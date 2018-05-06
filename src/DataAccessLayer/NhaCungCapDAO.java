/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import DataTranferObject.NhaCungCap;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vhk
 */
public class NhaCungCapDAO {
     public static ArrayList<NhaCungCap> getNhaCungCap(String idsanpham){
        ArrayList<NhaCungCap> listNhaCungCap=new ArrayList<>();
        NhaCungCap nhaCungCap = null;
        String query = "SELECT * FROM nhacungcap WHERE nhacungcap.idnhacungcap IN "
                + "(SELECT idnhacungcap FROM sanpham_nhacungcap WHERE idsanpham =\""+idsanpham+"\")";
        ResultSet resultSet=DataProvider.getDatDataProvider().executeQuery(query);
         try {
             while(resultSet.next()){
                 nhaCungCap = new NhaCungCap(resultSet);
                 listNhaCungCap.add(nhaCungCap);
             }} catch (SQLException ex) {
             Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
        return listNhaCungCap;
    }
     
     public static int getIdNhaCungCapByName(String name){
         String query ="SELECT idnhacungcap FROM nhacungcap WHERE tennhacungcap=\""+name+"\"";
        
         ResultSet resultSet=DataProvider.getDatDataProvider().executeQuery(query);
         int  id = 0;
         try {
             while(resultSet.next()){   
                 id = resultSet.getInt("idnhacungcap");
                 break;
             }
         } catch (SQLException ex) {
             Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
          return id;
     }
     
     public static String getNameById(int idNhaCungCap){
        String name=null;
        String query = "SELECT tennhacungcap FROM nhacungcap WHERE idnhacungcap="+idNhaCungCap;
         ResultSet resultSet=DataProvider.getDatDataProvider().executeQuery(query);
         try {
            while(resultSet.next()){
               name = resultSet.getString("tennhacungcap");
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return name;
    }
     
     
     public static void insertNhaCungCap(NhaCungCap nhaCungCap) {
        String query = "INSERT INTO `nhacungcap`(`idnhacungcap`, `tennhacungcap`, `diachi`, `sodienthoai`, `email`) VALUES "
                + "(" + nhaCungCap.getId()+ ",'" + nhaCungCap.getName()+ "','" + nhaCungCap.getDiachi()+ "','"
                + nhaCungCap.getSdt()+ "','" + nhaCungCap.getEmail()+ "')";
        DataProvider.getDatDataProvider().executeInsert(query);
    }

}
