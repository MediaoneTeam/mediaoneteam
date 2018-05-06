/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTranferObject;

import java.sql.ResultSet;

/**
 *
 * @author lehuyhung
 */
public class Sach extends SanPham {
    private String tennhaxuatban;
    private String tentacgia;

    public Sach(String tennhaxuatban, String tentacgia, String idsanpham, String tensanpham, int soluongconlai, int giabanhientai, String anhminhhoa, String tinhTrang) {
        super(idsanpham, tensanpham, soluongconlai, giabanhientai, anhminhhoa, tinhTrang);
        this.tennhaxuatban = tennhaxuatban;
        this.tentacgia = tentacgia;
    }
    
     public Sach(ResultSet resultSet,String tennhaxuatban,String tentacgia) {
        super(resultSet);
        this.tennhaxuatban=tennhaxuatban;
        this.tentacgia=tentacgia;
    }
    
    public Sach(ResultSet resultSet) {
        super(resultSet);
    }

    public String getTennhaxuatban() {
        return tennhaxuatban;
    }

    public String getTentacgia() {
        return tentacgia;
    }
    
}
