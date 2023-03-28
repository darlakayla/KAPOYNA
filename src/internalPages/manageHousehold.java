/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import config.dbconfiguration;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author HP
 */
public class manageHousehold extends javax.swing.JInternalFrame {

    /**
     * Creates new form newResident
     */
    public manageHousehold() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
        public void displayData(){
       
        try{
       
            dbconfiguration dbc = new dbconfiguration();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_householdrecords");
            tbl_household.setModel(DbUtils.resultSetToTableModel(rs));
       
        }catch(SQLException ex){
            System.out.println("Error Message: "+ex);    
        }            
        
    }
    public void reset(){
        id.setText("");
        fullname.setText("");
        spouse.setText("");
        gender.setText("");
        status.setText("");
        birthdate.setText("");
        address.setText("");  
        occupation.setText("");  
        contact.setText("");  
        number.setText("");  
        ages.setText("");  
    }
    
    
    
    
    
    
    
        Color navcolor= new Color(255,102,102);
        Color headcolor= new Color(255,153,153);
        Color bodycolor = new Color(255,204,204);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        occupation = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        birthdate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_household = new javax.swing.JTable();
        add = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        clear = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        display = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ages = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        spouse = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Household ID:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 240, 130, 30);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Spouse Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 320, 130, 30);

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Gender:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 360, 130, 30);

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Status:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 400, 130, 30);

        jLabel14.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel14.setText("No. of Children (ALL)");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(440, 400, 140, 30);

        jLabel13.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel13.setText("Occupation:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(440, 320, 140, 30);

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel10.setText("Address:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(440, 240, 140, 30);

        fullname.setBackground(new java.awt.Color(255, 153, 153));
        fullname.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(fullname);
        fullname.setBounds(160, 280, 250, 30);

        status.setBackground(new java.awt.Color(255, 153, 153));
        status.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        jPanel1.add(status);
        status.setBounds(160, 400, 250, 30);

        id.setEditable(false);
        id.setBackground(new java.awt.Color(255, 153, 153));
        id.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(id);
        id.setBounds(160, 240, 250, 30);

        occupation.setBackground(new java.awt.Color(255, 153, 153));
        occupation.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(occupation);
        occupation.setBounds(580, 320, 260, 30);

        number.setBackground(new java.awt.Color(255, 153, 153));
        number.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(number);
        number.setBounds(580, 400, 260, 30);

        address.setBackground(new java.awt.Color(255, 153, 153));
        address.setColumns(20);
        address.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(580, 240, 260, 70);

        birthdate.setBackground(new java.awt.Color(255, 153, 153));
        birthdate.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(birthdate);
        birthdate.setBounds(160, 440, 250, 30);

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Birthdate:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 440, 130, 30);

        tbl_household.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_householdMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_household);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 10, 850, 180);

        add.setBackground(new java.awt.Color(255, 153, 153));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("ADD");
        add.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        jPanel1.add(add);
        add.setBounds(120, 200, 120, 30);

        edit.setBackground(new java.awt.Color(255, 153, 153));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("EDIT");
        edit.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        jPanel1.add(edit);
        edit.setBounds(250, 200, 120, 30);

        delete.setBackground(new java.awt.Color(255, 153, 153));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("DELETE");
        delete.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        jPanel1.add(delete);
        delete.setBounds(380, 200, 120, 30);

        clear.setBackground(new java.awt.Color(255, 153, 153));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });
        clear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("CLEAR");
        clear.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        jPanel1.add(clear);
        clear.setBounds(510, 200, 120, 30);

        display.setBackground(new java.awt.Color(255, 153, 153));
        display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                displayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                displayMouseExited(evt);
            }
        });
        display.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("DISPLAY");
        display.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        jPanel1.add(display);
        display.setBounds(650, 200, 130, 30);

        contact.setBackground(new java.awt.Color(255, 153, 153));
        contact.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(contact);
        contact.setBounds(580, 360, 260, 30);

        jLabel15.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel15.setText("Contact:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(440, 360, 140, 30);

        jLabel16.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel16.setText("Their ages:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(440, 440, 140, 30);

        ages.setBackground(new java.awt.Color(255, 153, 153));
        ages.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(ages);
        ages.setBounds(580, 440, 260, 30);

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Fullname: (Head)");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 280, 130, 30);

        spouse.setBackground(new java.awt.Color(255, 153, 153));
        spouse.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(spouse);
        spouse.setBounds(160, 320, 250, 30);

        gender.setBackground(new java.awt.Color(255, 153, 153));
        gender.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel1.add(gender);
        gender.setBounds(160, 360, 250, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(navcolor);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(headcolor);
    }//GEN-LAST:event_addMouseExited

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setBackground(navcolor);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setBackground(headcolor);
    }//GEN-LAST:event_editMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(navcolor);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(headcolor);
    }//GEN-LAST:event_deleteMouseExited

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        clear.setBackground(navcolor);
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        clear.setBackground(headcolor);
    }//GEN-LAST:event_clearMouseExited

    private void displayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseEntered
        display.setBackground(navcolor);
    }//GEN-LAST:event_displayMouseEntered

    private void displayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseExited
        display.setBackground(headcolor);
    }//GEN-LAST:event_displayMouseExited

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        int rowIndex = tbl_household.getSelectedRow();
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please select an Item!");           
        }else{ 
            TableModel model = tbl_household.getModel();
             editNewHousehold nh = new editNewHousehold();
             nh.id.setText(""+model.getValueAt(rowIndex,0));
             nh.fullname.setText(""+model.getValueAt(rowIndex,1));
             nh.spouse.setText(""+model.getValueAt(rowIndex,2));       
             nh.gender = model.getValueAt(rowIndex,3).toString();
             String gend = model .getValueAt(rowIndex,3).toString();
             if(gend.equals("Male")){
                 nh.male.setSelected(true);
             }
             if(gend.equals("Female")){
               nh.female.setSelected(true);
             }
             nh.status.setSelectedItem(model.getValueAt(rowIndex,4));
             nh.birthdate.setText(""+model.getValueAt(rowIndex,5));
             nh.address.setText(model.getValueAt(rowIndex,6).toString());
             nh.occupation.setText(""+model.getValueAt(rowIndex,7));
             nh.contact.setText(""+model.getValueAt(rowIndex,8));
             nh.numbers.setText(""+model.getValueAt(rowIndex,9));
             nh.ages.setText(""+model.getValueAt(rowIndex,10));
             
             nh.setVisible(true);
             nh.action = "Update";             
             nh.st_label1.setText("UPDATE");
             JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
             editNewHousehold en = new editNewHousehold();
             mainFrame.dispose();
        }
    }//GEN-LAST:event_editMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        mainFrame.dispose();
        editNewHousehold nh = new editNewHousehold();
        nh.setVisible(true);
        nh.action = "Add";
        nh.st_label1.setText("SAVE");
    }//GEN-LAST:event_addMouseClicked

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        int rowIndex = tbl_household.getSelectedRow();
       if(rowIndex < 0){
           JOptionPane.showMessageDialog(null, "Please select data first from the table!");
       }else{
            TableModel model = tbl_household.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
             int a=JOptionPane.showConfirmDialog(null,"Are you sure to delete ID "+id);  
                    if(a==JOptionPane.YES_OPTION){  
                            dbconfiguration dbc = new dbconfiguration();
                            int hh_id=Integer.parseInt(id);
                            dbc.deletedata(hh_id,"tbl_householdrecords");
                            displayData();
                            
                    }    
       }

    }//GEN-LAST:event_deleteMouseClicked

    private void displayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseClicked
        displayData();
    }//GEN-LAST:event_displayMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        reset();
    }//GEN-LAST:event_clearMouseClicked

    private void tbl_householdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_householdMouseClicked
        int rowIndex = tbl_household.getSelectedRow();
        if(rowIndex < 0){          
        }else{
            TableModel model = tbl_household.getModel();
            id.setText(""+model.getValueAt(rowIndex,0));
            fullname.setText(""+model.getValueAt(rowIndex,1));
            spouse.setText(""+model.getValueAt(rowIndex,2));
            gender.setText(""+model.getValueAt(rowIndex,3));
            status.setText(""+model.getValueAt(rowIndex,4));
            birthdate.setText(""+model.getValueAt(rowIndex,5));
            address.setText(""+model.getValueAt(rowIndex,6));    
            occupation.setText(""+model.getValueAt(rowIndex,7));    
            contact.setText(""+model.getValueAt(rowIndex,8));   
            number.setText(""+model.getValueAt(rowIndex,9));   
            ages.setText(""+model.getValueAt(rowIndex,10));   
        }           
    }//GEN-LAST:event_tbl_householdMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JTextArea address;
    private javax.swing.JTextField ages;
    private javax.swing.JTextField birthdate;
    private javax.swing.JPanel clear;
    private javax.swing.JTextField contact;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel display;
    private javax.swing.JPanel edit;
    private javax.swing.JTextField fullname;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField number;
    private javax.swing.JTextField occupation;
    private javax.swing.JTextField spouse;
    private javax.swing.JTextField status;
    private javax.swing.JTable tbl_household;
    // End of variables declaration//GEN-END:variables
}