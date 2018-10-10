/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.manage;

import Business.Airliner;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author kavit
 */
public class WorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorkAreaJPanel
     */
    private Airliner air_liner;
    private JPanel rightJPanel;
    public WorkAreaJPanel(JPanel rightJPanel,Airliner air_liner) {
        initComponents();
        this.air_liner=air_liner;
        this.rightJPanel=rightJPanel;
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
        btnManageCatalog = new javax.swing.JButton();

        setBackground(new java.awt.Color(129, 235, 239));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setText("Work Area of Airliner");

        btnManageCatalog.setText("Manage Airliner Catalog>>");
        btnManageCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCatalogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(252, 252, 252))
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(btnManageCatalog)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(btnManageCatalog)
                .addContainerGap(458, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCatalogActionPerformed
        // TODO add your handling code here:
        ManageJPanel l = new ManageJPanel(rightJPanel, air_liner);
        rightJPanel.add("LoginJPanel", l);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnManageCatalogActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCatalog;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}