/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTranferObject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lehuyhung
 */
public class NhanVien {
private int idnhanvien;
private String tenNhanVien;
private String password;
private boolean isThuNgan;
private boolean isQuanKho;
private boolean isKeToan;
private int luong;
private String soDienThoai;
private String diaChi;
private String chungMinhThu;
private String queQuan;
private Date ngaybatdau;

    public NhanVien() {
    }


    public NhanVien(ResultSet resultSet) {
        super();
        
    try {
        this.idnhanvien=resultSet.getInt("idnhanvien");
        this.tenNhanVien=resultSet.getString("tennhanvien");
        
    } catch (SQLException ex) {
        Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }

    public int getIdnhanvien() {
        return idnhanvien;
    }
    
    
    
}
