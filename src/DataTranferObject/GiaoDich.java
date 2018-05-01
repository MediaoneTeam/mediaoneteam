/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTranferObject;

/**
 *
 * @author lehuyhung
 */
public class GiaoDich {
    String idsanpham;
    Integer idhoadon;
    int soluong;
    int giatien;

    public GiaoDich(String idsanpham, int soluong, int giatien) {
        this.idsanpham = idsanpham;
        this.idhoadon = null;
        this.soluong = soluong;
        this.giatien = giatien;
    }

    public void setIdhoadon(Integer idhoadon) {
        this.idhoadon = idhoadon;
    }

    public String getIdsanpham() {
        return idsanpham;
    }

    public int getGiatien() {
        return giatien;
    }

    public Integer getIdhoadon() {
        return idhoadon;
    }

    public int getSoluong() {
        return soluong;
    }
    
    
    public  boolean isReady(){
        if(idhoadon!=null){
            return true;
        }
        else{
            return false;
        }
    }
}
