
package DataAccessLayer;

import DataTranferObject.GiaoDichNhap;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GiaoDichNhapDAO {
        public static void insertGiaoDichNhap(GiaoDichNhap giaoDichNhap){
            String query="INSERT INTO giaodichnhap(idphieunhapkho,idsanpham,soluong,gianhap,dagiao) "
                    + "VALUES ("+giaoDichNhap.getIdHoaDon()+","+
                                    giaoDichNhap.getIdSanPham()+","+
                                    giaoDichNhap.getSoluong()+","+
                                    giaoDichNhap.getGiatien()+","+
                                    "\""+giaoDichNhap.getStatus()+"\")";
            DataProvider.getDatDataProvider().executeInsert(query);
        }
        
        public static void updateStatus(int idphieunhapkho,String idsanpham,String status){
            String query = "UPDATE giaodichnhap SET dagiao =\""+status+"\" WHERE idphieunhapkho="+idphieunhapkho+" AND idsanpham ="+idsanpham;
           
            DataProvider.getDatDataProvider().executeUpdate(query);
        }
        
        
        public static String getStatus(int idphieunhapkho,String idsanpham){
            String status = null;
            String query = "SELECT * FROM giaodichnhap WHERE idphieunhapkho="+idphieunhapkho+" AND idsanpham="+idsanpham;
            ResultSet resultSet = DataProvider.getDatDataProvider().executeQuery(query);
            try {
                while(resultSet.next()){
                    status = resultSet.getString("dagiao");
                }
            } catch (SQLException ex) {
                Logger.getLogger(GiaoDichNhapDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return status; 
       }
}
