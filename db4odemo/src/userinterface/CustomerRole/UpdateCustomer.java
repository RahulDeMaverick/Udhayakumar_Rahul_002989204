/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rahuludhayakumar
 */
public class UpdateCustomer extends javax.swing.JPanel {

    /**
     * Creates new form UpdateCustomer
     */
    
        public CustomerDirectory customerDirectory;
    public JPanel container;
    public Customer customer;
    private final EcoSystem system;
    private String currentPhoneNo;
    private String currentMailID;
    
    public UpdateCustomer(EcoSystem system, JPanel container, Customer customer, CustomerDirectory customerDirectory) {
        initComponents();
               this.customerDirectory = customerDirectory;
        this.container = container;
        this.customer = customer;
        this.system = system;
        this.currentMailID = customer.getCustEmail();
        this.currentPhoneNo = customer.getCustContact(); 
        
        txtCustID.setText(customer.getCustID());
        txtCustAddr.setText(customer.getCustAddr());
        txtCustContact.setText(customer.getCustContact());
        txtCustEmail.setText(customer.getCustEmail());
        txtCustName.setText(customer.getCustName());
        txtCustZip.setText(customer.getCustZipCode());

        disableEdit();
    }
    private void disableEdit(){
    txtCustID.setEditable(false);
    txtCustAddr.setEditable(false);
    txtCustContact.setEditable(false);
    txtCustEmail.setEditable(false);
    txtCustName.setEditable(false);
    txtCustZip.setEditable(false);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCustContact = new javax.swing.JLabel();
        txtCustName = new javax.swing.JTextField();
        txtCustContact = new javax.swing.JTextField();
        btnBack1 = new javax.swing.JButton();
        lblCustEmail = new javax.swing.JLabel();
        btnSaveChanges = new javax.swing.JButton();
        txtCustEmail = new javax.swing.JTextField();
        btnEnableUpdate = new javax.swing.JButton();
        lblViewUpdateCust = new javax.swing.JLabel();
        lblCustID = new javax.swing.JLabel();
        lblCustAddr = new javax.swing.JLabel();
        txtCustID = new javax.swing.JTextField();
        lblCustName = new javax.swing.JLabel();
        txtCustAddr = new javax.swing.JTextField();
        lblCustZip = new javax.swing.JLabel();
        txtCustZip = new javax.swing.JTextField();

        lblCustContact.setBackground(new java.awt.Color(204, 255, 255));
        lblCustContact.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblCustContact.setForeground(new java.awt.Color(0, 51, 51));
        lblCustContact.setText("Contact No :");

        txtCustName.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtCustName.setForeground(new java.awt.Color(0, 51, 51));

        txtCustContact.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtCustContact.setForeground(new java.awt.Color(0, 51, 51));

        btnBack1.setBackground(new java.awt.Color(204, 255, 255));
        btnBack1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(0, 51, 51));
        btnBack1.setText("Back");
        btnBack1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        lblCustEmail.setBackground(new java.awt.Color(204, 255, 255));
        lblCustEmail.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblCustEmail.setForeground(new java.awt.Color(0, 51, 51));
        lblCustEmail.setText("Email ID:");

        btnSaveChanges.setBackground(new java.awt.Color(204, 255, 255));
        btnSaveChanges.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnSaveChanges.setForeground(new java.awt.Color(0, 51, 51));
        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        txtCustEmail.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtCustEmail.setForeground(new java.awt.Color(0, 51, 51));

