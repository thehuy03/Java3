/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Bai3 extends javax.swing.JFrame {

  
    public Bai3() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pPersonalDetails = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        bntExit = new javax.swing.JButton();
        pPersonalDetails1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        taAddress = new javax.swing.JTextArea();
        pAcamedicDetails = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtHighestQualification = new javax.swing.JTextField();
        txtSpecification = new javax.swing.JTextField();
        txtEnrollFor = new javax.swing.JTextField();
        pExtracurricularDetails = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtHobbies = new javax.swing.JTextField();
        txtSport = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("STUDENT REGISTRATION");

        pPersonalDetails.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSave.setMnemonic('a');
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setMnemonic('R');
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        bntExit.setMnemonic('E');
        bntExit.setText("Exit");
        bntExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pPersonalDetailsLayout = new javax.swing.GroupLayout(pPersonalDetails);
        pPersonalDetails.setLayout(pPersonalDetailsLayout);
        pPersonalDetailsLayout.setHorizontalGroup(
            pPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPersonalDetailsLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btnSave)
                .addGap(41, 41, 41)
                .addComponent(btnReset)
                .addGap(39, 39, 39)
                .addComponent(bntExit)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        pPersonalDetailsLayout.setVerticalGroup(
            pPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPersonalDetailsLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(pPersonalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntExit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pPersonalDetails1.setBorder(javax.swing.BorderFactory.createTitledBorder("Personal Details"));

        jLabel6.setText("First Name");

        jLabel7.setText("Last Name");

        jLabel8.setText("Contact");

        jLabel9.setText("Address");

        txtFirstName.setToolTipText("");

        txtLastName.setToolTipText("");

        txtContact.setToolTipText("");

        taAddress.setColumns(20);
        taAddress.setRows(5);
        jScrollPane2.setViewportView(taAddress);

        javax.swing.GroupLayout pPersonalDetails1Layout = new javax.swing.GroupLayout(pPersonalDetails1);
        pPersonalDetails1.setLayout(pPersonalDetails1Layout);
        pPersonalDetails1Layout.setHorizontalGroup(
            pPersonalDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPersonalDetails1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pPersonalDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pPersonalDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9))
                    .addComponent(jLabel6))
                .addGap(10, 10, 10)
                .addGroup(pPersonalDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFirstName)
                    .addComponent(txtLastName)
                    .addComponent(txtContact)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                .addGap(67, 67, 67))
        );
        pPersonalDetails1Layout.setVerticalGroup(
            pPersonalDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPersonalDetails1Layout.createSequentialGroup()
                .addGroup(pPersonalDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pPersonalDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pPersonalDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pPersonalDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pAcamedicDetails.setBorder(javax.swing.BorderFactory.createTitledBorder("Acamedic Details"));

        jLabel5.setText("Highest Qualification");

        jLabel10.setText("Specification");

        jLabel11.setText("Enroll For");

        txtHighestQualification.setToolTipText("");

        txtSpecification.setToolTipText("");

        txtEnrollFor.setToolTipText("");

        javax.swing.GroupLayout pAcamedicDetailsLayout = new javax.swing.GroupLayout(pAcamedicDetails);
        pAcamedicDetails.setLayout(pAcamedicDetailsLayout);
        pAcamedicDetailsLayout.setHorizontalGroup(
            pAcamedicDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAcamedicDetailsLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pAcamedicDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pAcamedicDetailsLayout.createSequentialGroup()
                        .addGroup(pAcamedicDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(50, 50, 50))
                    .addGroup(pAcamedicDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(pAcamedicDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEnrollFor)
                    .addComponent(txtSpecification)
                    .addComponent(txtHighestQualification, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        pAcamedicDetailsLayout.setVerticalGroup(
            pAcamedicDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAcamedicDetailsLayout.createSequentialGroup()
                .addGroup(pAcamedicDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHighestQualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pAcamedicDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAcamedicDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel11))
                    .addGroup(pAcamedicDetailsLayout.createSequentialGroup()
                        .addComponent(txtSpecification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEnrollFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pExtracurricularDetails.setBorder(javax.swing.BorderFactory.createTitledBorder("Extracurricular Details"));

        jLabel4.setText("Hobbies");

        jLabel12.setText("Sport");

        txtHobbies.setToolTipText("");

        txtSport.setToolTipText("");

        javax.swing.GroupLayout pExtracurricularDetailsLayout = new javax.swing.GroupLayout(pExtracurricularDetails);
        pExtracurricularDetails.setLayout(pExtracurricularDetailsLayout);
        pExtracurricularDetailsLayout.setHorizontalGroup(
            pExtracurricularDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pExtracurricularDetailsLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pExtracurricularDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12))
                .addGap(55, 55, 55)
                .addGroup(pExtracurricularDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSport)
                    .addComponent(txtHobbies, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        pExtracurricularDetailsLayout.setVerticalGroup(
            pExtracurricularDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExtracurricularDetailsLayout.createSequentialGroup()
                .addGroup(pExtracurricularDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pExtracurricularDetailsLayout.createSequentialGroup()
                        .addComponent(txtHobbies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pExtracurricularDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1))
                    .addComponent(pPersonalDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pAcamedicDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pExtracurricularDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPersonalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pPersonalDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pAcamedicDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pExtracurricularDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pPersonalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        try
        {
            FileWriter fileWriter = new FileWriter("D:\\java3\\StuRegnew.txt", true);
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);

            fileWriter.write("Personal Details: \n\tFull name: " + this.txtFirstName.getText() +
                " " + this.txtLastName.getText() + " \n");
            fileWriter.write("\tContact: " + this.txtContact.getText() + " \n");
            fileWriter.write("\tAddress: " + this.taAddress.getText() + " \n");

            fileWriter.write("Academic Details: \n\tHighest Qualification: " + this.txtHighestQualification.getText() + " \n");
            fileWriter.write("\tSpecification: " + this.txtSpecification.getText() + " \n");
            fileWriter.write("\tEnroll For: " + this.txtEnrollFor.getText() + " \n");

            fileWriter.write("Extracurricular Details: \n\tHobbies: " + this.txtHobbies.getText() + " \n");
            fileWriter.write("\tSport: " + this.txtSport.getText() + " \n \n");

            fileWriter.close();
        }
        catch(IOException ioe)
        {
            JOptionPane.showMessageDialog(this, ioe.getMessage(), "File error", 0);
        }
        finally
        {
            JOptionPane.showMessageDialog(this, "Student informations were written into the file!",
                "Registration message", 1);
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        this.txtContact.setText("");
        this.txtEnrollFor.setText("");
        this.txtFirstName.setText("");
        this.txtHighestQualification.setText("");
        this.txtHobbies.setText("");
        this.txtLastName.setText("");
        this.txtSpecification.setText("");
        this.txtSport.setText("");
        this.taAddress.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void bntExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bntExitActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pAcamedicDetails;
    private javax.swing.JPanel pExtracurricularDetails;
    private javax.swing.JPanel pPersonalDetails;
    private javax.swing.JPanel pPersonalDetails1;
    private javax.swing.JTextArea taAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEnrollFor;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHighestQualification;
    private javax.swing.JTextField txtHobbies;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtSpecification;
    private javax.swing.JTextField txtSport;
    // End of variables declaration//GEN-END:variables
}
