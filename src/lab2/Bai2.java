
package lab2;

import javax.swing.JButton;


public class Bai2 extends javax.swing.JFrame {

 
    public Bai2() {
        initComponents();
    }
    long a = 0;
    String phepToan="";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSo = new javax.swing.JTextField();
        btnSo1 = new javax.swing.JButton();
        btnSo2 = new javax.swing.JButton();
        btnSo3 = new javax.swing.JButton();
        btnChia = new javax.swing.JButton();
        btnSQRT = new javax.swing.JButton();
        btnSo5 = new javax.swing.JButton();
        btnSo6 = new javax.swing.JButton();
        btnNhan = new javax.swing.JButton();
        btnPhanTram = new javax.swing.JButton();
        btnSo4 = new javax.swing.JButton();
        btnSo8 = new javax.swing.JButton();
        btnSo9 = new javax.swing.JButton();
        btnTru = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        btnSo7 = new javax.swing.JButton();
        btnSo0 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        btnCong = new javax.swing.JButton();
        btnBang = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("CASIO");

        txtSo.setEditable(false);
        txtSo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnSo1.setText("1");
        btnSo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo1ActionPerformed(evt);
            }
        });

        btnSo2.setText("2");
        btnSo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo2ActionPerformed(evt);
            }
        });

        btnSo3.setText("3");
        btnSo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo3ActionPerformed(evt);
            }
        });

        btnChia.setText(":");
        btnChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiaActionPerformed(evt);
            }
        });

        btnSQRT.setText("sqrt");
        btnSQRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSQRTActionPerformed(evt);
            }
        });

        btnSo5.setText("5");
        btnSo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo5ActionPerformed(evt);
            }
        });

        btnSo6.setText("6");
        btnSo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo6ActionPerformed(evt);
            }
        });

        btnNhan.setText("x");
        btnNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanActionPerformed(evt);
            }
        });

        btnPhanTram.setText("%");
        btnPhanTram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhanTramActionPerformed(evt);
            }
        });

        btnSo4.setText("4");
        btnSo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo4ActionPerformed(evt);
            }
        });

        btnSo8.setText("8");
        btnSo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo8ActionPerformed(evt);
            }
        });

        btnSo9.setText("9");
        btnSo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo9ActionPerformed(evt);
            }
        });

        btnTru.setText("-");
        btnTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruActionPerformed(evt);
            }
        });

        jButton14.setText("1/x");

        btnSo7.setText("7");
        btnSo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo7ActionPerformed(evt);
            }
        });

        btnSo0.setText("0");
        btnSo0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo0ActionPerformed(evt);
            }
        });

        jButton17.setText("C");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        btnCong.setText("+");
        btnCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongActionPerformed(evt);
            }
        });

        btnBang.setText("=");
        btnBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangActionPerformed(evt);
            }
        });

        jButton20.setText("+/-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSo1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSo2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSo3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChia, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSQRT, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnSo4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSo5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSo6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPhanTram, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnSo7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSo8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSo9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTru, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSo0, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCong, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBang, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSo2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSo3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSQRT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSo1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSo4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSo5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSo6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPhanTram, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSo7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSo8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSo9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTru, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSo0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo1ActionPerformed
        // TODO add your handling code here:
        String gt = txtSo.getText();
        if(gt.length()<12){
            if(gt.equals("0")){
                gt="";
            }
            long so = Long.parseLong(gt+btnSo1.getText());
            txtSo.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnSo1ActionPerformed

    private void btnSo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo2ActionPerformed
        // TODO add your handling code here:
        String gt = txtSo.getText();
        if(gt.length()<12){
            if(gt.equals("0")){
                gt="";
            }
            long so = Long.parseLong(gt+btnSo2.getText());
            txtSo.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnSo2ActionPerformed

    private void btnSo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo3ActionPerformed
        // TODO add your handling code here:
        String gt = txtSo.getText();
        if(gt.length()<12){
            if(gt.equals("0")){
                gt="";
            }
            long so = Long.parseLong(gt+btnSo3.getText());
            txtSo.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnSo3ActionPerformed

    private void btnSo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo4ActionPerformed
        // TODO add your handling code here:
        String gt = txtSo.getText();
        if(gt.length()<12){
            if(gt.equals("0")){
                gt="";
            }
            long so = Long.parseLong(gt+btnSo4.getText());
            txtSo.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnSo4ActionPerformed

    private void btnSo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo5ActionPerformed
        // TODO add your handling code here:
        String gt = txtSo.getText();
        if(gt.length()<12){
            if(gt.equals("0")){
                gt="";
            }
            long so = Long.parseLong(gt+btnSo5.getText());
            txtSo.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnSo5ActionPerformed

    private void btnSo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo6ActionPerformed
        // TODO add your handling code here:
        String gt = txtSo.getText();
        if(gt.length()<12){
            if(gt.equals("0")){
                gt="";
            }
            long so = Long.parseLong(gt+btnSo6.getText());
            txtSo.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btnSo6ActionPerformed

    private void btnSo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo7ActionPerformed
        // TODO add your handling code here:
        nhapSo(btnSo7);
    }//GEN-LAST:event_btnSo7ActionPerformed

    private void btnSo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo8ActionPerformed
        // TODO add your handling code here:
        nhapSo(btnSo8);
    }//GEN-LAST:event_btnSo8ActionPerformed

    private void btnSo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo9ActionPerformed
        // TODO add your handling code here:
        nhapSo(btnSo9);
    }//GEN-LAST:event_btnSo9ActionPerformed

    private void btnSo0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSo0ActionPerformed
        nhapSo(btnSo0);
    }//GEN-LAST:event_btnSo0ActionPerformed

    private void btnCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCongActionPerformed
        // TODO add your handling code here:
        nhapPhepTinh(btnCong);
    }//GEN-LAST:event_btnCongActionPerformed

    private void btnBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangActionPerformed
        // TODO add your handling code here:
        long kq = 0;
        long b = Long.parseLong(txtSo.getText());
        if(phepToan.equals("+")){
            kq = a+b;
            txtSo.setText(String.valueOf(kq));
        }else if(phepToan.equals("-")){
            kq = a-b;
            txtSo.setText(String.valueOf(kq));
        }else if(phepToan.equals("x")){
            kq = a*b;
            txtSo.setText(String.valueOf(kq));
        }else if(phepToan.equals(":")){
            kq = a/b;
            txtSo.setText(String.valueOf(kq));
        }else if(phepToan.equals("sqrl")){
            kq = (long) Math.sqrt(a);
            txtSo.setText(String.valueOf(kq));
        }else if(phepToan.equals("-")){
            kq = a-b;
            txtSo.setText(String.valueOf(kq));
        }else if(phepToan.equals("%")){
            kq = a%b;
            txtSo.setText(String.valueOf(kq));
        }
    }//GEN-LAST:event_btnBangActionPerformed

    private void btnTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruActionPerformed
        nhapPhepTinh(btnTru);
    }//GEN-LAST:event_btnTruActionPerformed

    private void btnNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanActionPerformed
        // TODO add your handling code here:
        nhapPhepTinh(btnNhan);
    }//GEN-LAST:event_btnNhanActionPerformed

    private void btnChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiaActionPerformed
        // TODO add your handling code here:
        nhapPhepTinh(btnChia);
    }//GEN-LAST:event_btnChiaActionPerformed

    private void btnSQRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSQRTActionPerformed
        // TODO add your handling code here:
        nhapPhepTinh(btnSQRT);
    }//GEN-LAST:event_btnSQRTActionPerformed

    private void btnPhanTramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhanTramActionPerformed
        // TODO add your handling code here:
        nhapPhepTinh(btnPhanTram);
    }//GEN-LAST:event_btnPhanTramActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        txtSo.setText("0");
        phepToan="0";
        a=0;
    }//GEN-LAST:event_jButton17ActionPerformed
    public void nhapSo(JButton btn){
        String gt = txtSo.getText();
        if(gt.length()<12){
            if(gt.equals("0")){
                gt="";
            }
            long so = Long.parseLong(gt+btn.getText());
            txtSo.setText(String.valueOf(so));
        }
    }
     
    public void nhapPhepTinh(JButton btn2){
        a = Long.parseLong(txtSo.getText());
        if(a!=0){
            phepToan=btn2.getText();
            txtSo.setText("0");
        }
    }
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBang;
    private javax.swing.JButton btnChia;
    private javax.swing.JButton btnCong;
    private javax.swing.JButton btnNhan;
    private javax.swing.JButton btnPhanTram;
    private javax.swing.JButton btnSQRT;
    private javax.swing.JButton btnSo0;
    private javax.swing.JButton btnSo1;
    private javax.swing.JButton btnSo2;
    private javax.swing.JButton btnSo3;
    private javax.swing.JButton btnSo4;
    private javax.swing.JButton btnSo5;
    private javax.swing.JButton btnSo6;
    private javax.swing.JButton btnSo7;
    private javax.swing.JButton btnSo8;
    private javax.swing.JButton btnSo9;
    private javax.swing.JButton btnTru;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton20;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtSo;
    // End of variables declaration//GEN-END:variables
}
