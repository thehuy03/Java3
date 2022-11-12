package ASM;

import static ASM.QuanLyDiem.index;
import java.awt.Color;
import java.sql.*;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lab5.Student;

public class quanLySV extends javax.swing.JFrame {

    public quanLySV() {
        initComponents();
        LoadDataToArray();
    }

    List<SinhVien> listSV = new ArrayList<>();
    DefaultTableModel tb;
    String PATH = "";
    static int index = -1;
    static int[] indexs;
    String userName = "sa";
    String password = "";
    String url = "jdbc:sqlserver://localhost:1433;databaseName=ps21795_DangTheHuy_SOF203_ASM;encrypt=true;trustServerCertificate=true";

    public void Display(int i) {
        SinhVien sv = listSV.get(i);
        txtDiaChi.setText(sv.diaChi);
        txtEmail.setText(sv.email);
        txtHoTen.setText(sv.hoTen);
        txtMaSV.setText(sv.maSV);
        txtSDT.setText(sv.sdt);
        String gt = sv.gioiTinh;
        if (gt.equalsIgnoreCase("nam")) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        PATH = sv.anh;
        lblAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource(PATH)));
    }

    public void LoadDataToArray() {
        listSV.clear();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, userName, password);
            String sql = "select * from students";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String masv = rs.getString("maSV");
                String hoten = rs.getString("hoTen");
                String email = rs.getString("email");
                String sodt = rs.getString("sdt");
                String gt = (rs.getBoolean("gioiTinh") == false ? "Nam" : "Nữ");
                String diachi = rs.getString("diaChi");
                String path = rs.getString("hinh");
                SinhVien sv = new SinhVien(masv, hoten, email, sodt, gt, diachi, path);
                listSV.add(sv);
            }
            fillTable();
            rs.close();
            st.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void fillTable() {
        tb = (DefaultTableModel) table.getModel();
        tb.setRowCount(0);
        for (SinhVien sv : listSV) {
            Object[] duLieu = {sv.maSV, sv.hoTen, sv.email, sv.sdt, sv.gioiTinh, sv.diaChi};
            tb.addRow(duLieu);
        }
    }

    public boolean checkForm() {
        if (txtMaSV.getText().strip().isEmpty() || txtHoTen.getText().strip().isEmpty()
                || txtSDT.getText().strip().isEmpty() || txtEmail.getText().strip().isEmpty() || txtDiaChi.getText().strip().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống các ô nhập");
            return false;
        }
        if (!rdoNam.isSelected() || !rdoNu.isSelected()) {
            JOptionPane.showMessageDialog(this, "Không được để trống nút chọn");
            return false;
        }
        return true;
    }

