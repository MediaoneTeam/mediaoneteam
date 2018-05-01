/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import DataTranferObject.SanPham;
import Exception.IdSanPhamNotMatch;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lehuyhung
 */
public class SanPhamDAO {
    
    static public SanPham getSanPham(String idsanpham) throws IdSanPhamNotMatch{
        SanPham sanPham=null;
        String query="Select * from sanpham where idsanpham="+idsanpham;
        ResultSet resultSet=DataProvider.getDatDataProvider().executeQuery(query);
        try {
           if (!resultSet.isBeforeFirst() ) {    
               throw new IdSanPhamNotMatch(idsanpham);
            } 
            while(resultSet.next()){
                sanPham= new SanPham(resultSet);
                break;
            }
        } catch (SQLException ex) {
            throw new IdSanPhamNotMatch(idsanpham);
        }
        return sanPham;
    }
    static public void giamSoluong(String idsanpham,int luonggiam){
    String query="UPDATE `sanpham` SET `soluongconlai`=`soluongconlai`-"+luonggiam+" WHERE idsanpham="+idsanpham;
        DataProvider.getDatDataProvider().executeUpdate(query);
    }
}
