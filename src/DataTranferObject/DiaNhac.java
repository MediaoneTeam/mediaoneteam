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
public class DiaNhac extends SanPham{
    private String theloainhac_tentheloai;
    private String tencasy;

    
    public DiaNhac(String theloainhac_tentheloai, String tencasy, String idsanpham, String tensanpham, int soluongconlai, int giabanhientai, String anhminhhoa, String tinhTrang) {
        super(idsanpham, tensanpham, soluongconlai, giabanhientai, anhminhhoa, tinhTrang);
        this.theloainhac_tentheloai = theloainhac_tentheloai;
        this.tencasy = tencasy;
    }
    
    
    public DiaNhac(ResultSet resultSet) {
        super(resultSet);
    }

    public String getTheloainhac_tentheloai() {
        return theloainhac_tentheloai;
    }

    public String getTencasy() {
        return tencasy;
    }
    
    
}
