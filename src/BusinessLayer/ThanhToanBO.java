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
import Exception.IdSanPhamNotMatch;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lehuyhung
 */
public class ThanhToanBO {
    public static void thanhToan(NhanVien nhanVien,ArrayList<GiaoDich> giaodichs) throws IdSanPhamNotMatch{
        try {
            HoaDon hoaDon=HoaDonDAO.insertHoaDon(nhanVien);
            String csvFile = "C:\\Users\\lehuyhung\\Desktop\\toan merge\\mediaone-master\\test\\HoaDonBanHang\\"+hoaDon.getIdhoadon();
            int tongtien=0;
            PrintStream fileStream = null;
            fileStream = new PrintStream(new File(csvFile));
            fileStream.println("tên sản phẩm,mã sản phẩm,số lượng,giá tiền,thành tiền");
            for(GiaoDich giaodich : giaodichs){
                
                giaodich.setIdhoadon(hoaDon.getIdhoadon());
                GiaoDichDAO.insertGiaoDich(giaodich);
                SanPhamDAO.giamSoluong(giaodich.getIdsanpham(), giaodich.getSoluong());
                
                int tientungsanpham=(giaodich.getGiatien()*giaodich.getSoluong());
                fileStream.println(""+SanPhamDAO.getSanPhamDetail(giaodich.getIdsanpham()).getTensanpham()+","+giaodich.getIdsanpham()+","+giaodich.getSoluong()+","+giaodich.getGiatien()+","+tientungsanpham);
                tongtien=tongtien+tientungsanpham;
           
            }
            fileStream.println("tongtien:"+tongtien);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ThanhToanBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
