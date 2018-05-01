/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTranferObject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author lehuyhung
 */
public class HoaDon {
    int idhoadon;
    Date ngaymua;
    int nhanvien_idnhanvien;

    public HoaDon(int idhoadon, Date ngaymua, int nhanvien_idnhanvien) {
        this.idhoadon = idhoadon;
        this.ngaymua = ngaymua;
        this.nhanvien_idnhanvien = nhanvien_idnhanvien;
    }

    public HoaDon(ResultSet resultSet) {
         try {
            idhoadon=resultSet.getInt("idhoadon");
            ngaymua=resultSet.getDate("ngaymua");
            nhanvien_idnhanvien=resultSet.getInt("nhanvien_idnhanvien");
            
        } catch (SQLException ex) {
            System.out.println("error: Hoadon contructor không có chứa cột tương ứng");
        }
    }
    
    public int getIdhoadon() {
        return idhoadon;
    }
    
}
