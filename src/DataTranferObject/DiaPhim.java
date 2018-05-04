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
public class DiaPhim extends SanPham{
    private String daodien;
    private String dienvien;

    
    public DiaPhim(String daodien, String dienvien, String idsanpham, String tensanpham, int soluongconlai, int giabanhientai, String anhminhhoa, String tinhTrang) {
        super(idsanpham, tensanpham, soluongconlai, giabanhientai, anhminhhoa, tinhTrang);
        this.daodien = daodien;
        this.dienvien = dienvien;
    }
    
    
    public DiaPhim(ResultSet resultSet) {
        super(resultSet);
    }

    public String getDaodien() {
        return daodien;
    }

    public String getDienvien() {
        return dienvien;
    }
    
}
