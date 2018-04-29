/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTranferObject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lehuyhung
 */
public class SanPham {
    private String idsanpham;
   private String tensanpham;
  private  int soluongconlai;
  private  int giabanhientai;
  private  String anhminhhoa;
    public SanPham(ResultSet resultSet) {
        try {
            idsanpham=resultSet.getString("idsanpham");
            tensanpham=resultSet.getString("tensanpham");
            soluongconlai=resultSet.getInt("soluongconlai");
            giabanhientai=resultSet.getInt("giabanhientai");
            anhminhhoa=resultSet.getString("anhminhhoa");
        } catch (SQLException ex) {
            System.out.println("SanPham contructor không có chứa cột tương ứng");
        }
        
    }

    public String getIdsanpham() {
        return idsanpham;
    }

    public int getGiabanhientai() {
        return giabanhientai;
    }

   

    public int getSoluongconlai() {
        return soluongconlai;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    
    
    public String getAnhminhhoa() {
        return anhminhhoa;
    }

    
    
    
}
