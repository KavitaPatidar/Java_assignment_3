/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.Airliner;
import Business.Customer;
import UserInterface.AirlinerRole.ManageAirplaneCatalogJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 *  @author lENOVO PC
 */
public class ChooseFromAirplanes extends javax.swing.JPanel {

    /**
     * Creates new form ChooseFromAirplanes
     */
    private Customer customer;
    private JPanel userprocesscontainer;
    private Airliner airliner;
    public ChooseFromAirplanes(JPanel userprocesscontainer,Airliner airliner,Customer customer) {
        initComponents();
        this.userprocesscontainer=userprocesscontainer;
        this.airliner=airliner;
        this.customer=customer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooseairplanesLbl = new javax.swing.JLabel();
        viewairplanecatalogBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 0, 0));

        chooseairplanesLbl.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        chooseairplanesLbl.setText("Choose From Airplanes");

        viewairplanecatalogBtn.setText("View Airplane Catalog");
        viewairplanecatalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewairplanecatalogBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewairplanecatalogBtn)
                    .addComponent(chooseairplanesLbl))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(chooseairplanesLbl)
                .addGap(27, 27, 27)
                .addComponent(viewairplanecatalogBtn)
                .addContainerGap(211, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewairplanecatalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewairplanecatalogBtnActionPerformed
        // TODO add your handling code here:
        ViewAirplaneCatalog view_airplane_catalog = new ViewAirplaneCatalog(userprocesscontainer, airliner,customer);
        userprocesscontainer.add("ViewAirplaneCatalog",view_airplane_catalog);
        CardLayout layout = (CardLayout)userprocesscontainer.getLayout();
        layout.next(userprocesscontainer);
        
    }//GEN-LAST:event_viewairplanecatalogBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chooseairplanesLbl;
    private javax.swing.JButton viewairplanecatalogBtn;
    // End of variables declaration//GEN-END:variables
}
