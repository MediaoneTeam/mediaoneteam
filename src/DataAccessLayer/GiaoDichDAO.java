/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import DataTranferObject.GiaoDich;

/**
 *
 * @author lehuyhung
 */
public class GiaoDichDAO {
    public static void insertGiaoDich(GiaoDich giaoDich){
        String query="INSERT INTO `giaodich`(`sanpham_idsanpham`, `hoadon_idhoadon`, `soluong`, `giatien`) VALUES ("+giaoDich.getIdsanpham()+","+giaoDich.getIdhoadon()+","+giaoDich.getSoluong()+","+giaoDich.getGiatien()+")";
        DataProvider.getDatDataProvider().executeInsert(query);
    }
}
