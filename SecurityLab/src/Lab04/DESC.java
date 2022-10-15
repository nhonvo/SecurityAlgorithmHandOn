
package Lab04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
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

public class DESC extends javax.swing.JFrame {

 
    public DESC() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_inputkey = new javax.swing.JTextField();
        btn_mokhoaA = new javax.swing.JButton();
        btn_mahoa = new javax.swing.JButton();
        btn_mokhoaB = new javax.swing.JButton();
        btn_ghifile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_plaintext = new javax.swing.JTextField();
        txt_ciphertext = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_giama = new javax.swing.JButton();
        btn_allshow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("input key:");

        btn_mokhoaA.setText("mo khoa a");
        btn_mokhoaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mokhoaAActionPerformed(evt);
            }
        });

        btn_mahoa.setText("mahoa");
        btn_mahoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mahoaActionPerformed(evt);
            }
        });

        btn_mokhoaB.setText("mo khoa b");
        btn_mokhoaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mokhoaBActionPerformed(evt);
            }
        });

        btn_ghifile.setText("ghi file");
        btn_ghifile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ghifileActionPerformed(evt);
            }
        });

        jLabel2.setText("plaintext");

        jLabel3.setText("ciphertext");

        btn_giama.setText("giai ma");
        btn_giama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_giamaActionPerformed(evt);
            }
        });

        btn_allshow.setText("all show");
        btn_allshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_allshowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1)
                                .addGap(42, 42, 42)
                                .addComponent(txt_inputkey, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_mahoa)
                                .addGap(18, 18, 18)
                                .addComponent(btn_mokhoaA)
                                .addGap(30, 30, 30)
                                .addComponent(btn_mokhoaB)
                                .addGap(18, 18, 18)
                                .addComponent(btn_ghifile))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_ciphertext, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_plaintext, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btn_giama)
                        .addGap(70, 70, 70)
                        .addComponent(btn_allshow)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_inputkey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_mokhoaA)
                    .addComponent(btn_mokhoaB)
                    .addComponent(btn_mahoa)
                    .addComponent(btn_ghifile))
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txt_plaintext, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(txt_ciphertext, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_giama)
                    .addComponent(btn_allshow))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_giamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_giamaActionPerformed
        // TODO add your handling code here:
        FileInputStream fis2 = null;
        try {
            String key = txt_inputkey.getText();
            fis2 = new FileInputStream("D:\\EnDes.txt");
            FileOutputStream fos2 = new FileOutputStream("D:\\DeDes.txt");
            decrypt(key, fis2, fos2);
            BufferedReader br = null;
            String filename = "D:\\DeDes.txt";
            br = new BufferedReader(new FileReader(filename));
            StringBuffer sb = new StringBuffer();
            JOptionPane.showMessageDialog(null, "Da giai ma");
            char[] ca = new char[5];
            while (br.ready()) {
                int len = br.read(ca);
                sb.append(ca, 0, len);

            }
            br.close();
            System.out.println("du lieu la: " + sb);
            String chuoi = sb.toString();
            txt_ciphertext.setText(chuoi);
        } catch (Throwable sdf) {
        }
    }//GEN-LAST:event_btn_giamaActionPerformed

    private void btn_allshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_allshowActionPerformed
        // TODO add your handling code here:
        try {
            BufferedReader br = null;

            String filename = "D:\\Des.txt";
            br = new BufferedReader(new FileReader(filename));
            StringBuffer sb = new StringBuffer();
            JOptionPane.showMessageDialog(null, "Da mo file");
            char[] ca = new char[5];
            while (br.ready()) {
                int len = br.read(ca);
                sb.append(ca, 0, len);

            }
            br.close();
            String ff = "D:\\EnDes.txt";
            br = new BufferedReader(new FileReader(ff));
            StringBuffer sb1 = new StringBuffer();
            char[] ca1 = new char[5];
            while (br.ready()) {
                int len = br.read(ca1);
                sb1.append(ca1, 0, len);
            }
            System.out.println("du lieu la: " + sb);
            String chuoi = sb.toString();
            String chuoi1 = sb1.toString();
            txt_plaintext.setText(chuoi);
            txt_ciphertext.setText(chuoi1);
        } catch (IOException as) {
        }
        // TODO add your handling code here:
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_allshowActionPerformed

    private void btn_mahoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mahoaActionPerformed
        // TODO add your handling code here:
        try {
            String key = txt_inputkey.getText();

            FileInputStream fis = new FileInputStream("D:\\Des.txt");
            FileOutputStream fos = new FileOutputStream("D:\\EnDes.txt");
            encrypt(key, fis, fos);//, bytes1, bytes2, WIDTH, WIDTH)
            JOptionPane.showMessageDialog(null, "da ma hoa van ban");

            BufferedReader br = null;

            String filename = "D:\\DeDes.txt";
            br = new BufferedReader(new FileReader(filename));
            StringBuffer sb = new StringBuffer();
            //JOptionPane.showMessageDialog(null, "Da mo file");
            char[] ca = new char[5];
            while (br.ready()) {
                int len = br.read(ca);
                sb.append(ca, 0, len);

            }
            br.close();
            String ff = "D:\\EnDes.txt";
            br = new BufferedReader(new FileReader(ff));
            StringBuffer sb1 = new StringBuffer();
            char[] ca1 = new char[5];
            while (br.ready()) {
                int len = br.read(ca1);
                sb1.append(ca1, 0, len);
            }
            System.out.println("du lieu la: " + sb);
            // String chuoi =sb.toString();
            String chuoi1 = sb1.toString();
            // txt_plaintext.setText(chuoi);
            txt_ciphertext.setText(chuoi1);

        } catch (Throwable ex) {
            ex.printStackTrace();
        }
        // TODO add your handling code here:
        // TODO add your handling code here:


    }//GEN-LAST:event_btn_mahoaActionPerformed

    private void btn_mokhoaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mokhoaAActionPerformed
        // TODO add your handling code here:
        try {
            BufferedReader br = null;
            String filename = "D:\\KhoaA.txt";
            br = new BufferedReader(new FileReader(filename));
            StringBuffer sb = new StringBuffer();

            JOptionPane.showMessageDialog(null, "da mo file");
            char[] ca = new char[5];
            while (br.ready()) {
                int len = br.read(ca);
                sb.append(ca, 0, len);
            }
            br.close();
            System.out.println("Du lieu la: " + sb);
            String chuoi = sb.toString();
            txt_inputkey.setText(chuoi);
        } catch (Exception wsef) {
        }

    }//GEN-LAST:event_btn_mokhoaAActionPerformed

    private void btn_mokhoaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mokhoaBActionPerformed
        // TODO add your handling code here:
        try {
            BufferedReader br = null;
            String filename = "D:\\KhoaB.txt";
            br = new BufferedReader(new FileReader(filename));
            StringBuffer sb = new StringBuffer();

            JOptionPane.showMessageDialog(null, "da mo gile");
            char[] ca = new char[5];
            while (br.ready()) {
                int len = br.read(ca);
                sb.append(ca, 0, len);
            }
            br.close();
            System.out.println("Du lieu la: " + sb);
            String chuoi = sb.toString();
            txt_inputkey.setText(chuoi);
        } catch (Exception wsef) {
        }

    }//GEN-LAST:event_btn_mokhoaBActionPerformed

    private void btn_ghifileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ghifileActionPerformed
        // TODO add your handling code here:
        try {
            BufferedWriter bw = null;
            String filename = "D:\\Des.txt";
            String s = txt_plaintext.getText();
            bw = new BufferedWriter(new FileWriter(filename));
            bw.write(s);;
            bw.close();
            JOptionPane.showMessageDialog(null, "da ghi file");
            //txt_ciphertext.setText(s);
        } catch (Exception ui) {
        }
    }//GEN-LAST:event_btn_ghifileActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DESC().setVisible(true);
            }
        });
    }

    public static void encrypt(String key, InputStream is, OutputStream os) throws Throwable {
        encryptordecrypt(key, Cipher.ENCRYPT_MODE, is, os);
    }

    private static void encryptordecrypt(String key, int mode, InputStream is, OutputStream os) throws Throwable {
        DESKeySpec dks = new DESKeySpec(key.getBytes());
        SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
        SecretKey desKey = skf.generateSecret(dks);
        Cipher cipher = Cipher.getInstance("DES");

        if (mode == Cipher.ENCRYPT_MODE) {
            cipher.init(Cipher.ENCRYPT_MODE, desKey);
            CipherInputStream cis = new CipherInputStream(is, cipher);
            doCoppy(cis, os);

        } else {
            if (mode == Cipher.DECRYPT_MODE) {
                cipher.init(Cipher.DECRYPT_MODE, desKey);
                CipherOutputStream cos = new CipherOutputStream(os, cipher);
                doCoppy(is, cos);
            }

        }
    }

    private static void doCoppy(InputStream is, OutputStream os) throws IOException {
        byte[] bytes = new byte[64];
        int Numbytes;
        while ((Numbytes = is.read(bytes)) != -1) {
            os.write(bytes, 0, Numbytes);
        }
        os.flush();
        os.close();
        is.close();
    }

    public static void decrypt(String key, InputStream is, OutputStream os) throws Throwable {
        encryptordecrypt(key, Cipher.DECRYPT_MODE, is, os);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_allshow;
    private javax.swing.JButton btn_ghifile;
    private javax.swing.JButton btn_giama;
    private javax.swing.JButton btn_mahoa;
    private javax.swing.JButton btn_mokhoaA;
    private javax.swing.JButton btn_mokhoaB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_ciphertext;
    private javax.swing.JTextField txt_inputkey;
    private javax.swing.JTextField txt_plaintext;
    // End of variables declaration//GEN-END:variables

}
