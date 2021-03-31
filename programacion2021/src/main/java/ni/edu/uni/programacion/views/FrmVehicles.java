/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.views;

import java.awt.BorderLayout;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import ni.edu.uni.programacion.controllers.PnlVehicleController;
import ni.edu.uni.programacion.controllers.PnlVehicleShowController;
import ni.edu.uni.programacion.views.panels.PnlShow;
import ni.edu.uni.programacion.views.panels.PnlVehicle;

/**
 *
 * @author Sistemas-05
 */
public class FrmVehicles extends javax.swing.JFrame {

    private PnlVehicle pnlVehicle;
    private PnlShow pnlShow;
    private PnlVehicleShowController pnlShowController;
    private PnlVehicleController pnlVehicleController;

    /**
     * Creates new form FrmVehicles
     */
    public FrmVehicles() {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pnlBottom = new javax.swing.JPanel();
        pnlContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vehicle App");

        jSplitPane1.setDividerLocation(120);
        jSplitPane1.setOneTouchExpandable(true);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        btnNew.setBackground(new java.awt.Color(0, 204, 204));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Webp.net-resizeimage (3).png"))); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel1.add(btnNew);

        btnView.setBackground(new java.awt.Color(0, 204, 204));
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Webp.net-resizeimage (4).png"))); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jPanel1.add(btnView);

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        pnlBottom.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(pnlBottom, java.awt.BorderLayout.PAGE_START);

        pnlContent.setBackground(new java.awt.Color(255, 204, 204));
        pnlContent.setLayout(new java.awt.BorderLayout());
        jPanel2.add(pnlContent, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(jPanel2);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(496, 598));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        try {
            if (pnlVehicle == null) {
                pnlVehicle = new PnlVehicle();
                pnlVehicleController = new PnlVehicleController(pnlVehicle);
            }
        } catch (FileNotFoundException ex) {
        }

        addComponent(pnlVehicle);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        if (pnlShow == null)
        {
           pnlShow=new PnlShow();
            //try
            {
                try {
                    pnlShowController = new PnlVehicleShowController(pnlShow);
                } catch (IOException ex) {
                    Logger.getLogger(FrmVehicles.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            /*catch (FileNotFoundException ex) {
                Logger.getLogger(FrmVehicle.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }

        addComponent(pnlShow);

    }//GEN-LAST:event_btnViewActionPerformed

    private void addComponent(JComponent component) {
        pnlContent.removeAll();
        pnlContent.add(component, BorderLayout.CENTER);
        pnlContent.repaint();
        this.validate();
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
            java.util.logging.Logger.getLogger(FrmVehicles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVehicles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVehicles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVehicles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVehicles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables
}
