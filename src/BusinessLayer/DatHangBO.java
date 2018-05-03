package BusinessLayer;

import DataAccessLayer.GiaoDichNhapDAO;
import DataAccessLayer.PhieuNhapKhoDAO;
import DataTranferObject.GiaoDichNhap;
import DataTranferObject.NhanVien;
import DataTranferObject.PhieuNhapKho;
import java.util.ArrayList;

public class DatHangBO {
    public static PhieuNhapKho DatHang(NhanVien nhanVien,ArrayList<GiaoDichNhap> giaodichnhaps,int idNhaCungCap){
    PhieuNhapKho phieuNhapKho = PhieuNhapKhoDAO.insertPhieuNhapKho(nhanVien, idNhaCungCap);
    for(GiaoDichNhap giaodichnhap : giaodichnhaps){
            //nếu sản phẩm đang trong trạng thái đang đặt hàng mới được phép nhập
            giaodichnhap.setIdHoaDon(phieuNhapKho.getIdhoadon());
            GiaoDichNhapDAO.insertGiaoDichNhap(giaodichnhap);
    }
    return phieuNhapKho;
  };
}
