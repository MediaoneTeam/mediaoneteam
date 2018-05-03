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
  private String tinhTrang;

    public SanPham(String idsanpham, String tensanpham, int soluongconlai, int giabanhientai, String anhminhhoa, String tinhTrang) {
        this.idsanpham = idsanpham;
        this.tensanpham = tensanpham;
        this.soluongconlai = soluongconlai;
        this.giabanhientai = giabanhientai;
        this.anhminhhoa = anhminhhoa;
        this.tinhTrang = tinhTrang;
    }
  
  public SanPham(ResultSet resultSet) {
        try {
            idsanpham=resultSet.getString("idsanpham");
            tensanpham=resultSet.getString("tensanpham");
            soluongconlai=resultSet.getInt("soluongconlai");
            giabanhientai=resultSet.getInt("giabanhientai");
            anhminhhoa=resultSet.getString("anhminhhoa");
            tinhTrang = resultSet.getString("dangDatHang");
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

    public String getTinhTrang() {
        return tinhTrang;
    }
    
}
