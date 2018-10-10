/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.AirlinerDirectory;
import Business.Customer;
import Business.CustomerDirectory;
import UserInterface.AirlinerRole.LoginAirliner;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 *  @author lENOVO PC
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkAreaJPanel
     */
    private Customer customer;
    private JPanel userprocesscontainer;
    private AirlinerDirectory airlinerdirectory;
    private CustomerDirectory customerdirectory;
    public CustomerWorkAreaJPanel(JPanel userprocesscontainer,AirlinerDirectory airlinerdirectory,CustomerDirectory customerdirectory) {
        initComponents();
        this.userprocesscontainer=userprocesscontainer;
        this.airlinerdirectory=airlinerdirectory;
        this.customerdirectory=customerdirectory;
        customer =new Customer();
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
        customerprofileBtn = new javax.swing.JButton();
        bookflightsBtn = new javax.swing.JButton();
        customerworkareaLbl = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(204, 0, 0));

        customerprofileBtn.setText("Customer profile");
        customerprofileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerprofileBtnActionPerformed(evt);
            }
        });

        bookflightsBtn.setText("Book flights");
        bookflightsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookflightsBtnActionPerformed(evt);
            }
        });

        customerworkareaLbl.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        customerworkareaLbl.setText("DASHBOARD: CUSTOMER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(customerprofileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookflightsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(customerworkareaLbl)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(customerworkareaLbl)
                .addGap(46, 46, 46)
                .addComponent(customerprofileBtn)
                .addGap(68, 68, 68)
                .addComponent(bookflightsBtn)
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void customerprofileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerprofileBtnActionPerformed
        // TODO add your handling code here:
        ManageCustomers manage_customers = new ManageCustomers(userprocesscontainer, airlinerdirectory,customerdirectory,customer);
        userprocesscontainer.add("ManageCustomers", manage_customers);
        CardLayout layout = (CardLayout)userprocesscontainer.getLayout();
        layout.next(userprocesscontainer);
    }//GEN-LAST:event_customerprofileBtnActionPerformed

    private void bookflightsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookflightsBtnActionPerformed
        // TODO add your handling code here:
        ChooseFromAirlines choose_from_airlines = new ChooseFromAirlines(userprocesscontainer,airlinerdirectory,customer);
        userprocesscontainer.add("ChooseFromAirlines",choose_from_airlines);
        CardLayout layout = (CardLayout)userprocesscontainer.getLayout();
        layout.next(userprocesscontainer);
    }//GEN-LAST:event_bookflightsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookflightsBtn;
    private javax.swing.JButton customerprofileBtn;
    private javax.swing.JLabel customerworkareaLbl;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
