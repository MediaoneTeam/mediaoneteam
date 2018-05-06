/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTranferObject;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vhk
 */
public class NhaCungCap {
    private Integer id;
    private String name;
    private String diachi;
    private String sdt;
    private String email;
   
    public NhaCungCap(ResultSet resultSet){
       try {
            id=Integer.parseInt(resultSet.getString("idnhacungcap"));
            name=resultSet.getString("tennhacungcap");
            diachi=resultSet.getString("diachi");
            sdt=resultSet.getString("sodienthoai");
            email=resultSet.getString("email");
        } catch (SQLException ex) {
            System.out.println("NhaCungCap contructor không có chứa cột tương ứng");
        }
         
    }

    public NhaCungCap(String tenNhaCungCap, String diaChi, String soDienThoai, String email) {
        this.id = null;
        this.name = tenNhaCungCap;
        this.diachi = diaChi;
        this.sdt = soDienThoai;
        this.email = email;
    }
    
    
    public NhaCungCap() {
        this.id = null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

   
    
    
}
