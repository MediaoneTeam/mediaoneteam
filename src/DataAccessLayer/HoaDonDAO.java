/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import DataTranferObject.HoaDon;
import DataTranferObject.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lehuyhung
 */
public class HoaDonDAO {
    public static HoaDon insertHoaDon(NhanVien nhanVien){
        HoaDon hoadon=null;
        
        String query="INSERT INTO `hoadon`(`idhoadon`, `ngaymua`, `nhanvien_idnhanvien`) VALUES (null,null,"+nhanVien.getIdnhanvien()+")";
        
        ResultSet resultSet=DataProvider.getDatDataProvider().executeInsert(query);
       
        try {
             int idhoadon=0;
            while(resultSet.next()){
                idhoadon=resultSet.getInt(1);
                break;
            }
             query="select * from hoadon where idhoadon="+idhoadon;
             resultSet=DataProvider.getDatDataProvider().executeQuery(query);
             resultSet.next();
             hoadon=new HoaDon(resultSet);
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return hoadon;
               

    }
}