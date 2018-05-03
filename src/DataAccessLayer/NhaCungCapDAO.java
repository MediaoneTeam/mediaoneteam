/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import DataTranferObject.NhaCungCap;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toan
 */
public class NhaCungCapDAO {
    public static void insertNhaCungCap(NhaCungCap nhaCungCap) {
        String query = "INSERT INTO `nhacungcap`(`idnhacungcap`, `tennhacungcap`, `diachi`, `sodienthoai`, `email`) VALUES "
                + "(" + nhaCungCap.getIdNhaCungCap() + ",'" + nhaCungCap.getTenNhaCungCap() + "','" + nhaCungCap.getDiaChi() + "','"
                + nhaCungCap.getSoDienThoai() + "','" + nhaCungCap.getEmail() + "')";
        DataProvider.getDatDataProvider().executeInsert(query);
    }
    
    public static ResultSet getAllNhaCungCap() {
        String query = "SELECT * FROM nhacungcap";
        ResultSet danhSachNhaCungCap = DataProvider.getDatDataProvider().executeQuery(query);
        return danhSachNhaCungCap;
    }
    
//    public static void main(String[] args) {
//        ResultSet rs = getAllNhaCungCap();
//        try {
//            while(rs.next()){
//                System.out.println(rs.getString("tennhacungcap"));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DataProvider.class.getName()).log(Level.SEVERE, null, ex);
//        }

//          NhaCungCap ncc = new NhaCungCap();
//          ncc.setTenNhaCungCap("qb");
//          ncc.setDiaChi("qb");
//          ncc.setSoDienThoai("0123");
//          ncc.setEmail("qb@gmail.com");
//          insertNhaCungCap(ncc);
//    }
}
