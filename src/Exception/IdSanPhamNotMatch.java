/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author lehuyhung
 */
public class IdSanPhamNotMatch extends Exception{

    public IdSanPhamNotMatch(String idsanpham) {
        super("id không tồn tại:"+idsanpham);
    }

    
}
