/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalgoritmos;

/**
 *
 * @author User
 */
public class Ventana4 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana3
     */
    public Ventana4() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnHome = new javax.swing.JButton();
        BtnConfig = new javax.swing.JButton();
        BtnMenu = new javax.swing.JButton();
        BtnMusic = new javax.swing.JButton();
        Manzana = new javax.swing.JLabel();
        HOME1 = new javax.swing.JButton();
        HOME = new javax.swing.JButton();
        APPLE = new javax.swing.JButton();
        CAR = new javax.swing.JButton();
        FranjaBoton1 = new javax.swing.JLabel();
        FranjaBoton2 = new javax.swing.JLabel();
        FranjaBoton3 = new javax.swing.JLabel();
        FranjaBoton4 = new javax.swing.JLabel();
        Fondo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnHome.setBackground(new java.awt.Color(117, 194, 197));
        BtnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_home.png"))); // NOI18N
        BtnHome.setBorder(null);
        BtnHome.setContentAreaFilled(false);
        BtnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(BtnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        BtnConfig.setBackground(new java.awt.Color(117, 194, 197));
        BtnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_config.png"))); // NOI18N
        BtnConfig.setBorder(null);
        BtnConfig.setContentAreaFilled(false);
        BtnConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(BtnConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 80, -1));

        BtnMenu.setBackground(new java.awt.Color(117, 194, 197));
        BtnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_menu.png"))); // NOI18N
        BtnMenu.setBorder(null);
        BtnMenu.setContentAreaFilled(false);
        BtnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(BtnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        BtnMusic.setBackground(new java.awt.Color(117, 194, 197));
        BtnMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_music.png"))); // NOI18N
        BtnMusic.setBorder(null);
        BtnMusic.setContentAreaFilled(false);
        BtnMusic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMusic.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(BtnMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 80, 70));

        Manzana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apple.png"))); // NOI18N
        getContentPane().add(Manzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 200, 200));

        HOME1.setFont(new java.awt.Font("Super Comic", 1, 36)); // NOI18N
        HOME1.setForeground(new java.awt.Color(255, 255, 255));
        HOME1.setText("CHEESE");
        HOME1.setBorder(null);
        HOME1.setContentAreaFilled(false);
        HOME1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(HOME1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 290, 60));

        HOME.setFont(new java.awt.Font("Super Comic", 1, 36)); // NOI18N
        HOME.setForeground(new java.awt.Color(255, 255, 255));
        HOME.setText("HOUSE");
        HOME.setBorder(null);
        HOME.setContentAreaFilled(false);
        HOME.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(HOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 310, 60));

        APPLE.setFont(new java.awt.Font("Super Comic", 1, 36)); // NOI18N
        APPLE.setForeground(new java.awt.Color(255, 255, 255));
        APPLE.setText("APPLE");
        APPLE.setBorder(null);
        APPLE.setContentAreaFilled(false);
        APPLE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        APPLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APPLEActionPerformed(evt);
            }
        });
        getContentPane().add(APPLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 290, 60));

        CAR.setFont(new java.awt.Font("Super Comic", 1, 36)); // NOI18N
        CAR.setForeground(new java.awt.Color(255, 255, 255));
        CAR.setText("CAR");
        CAR.setBorder(null);
        CAR.setContentAreaFilled(false);
        CAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(CAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 290, 60));

        FranjaBoton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnopciones.png"))); // NOI18N
        getContentPane().add(FranjaBoton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 350, 110));

        FranjaBoton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnopciones.png"))); // NOI18N
        getContentPane().add(FranjaBoton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 350, 110));

        FranjaBoton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnopciones.png"))); // NOI18N
        getContentPane().add(FranjaBoton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 350, 110));

        FranjaBoton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnopciones.png"))); // NOI18N
        getContentPane().add(FranjaBoton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 350, 110));

        Fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fondo4.jpg"))); // NOI18N
        getContentPane().add(Fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void APPLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APPLEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_APPLEActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton APPLE;
    private javax.swing.JButton BtnConfig;
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnMenu;
    private javax.swing.JButton BtnMusic;
    private javax.swing.JButton CAR;
    private javax.swing.JLabel Fondo3;
    private javax.swing.JLabel FranjaBoton1;
    private javax.swing.JLabel FranjaBoton2;
    private javax.swing.JLabel FranjaBoton3;
    private javax.swing.JLabel FranjaBoton4;
    private javax.swing.JButton HOME;
    private javax.swing.JButton HOME1;
    private javax.swing.JLabel Manzana;
    // End of variables declaration//GEN-END:variables
}
