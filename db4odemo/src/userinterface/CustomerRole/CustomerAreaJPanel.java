/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Order.Menu;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Order.OrderItem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;

    private UserAccount userAccount;
    private final RestaurantDirectory resDirectory;
    private final EcoSystem system;
    private final Menu menu;
    private final CustomerDirectory customerDirectory;
    private final OrderDirectory orderDir;
    private final DeliveryManDirectory deldir;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, RestaurantDirectory resDirectory, Menu menu,CustomerDirectory customerDirectory,OrderDirectory orderDir,DeliveryManDirectory deldir) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.resDirectory = resDirectory;
        this.menu = menu;
        this.system = system;     
        this.userAccount = account;
        this.customerDirectory = customerDirectory;
        this.orderDir = orderDir;
        this.deldir = deldir;

        populateRequestTable();
    
    }


    
    public void populateRequestTable(){
                DefaultTableModel model = (DefaultTableModel) tblRestaurantList.getModel();
        model.setRowCount(0);
        //for (OrderItem item : menu.getMenuList()) {
            Object[] row = new Object[5];
            row[0] = "ccd";
            row[1] = "ccd";
            row[2] = "ccd";
            row[3] = "ccd";
            row[4] = "ccd";
            model.addRow(row);
        //}
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        btnViewOrders = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRestaurantList = new javax.swing.JTable();
        btnPlaceOrder = new javax.swing.JButton();
        cmboxQtyCount = new javax.swing.JComboBox();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        requestTestJButton.setText("Request Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        lblQuantity.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(0, 51, 51));
        lblQuantity.setText("Quantity:");

        btnViewOrders.setBackground(new java.awt.Color(204, 255, 255));
        btnViewOrders.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnViewOrders.setForeground(new java.awt.Color(0, 51, 51));
        btnViewOrders.setText("View Orders");
        btnViewOrders.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrdersActionPerformed(evt);
            }
        });

        tblRestaurantList.setBackground(new java.awt.Color(204, 255, 255));
        tblRestaurantList.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        tblRestaurantList.setForeground(new java.awt.Color(0, 51, 51));
        tblRestaurantList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Restaurant", "Item", "Category", "Ingredients", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblRestaurantList);

        btnPlaceOrder.setBackground(new java.awt.Color(204, 255, 255));
        btnPlaceOrder.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnPlaceOrder.setForeground(new java.awt.Color(0, 51, 51));
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        cmboxQtyCount.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        cmboxQtyCount.setForeground(new java.awt.Color(0, 51, 51));
        cmboxQtyCount.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" }));
        cmboxQtyCount.setToolTipText("");
        cmboxQtyCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxQtyCountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                .addComponent(refreshTestJButton)
                .addGap(103, 103, 103))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(requestTestJButton)
                .addGap(41, 41, 41))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(142, 142, 142)
                            .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(cmboxQtyCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(btnViewOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(120, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(refreshTestJButton)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                .addComponent(requestTestJButton)
                .addGap(88, 88, 88))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmboxQtyCount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnViewOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(107, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        
        
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void btnViewOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrdersActionPerformed
        // TODO add your handling code here:
//       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//       OrderRequest orderRequest = new OrderRequest(userProcessContainer, userAccount, system, customerDirectory, resDirectory, deldir, menu,orderDir);
//       userProcessContainer.add(orderRequest);
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewOrdersActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
        int row = tblRestaurantList.getSelectedRow();
        int count = tblRestaurantList.getSelectedRowCount();
        if (count == 1) {
            if (row >= 0) {
              int quantity = Integer.parseInt(cmboxQtyCount.getSelectedItem().toString());
               // Restaurant res = resDirectory.getResDirectory(menu.getOrderItemByKey(row).getRestaurantNo());
//               Restaurant res = resDirectory.getRestaurant(menu.getOrderItemByKey(row).getRestaurantNo());
               Customer customer = customerDirectory.getCustomer(userAccount.getEmployee().getName());
                OrderItem item = menu.getOrderItemByKey(row);
                String status = "Awaiting Order Confirmation";

                Order or = orderDir.add();
                or.setOrderNo("Order " + (orderDir.getOrderDir().size()));
                or.setOrderItem(item);
                //orderRequest.setRestaurant();
                or.setCustomer(customer);
                or.setQuantity(quantity);
                or.setMessage("Order Placed");
                or.setSender(userAccount);
                or.setStatus(status);
                system.setOrderDir(orderDir);
                system.getWorkQueue().getWorkRequestList().add(or);
                JOptionPane.showMessageDialog(null, "Your Order has been sucessfully placed!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void cmboxQtyCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxQtyCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxQtyCountActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnViewOrders;
    private javax.swing.JComboBox cmboxQtyCount;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable tblRestaurantList;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
