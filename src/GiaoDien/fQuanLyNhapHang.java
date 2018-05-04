/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import BusinessLayer.DatHangBO;
import BusinessLayer.NhapThemHangBO;
import DataAccessLayer.NhaCungCapDAO;
import DataAccessLayer.SanPhamDAO;
import DataAccessLayer.nhacungcap_hanghoaDAO;
import DataTranferObject.GiaoDichNhap;
import DataTranferObject.NhaCungCap;
import DataTranferObject.NhanVien;
import DataTranferObject.PhieuNhapKho;
import DataTranferObject.SanPham;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fQuanLyNhapHang extends javax.swing.JFrame {
    int rowNumber = 0;
    NhanVien nhanVien;
    ArrayList<Object[]> listProducesForTableCacMatHangDaHet = new ArrayList<>();
    //  objProduces[0]:Idsanpham;
    //objProduces[1]:Tensanpham;
    //objProduces[2]:TinhTrang;
    ArrayList<Object[]> listProducesForTableDonNhapHang = new ArrayList<>();
    // produces[0] :mã sản phẩm
    //    produces[1] :tên sản phẩm
    //    produces[2] :số lượng sản phẩm
    //    produces[3] :tên nhà cung cấp
    //    produces[4] :giá cung cấp
    //    produces[5] :mã nhà cung cấpf
    //    produces[6] :id phiếu nhập kho
     ArrayList<Object[]> listProducesForTableNhapHang = new ArrayList<>();
        //0:ma hoa don
        //1:ma san pham
        //2:so luong san pham
        //3:gia san pham
        //4:ma nha cung cap
    
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
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableGiaNhap = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDonDatHang = new javax.swing.JTable();
        jButtonXuatFile = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBtnRefresh = new javax.swing.JButton();
        jSpinnerSoluongHang = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
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

        jLabel1.setText("Các sản phẩm có số lượng nhỏ hơn:");

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
        jComboBoxNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxNhaCungCapMouseClicked(evt);
            }
        });
        jComboBoxNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNhaCungCapActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jTableGiaNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nhà cung cấp", "Giá cung ứng"
            }
        ));
        jScrollPane5.setViewportView(jTableGiaNhap);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAdd)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButtonAdd))
                .addGap(52, 52, 52))
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

        jButtonXuatFile.setText("Xuất file");
        jButtonXuatFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonXuatFileMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 608, Short.MAX_VALUE)
                        .addComponent(jButtonXuatFile))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonXuatFile)
                .addContainerGap())
        );

        jLabel3.setText("Danh sách các mặt hàng cần nhập:");

        jBtnRefresh.setText("Làm mới");
        jBtnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnRefreshMouseClicked(evt);
            }
        });

        jSpinnerSoluongHang.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jButton1.setText("Làm mới");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerSoluongHang, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnRefresh)
                        .addGap(11, 11, 11)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jBtnRefresh)
                            .addComponent(jSpinnerSoluongHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, Short.MAX_VALUE))
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
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1174, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
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
        hienThiDanhSachCacMatHangNhoHonSoLuongChoTruoc(Integer.parseInt(jSpinnerSoluongHang.getValue().toString()));
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
          ArrayList<GiaoDichNhap> giaodichnhaps = new ArrayList<>();
          for(Object[]produces:listProducesForTableNhapHang){
              giaodichnhaps.add(new GiaoDichNhap(produces[1].toString(), //id san pham
                                                 Integer.parseInt(produces[0].toString()), //id hoa don
                                                 Integer.parseInt(produces[2].toString()), //so luong
                                                 Integer.parseInt(produces[3].toString()),    //gia tien
                                                 "true")); //status
          }
          NhapThemHangBO.NhapThemHang(giaodichnhaps);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButtonXuatFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonXuatFileMouseClicked
       //count so luong nha san xuat
        ArrayList<Integer> idNhaSanXuat = new ArrayList();
       
        for (Object[] produce : listProducesForTableDonNhapHang) {
               
            int id = Integer.parseInt(produce[5].toString());
            if(!isDuplicateNumber(idNhaSanXuat,id)) idNhaSanXuat.add(id);
        }
        DatHang(idNhaSanXuat);
        TaoHoaDonDatHang(idNhaSanXuat);
        JOptionPane.showMessageDialog(this, "Các đơn hàng đã được tạo thành công");
    }//GEN-LAST:event_jButtonXuatFileMouseClicked

    private void jComboBoxNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNhaCungCapActionPerformed
       
    }//GEN-LAST:event_jComboBoxNhaCungCapActionPerformed

    private void jButtonAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMouseClicked
        Object[] produces = new Object[7];
        produces[0] = jTable1.getValueAt(rowNumber, 0);
        produces[1] = jTable1.getValueAt(rowNumber, 1);
        produces[2] = jSpinner1.getValue();
        produces[3] = jComboBoxNhaCungCap.getSelectedItem();
        int idNhaCungCap = NhaCungCapDAO.getIdNhaCungCapByName(jComboBoxNhaCungCap.getSelectedItem().toString());
        produces[4] = nhacungcap_hanghoaDAO.getGiaCungUng(idNhaCungCap,produces[0].toString());
        produces[5] = idNhaCungCap;
        listProducesForTableDonNhapHang.add(produces);
        hienThiDanhSachSanPhamTrongDonDatHang();
    }//GEN-LAST:event_jButtonAddMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        ArrayList<NhaCungCap> listNhaCungCap = null;
        String idsanpham = null;
        int gia;
        rowNumber = jTable1.getSelectedRow();
        idsanpham = "" + jTable1.getValueAt(rowNumber, 0);
        listNhaCungCap = NhaCungCapDAO.getNhaCungCap(idsanpham);
        jComboBoxNhaCungCap.removeAllItems();
        
         ArrayList<Object[]> listGiaNhap = new ArrayList();
         Object[] giaNhap;
        for(int i = 0 ;i<listNhaCungCap.size();i++){
            String tennhacungcap = listNhaCungCap.get(i).getName();
            int idnhacungcap = listNhaCungCap.get(i).getId();
            jComboBoxNhaCungCap.addItem(tennhacungcap);
            giaNhap = new Object[2];
            giaNhap[0] = tennhacungcap;
            giaNhap[1] = nhacungcap_hanghoaDAO.getGiaCungUng(idnhacungcap, idsanpham);
            listGiaNhap.add(giaNhap);
        }
        hienThiDanhSachGiaNhapVaNhaCungCap(listGiaNhap);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBoxNhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxNhaCungCapMouseClicked

    }//GEN-LAST:event_jComboBoxNhaCungCapMouseClicked

    private void jBtnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnRefreshMouseClicked
        listProducesForTableCacMatHangDaHet.clear();
        hienThiDanhSachCacMatHangNhoHonSoLuongChoTruoc(Integer.parseInt(jSpinnerSoluongHang.getValue().toString()));
    }//GEN-LAST:event_jBtnRefreshMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        listProducesForTableDonNhapHang.clear();
        hienThiDanhSachSanPhamTrongDonDatHang();
    }//GEN-LAST:event_jButton1MouseClicked
    
    
    private void DatHang(ArrayList<Integer> idNhaSanXuat){
        ArrayList<GiaoDichNhap> giaodichnhaps = new ArrayList<>();
        PhieuNhapKho phieuNhapKho = null;
        for(int i :idNhaSanXuat){
            
            giaodichnhaps.clear();
            
            for(Object[] produces:listProducesForTableDonNhapHang){
              int id = Integer.parseInt(produces[5].toString());
              if(id == i ) {
                  giaodichnhaps.add(new GiaoDichNhap(produces[0].toString(),
                                                     id,
                                                     Integer.parseInt(produces[2].toString()),
                                                     Integer.parseInt(produces[4].toString()),
                                                     "false"));
              }
            }   
            
            phieuNhapKho = DatHangBO.DatHang(this.nhanVien, giaodichnhaps,i);
            
            for(Object[] produces:listProducesForTableDonNhapHang){
                 int id = Integer.parseInt(produces[5].toString());
                  if(id == i ) {
                      produces[6] = phieuNhapKho.getIdhoadon();
                  }
            }
        }
       
    }
    private void TaoHoaDonDatHang(ArrayList<Integer> idNhaSanXuat){
       
       for(int i:idNhaSanXuat){
            String tenNhaCungCap = NhaCungCapDAO.getNameById(i);
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            String currentDate = dateFormat.format(date);
            
            String path = "/home/vhk/PROJECT_ON_GIT/mediaoneteam/test/dathangCSV/"+currentDate+tenNhaCungCap+".csv";
    
            File f = new File(path);
            f.getParentFile().mkdirs(); 
            try {
                f.createNewFile();
            } catch (IOException ex) {}
            int id;
            PrintWriter printWriter = null;
            try {
                printWriter = new PrintWriter(f);
                for(Object[] produces:listProducesForTableDonNhapHang){
                   id = Integer.parseInt(produces[5].toString());
                   if(id == i){
                    printWriter.println(produces[6].toString()+","//idphieunhapkho
                            +produces[0].toString()+","+//idsanpham
                            produces[2].toString()+","+//soluong
                            produces[4].toString()+","+//gianhap
                            i);//idnhacungcap 
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
         String coltitle[] = new String[]{"mã sản phẩm", "tên sản phẩm","Số lượng","Nhà cung cấp","Gía cung ứng"};
        DefaultTableModel model = new DefaultTableModel(coltitle, 0);
        for (Object[] row : listProducesForTableDonNhapHang) {
            model.addRow(row);
        }
        jTableDonDatHang.setModel(model);
    }
    private void hienThiDanhSachCacMatHangNhoHonSoLuongChoTruoc(int soluong){
        ArrayList<SanPham> listSanPhamHetHang = SanPhamDAO.getSanPhamNhoHonSoluongChoTruoc(soluong);
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
            objProduces[0] = produces[1];//ma san pham
            objProduces[1] = SanPhamDAO.getNameById(produces[1].toString());
            objProduces[2] = NhaCungCapDAO.getNameById(Integer.parseInt(produces[4].toString()));
            objProduces[3] = produces[2];//so luong san pham
            objProduces[4] = produces[3];//gia nhap
            tmp.add(objProduces);
        }
        
        for (Object[] row : tmp) {
            model.addRow(row);
        }
        jTable3.setModel(model);
    }
    private void hienThiDanhSachGiaNhapVaNhaCungCap(ArrayList<Object[]> listGiaNhap){
         String coltitle[] = new String[]{"nhà cung cấp", "Giá cung ứng"};
         DefaultTableModel model = new DefaultTableModel(coltitle, 0);   
         for(Object[] row:listGiaNhap){
             model.addRow(row);
         }
         jTableGiaNhap.setModel(model);
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
    private javax.swing.JButton jBtnRefresh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonXuatFile;
    private javax.swing.JComboBox<String> jComboBoxNhaCungCap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinnerSoluongHang;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTableDonDatHang;
    private javax.swing.JTable jTableGiaNhap;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
