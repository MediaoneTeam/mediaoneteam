package BusinessLayer;

import DataAccessLayer.GiaoDichNhapDAO;
import DataAccessLayer.PhieuNhapKhoDAO;
import DataAccessLayer.SanPhamDAO;
import DataTranferObject.GiaoDichNhap;
import DataTranferObject.PhieuNhapKho;
import java.util.ArrayList;


public class NhapThemHangBO {
  public static void NhapThemHang(ArrayList<GiaoDichNhap> giaodichnhaps){
    for(GiaoDichNhap giaodichnhap : giaodichnhaps){
        int idphieunhapkho = giaodichnhap.getIdHoaDon();
        String idsanpham = giaodichnhap.getIdSanPham();
        String status= GiaoDichNhapDAO.getStatus(idphieunhapkho, idsanpham);
        
         //nếu sản phẩm đang trong trạng thái đang đặt hàng mới được phép nhập
        if(status.equals("false")){
             GiaoDichNhapDAO.updateStatus(idphieunhapkho,idsanpham,"true");
             SanPhamDAO.tangSoluong(idsanpham, giaodichnhap.getSoluong());
             PhieuNhapKhoDAO.updatePhieuNhapKho(idphieunhapkho);
        }
          
    }           
  };
  
}
