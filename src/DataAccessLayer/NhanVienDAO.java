/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import DataTranferObject.NhanVien;
import GiaoDien.fLogin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lehuyhung
 */
public class NhanVienDAO {
    
    public static NhanVien getNhanVien(String idnhanvien,String password){
        
       String query="select * from nhanvien where idnhanvien="+idnhanvien+" and password="+password;
       DataProvider dataProvider=DataProvider.getDatDataProvider();
       ResultSet resultSet=dataProvider.executeQuery(query);
       NhanVien nhanVien=null;
        int soluong=0;
        try {
            
            while(resultSet.next()){
                nhanVien=new NhanVien(resultSet);
               soluong++;
               break;
            }
            while(resultSet.next()){
               soluong++;
               break;
            }
            if(soluong==1){
           return nhanVien;
        }
        else{
            return null;
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(fLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
       return null;
    }
    
    public static void main(String[] args) {
       // getNhanVien("", password)
    }
}
