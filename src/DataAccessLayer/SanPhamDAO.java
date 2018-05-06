package DataAccessLayer;

import DataTranferObject.DiaNhac;
import DataTranferObject.DiaPhim;
import DataTranferObject.Sach;
import DataTranferObject.SanPham;
import Exception.IdSanPhamNotMatch;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SanPhamDAO {
    
    static public SanPham getSanPham(String idsanpham) throws IdSanPhamNotMatch{
        SanPham sanPham=null;
        String query="Select * from sanpham where idsanpham="+idsanpham;
        ResultSet resultSet=DataProvider.getDatDataProvider().executeQuery(query);
        try {
           if (!resultSet.isBeforeFirst() ) {    
               throw new IdSanPhamNotMatch(idsanpham);
            } 
            while(resultSet.next()){
                sanPham= new SanPham(resultSet);
                break;
            }
        } catch (SQLException ex) {
            throw new IdSanPhamNotMatch(idsanpham);
        }
        return sanPham;
    }
    static public void giamSoluong(String idsanpham,int luonggiam){
    String query="UPDATE `sanpham` SET `soluongconlai`=`soluongconlai`-"+luonggiam+" WHERE idsanpham="+idsanpham;
        DataProvider.getDatDataProvider().executeUpdate(query);
    }
    
    public static void tangSoluong(String idsanpham,int luongtang){
        String query="UPDATE `sanpham` SET `soluongconlai`=`soluongconlai`+"+luongtang+" WHERE idsanpham="+idsanpham;
        DataProvider.getDatDataProvider().executeUpdate(query);
    }
    
    public static ArrayList<SanPham> getSanPhamNhoHonSoluongChoTruoc(int soluongconlai){
        ArrayList<SanPham> listSanPhamHetHang = new ArrayList();
        SanPham sanPham=null;
        String query="Select * from sanpham where soluongconlai<="+soluongconlai;
        ResultSet resultSet=DataProvider.getDatDataProvider().executeQuery(query);
        try {
            while(resultSet.next()){
                sanPham = new SanPham(resultSet);
                listSanPhamHetHang.add(sanPham);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listSanPhamHetHang;
    }
    public static ArrayList<String> getIDSanPhamDangDatHang(){
        ArrayList<String> listIDSanPhamDangDatHang = new ArrayList();
        String query="SELECT idsanpham  FROM giaodichnhap WHERE dagiao =\"false\"";
        ResultSet resultSet=DataProvider.getDatDataProvider().executeQuery(query);
        try {
            while(resultSet.next()){
                String idsanpham =  resultSet.getString("idsanpham");
                listIDSanPhamDangDatHang.add(idsanpham);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listIDSanPhamDangDatHang;
    }
    
    public static String getNameById(String idsanpham){
        String name=null;
        String query = "SELECT tensanpham FROM sanpham WHERE idsanpham="+idsanpham;
         ResultSet resultSet=DataProvider.getDatDataProvider().executeQuery(query);
         try {
            while(resultSet.next()){
               name = resultSet.getString("tensanpham");
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return name;
    }

    public static SanPham getSanPhamDetail(String idsanpham) throws IdSanPhamNotMatch{
        SanPham sanPham=null;
        
        String query="Select * from sanpham where idsanpham="+idsanpham;
        ResultSet resultSet=DataProvider.getDatDataProvider().executeQuery(query);
        try {
           if (!resultSet.isBeforeFirst() ) {    
               throw new IdSanPhamNotMatch(idsanpham);
            } 
           
           
            while(resultSet.next()){
                String detailquery="Select * from sach where sanpham_idsanpham="+idsanpham;
                ResultSet resultSet2=DataProvider.getDatDataProvider().executeQuery(detailquery);
                if(resultSet2.next()){
                    sanPham=new Sach(resultSet,resultSet2.getString("tennhaxuatban"),resultSet2.getString("tentacgia"));
                  //  System.out.println("có trong sách");
                }
                else{
                  
                    detailquery="Select * from diaphim where sanpham_idsanpham="+idsanpham;
                    resultSet2=DataProvider.getDatDataProvider().executeQuery(detailquery);
                    if(resultSet2.next()){
                       // System.out.println("có trong diaphim");
                        sanPham=new DiaPhim(resultSet,resultSet2.getString("daodien"),resultSet2.getString("dienvien"));
                    }
                    else{
                        
                        detailquery="SELECT * FROM `dianhac` where sanpham_idsanpham="+idsanpham;
                        resultSet2=DataProvider.getDatDataProvider().executeQuery(detailquery);
                         if(resultSet2.next()){
                          //System.out.println("hello");
                        sanPham=new DiaNhac(resultSet,resultSet2.getString("theloainhac_tentheloai"),resultSet2.getString("tencasy"));
                    //System.out.println("hello");
                    //    System.out.println("có trong dianhac");
                          }
                    }
                }
                
                //sanPham= new SanPham(resultSet);
                break;
            }
        } catch (SQLException ex) {
            throw new IdSanPhamNotMatch(idsanpham);
        }
        
        return sanPham;
    }
    
      public static void main(String[] args){
        try {
            SanPham sanpham=SanPhamDAO.getSanPhamDetail("1234567890120");
            if(sanpham instanceof Sach){
                Sach sach=(Sach )sanpham;
                System.out.println(sach.getTentacgia());
            }
            else if(sanpham instanceof DiaPhim){
                System.out.println("đây là một đĩa phim");
        }
            else if(sanpham instanceof DiaNhac){
             System.out.println("đây là một đĩa nhac");
        }
            
            
        } catch (IdSanPhamNotMatch ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
