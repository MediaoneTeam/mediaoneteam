package BusinessLayer;

import DataAccessLayer.GiaoDichNhapDAO;
import DataAccessLayer.PhieuNhapKhoDAO;
import DataAccessLayer.SanPhamDAO;
import DataTranferObject.GiaoDichNhap;
import DataTranferObject.NhanVien;
import DataTranferObject.PhieuNhapKho;
import java.util.ArrayList;


public class NhapThemHangBO {
  public static void NhapThemHang(NhanVien nhanVien,ArrayList<GiaoDichNhap> giaodichnhaps,int idNhaCungCap){
    PhieuNhapKho phieuNhapKho = PhieuNhapKhoDAO.insertPhieuNhapKho(nhanVien, idNhaCungCap);
    for(GiaoDichNhap giaodichnhap : giaodichnhaps){
            giaodichnhap.setIdHoaDon(phieuNhapKho.getIdhoadon());
            GiaoDichNhapDAO.insertGiaoDichNhap(giaodichnhap);
            SanPhamDAO.tangSoluong(giaodichnhap.getIdSanPham(), giaodichnhap.getSoluong());
        }
  };
}
