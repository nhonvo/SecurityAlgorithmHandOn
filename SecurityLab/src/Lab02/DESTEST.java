/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class DESTEST extends javax.swing.JFrame {

    /**
     * Creates new form DES
     */
    public DESTEST() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKey = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPlaintext = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCiphertext = new javax.swing.JTextArea();
        btnEn = new javax.swing.JButton();
        btnDe = new javax.swing.JButton();
        txtShowC = new javax.swing.JButton();
        txtShowP = new javax.swing.JButton();
        btnSwap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DES");

        jLabel2.setText("Key");

        jLabel3.setText("Plaintext");

        jLabel4.setText("Ciphertext");

        txtPlaintext.setColumns(20);
        txtPlaintext.setRows(5);
        jScrollPane1.setViewportView(txtPlaintext);

        txtCiphertext.setColumns(20);
        txtCiphertext.setRows(5);
        txtCiphertext.setEnabled(false);
        jScrollPane2.setViewportView(txtCiphertext);

        btnEn.setText("ma hoa");
        btnEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnActionPerformed(evt);
            }
        });

        btnDe.setText("giai ma");
        btnDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeActionPerformed(evt);
            }
        });

        txtShowC.setText("ghi file");
        txtShowC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShowCActionPerformed(evt);
            }
        });

        txtShowP.setText("mo file");
        txtShowP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShowPActionPerformed(evt);
            }
        });

        btnSwap.setText("Swap");
        btnSwap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEn)
                                        .addGap(55, 55, 55)
                                        .addComponent(btnDe)
                                        .addGap(43, 43, 43)
                                        .addComponent(txtShowC)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtShowP))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2)
                                        .addComponent(txtKey))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btnSwap)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEn)
                    .addComponent(btnDe)
                    .addComponent(txtShowC)
                    .addComponent(txtShowP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnSwap)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnActionPerformed
        // TODO add your handling code here:
        String key=txtKey.getText();
        
        try {
            FileInputStream fis=new FileInputStream("D:\\Des.txt");
            FileOutputStream fos=new FileOutputStream("D:\\EnDes.txt");
            encrypt(key, fis, fos);
            JOptionPane.showMessageDialog(null, "da ma hoa van ban");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DESTEST.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Throwable ex) {
            Logger.getLogger(DESTEST.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEnActionPerformed

    private void btnDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeActionPerformed
        // TODO add your handling code here:
         FileInputStream fis2 = null;
        try {
            String key = txtKey.getText();
            fis2 = new FileInputStream("D:\\EnDes.txt");
            FileOutputStream fos2 = new FileOutputStream("D:\\DeDes.txt");
            decrypt(key, fis2, fos2);
            BufferedReader br = null;
            String fileName = "D:\\DeDes.txt"; ////
            br = new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer();
            JOptionPane.showMessageDialog(null, "Đã giải mã");
            char[] ca = new char[5];
            while(br.ready())
            {
                int len = br.read(ca);
                sb.append(ca,0,len);
                
            }
            br.close();
            
            //xuat chuoi
            System.out.println("Dữ liệu là : "+""+sb);
            String chuoi = sb.toString();
            txtCiphertext.setText(chuoi);
        } catch (Exception e) {
        } catch (Throwable ex) {
            
            Logger.getLogger(DESTEST.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                fis2.close();
            } catch (Exception e) {
                Logger.getLogger(DESTEST.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_btnDeActionPerformed

    private void txtShowCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShowCActionPerformed
        // TODO add your handling code here:
        BufferedWriter bw=null;
        String filenameString="D:\\Des.txt";
        String s = txtPlaintext.getText();
        try {
            bw=new BufferedWriter(new FileWriter(filenameString));
            bw.write(s);
            bw.close();
            JOptionPane.showMessageDialog(null, "da ghi file");
            txtCiphertext.setText(s);
        } catch (IOException ex) {
            Logger.getLogger(DESTEST.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtShowCActionPerformed

    private void txtShowPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShowPActionPerformed
        try {
        // TODO add your handling code here:
        BufferedReader br =null;
        String filenameString="D:\\EnDes.txt";
        br=new BufferedReader(new FileReader(filenameString));
        StringBuffer sb = new StringBuffer();
        JOptionPane.showMessageDialog(null, "da mo file");
        
        char[] ca=new char[5];
            while (br.ready()) {                
                int len=br.read(ca);
                sb.append(ca,0,len);
            }
            br.close();
            System.out.println("Du lieu la: "+sb);
            String chuoi = sb.toString();
            
            txtCiphertext.setText(chuoi);
        } catch (IOException ex) {
            Logger.getLogger(DESTEST.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtShowPActionPerformed

    private void btnSwapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwapActionPerformed
        // TODO add your handling code here:
        this.txtPlaintext.setText(this.txtCiphertext.getText());
        this.txtCiphertext.setText("");
    }//GEN-LAST:event_btnSwapActionPerformed
    private int mode;
    private static void doCopy(InputStream is, OutputStream os) throws IOException{
        byte[] b = new byte[64];
        int numBytes;
        while ((numBytes =is.read(b))!=-1) {
            os.write(b, 0, numBytes);
        }
        os.flush();
        os.close();
        is.close();
    }
    public static void encrypt(String keyString, InputStream is, OutputStream os)throws Throwable {
        encryptOrDecrypt(keyString,Cipher.ENCRYPT_MODE,is,os);
    }
    public static void decrypt(String keyString, InputStream is, OutputStream os)throws Throwable {
        encryptOrDecrypt(keyString,Cipher.DECRYPT_MODE,is,os);
    }
    public static void encryptOrDecrypt(String keyString, int mode,InputStream is, OutputStream os)throws Throwable {
         DESKeySpec dks = new DESKeySpec(keyString.getBytes());
         SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
         SecretKey desKey=skf.generateSecret(dks);
         Cipher cipher = Cipher.getInstance("DES");
         
         if(mode == Cipher.ENCRYPT_MODE){
             cipher.init(Cipher.ENCRYPT_MODE, desKey);
             CipherInputStream cis=new CipherInputStream(is, cipher);
             doCopy(cis, os);
         }else if(mode == Cipher.DECRYPT_MODE){
             cipher.init(Cipher.DECRYPT_MODE, desKey);
             CipherOutputStream cos=new CipherOutputStream(os, cipher);
             doCopy(is, cos);
         }
         
    }
    
    
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
            java.util.logging.Logger.getLogger(DESTEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DESTEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DESTEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DESTEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DESTEST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDe;
    private javax.swing.JButton btnEn;
    private javax.swing.JButton btnSwap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtCiphertext;
    private javax.swing.JTextField txtKey;
    private javax.swing.JTextArea txtPlaintext;
    private javax.swing.JButton txtShowC;
    private javax.swing.JButton txtShowP;
    // End of variables declaration//GEN-END:variables
}