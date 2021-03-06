/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Airliner;
import Business.AirlinerDirectory;
import Interface.airliner.AirlinerDirectoryJPanel;
import Interface.manage.LoginJPanel;
import java.awt.CardLayout;
import java.awt.Panel;


/**
 *
 * @author kavit
 */
public class TravelAgencyMain extends javax.swing.JFrame {

    /**
     * Creates new form TravelAgencyMain
     */
    private  AirlinerDirectory airliner1;
    private Airliner a;
   
    public TravelAgencyMain() {
        initComponents();
        airliner1=new AirlinerDirectory();
        a = new Airliner();
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
        leftJPanel = new javax.swing.JPanel();
        btnAgency = new javax.swing.JButton();
        btnAirliner = new javax.swing.JButton();
        btnCustomers = new javax.swing.JButton();
        rightJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftJPanel.setBackground(new java.awt.Color(20, 194, 211));

        btnAgency.setText("Travel Agency");
        btnAgency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgencyActionPerformed(evt);
            }
        });

        btnAirliner.setText("Manage Airliner");
        btnAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAirlinerActionPerformed(evt);
            }
        });

        btnCustomers.setText("Customers");

        javax.swing.GroupLayout leftJPanelLayout = new javax.swing.GroupLayout(leftJPanel);
        leftJPanel.setLayout(leftJPanelLayout);
        leftJPanelLayout.setHorizontalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAirliner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        leftJPanelLayout.setVerticalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(btnAgency)
                .addGap(43, 43, 43)
                .addComponent(btnAirliner)
                .addGap(46, 46, 46)
                .addComponent(btnCustomers)
                .addContainerGap(391, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(leftJPanel);

        rightJPanel.setBackground(new java.awt.Color(129, 235, 239));
        rightJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(rightJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgencyActionPerformed
        // TODO add your handling code here:
        AirlinerDirectoryJPanel adPanel = new AirlinerDirectoryJPanel(rightJPanel,airliner1  );
         rightJPanel.add("AirlinerDirectory", adPanel);
         CardLayout layout =(CardLayout)rightJPanel.getLayout();
         layout.next(rightJPanel);
    }//GEN-LAST:event_btnAgencyActionPerformed

    private void btnAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAirlinerActionPerformed
        // TODO add your handling code here:
        LoginJPanel Panel = new LoginJPanel(rightJPanel,airliner1);
         rightJPanel.add("ManageAirlinerCatalog", Panel);
         CardLayout layout =(CardLayout)rightJPanel.getLayout();
         layout.next(rightJPanel);
    }//GEN-LAST:event_btnAirlinerActionPerformed

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
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgencyMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgency;
    private javax.swing.JButton btnAirliner;
    private javax.swing.JButton btnCustomers;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftJPanel;
    private javax.swing.JPanel rightJPanel;
    // End of variables declaration//GEN-END:variables
}
