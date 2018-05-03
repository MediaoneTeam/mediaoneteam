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

/**
 *
 * @author vhk
 */
public class nhacungcap_hanghoaDAO {
    public static int getGiaCungUng(int idNhaCungCap,String idSanPham){
        int gia = 0;
        String query = "SELECT giacungung FROM sanpham_nhacungcap WHERE "
                        + "idnhacungcap="+idNhaCungCap+" "
                        + "AND idsanpham=\""+idSanPham+"\"";
         ResultSet resultSet=DataProvider.getDatDataProvider().executeQuery(query);
         try {
           
            while(resultSet.next()){
              
                gia = resultSet.getInt("giacungung");
               
                break;
            }
        } catch (SQLException ex) {
        }
        return gia;
    }
    
}
