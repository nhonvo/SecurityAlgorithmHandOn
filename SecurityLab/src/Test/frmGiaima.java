/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import FinalTest.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.DESedeKeySpec;
import javax.swing.JOptionPane;
import sun.misc.BASE64Decoder;

/**
 *
 * @author duyle
 */
public class frmGiaima extends javax.swing.JFrame {

    private static final String UNICODE_FORMAT = "UTF8";
    public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";
    public static final String DESEDE_DECRYPTION_SCHEME = "DESede";
    private KeySpec myKeySpec;
    private SecretKeyFactory mySecretKeyFactory;

    private String myEncryptionKey;
    private String myEncryptionScheme;
    private Cipher cipher;
    byte[] keyAsBytes;
    private String myDecryptionKey;
    private String myDecryptionScheme;
    SecretKey key;
    private byte[] byteCipherText;
    private SecretKey secretKey;

    /**
     * Creates new form frmGiaima
     */
    public frmGiaima() {
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
        btnM1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnH2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtD3 = new javax.swing.JTextArea();
        txtK1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtK3 = new javax.swing.JTextField();
        btnMofile = new javax.swing.JButton();
        btnD3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtE3 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtM2 = new javax.swing.JTextField();
        txtM3 = new javax.swing.JTextField();
        txtH2 = new javax.swing.JTextField();
        txtE1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtM1 = new javax.swing.JTextField();
        btnTachchuoi = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtH2GM = new javax.swing.JTextArea();
        btnSosanh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Giải mã");

        btnM1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnM1.setText("M1 = De[E1] với K1");
        btnM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnM1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("D3");

        btnH2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnH2.setText("H2' = hash[E1 + M2] với SHA");
        btnH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setText("E3");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("E1");

        txtD3.setEditable(false);
        txtD3.setColumns(20);
        txtD3.setRows(5);
        jScrollPane3.setViewportView(txtD3);

        txtK1.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setText("K3");

        txtK3.setEditable(false);

        btnMofile.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMofile.setText("Mở file");
        btnMofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMofileActionPerformed(evt);
            }
        });

        btnD3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnD3.setText("D3 = De[E3] với K3");
        btnD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD3ActionPerformed(evt);
            }
        });

        txtE3.setEditable(false);
        txtE3.setColumns(20);
        txtE3.setRows(5);
        jScrollPane4.setViewportView(txtE3);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("M2");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("H2");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("M3");

        txtM2.setEditable(false);

        txtM3.setEditable(false);

        txtH2.setEditable(false);

        txtE1.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setText("K1");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setText("M1");

        txtM1.setEditable(false);

        btnTachchuoi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnTachchuoi.setText("Tách chuỗi D3");
        btnTachchuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTachchuoiActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setText("H2'");

        txtH2GM.setEditable(false);
        txtH2GM.setColumns(20);
        txtH2GM.setRows(5);
        jScrollPane1.setViewportView(txtH2GM);

        btnSosanh.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSosanh.setText("So sánh [H2, H2']");
        btnSosanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSosanhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnM1)
                                    .addComponent(btnMofile)
                                    .addComponent(btnH2)
                                    .addComponent(btnD3)
                                    .addComponent(btnTachchuoi)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel11))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel10)
                                                                        .addComponent(jLabel5))
                                                                    .addGap(9, 9, 9)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtH2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtM1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addGap(32, 32, 32))
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(jLabel3)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(txtE1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(29, 29, 29)))
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                                                        .addComponent(jLabel7))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtK1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtM2)
                                                        .addComponent(txtM3))))
                                            .addComponent(txtK3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(btnSosanh, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMofile)
                                .addGap(119, 119, 119)
                                .addComponent(btnD3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtK3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(btnTachchuoi)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtH2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(txtM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnM1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnH2)
                            .addComponent(jLabel11))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSosanh)
                        .addGap(30, 30, 30))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMofileActionPerformed
        // TODO add your handling code here:
        //Mở E3
        try {
            // TODO add your handling code here:
            BufferedReader br = null;
            String filenameString = "D:\\sE3.txt";
            br = new BufferedReader(new FileReader(filenameString));
            StringBuffer sb = new StringBuffer();
            JOptionPane.showMessageDialog(null, "da mo file");

            char[] ca = new char[5];
            while (br.ready()) {
                int len = br.read(ca);
                sb.append(ca, 0, len);
            }
            br.close();
            String chuoi = sb.toString();
            txtE3.setText(chuoi);
        } catch (IOException ex) {
            Logger.getLogger(frmGiaima.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Mở K1
        try {
            // TODO add your handling code here:
            BufferedReader br = null;
            String filenameString = "D:\\K1.txt";
            br = new BufferedReader(new FileReader(filenameString));
            StringBuffer sb = new StringBuffer();

            char[] ca = new char[5];
            while (br.ready()) {
                int len = br.read(ca);
                sb.append(ca, 0, len);
            }
            br.close();
            String chuoi = sb.toString();

            txtK1.setText(chuoi);
        } catch (IOException ex) {
            Logger.getLogger(frmGiaima.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Mở K3
        try {
            // TODO add your handling code here:
            BufferedReader br = null;
            String filenameString = "D:\\K3.txt";
            br = new BufferedReader(new FileReader(filenameString));
            StringBuffer sb = new StringBuffer();

            char[] ca = new char[5];
            while (br.ready()) {
                int len = br.read(ca);
                sb.append(ca, 0, len);
            }
            br.close();
            String chuoi = sb.toString();
            txtK3.setText(chuoi);
        } catch (IOException ex) {
            Logger.getLogger(frmGiaima.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMofileActionPerformed

    private void btnD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD3ActionPerformed
        // TODO add your handling code here:
        FileInputStream fis2 = null;
        try {
            String key = txtK3.getText();
            fis2 = new FileInputStream("D:\\E3.txt");
            FileOutputStream fos2 = new FileOutputStream("D:\\DeDes.txt");
            decryptDES(key, Cipher.DECRYPT_MODE, fis2, fos2);
            BufferedReader br = null;
            String fileName = "D:\\DeDes.txt";
            br = new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer();
            JOptionPane.showMessageDialog(null, "Đã giải mã");
            char[] ca = new char[5];
            while (br.ready()) {
                int len = br.read(ca);
                sb.append(ca, 0, len);
            }
            br.close();
            //xuat chuoi
            String chuoi = sb.toString();
            txtD3.setText(chuoi);
        } catch (Exception e) {
        } catch (Throwable ex) {

            Logger.getLogger(frmGiaima.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis2.close();
            } catch (Exception e) {
                Logger.getLogger(frmGiaima.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_btnD3ActionPerformed

    private void btnTachchuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTachchuoiActionPerformed
        // TODO add your handling code here:
        String D3 = txtD3.getText();
        String[] parts = D3.split("-");
        txtE1.setText(parts[0]);
        txtM2.setText(parts[1]);
        txtH2.setText(parts[2]);
        txtM3.setText(parts[3]);
    }//GEN-LAST:event_btnTachchuoiActionPerformed

    private void btnM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnM1ActionPerformed
        // TODO add your handling code here:

        try {
            String cipherText = txtE1.getText();
            //txtP.setText(cipherText);
            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.DECRYPT_MODE, secretKey, aesCipher.getParameters());
            //String giaima=txtmahoa.getText();
            //byte[] giaima=cipherText.getBytes();
            //byteCipherText
            byte[] byteDecryptedText = aesCipher.doFinal(byteCipherText);
            String strDecryptedText = new String(byteDecryptedText);
            System.out.println("Decrypted Text message is " + strDecryptedText);
            txtM1.setText(strDecryptedText);

//            myDecryptionKey = txtK1.getText();
//            myDecryptionScheme = DESEDE_DECRYPTION_SCHEME;
//            keyAsBytes = myDecryptionKey.getBytes(UNICODE_FORMAT);
//            myKeySpec = new DESedeKeySpec(keyAsBytes);
//            mySecretKeyFactory = SecretKeyFactory.getInstance(myDecryptionScheme);
//            cipher = Cipher.getInstance(myDecryptionScheme);
//            key = mySecretKeyFactory.generateSecret(myKeySpec);
//            String plaintext = txtE1.getText();
//            String decrypted = decrypt3DES(plaintext);
//            txtM1.setText(decrypted);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnM1ActionPerformed

    private void btnH2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH2ActionPerformed
        // TODO add your handling code here:
        try {
            String chuoi = txtE1.getText() + "-" + txtM2.getText();
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(chuoi.getBytes());
            byte byteData[] = md.digest();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }
            System.out.println("Hex format1: " + sb.toString());
            txtH2GM.setText(sb.toString());

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(frmMahoa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnH2ActionPerformed

    private void btnSosanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSosanhActionPerformed
        // TODO add your handling code here:
        String H2 = txtH2.getText();
        String H2GM = txtH2GM.getText();
        if (H2.equals(H2GM)) {
            JOptionPane.showMessageDialog(null, "Văn bản toàn vẹn");
        } else {
            JOptionPane.showMessageDialog(null, "Văn bản không khớp");
        }
    }//GEN-LAST:event_btnSosanhActionPerformed
    public String decrypt3DES(String encryptedString) {
        String decryptedText = null;
        try {

            cipher.init(Cipher.DECRYPT_MODE, key);
            BASE64Decoder base64decoder = new BASE64Decoder(); // ho tro ma hoa thuat toan them 1 lan nua
            byte[] encryptedtext = base64decoder.decodeBuffer(encryptedString);
            byte[] plaintext = cipher.doFinal(encryptedtext);
            String a = new String(plaintext);
            System.out.println("Chuoi plaintext : " + a);
            decryptedText = a;
        } catch (Exception e) {
        }
        return decryptedText;
    }

    public static void decryptDES(String keyString, int mode, InputStream is, OutputStream os) {
        try {
            DESKeySpec dks = new DESKeySpec(keyString.getBytes());
            SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
            SecretKey desKey = skf.generateSecret(dks);
            Cipher cipher = Cipher.getInstance("DES");

            if (mode == Cipher.DECRYPT_MODE) {
                cipher.init(Cipher.DECRYPT_MODE, desKey);
                CipherOutputStream cos = new CipherOutputStream(os, cipher);
                doCopy(is, cos);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private static void doCopy(InputStream is, OutputStream os) throws IOException {
        byte[] b = new byte[64];
        int numBytes;
        while ((numBytes = is.read(b)) != -1) {
            os.write(b, 0, numBytes);
        }
        os.flush();
        os.close();
        is.close();
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
            java.util.logging.Logger.getLogger(frmGiaima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGiaima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGiaima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGiaima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGiaima().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnD3;
    private javax.swing.JButton btnH2;
    private javax.swing.JButton btnM1;
    private javax.swing.JButton btnMofile;
    private javax.swing.JButton btnSosanh;
    private javax.swing.JButton btnTachchuoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtD3;
    private javax.swing.JTextField txtE1;
    private javax.swing.JTextArea txtE3;
    private javax.swing.JTextField txtH2;
    private javax.swing.JTextArea txtH2GM;
    private javax.swing.JTextField txtK1;
    private javax.swing.JTextField txtK3;
    private javax.swing.JTextField txtM1;
    private javax.swing.JTextField txtM2;
    private javax.swing.JTextField txtM3;
    // End of variables declaration//GEN-END:variables
}