/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.table.DefaultTableModel;
import model.History;
import model.cars;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.opencsv.CSVWriter;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author rahuludhayakumar
 */
public class Viewjpanel extends javax.swing.JPanel {

    /**
     * Creates new form
     */
    History carshistory;

    public Viewjpanel(History carshistory) throws IOException {
        initComponents();
        this.carshistory = carshistory;
        populateTable();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        txtlastdate = new javax.swing.JTextField();
        lblmodel = new javax.swing.JLabel();
        txtisavailable = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtexpirydate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtmodel = new javax.swing.JTextField();
        txtseats = new javax.swing.JTextField();
        txtcarmannumber = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(800, 800));
        setVerifyInputWhenFocusTarget(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW CARS");

        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 800));

        jTable1.setBackground(new java.awt.Color(51, 255, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "serialNumber", "modelname", "seats", "CarManufacturer", "lastDate", "city", "expiryDate", "isavailable"
            }
        ));
        jTable1.setMinimumSize(new java.awt.Dimension(300, 300));
        jTable1.setPreferredSize(new java.awt.Dimension(600, 1000));
        jTable1.setShowGrid(false);
        jScrollPane1.setViewportView(jTable1);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });

        btnsearch.setBackground(new java.awt.Color(0, 204, 204));
        btnsearch.setText("Search");
        btnsearch.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        txtlastdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastdateActionPerformed(evt);
            }
        });

        lblmodel.setText("modelName");

        txtisavailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtisavailableActionPerformed(evt);
            }
        });

        jLabel3.setText("Seats");

        txtcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcityActionPerformed(evt);
            }
        });

        jLabel5.setText("CarManufacturer");

        txtexpirydate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexpirydateActionPerformed(evt);
            }
        });

        jLabel6.setText("lastDate");

        jLabel7.setText("isavailable");

        jLabel8.setText("city");

        jLabel9.setText("expiryDate");

        txtmodel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmodelActionPerformed(evt);
            }
        });

        txtseats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtseatsActionPerformed(evt);
            }
        });

        txtcarmannumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcarmannumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(346, 346, 346))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblmodel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtseats, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcarmannumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlastdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtisavailable, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtexpirydate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(337, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btndelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcarmannumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlastdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtisavailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtexpirydate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtseats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 200, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        int index=  jTable1.getSelectedRow();
            
            if(index<0){
                JOptionPane.showMessageDialog(this, "Please select a row to Delete");
                return;
            }
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            cars selectedcars = (cars) model.getValueAt(index , 0); 
            
            txtmodel.setText(selectedcars.getModelName());
            txtexpirydate.setText(selectedcars.getExpiryDate());
            txtlastdate.setText(selectedcars.getLastDate());
            txtcity.setText(selectedcars.getCity());
            txtcarmannumber.setText(selectedcars.getCarManufacturer());
            txtseats.setText(String.valueOf(selectedcars.getSeats()));
            

    }//GEN-LAST:event_btnViewActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed

        try {
            int index = jTable1.getSelectedRow();

            if (index < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to Delete");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            cars selectedcars = (cars) model.getValueAt(index, 0);
            carshistory.deletecars(selectedcars);

            JOptionPane.showMessageDialog(this, "Selected car deleted!");

            populateTable();
        } catch (IOException ex) {
            Logger.getLogger(Viewjpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtsearch.getText().trim()));
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtlastdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlastdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlastdateActionPerformed

    private void txtisavailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtisavailableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtisavailableActionPerformed

    private void txtcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcityActionPerformed

    private void txtexpirydateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexpirydateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtexpirydateActionPerformed

    private void txtmodelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmodelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmodelActionPerformed

    private void txtseatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtseatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtseatsActionPerformed

    private void txtcarmannumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcarmannumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcarmannumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnView;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblmodel;
    private javax.swing.JTextField txtcarmannumber;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtexpirydate;
    private javax.swing.JTextField txtisavailable;
    private javax.swing.JTextField txtlastdate;
    private javax.swing.JTextField txtmodel;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtseats;
    // End of variables declaration//GEN-END:variables

    private void populateTable() throws IOException {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        Object[] row = new Object[10];
        for (cars vs : carshistory.getCarshistory()) {

            row[0] = vs;
            row[1] = vs.getSerialNumber();
            row[2] = vs.getModelName();
            row[3] = vs.getSeats();
            row[4] = vs.getCarManufacturer();
            row[5] = vs.getLastDate();
            row[6] = vs.getCity();
            row[7] = vs.getExpiryDate();
            row[8] = vs.isIsavailable();

            model.addRow(row);
        }

        String[] rowVal = new String[10];
        for (cars cr : carshistory.getCarshistory()) {
            rowVal[0] = cr.getSerialNumber();
            rowVal[1] = cr.getModelName();
            rowVal[2] = String.valueOf(cr.getSeats());
            rowVal[3] = cr.getCarManufacturer();
            rowVal[4] = cr.getLastDate();
            rowVal[5] = cr.getCity();
            rowVal[6] = cr.getExpiryDate();
            rowVal[7] = String.valueOf(cr.isIsavailable());
        }
        String file = "/Users/rahuludhayakumar/Downloads/output.csv";
        List<String[]> content = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/rahuludhayakumar/Downloads/car_db.csv"))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                content.add(line.split(","));
            }
            FileWriter outputfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputfile);
            String[] header = { "Unique Number", "Car Model", "carManufacturer", "Manufacturing Year","No of Seats", "City","Last Updated Time","Expiry Date", "Is Available"};
            writer.writeNext(header);
            writer.writeNext(rowVal);
            for (int i = 1; i < content.size(); i++) {
                String a = Arrays.toString(content.get(i));
                String[] val = a.split(",");
                System.out.println(val[4]);
                
            cars carInformation = carshistory.addcars();
            carInformation.setSerialNumber(val[0]);
            carInformation.setCarManufacturer(val[2]);
            carInformation.setCity(val[5]);
            carInformation.setExpiryDate(val[7]);
            carInformation.setIsavailable(Boolean.valueOf(val[6]));
            carInformation.setLastDate((val[3]));
            carInformation.setModelName(val[1]);
            carInformation.setSeats(Integer.parseInt(val[4].stripIndent()));
            
                writer.writeNext(val);

               for(int j=0;j<val.length;j++)
               
            {
                System.out.println(j);
                row[0] = carInformation;
                row[j]= val[j];
            }
               model.addRow(row);
            }
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Viewjpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

}
