/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import DataTranferObject.NhanVien;
import DataTranferObject.PhieuNhapKho;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vhk
 */
public class PhieuNhapKhoDAO {
     public static PhieuNhapKho insertPhieuNhapKho(NhanVien nhanVien,int idNhaCungCap){
        PhieuNhapKho phieuNhapKho = null;
        
        String query="INSERT INTO `phieunhapkho`(`idphieunhapkho`,`ngaydathang`,`ngaynhap`,`idnhacungcap` ,`idnhanvien`) VALUES "
                + "(null,null,null,"+idNhaCungCap+","+nhanVien.getIdnhanvien()+")";
        ResultSet resultSet=DataProvider.getDatDataProvider().executeInsert(query);
        if(resultSet == null){
            System.out.println("Loi thuc thi cau lenh insert phieunhapkho");
        }
       
        try {
            int idPhieuNhapKho=0;
            while(resultSet.next()){
                idPhieuNhapKho = resultSet.getInt(1);
                break;
            }
             query="SELECT  * FROM phieunhapkho where idphieunhapkho="+idPhieuNhapKho;
             resultSet=DataProvider.getDatDataProvider().executeQuery(query);
             resultSet.next();
             phieuNhapKho=new PhieuNhapKho(resultSet);
        } catch (SQLException ex) {
            Logger.getLogger(PhieuNhapKhoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return phieuNhapKho;
              
    }
       public static void updatePhieuNhapKho(int idphieunhapkho){
        String query = "UPDATE phieunhapkho SET ngaynhap = CURRENT_TIMESTAMP WHERE idphieunhapkho ="+idphieunhapkho;
        DataProvider.getDatDataProvider().executeInsert(query);
        
    }
}
