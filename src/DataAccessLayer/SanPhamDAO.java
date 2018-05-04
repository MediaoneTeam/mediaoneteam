package DataAccessLayer;

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

}
