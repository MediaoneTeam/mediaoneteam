/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import BusinessLayer.NhapThemHangBO;
import DataAccessLayer.NhaCungCapDAO;
import DataAccessLayer.SanPhamDAO;
import DataTranferObject.GiaoDichNhap;
import DataTranferObject.NhaCungCap;
import DataTranferObject.NhanVien;
import DataTranferObject.SanPham;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class fQuanLyNhapHang extends javax.swing.JFrame {
    int rowNumber = 0;
    NhanVien nhanVien;
    ArrayList<Object[]> listProducesForTableCacMatHangDaHet = new ArrayList<>();
    ArrayList<Object[]> listProducesForTableDonNhapHang = new ArrayList<>();
     ArrayList<Object[]> listProducesForTableNhapHang = new ArrayList<>();
    public fQuanLyNhapHang(NhanVien nhanvien) {
        this.nhanVien = nhanvien;
        this.nhanVien.setIdnhanvien(1);
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxNhaCungCap = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDonDatHang = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Danh sách sản phẩm hết hàng:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Tình trạng", ""
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonAdd.setText("Xác nhận");
        jButtonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddMouseClicked(evt);
            }
        });

        jLabel2.setText("Thêm vào danh sách nhập hàng:");

        jLabel4.setText("Chọn nhà cung cấp:");

        jLabel5.setText("Chọn số lương:");

        jComboBoxNhaCungCap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAdd)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jTableDonDatHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Nhà cung cấp"
            }
        ));
        jScrollPane2.setViewportView(jTableDonDatHang);

        jButton2.setText("Xuất file");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jLabel3.setText("Danh sách các mặt hàng cần nhập:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(372, 372, 372)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Quản lý hàng trong kho", jPanel1);

        jTextField1.setText("...");

        jButton4.setText("Chọn file");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng sản phẩm", "Giá nhập", "Nhà cung cấp"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jButton5.setText("Nhập hàng");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Quản lý nhập hàng", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        hienThiDanhSachCacMatHangDaHet();
    }//GEN-LAST:event_formWindowOpened
   
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
   
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
    int result = fileChooser.showOpenDialog(this);
    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        
        jTextField1.setText(selectedFile.getAbsolutePath());
        jTextField1.setEditable(false);
        
        listProducesForTableNhapHang = ReadCSVFile(selectedFile);
      }    
    hienThiDanhSachCacMatHangCanNhap();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        ArrayList<GiaoDichNhap> giaodichnhaps = new ArrayList<GiaoDichNhap>();
        int idNhaCungCap = 0 ;
       
        for(Object[] produces:listProducesForTableNhapHang){        
            giaodichnhaps.add(new GiaoDichNhap(produces[0].toString(),//id san pham
                                                                    0,//id hoa don
                                               Integer.parseInt(produces[1].toString()),//so luong
                                               Integer.parseInt(produces[3].toString())));//gia tien
            idNhaCungCap = Integer.parseInt(produces[2].toString());
        }
        NhapThemHangBO.NhapThemHang(this.nhanVien, giaodichnhaps, idNhaCungCap);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        ArrayList<NhaCungCap> listNhaCungCap = null;
        String idsanpham = null;
        rowNumber = jTable1.getSelectedRow();
        idsanpham = "" + jTable1.getValueAt(rowNumber, 0);
        listNhaCungCap = NhaCungCapDAO.getNhaCungCap(idsanpham);
        jComboBoxNhaCungCap.removeAllItems();
        for(int i = 0 ;i<listNhaCungCap.size();i++){
            jComboBoxNhaCungCap.addItem(listNhaCungCap.get(i).getName());
        }
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMouseClicked
        Object[] produces = new Object[5];
        produces[0] = jTable1.getValueAt(rowNumber, 0);
        produces[1] = jTable1.getValueAt(rowNumber, 1);
        produces[2] = jSpinner1.getValue();
        produces[3] = jComboBoxNhaCungCap.getSelectedItem();
        produces[4] = NhaCungCapDAO.getIdNhaCungCapByName(jComboBoxNhaCungCap.getSelectedItem().toString());
        
        listProducesForTableDonNhapHang.add(produces);
        hienThiDanhSachSanPhamTrongDonDatHang();
    }//GEN-LAST:event_jButtonAddMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       //count so luong nha san xuat
        
        ArrayList<Integer> idNhaSanXuat = new ArrayList();
        for (Object[] produce : listProducesForTableDonNhapHang) {
            int id = Integer.parseInt(produce[4].toString());
            if(!isDuplicateNumber(idNhaSanXuat,id)) idNhaSanXuat.add(id);
        }
        TaoHoaDonDatHang(idNhaSanXuat);
    }//GEN-LAST:event_jButton2MouseClicked
    private void TaoHoaDonDatHang(ArrayList<Integer> idNhaSanXuat){
        for(int i:idNhaSanXuat){
           String path = "/home/vhk/PROJECT_ON_GIT/mediaoneteam/test/dathangCSV/nhacungcap"+i+".csv";
            // Use relative path for Unix systems
            File f = new File(path);
            f.getParentFile().mkdirs(); 
            try {
                f.createNewFile();
                
            } catch (IOException ex) {
            }
            int id;
            PrintWriter printWriter = null;
            try {
                printWriter = new PrintWriter(f);
                 for (Object[] produce : listProducesForTableDonNhapHang) {
                     id = Integer.parseInt(produce[4].toString());
                   if(id == i ){
                       printWriter.println(produce[0]+","+produce[2]+","+id);
                   }  
            } 
            } catch (FileNotFoundException ex) {
            }finally{
            printWriter.close();
             
            }
        }   
           
    }
    private boolean isDuplicateNumber(ArrayList<Integer> arrA,int a){
        for(int i:arrA){
            if(i == a) return true;
        }
        return false;
    }
    
    private void hienThiDanhSachSanPhamTrongDonDatHang(){
         String coltitle[] = new String[]{"mã sản phẩm", "tên sản phẩm","Số lượng","Nhà cung cấp"};
        DefaultTableModel model = new DefaultTableModel(coltitle, 0);
        for (Object[] row : listProducesForTableDonNhapHang) {
            model.addRow(row);
        }
        jTableDonDatHang.setModel(model);
    }
    private void hienThiDanhSachCacMatHangDaHet(){
        ArrayList<SanPham> listSanPhamHetHang = SanPhamDAO.getSanPhamDaHetHang();
        String coltitle[] = new String[]{"mã sản phẩm", "tên sản phẩm","Tình trạng"};
        Object[] objProduces;
        System.out.println(listSanPhamHetHang.size());
        for(int i = 0 ;i<listSanPhamHetHang.size();i++){
                objProduces = new Object[3];
                objProduces[0] = listSanPhamHetHang.get(i).getIdsanpham();
                objProduces[1] = listSanPhamHetHang.get(i).getTensanpham();
                objProduces[2] = listSanPhamHetHang.get(i).getTinhTrang();
                listProducesForTableCacMatHangDaHet.add(objProduces);
        }
        
        DefaultTableModel model = new DefaultTableModel(coltitle, 0);

        for (Object[] row : listProducesForTableCacMatHangDaHet) {
            model.addRow(row);
        }
        jTable1.setModel(model);
    }
    
    private void hienThiDanhSachCacMatHangCanNhap(){
        String coltitle[] = new String[]{"mã sản phẩm", "tên sản phẩm", "Nhà cung cấp", "số lượng sản phẩm", "giá nhập"};
        DefaultTableModel model = new DefaultTableModel(coltitle, 0);   
       ArrayList<Object[]> tmp = new ArrayList<>();
        Object[] objProduces;
        for (Object[] produces : listProducesForTableNhapHang) {
            objProduces = new Object[5];
            objProduces[0] = produces[0];//ma san pham
            objProduces[1] = SanPhamDAO.getNameById(produces[0].toString());
            objProduces[2] = NhaCungCapDAO.getNameById(Integer.parseInt(produces[2].toString()));
            objProduces[3] = produces[1];//so luong san pham
            objProduces[4] = produces[3];//gia nhap
            tmp.add(objProduces);
        }
        
        for (Object[] row : tmp) {
            model.addRow(row);
        }
        jTable3.setModel(model);
    }
     
     
     
    private ArrayList<Object[]> ReadCSVFile(File fileInput){
        ArrayList<Object[]> listProduces = new ArrayList();
        String line = ""; 
        String cvsSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(fileInput))) {

            while ((line = br.readLine()) != null) {
                String[] metaData = line.split(cvsSplitBy);
                int i = metaData.length;
                Object[] produce = new Object[i];
                for(int j = 0 ; j<metaData.length;j++){
                    produce[j] = metaData[j];
                }
                listProduces.add(produce);
                // use comma as separator
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listProduces;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fQuanLyNhapHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fQuanLyNhapHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fQuanLyNhapHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fQuanLyNhapHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fQuanLyNhapHang(new NhanVien()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JComboBox<String> jComboBoxNhaCungCap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTableDonDatHang;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
