/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;

import DataAccessLayer.GiaoDichDAO;
import DataAccessLayer.HoaDonDAO;
import DataAccessLayer.SanPhamDAO;
import DataTranferObject.GiaoDich;
import DataTranferObject.HoaDon;
import DataTranferObject.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author lehuyhung
 */
public class ThanhToanBO {
    public static void thanhToan(NhanVien nhanVien,ArrayList<GiaoDich> giaodichs){
        HoaDon hoaDon=HoaDonDAO.insertHoaDon(nhanVien);
        for(GiaoDich giaodich : giaodichs){
            giaodich.setIdhoadon(hoaDon.getIdhoadon());
            GiaoDichDAO.insertGiaoDich(giaodich);
            SanPhamDAO.giamSoluong(giaodich.getIdsanpham(), giaodich.getSoluong());
        }
        
    }
}