        btnEnableUpdate.setBackground(new java.awt.Color(204, 255, 255));
        btnEnableUpdate.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnEnableUpdate.setForeground(new java.awt.Color(0, 51, 51));
        btnEnableUpdate.setText("Enable Update");
        btnEnableUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEnableUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnableUpdateActionPerformed(evt);
            }
        });

        lblViewUpdateCust.setBackground(new java.awt.Color(204, 255, 255));
        lblViewUpdateCust.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblViewUpdateCust.setForeground(new java.awt.Color(0, 51, 51));
        lblViewUpdateCust.setText("Customer Details");

        lblCustID.setBackground(new java.awt.Color(204, 255, 255));
        lblCustID.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblCustID.setForeground(new java.awt.Color(0, 51, 51));
        lblCustID.setText("Customer ID :");

        lblCustAddr.setBackground(new java.awt.Color(204, 255, 255));
        lblCustAddr.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblCustAddr.setForeground(new java.awt.Color(0, 51, 51));
        lblCustAddr.setText("Street Address :");

        txtCustID.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtCustID.setForeground(new java.awt.Color(0, 51, 51));

        lblCustName.setBackground(new java.awt.Color(204, 255, 255));
        lblCustName.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblCustName.setForeground(new java.awt.Color(0, 51, 51));
        lblCustName.setText("Full Name :");

        txtCustAddr.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtCustAddr.setForeground(new java.awt.Color(0, 51, 51));

        lblCustZip.setBackground(new java.awt.Color(204, 255, 255));
        lblCustZip.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblCustZip.setForeground(new java.awt.Color(0, 51, 51));
        lblCustZip.setText("Zip Code :");

        txtCustZip.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtCustZip.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 906, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(320, 320, 320)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblViewUpdateCust)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(lblCustEmail))
                                    .addComponent(lblCustID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCustName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCustContact, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCustContact, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCustEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEnableUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(btnSaveChanges, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCustAddr)
                                    .addComponent(lblCustZip))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCustAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCustZip, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(320, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(lblViewUpdateCust)
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(lblCustContact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCustID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCustID))
                            .addGap(7, 7, 7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCustName))
                            .addGap(7, 7, 7)
                            .addComponent(txtCustContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCustEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCustEmail))))
                    .addGap(7, 7, 7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCustAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCustAddr))
                    .addGap(7, 7, 7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCustZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCustZip))
                    .addGap(17, 17, 17)
                    .addComponent(btnEnableUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(btnSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBack1)))
                    .addContainerGap(55, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerDB manageCustomersJPanel = (CustomerDB) component;
       // CustomerDB.populateCustomer();

        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);

    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        // TODO add your handling code here:
        String custID = txtCustID.getText();
        String custName = txtCustName.getText();
        String custContact = txtCustContact.getText();
        String custAddr = txtCustAddr.getText();
        String custZipCode = txtCustZip.getText();
        String custEmail = txtCustEmail.getText();
        boolean allSet = true;

        if( custName.isEmpty() || custContact.isEmpty() || custAddr.isEmpty() || custZipCode.isEmpty() || custEmail.isEmpty() ) {
            allSet = false;
            JOptionPane.showMessageDialog(null, "Kindly Enter all the required fields!");
        } 
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void btnEnableUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnableUpdateActionPerformed
        // TODO add your handling code here:
        txtCustAddr.setEditable(true);
        txtCustContact.setEditable(true);
        txtCustEmail.setEditable(true);
        txtCustName.setEditable(true);
        txtCustZip.setEditable(true);
        btnEnableUpdate.setEnabled(false);
    }//GEN-LAST:event_btnEnableUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnEnableUpdate;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JLabel lblCustAddr;
    private javax.swing.JLabel lblCustContact;
    private javax.swing.JLabel lblCustEmail;
    private javax.swing.JLabel lblCustID;
    private javax.swing.JLabel lblCustName;
    private javax.swing.JLabel lblCustZip;
    private javax.swing.JLabel lblViewUpdateCust;
    private javax.swing.JTextField txtCustAddr;
    private javax.swing.JTextField txtCustContact;
    private javax.swing.JTextField txtCustEmail;
    private javax.swing.JTextField txtCustID;
    private javax.swing.JTextField txtCustName;
    private javax.swing.JTextField txtCustZip;
    // End of variables declaration//GEN-END:variables
}
