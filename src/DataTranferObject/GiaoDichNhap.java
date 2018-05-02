package DataTranferObject;


public class GiaoDichNhap {
    private String idSanPham;
    private int idHoaDon;
    private int soluong;
    private int giatien;

    public GiaoDichNhap(String idSanPham,int idHoaDon, int soluong, int giatien) {
        this.idSanPham = idSanPham;
        this.idHoaDon =idHoaDon;
        this.soluong = soluong;
        this.giatien = giatien;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getGiatien() {
        return giatien;
    }

    public void setGiatien(int giatien) {
        this.giatien = giatien;
    }
    
    
}
