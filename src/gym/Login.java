/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

import java.awt.Color;

/**
 *
 * @author safwa
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        ad = new javax.swing.JButton();
        tr = new javax.swing.JButton();
        mem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(350, 100, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ad.setBackground(new java.awt.Color(0, 0, 0));
        ad.setFont(new java.awt.Font("Niagara Engraved", 1, 48)); // NOI18N
        ad.setForeground(new java.awt.Color(255, 0, 0));
        ad.setText("Admin");
        ad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adMouseExited(evt);
            }
        });
        ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adActionPerformed(evt);
            }
        });
        getContentPane().add(ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 210, 62));

        tr.setBackground(new java.awt.Color(0, 0, 0));
        tr.setFont(new java.awt.Font("Niagara Engraved", 1, 48)); // NOI18N
        tr.setForeground(new java.awt.Color(255, 0, 0));
        tr.setText("Trainer");
        tr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                trMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                trMouseExited(evt);
            }
        });
        tr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trActionPerformed(evt);
            }
        });
        getContentPane().add(tr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 210, 67));

        mem.setBackground(new java.awt.Color(0, 0, 0));
        mem.setFont(new java.awt.Font("Niagara Engraved", 1, 48)); // NOI18N
        mem.setForeground(new java.awt.Color(255, 0, 0));
        mem.setText(" Member ");
        mem.setToolTipText("");
        mem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                memMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                memMouseExited(evt);
            }
        });
        mem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memActionPerformed(evt);
            }
        });
        getContentPane().add(mem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 210, 64));

        jLabel1.setFont(new java.awt.Font("Niagara Engraved", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Please Select From Following Category");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 550, 89));

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Niagara Engraved", 1, 36)); // NOI18N
        back.setForeground(new java.awt.Color(255, 0, 0));
        back.setText("<<<");
        back.setMaximumSize(new java.awt.Dimension(70, 50));
        back.setMinimumSize(new java.awt.Dimension(70, 50));
        back.setPreferredSize(new java.awt.Dimension(70, 50));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 100, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/Pic/bg3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adMouseEntered
        ad.setForeground(Color.WHITE);
    }//GEN-LAST:event_adMouseEntered

    private void adMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adMouseExited
        ad.setForeground(Color.red);
    }//GEN-LAST:event_adMouseExited

    private void adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adActionPerformed
        AdminLog adlog = new AdminLog();
        adlog.setVisible(true);
        dispose();
    }//GEN-LAST:event_adActionPerformed

    private void trMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trMouseEntered
        tr.setForeground(Color.WHITE);
    }//GEN-LAST:event_trMouseEntered

    private void trMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trMouseExited
        tr.setForeground(Color.red);
    }//GEN-LAST:event_trMouseExited

    private void trActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trActionPerformed
        TrainerLog trlog = new TrainerLog();
        trlog.setVisible(true);
        dispose();
    }//GEN-LAST:event_trActionPerformed

    private void memMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memMouseEntered
        mem.setForeground(Color.WHITE);
    }//GEN-LAST:event_memMouseEntered

    private void memMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memMouseExited
        mem.setForeground(Color.red);
    }//GEN-LAST:event_memMouseExited

    private void memActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memActionPerformed
        MemberLog mblog = new MemberLog();
        mblog.setVisible(true);
        dispose();
    }//GEN-LAST:event_memActionPerformed

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setForeground(Color.WHITE);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setForeground(Color.RED);
    }//GEN-LAST:event_backMouseExited

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Choose1 ch = new Choose1();
        ch.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ad;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton mem;
    private javax.swing.JButton tr;
    // End of variables declaration//GEN-END:variables
}
