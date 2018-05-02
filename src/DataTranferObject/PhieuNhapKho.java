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
 * @author vhk
 */
public class PhieuNhapKho {
    private Integer idhoadon;
    private Date ngaymua;
    private int idNhaCungCap;
    private int nhanvien_idnhanvien;

    public PhieuNhapKho(Date ngaymua, int idNhaCungCap, int nhanvien_idnhanvien) {
        this.idhoadon = null;
        this.ngaymua = ngaymua;
        this.idNhaCungCap = idNhaCungCap;
        this.nhanvien_idnhanvien = nhanvien_idnhanvien;
    }
    
    public PhieuNhapKho(ResultSet resultSet){
         try {
            idhoadon=resultSet.getInt("idphieunhapkho");
            ngaymua=resultSet.getDate("ngaynhap");
            idNhaCungCap = resultSet.getInt("idnhacungcap");
            nhanvien_idnhanvien=resultSet.getInt("idnhanvien");
            
        } catch (SQLException ex) {
            System.out.println("error: phieunhapkho contructor không có chứa cột tương ứng");
        }
    }
    public Integer getIdhoadon() {
        return idhoadon;
    }

    public void setIdhoadon(Integer idhoadon) {
        this.idhoadon = idhoadon;
    }

    public Date getNgaymua() {
        return ngaymua;
    }

    public void setNgaymua(Date ngaymua) {
        this.ngaymua = ngaymua;
    }

    public int getIdNhaCungCap() {
        return idNhaCungCap;
    }

    public void setIdNhaCungCap(int idNhaCungCap) {
        this.idNhaCungCap = idNhaCungCap;
    }

    public int getNhanvien_idnhanvien() {
        return nhanvien_idnhanvien;
    }

    public void setNhanvien_idnhanvien(int nhanvien_idnhanvien) {
        this.nhanvien_idnhanvien = nhanvien_idnhanvien;
    }
    
}