//    public void showDetail() {
//        SinhVien sv = listSV.get(index);
//
//        txtMaSV.setText(sv.maSV);
//        txtHoTen.setText(sv.hoTen);
//        txtEmail.setText(sv.email);
//        txtSDT.setText(sv.sdt);
//        if (rdoNam.isSelected()) {
//            rdoNam.setSelected(true);
//        } else {
//            rdoNu.setSelected(true);
//        }
//        txtDiaChi.setText(sv.diaChi);
//
//    }
    public void clear() {
        txtDiaChi.setText("");
        txtEmail.setText("");
        txtHoTen.setText("");
        txtMaSV.setText("");
        txtSDT.setText("");
        btngr.clearSelection();
        lblAnh.setIcon(null);
    }

    public void delete() {
        index = table.getSelectedRow();
        listSV.remove(index);
        fillTable();
    }

    public void deleteS() {
        indexs = table.getSelectedRows();
        for (int i = indexs.length - 1; i >= 0; i--) {
            listSV.remove(indexs[i]);
        }
        fillTable();
    }

    public boolean validateform() {
        if (txtMaSV.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Mã số sinh viên không được để trống");
            txtMaSV.setBackground(Color.yellow);
            txtMaSV.requestFocus();
            return false;
        }
        if (txtHoTen.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Mã số sinh viên không được để trống");
            txtHoTen.setBackground(Color.yellow);
            txtHoTen.requestFocus();
            return false;
        }
        if (txtEmail.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Mã số sinh viên không được để trống");
            txtEmail.setBackground(Color.yellow);
            txtEmail.requestFocus();
            return false;
        }
        if (txtSDT.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Mã số sinh viên không được để trống");
            txtSDT.setBackground(Color.yellow);
            txtSDT.requestFocus();
            return false;
        }

        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngr = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblAnh = new javax.swing.JLabel();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnAddIMG = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        jLabel2.setText("Mã SV");

        jLabel3.setText("Giới Tính");

        jLabel4.setText("Họ Tên");

        jLabel5.setText("Địa Chỉ");

        jLabel6.setText("Email");

        jLabel7.setText("SĐT");

        btngr.add(rdoNam);
        rdoNam.setText("Nam");

        btngr.add(rdoNu);
        rdoNu.setText("Nữ");

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        jScrollPane1.setViewportView(txtDiaChi);

        btnNew.setIcon(new javax.swing.ImageIcon("D:\\java3\\taiLieu\\icon\\icon\\Button-New-icon.png")); // NOI18N
        btnNew.setText("New");
        btnNew.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon("D:\\java3\\taiLieu\\icon\\icon\\save-icon.png")); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon("D:\\java3\\taiLieu\\icon\\icon\\Button-Close-icon.png")); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon("D:\\java3\\taiLieu\\icon\\icon\\update-icon.png")); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MãSV", "Họ Tên", "Email", "SĐT", "Giới Tính", "Địa Chỉ"
            }
        ));
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        lblAnh.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnFirst.setIcon(new javax.swing.ImageIcon("D:\\java3\\taiLieu\\icon\\icon\\Button-Rewind-icon.png")); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnLast.setIcon(new javax.swing.ImageIcon("D:\\java3\\taiLieu\\icon\\icon\\Button-Forward-icon.png")); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnPre.setIcon(new javax.swing.ImageIcon("D:\\java3\\taiLieu\\icon\\icon\\Button-First-icon.png")); // NOI18N
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });

        btnNext.setIcon(new javax.swing.ImageIcon("D:\\java3\\taiLieu\\icon\\icon\\Button-Last-icon.png")); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnAddIMG.setText("Add IMG");
        btnAddIMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddIMGActionPerformed(evt);
            }
        });

        jMenu1.setText("Quản lý điểm");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Thoát");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSDT))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addComponent(rdoNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoNu)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddIMG)
                        .addGap(52, 52, 52)
                        .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtHoTen))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEmail)))
                                .addGap(119, 119, 119)
                                .addComponent(jLabel1)))
                        .addContainerGap(140, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu)
                            .addComponent(btnAddIMG)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNew)
                            .addComponent(btnSave))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnUpdate)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFirst))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (validateform()) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(url, userName, password);
                Boolean gt = rdoNam.isSelected() ? false : true;
                PreparedStatement ps = con.prepareStatement("insert into students values(?,?,?,?,?,?,?)");
                ps.setString(1, txtMaSV.getText());
                ps.setString(2, txtHoTen.getText());
                ps.setString(3, txtEmail.getText());
                ps.setString(4, txtSDT.getText());
                ps.setBoolean(5, gt);
                ps.setString(6, txtDiaChi.getText());
                ps.setString(7, PATH);
                int kq = ps.executeUpdate();

                if (kq == 1) {
                    JOptionPane.showMessageDialog(this, "Successfull");
                } else {
                    JOptionPane.showMessageDialog(this, "fail");
                }
                LoadDataToArray();
                clear();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Tài khoản đã tồn tại");
                clear();
            }
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ");
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddIMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddIMGActionPerformed
        // TODO add your handling code here:
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        JFileChooser fs = new JFileChooser("src\\ASM\\img");
        int n = fs.showOpenDialog(null);
        if (n == JFileChooser.APPROVE_OPTION) {
            String duongDan = fs.getSelectedFile().getAbsolutePath();
            PATH = duongDan.substring(duongDan.indexOf("img")).replaceAll("\\\\", "/");
            lblAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource(PATH)));
        }

    }//GEN-LAST:event_btnAddIMGActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        index = table.getSelectedRow();
        Display(index);
    }//GEN-LAST:event_tableMouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        clear();
        txtMaSV.requestFocus();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String maSV = JOptionPane.showInputDialog("Nhap ma SV muon xoa");
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, userName, password);
            PreparedStatement ps = con.prepareStatement("delete from students where maSV = ?");
            ps.setString(1, maSV);
            int kq = ps.executeUpdate();
            if (kq == 1) {
                JOptionPane.showMessageDialog(this, "Xoa thanh cong");
                LoadDataToArray();
            } else {
                JOptionPane.showMessageDialog(this, "Xoa That bai");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, userName, password);
            PreparedStatement ps = con.prepareStatement("update students set  hoTen = ? , email = ? , sdt = ? , gioiTinh = ? , diaChi = ? , hinh = ? where maSV = ?");
            ps.setString(1, txtHoTen.getText());
            ps.setString(2, txtEmail.getText());
            ps.setString(3, txtSDT.getText());
            ps.setBoolean(4, rdoNam.isSelected() ? false : true);
            ps.setString(5, txtDiaChi.getText());
            ps.setString(6, PATH);
            ps.setString(7, txtMaSV.getText());
            int kq = ps.executeUpdate();
            if (kq == 1) {
                JOptionPane.showMessageDialog(this, "Cap nhap thanh cong");
                LoadDataToArray();
            } else {
                JOptionPane.showMessageDialog(this, "Cap nhap That bai");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
//        QuanLyDiem qld = new QuanLyDiem();
//        qld.setVisible(true);
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        QuanLyDiem qld = new QuanLyDiem();
        qld.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        index = 0;
        Display(index);
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        index = listSV.size() - 1;
        Display(index);
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreActionPerformed
        index--;
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Đang ở đầu danh sách!");
            return;
        }
        Display(index);
    }//GEN-LAST:event_btnPreActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        index++;
        if (index >= listSV.size()) {
            JOptionPane.showMessageDialog(null, "Đang ở cuối!");
            return;
        }
        Display(index);
    }//GEN-LAST:event_btnNextActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu2MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quanLySV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddIMG;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup btngr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable table;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
