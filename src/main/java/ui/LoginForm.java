/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;
import javax.swing.JOptionPane;
import java.awt.event.ItemEvent;

/**
 *
 * @author ROG
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
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

        panelKiri = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panelKanan = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pwFieldPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        cbShowPassword = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelKiri.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/web-development-programming-languages-css-html-it-ui-programmer-cartoon-character-developing-website-coding-flat-illustration-banner_128772-862.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel10.setText("UJIAN AKHIR SEMESTER");

        jLabel11.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel11.setText("Pemrograman Berbasis Objek 2");

        javax.swing.GroupLayout panelKiriLayout = new javax.swing.GroupLayout(panelKiri);
        panelKiri.setLayout(panelKiriLayout);
        panelKiriLayout.setHorizontalGroup(
            panelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKiriLayout.createSequentialGroup()
                .addGroup(panelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKiriLayout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel8))
                    .addGroup(panelKiriLayout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel11))
                    .addGroup(panelKiriLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelKiriLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel10)))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        panelKiriLayout.setVerticalGroup(
            panelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKiriLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelKanan.setBackground(new java.awt.Color(176, 211, 255));

        jPanel1.setBackground(new java.awt.Color(176, 211, 255));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Masuk dengan user dan password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(176, 211, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-user-32.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-password-30.png"))); // NOI18N

        btnLogin.setFont(new java.awt.Font("Sitka Subheading", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        cbShowPassword.setText("Show Password");
        cbShowPassword.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbShowPasswordItemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel5.setText("Forgot your password?");

        jLabel7.setText("Don't have an account? Sign Up");

        tfUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfUserKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 168, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(122, 122, 122))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cbShowPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addComponent(pwFieldPassword)
                    .addComponent(tfUser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfUser))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(pwFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbShowPassword)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelKananLayout = new javax.swing.GroupLayout(panelKanan);
        panelKanan.setLayout(panelKananLayout);
        panelKananLayout.setHorizontalGroup(
            panelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKananLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKananLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelKananLayout.setVerticalGroup(
            panelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKananLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelKanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelKanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelKiri, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * BUTTON LOGIN
     * ============
     * Ketika Button Di Klik dengan username dan password salah, maka akan menampilkan User atau password anda salah
     * Ketika Button Di klik dengan username atau password belum terisi, maka akaan menampilkan Harap isi kedua kolom
     * Ketika Button di klik dengan username rahmatulfirdaus dan password ganteng, maka akan menampilkan halaman Catatan Harian
     */
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        //Membuat Variabel Username yang berfungsi mengambil text di dalam text Field
        String username = tfUser.getText();
        //Membuat Variabel passwordchars yang berfungsi mengambil password di dalam field password
        char[] passwordChars = pwFieldPassword.getPassword();
        //Membuat Variabel password yang menginisialisasikan variabel passwordChars
        String password = new String(passwordChars);
        
        //Ketika Button Di klik dengan username atau password belum terisi, maka akaan menampilkan Harap isi kedua kolom
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Harap isi kedua kolom", "Pesan Kesalahan", JOptionPane.ERROR_MESSAGE);

        //Ketika Button di klik dengan username rahmatulfirdaus dan password ganteng, maka akan menampilkan halaman Catatan Harian  
        } else if (username.equals("rahmatulfirdaus") && password.equals("ganteng")) {
            mainMenu iv = new mainMenu();
            iv.setVisible(true);
            dispose(); //menutup halaman login
        //Ketika Button Di Klik dengan username dan password salah, maka akan menampilkan User atau password anda salah
        } else {
            JOptionPane.showMessageDialog(null, "User atau password anda salah", "Pesan Kesalahan", JOptionPane.ERROR_MESSAGE);
            tfUser.setText(""); 
            pwFieldPassword.setText("");
            tfUser.requestFocus();
            /**
             * line 274 & 275 berfungsi mengosongkan text field masing masing dari mereka
             * line 276 berfungsi agar fokus ke text field user
             */
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    //Key Typed berfungsi agar user hanya bisa mengetikkan huruf dan angka di dalam text field user atau tfUser
    private void tfUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUserKeyTyped
        //membuat variabel dan mengambil karakter yang diketikkan oleh pengguna dengan method getKeyChar yang dihasilkan dari event keyboard (evt)
        char userInput = evt.getKeyChar();
        
        /**
         * Pemeriksaan
         */
        //Ketika user menginputkan selain huruf dan angka, maka akan menjalankan evt.consume
        //evt.consume berfungsi untuk menghentikan proses lebih lanjut atau membatasi jenis input (huruf dan angka) atau dalam artiannya dia akan otomatis tidak mengetikkan saat kita mengetikkan selain huruf dan angka.
        if (!Character.isLetterOrDigit(userInput)) {
            evt.consume(); //menolak selain huruf angka
        }
    }//GEN-LAST:event_tfUserKeyTyped

    /*CHECKBOX SHOW PASSWORD */
    //Berfungsi untuk ketika checkbox diaktifkan, maka password akan terlihat(tidak tertutupi oleh *)
    private void cbShowPasswordItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbShowPasswordItemStateChanged
        //membuat variabel yang akan berfungsi mengambil status perubahan dari event checkbox
        int perubahan = evt.getStateChange();
        
        //Ketika Checkbox mengalami status perubahan / centang, maka akan menampilkan isi password
        if (perubahan == ItemEvent.SELECTED) {
            pwFieldPassword.setEchoChar((char) 0); 
            // .setEchoChar((char) 0); => karakter input tidak akan disembunyikan dan akan terlihat.
        } else {
            //Ketika Checkbox mengalami status tidak dicentang, maka akan menutup isi password
            pwFieldPassword.setEchoChar('*'); 
            //.setEchoChar('*'); => karakter input akan disembunyikan dan akan terlihat sebagai karakter bintang 
        }
    }//GEN-LAST:event_cbShowPasswordItemStateChanged

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox cbShowPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelKanan;
    private javax.swing.JPanel panelKiri;
    private javax.swing.JPasswordField pwFieldPassword;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
}
