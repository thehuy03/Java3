package lab6;


import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Lab6Bai2 extends javax.swing.JFrame {
    boolean addNew=false;
    boolean fill=false;
    Vector data=new Vector();
    Vector header=new Vector();
    Vector col =new Vector();
    Connection con=null;
    PreparedStatement pstDetails=null;
    PreparedStatement pstInsert=null;
    PreparedStatement pstDelete=null;
    PreparedStatement pstUpdate=null;
    String sqlInsert="Insert into Students ([Name],Address,ParentName,Phone,standard) values(?,?,?,?,?)";
    String sqlDelete="Delete from Students where Name=?";
    String sqlUpdate="Update Students set Address=?,  ParentName=?,Phone=? ,standard=? where Name=?";
    ResultSet rts;
    /** Creates new form Assignment */
    public Lab6Bai2() {
        initComponents();
      //  this.cbMID.setVisible(false);
       // this.pnlDetails.setVisible(false);
        //connect database
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database=ps21795_DangTheHuy_sof203_Demo_asm;userName=as;password=");
            pstInsert=con.prepareStatement(this.sqlInsert);
            pstUpdate=con.prepareStatement(this.sqlUpdate);
            pstDelete=con.prepareStatement(this.sqlDelete);
            pstDetails=con.prepareStatement("select * from Students",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rts=pstDetails.executeQuery();
            JOptionPane.showMessageDialog(this,"Connection  Database Successful!");
            this.loadCombobox();
            this.loadData();
            fill=true;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
        btnUpdate.setEnabled(false);      
    }

  private void loadCombobox(){
    String sql1="select * from dbo.Standars";
      try{
          Statement  stm=con.createStatement();
          ResultSet rs=stm.executeQuery(sql1);
          Vector<String> standards=new Vector<String>();
          Vector<Integer> fees=new Vector<Integer>();
          while(rs.next()){
              cbb_Stan.addItem(rs.getString(1));
              cbb_Fees.addItem(rs.getInt(2));
          }
      }catch(Exception e){
          JOptionPane.showMessageDialog(this,e.getMessage());
               System.exit(0);
      }
  }
    private void loadData() throws SQLException
    {
        String sql="Select [Name], standard from Students";
        try
        {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            data.removeAllElements();
            if(!fill)
            {
                    //get header
                    ResultSetMetaData rsmd=rs.getMetaData();
                    int n=rsmd.getColumnCount();
                    
                        col.add(rsmd.getColumnName(1));
                        col.add(rsmd.getColumnName(2));
            }
            //get data
            while(rs.next())
            {
                Vector v=new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));                      
                data.add(v);
            }
            TableModel tbl=new DefaultTableModel(data,col);
            this.tblStudent.setModel(tbl);
            rs.close();
            st.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }
    boolean validates(){

        if(txt_Name.getText().matches("^\\w+$")==false){
            JOptionPane.showMessageDialog(this, "Name ko dc trong ", "Chu y", 1);
            txt_Name.requestFocus();
            return false;
        }
        String pName=this.txt_Name.getText().trim();
                        Iterator it=data.iterator();
                        while(it.hasNext())
                        {
                            Vector v=(Vector)it.next();
                            String name=((String)v.get(0)).trim();
                            if(pName.equalsIgnoreCase(name))
                            {
                                JOptionPane.showMessageDialog(this,"Ten Sinh Vien  nay da ton tai!");
                                this.txt_Name.grabFocus();
                                return false;
                            }
        }
        if(txt_Address.getText().matches("^\\w+$")==false){
            JOptionPane.showMessageDialog(this, "Address khong duoc de trong ","Chu y",1);
            txt_Address.requestFocus();
            return false;
        }
       if(txt_PName.getText().matches("^\\w+$")==false){
            JOptionPane.showMessageDialog(this, "ParentsName khong duoc de trong ","Chu y",1);
            txt_PName.requestFocus();
            return false;
        }
        
         if(txt_Con.getText().matches("^\\d{7,11}$")==false){
            JOptionPane.showMessageDialog(this, "Contact(Phone) khong duoc de trong va phai la 7-12 so ","Chu y",1);
            txt_Con.requestFocus();
            return false;
        }
        if((cbb_Stan.getSelectedIndex()==0))
        {
            JOptionPane.showMessageDialog(this,cbb_Stan.getSelectedItem());
        }

        return true;
    }
    boolean duplicate(String s){
        if(addNew==false) return false;
        for (int i=0;i<data.size();i++){
            Vector v=(Vector)data.get(i);
            if(s.equalsIgnoreCase((String)v.get(0))) return true;
        }
        return false;
    }
     private void clearForm() {

        txt_Name.setText("");
        txt_Address.setText("");
        txt_PName.setText("");
        txt_Con.setText("");
        cbb_Stan.setSelectedIndex(0);
        cbb_Fees.setSelectedIndex(0);
        txt_Name.requestFocus();
    }
 
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_Address = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txt_PName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Con = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbb_Stan = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cbb_Fees = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Students Review Details");

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPre.setText("Previous");
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnCancel.setText("New");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnEdit)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPre)
                    .addComponent(btnNext)
                    .addComponent(btnExit)
                    .addComponent(btnDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Standard"
            }
        ));
        tblStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblStudentMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudent);

        jLabel1.setText("Name:");

        jLabel2.setText("Address:");

        txt_Address.setColumns(20);
        txt_Address.setRows(5);
        jScrollPane2.setViewportView(txt_Address);

        jLabel3.setText("ParentName:");

        jLabel4.setText("ContactNo:");

        jLabel5.setText("Standard:");

        cbb_Stan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "........" }));
        cbb_Stan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_StanActionPerformed(evt);
            }
        });

        jLabel6.setText("Fees:");

        cbb_Fees.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "........" }));
        cbb_Fees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_FeesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_PName))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbb_Stan, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Con, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbb_Fees, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_PName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cbb_Stan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbb_Fees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbb_StanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_StanActionPerformed
        cbb_Fees.setSelectedIndex(cbb_Stan.getSelectedIndex());
    }//GEN-LAST:event_cbb_StanActionPerformed

    private void cbb_FeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_FeesActionPerformed
        cbb_Stan.setSelectedIndex(cbb_Fees.getSelectedIndex());
    }//GEN-LAST:event_cbb_FeesActionPerformed

    private void tblStudentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentMouseReleased
       if(this.tblStudent.getCellEditor()!=null)
            this.tblStudent.getCellEditor().cancelCellEditing();
    }//GEN-LAST:event_tblStudentMouseReleased

    private void tblStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentMouseClicked
        // TODO add your handling code here:
        try{
            rts.beforeFirst();
            this.clearForm();
            int row=tblStudent.getSelectedRow();
            String name=(String) tblStudent.getValueAt(row,0);
            while(rts.next()){
                String str=rts.getString(2); //JOptionPane.showMessageDialog(null,""+jrs.getString(2)+"  "+name);
                if(str.equalsIgnoreCase(name))
                {   txt_Name.setText(rts.getString(2));
                    txt_Address.setText(rts.getString(3));
                    txt_Con.setText(rts.getInt(5)+"");
                    //String parent=dencry(rts.getString(5));
                    txt_PName.setText(rts.getString(4));
                    cbb_Stan.setSelectedItem(rts.getString(6));
                    //com_fees.setSelectedItem(rts.getInt(7));
                    break;
                }
            }
        }catch(Exception e){}
        txt_Name.setEnabled(false);
        txt_Address.setEnabled(false);
        txt_PName.setEnabled(false);
        txt_Con.setEnabled(false);
        cbb_Stan.setEnabled(false);
        cbb_Fees.setEnabled(false);
    }//GEN-LAST:event_tblStudentMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try
        {
            int n;
            if(addNew)
            {
                //them moi
                //set cac tham so
                pstInsert.setString(1,this.txt_Name.getText().trim());
                pstInsert.setString(2,txt_Address.getText().trim());
                pstInsert.setString(3,txt_PName.getText().trim());
                pstInsert.setString(4,txt_Con.getText().trim());
                pstInsert.setString(5,(String) cbb_Stan.getSelectedItem());
                n=pstInsert.executeUpdate();//thuc thi
                this.loadData();
            }
            else
            {
                //update
                //set cac tham so
                pstUpdate.setString(5,this.txt_Name.getText().trim());
                pstUpdate.setString(2,this.txt_Address.getText().trim());
                pstUpdate.setString(1,this.txt_PName.getText().trim());
                pstUpdate.setString(3,this.txt_Con.getText().trim());
                pstUpdate.setString(4,(String) cbb_Stan.getSelectedItem());
                n=pstUpdate.executeUpdate();//thuc thi
                this.loadData();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        clearForm();
        txt_Name.setEnabled(true);
        txt_Address.setEnabled(true);
        txt_PName.setEnabled(true);
        txt_Con.setEnabled(true);
        cbb_Fees.setEnabled(true);
        cbb_Stan.setEnabled(true);
        txt_Name.requestFocus();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        btnUpdate.setEnabled(true);
        btnCancel.setEnabled(true);
        btnEdit.setEnabled(true);
        txt_Name.setEnabled(true);
        txt_Address.setEnabled(true);
        txt_PName.setEnabled(true);
        txt_Con.setEnabled(true);
        cbb_Stan.setEnabled(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreActionPerformed
        try {
            //JOptionPane.showMessageDialog(this, "Co loi xay ra");
            rts.previous();
            //  JOptionPane.showMessageDialog(this, "Co loi xay ra");
            btnNext.setEnabled(true);
            if(rts.isBeforeFirst()){
                // System.out.println("co loi xay ra");
                btnPre.setEnabled(false);
                btnNext.setEnabled(true);
                JOptionPane.showMessageDialog(null, "You have reached the first record " +
                    "of the ResultSet!!!!");
            }
            else {
                txt_Name.setText(rts.getString(2));
                txt_Address.setText(rts.getString(3));
                txt_PName.setText(rts.getString(4));
                txt_Con.setText(rts.getString(5));
                cbb_Stan.setSelectedItem(rts.getString(6));
            }
        } catch (Exception e) {
            //JOptionPane.showConfirmDialog(this,"co loi xay ra");
        }
    }//GEN-LAST:event_btnPreActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

        //loadCombobox();
        try {
            rts.next();
            btnPre.setEnabled(true);
            if(rts.isAfterLast() || rts.isBeforeFirst()){
                btnNext.setEnabled(false);
                btnPre.setEnabled(true);
                JOptionPane.showMessageDialog(null, "You have reached the last record" +
                    " of the ResultSet!!!!");
            } else {
                txt_Name.setText(rts.getString(2));
                txt_Address.setText(rts.getString(3));
                txt_PName.setText(rts.getString(4));
                txt_Con.setText(rts.getString(5));
                cbb_Stan.setSelectedItem(rts.getString(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        fill=false;
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try
        {
            int n=this.tblStudent.getSelectedRow();
            if(n>=0)//nguoi dung co chon
            {
                //this.pnlDetails.setVisible(false);
                Vector v=(Vector)data.get(n);
                int ans=JOptionPane.showConfirmDialog(this,"Ban co thuc su muon xoa Sinh Vien " + ((String)v.get(0)).trim() + " khong?");
                if(ans==JOptionPane.YES_OPTION)
                {
                    pstDelete.setString(1,(String)v.get(0));
                    pstDelete.executeUpdate();
                    this.loadData();
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if(!validates()) return;
        String name=txt_Name.getText();
        String addr=txt_Address.getText();
        String parentName=txt_PName.getText();
        String phone=txt_Con.getText();
        String standard=(String) cbb_Stan.getSelectedItem();
        try{
            pstInsert.setString(1,name);
            pstInsert.setString(2,addr);
            pstInsert.setString(3,parentName);
            pstInsert.setString(4,phone);
            pstInsert.setString(5,standard);
            int addRows= pstInsert.executeUpdate();
            this.loadData();
            clearForm();
            if(addRows>0)
            JOptionPane.showMessageDialog(this, "Students Details Have Been Save","Successfull",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Failed to save data in database", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab6Bai2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cbb_Fees;
    private javax.swing.JComboBox cbb_Stan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTextArea txt_Address;
    private javax.swing.JTextField txt_Con;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_PName;
    // End of variables declaration//GEN-END:variables

}
