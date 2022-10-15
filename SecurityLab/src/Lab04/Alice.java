package Lab04;
//

import com.sun.crypto.provider.DHParameterGenerator;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.DHParameterSpec;

public class Alice extends javax.swing.JFrame {

    /**
     * Creates new form Alice
     */
    public Alice() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_KhoaBOB = new javax.swing.JTextField();
        txtkhoaAlice = new javax.swing.JTextField();
        txt_nagiaKAB = new javax.swing.JTextField();
        txt_khoakab = new javax.swing.JTextField();
        btn_mahoa_giaima = new javax.swing.JButton();
        btntaokhoaA = new javax.swing.JButton();
        btn_taokhoaB = new javax.swing.JButton();
        btn_khoachung = new javax.swing.JButton();
        btn_mahoaKAB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("khoa alice");

        jLabel2.setText("khoa kab");

        jLabel3.setText("khoa bob");

        jLabel4.setText("ma hoa kab");

        jLabel5.setText("alice");

        txt_nagiaKAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nagiaKABActionPerformed(evt);
            }
        });

        btn_mahoa_giaima.setText("ma hoa / giai ma");
        btn_mahoa_giaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mahoa_giaimaActionPerformed(evt);
            }
        });

        btntaokhoaA.setText("tao khoa a");
        btntaokhoaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntaokhoaAActionPerformed(evt);
            }
        });

        btn_taokhoaB.setText("hien khoa B");
        btn_taokhoaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_taokhoaBActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
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
                                .addComponent(txtkhoaAlice, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btntaokhoaA))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_KhoaBOB, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_taokhoaB))
                            .addComponent(btn_mahoa_giaima)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel5)))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkhoaAlice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntaokhoaA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_KhoaBOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_taokhoaB))
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
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nagiaKABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nagiaKABActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nagiaKABActionPerformed
    KeyAgreement aliceKeyAgree;
    PublicKey bobPubKey;
    SecretKey aliceDesKey;
    Cipher aliceCipher;
    private void btntaokhoaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntaokhoaAActionPerformed
        // TODO add your handling code here:
        try {
            AlgorithmParameterGenerator paramGen = AlgorithmParameterGenerator.getInstance("DH");
            paramGen.init(512);
            AlgorithmParameters params = paramGen.generateParameters();
            DHParameterSpec dhSkipParamSpec = (DHParameterSpec) params.getParameterSpec(DHParameterSpec.class);

            System.out.print("Generating a DH KeyPair...");
            KeyPairGenerator aliceKpairGen = KeyPairGenerator.getInstance("DH");
            aliceKpairGen.initialize((dhSkipParamSpec));
            KeyPair aliceKPair = aliceKpairGen.genKeyPair();

            System.out.println("Initialingzing the KeyAgreement Engine with DH private key ");
            aliceKeyAgree = KeyAgreement.getInstance(("DH"));
            aliceKeyAgree.init(aliceKPair.getPrivate());
            byte[] alicePubKeyEnc = aliceKPair.getPublic().getEncoded();
            FileOutputStream fos = new FileOutputStream("D:/A.pub");
            fos.write(alicePubKeyEnc);
            fos.close();
            txtkhoaAlice.setText(alicePubKeyEnc.toString());
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_btntaokhoaAActionPerformed

    private void btn_taokhoaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_taokhoaBActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:/B.pub");
            byte[] bkeyP = new byte[fis.available()];
            fis.read(bkeyP);
            fis.close();
            txt_KhoaBOB.setText((bkeyP.toString()));
        } catch (Exception ex) {
        }

    }//GEN-LAST:event_btn_taokhoaBActionPerformed

    private void btn_khoachungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_khoachungActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:/B.pub");
            byte[] bobPubKeyEnc = new byte[fis.available()];
            fis.read(bobPubKeyEnc);
            fis.close();

            KeyFactory aliceKeyFac = KeyFactory.getInstance("DH");
            X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(bobPubKeyEnc);
            bobPubKey = aliceKeyFac.generatePublic(x509KeySpec);
            System.out.println("excuting phase1 of the agrennment...");
            aliceKeyAgree.doPhase(bobPubKey, true);
            byte[] alicesharesecrest = aliceKeyAgree.generateSecret();

            System.out.println("Khoa chung secret (debug only):" + cryptoUlti.toHexString(alicesharesecrest));
            txt_khoakab.setText((cryptoUlti.toHexString(alicesharesecrest)));
        } catch (Exception es) {
        }
    }//GEN-LAST:event_btn_khoachungActionPerformed

    private void btn_mahoaKABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mahoaKABActionPerformed
        // TODO add your handling code here:
        try {
            aliceKeyAgree.doPhase(bobPubKey, true);
            aliceDesKey = aliceKeyAgree.generateSecret("DES");
            txt_nagiaKAB.setText(aliceDesKey.toString());
            BufferedWriter bw = null;
            String file = "D:\\KhoaA.txt";

            bw = new BufferedWriter(new FileWriter(file));

            bw.write(aliceDesKey.toString());
            bw.close();
        } catch (Exception es) {
        }
    }//GEN-LAST:event_btn_mahoaKABActionPerformed

    private void btn_mahoa_giaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mahoa_giaimaActionPerformed
        // TODO add your handling code here:
        DESC des = new DESC();
        des.setVisible(true);
    }//GEN-LAST:event_btn_mahoa_giaimaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_khoachung;
    private javax.swing.JButton btn_mahoaKAB;
    private javax.swing.JButton btn_mahoa_giaima;
    private javax.swing.JButton btn_taokhoaB;
    private javax.swing.JButton btntaokhoaA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_KhoaBOB;
    private javax.swing.JTextField txt_khoakab;
    private javax.swing.JTextField txt_nagiaKAB;
    private javax.swing.JTextField txtkhoaAlice;
    // End of variables declaration//GEN-END:variables

}
