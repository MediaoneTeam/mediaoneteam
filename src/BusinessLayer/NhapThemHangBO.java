package BusinessLayer;

import DataAccessLayer.GiaoDichNhapDAO;
import DataAccessLayer.PhieuNhapKhoDAO;
import DataAccessLayer.SanPhamDAO;
import DataTranferObject.GiaoDichNhap;
import DataTranferObject.NhanVien;
import DataTranferObject.PhieuNhapKho;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class NhapThemHangBO {
  public static void NhapThemHang(NhanVien nhanVien,ArrayList<GiaoDichNhap> giaodichnhaps,int idNhaCungCap){
    PhieuNhapKho phieuNhapKho = PhieuNhapKhoDAO.insertPhieuNhapKho(nhanVien, idNhaCungCap);
    for(GiaoDichNhap giaodichnhap : giaodichnhaps){
            //nếu sản phẩm đang trong trạng thái đang đặt hàng mới được phép nhập
            String idsanpham = giaodichnhap.getIdSanPham();
            String status = SanPhamDAO.getStatus(idsanpham);
            if(status.equals("true")){
            giaodichnhap.setIdHoaDon(phieuNhapKho.getIdhoadon());
            GiaoDichNhapDAO.insertGiaoDichNhap(giaodichnhap);
            SanPhamDAO.tangSoluong(giaodichnhap.getIdSanPham(), giaodichnhap.getSoluong());
            SanPhamDAO.setStatus(giaodichnhap.getIdSanPham(),"false");
            }else{
                   JOptionPane.showMessageDialog(null, "Sản phẩm có mã "+idsanpham+" đã được nhập vào kho hoặc đang không được đặt hàng",
                                                 "Nhập sản phẩm thất bại",0);
            }
    }           
  };
  
}
