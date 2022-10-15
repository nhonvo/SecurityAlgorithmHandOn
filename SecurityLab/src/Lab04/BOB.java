package Lab04;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;

public class BOB extends javax.swing.JFrame {

    public BOB() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_khoachung = new javax.swing.JButton();
        btn_mahoaKAB = new javax.swing.JButton();
        btnkhoaB = new javax.swing.JButton();
        btn_hienthiKA = new javax.swing.JButton();
        txt_khoakab = new javax.swing.JTextField();
        btn_mahoa_giaima = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_nagiaKAB = new javax.swing.JTextField();
        txtkhoaalice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtkhoabob = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_khoachung.setText("khoa chung");
        btn_khoachung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_khoachungActionPerformed(evt);
            }
        });

        btn_mahoaKAB.setText("ma hoa kab");
        btn_mahoaKAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mahoaKABActionPerformed(evt);
            }
        });

        btnkhoaB.setText("tao khoa b");
        btnkhoaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkhoaBActionPerformed(evt);
            }
        });

        btn_hienthiKA.setText("hien thi ka");
        btn_hienthiKA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hienthiKAActionPerformed(evt);
            }
        });

        btn_mahoa_giaima.setText("ma hoa / giai ma");
        btn_mahoa_giaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mahoa_giaimaActionPerformed(evt);
            }
        });

        jLabel2.setText("khoa kab");

        jLabel1.setText("khoa bob");

        txt_nagiaKAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nagiaKABActionPerformed(evt);
            }
        });

        jLabel5.setText("bob");

        jLabel4.setText("ma hoa kab");

        jLabel3.setText("khoa alice");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_khoakab, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_khoachung))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_nagiaKAB, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_mahoaKAB))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtkhoabob, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnkhoaB))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtkhoaalice, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_hienthiKA))
                            .addComponent(btn_mahoa_giaima)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkhoabob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkhoaB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkhoaalice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hienthiKA))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_khoakab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_khoachung))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nagiaKAB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mahoaKAB))
                .addGap(31, 31, 31)
                .addComponent(btn_mahoa_giaima)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    KeyAgreement bobKeyAgree;
    PublicKey alicePubKey;
    SecretKey bobDesKey;
    Cipher bobCphier;
    private void btn_khoachungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_khoachungActionPerformed
        // TODO add your handling code here:
        try {
            bobKeyAgree.doPhase(alicePubKey, true);
            byte[] bobsharesecret = bobKeyAgree.generateSecret();
            System.out.println("khoa chung: " + cryptoUlti.toHexString(bobsharesecret));
            txt_khoakab.setText(cryptoUlti.toHexString(bobsharesecret));
        } catch (Exception es) {
        }
}//GEN-LAST:event_btn_khoachungActionPerformed

    private void btn_mahoaKABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mahoaKABActionPerformed
        // TODO add your handling code here:

        try {
            bobKeyAgree.doPhase(alicePubKey, true);
            bobDesKey = bobKeyAgree.generateSecret("DES");
            txt_nagiaKAB.setText(bobDesKey.toString());

            BufferedWriter bw = null;

            String file = "D:\\KhoaB.txt";
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(bobDesKey.toString());
            bw.close();
        } catch (Exception es) {
        }
}//GEN-LAST:event_btn_mahoaKABActionPerformed

    private void btnkhoaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhoaBActionPerformed
        // TODO add your handling code here:
        try {
            boolean read = false;
            while (!read) {
                try {
                    FileInputStream fis = new FileInputStream("D:/A.pub");
                    fis.close();
                    read = true;

                } catch (Exception ex) {
                }
            }
            FileInputStream fis = new FileInputStream("D:/A.pub");
            byte[] alicePubKeyEnc = new byte[fis.available()];
            fis.read(alicePubKeyEnc);
            fis.close();
            KeyFactory bobkeyfac = KeyFactory.getInstance("DH");
            X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(alicePubKeyEnc);
            alicePubKey = bobkeyfac.generatePublic((x509KeySpec));
            DHParameterSpec dHParameterSpec = ((DHPublicKey) alicePubKey).getParams();
            System.out.println("Generrate DH keypair...");
            KeyPairGenerator bobKpairGen = KeyPairGenerator.getInstance("DH");
            bobKpairGen.initialize(dHParameterSpec);
            KeyPair bobKpair = bobKpairGen.generateKeyPair();

            System.out.println("intializing key agreement egine ....");
            bobKeyAgree = KeyAgreement.getInstance("DH");
            bobKeyAgree.init(bobKpair.getPrivate());

            byte[] bobpubkeyenc = bobKpair.getPublic().getEncoded();
            FileOutputStream fos = new FileOutputStream("D:/B.pub");
            fos.write(bobpubkeyenc);
            fos.close();
            txtkhoabob.setText(bobpubkeyenc.toString());

        } catch (Exception ex) {
        }
}//GEN-LAST:event_btnkhoaBActionPerformed

    private void btn_hienthiKAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hienthiKAActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:/A.pub");
            byte[] bkeyP = new byte[fis.available()];
            fis.read(bkeyP);
            fis.close();
            txtkhoaalice.setText((bkeyP.toString()));
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_btn_hienthiKAActionPerformed

    private void btn_mahoa_giaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mahoa_giaimaActionPerformed
        // TODO add your handling code here:
        DESC des = new DESC();
        des.setVisible(true);
}//GEN-LAST:event_btn_mahoa_giaimaActionPerformed

    private void txt_nagiaKABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nagiaKABActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txt_nagiaKABActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BOB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hienthiKA;
    private javax.swing.JButton btn_khoachung;
    private javax.swing.JButton btn_mahoaKAB;
    private javax.swing.JButton btn_mahoa_giaima;
    private javax.swing.JButton btnkhoaB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_khoakab;
    private javax.swing.JTextField txt_nagiaKAB;
    private javax.swing.JTextField txtkhoaalice;
    private javax.swing.JTextField txtkhoabob;
    // End of variables declaration//GEN-END:variables

}
