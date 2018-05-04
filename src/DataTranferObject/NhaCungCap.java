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
    private int id;
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
    
    
}
