
package DataAccessLayer;

import DataTranferObject.GiaoDichNhap;

public class GiaoDichNhapDAO {
        public static void insertGiaoDichNhap(GiaoDichNhap giaoDichNhap){
            String query="INSERT INTO giaodichnhap(idphieunhapkho,idsanpham,soluong,gianhap) "
                    + "VALUES ("+giaoDichNhap.getIdHoaDon()+","+
                                    giaoDichNhap.getIdSanPham()+","+
                                    giaoDichNhap.getSoluong()+","+
                                    giaoDichNhap.getGiatien()+")";
            DataProvider.getDatDataProvider().executeInsert(query);
        }
}
