/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optical.forms;

import optical.db.DBClass;
import optical.db.ComboItem;
import optical.db.ImageUtiltiy;
import optical.db.Messages;
import optical.db.Rules;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author Administrator
 */
public class EmployeeForm extends javax.swing.JFrame {

    DBClass db=new DBClass();
    File file;
    /**
     * Creates new form ItemForm
     */
    public EmployeeForm() {        
        initComponents();
        ImageUtiltiy.resizeLabelImage(lbl2);
        getContentPane().setBackground(Color.WHITE);
        JRootPane p1=getRootPane();
        p1.setBorder(BorderFactory.createEtchedBorder());
        db.fillTable2(table1, "select * from Employee");
        db.applySearch(table1, cmbfield, txtsearch, "select * from Employee");                   
        getContentPane().setBackground(new java.awt.Color(255,255,255));        
        txtid.setText(db.getID("EmpNo"));
        txtname.requestFocus();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        txtcontact = new javax.swing.JTextField();
        cmbdesg = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtjdate = new com.github.lgooddatepicker.components.DatePicker();
        jLabel9 = new javax.swing.JLabel();
        lblphoto = new javax.swing.JLabel();
        btnbrowse = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtsalary = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbfield = new javax.swing.JComboBox<>();
        txtsearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Employee Information");
        setBackground(new java.awt.Color(227, 134, 21));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Employee ID");
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtid.setEditable(false);
        txtid.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        jLabel2.setText("Employee Name");
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtname.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel3.setText("Employee Address");
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        jLabel4.setText("Contact/Mobile No");
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel7.setText("Designation");
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        btnsave.setText("Save");
        btnsave.setBackground(new java.awt.Color(250, 72, 37));
        btnsave.setContentAreaFilled(false);
        btnsave.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setOpaque(true);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnreset.setText("Reset");
        btnreset.setBackground(new java.awt.Color(250, 72, 37));
        btnreset.setContentAreaFilled(false);
        btnreset.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setOpaque(true);
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        txtcontact.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        cmbdesg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Worker", "Operator", "Manager" }));
        cmbdesg.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbdesg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbdesgActionPerformed(evt);
            }
        });

        jLabel8.setText("Joining Date");
        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel9.setText("Employee Image");
        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        lblphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnbrowse.setText("Browse");
        btnbrowse.setBackground(new java.awt.Color(250, 72, 37));
        btnbrowse.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnbrowse.setForeground(new java.awt.Color(255, 0, 0));
        btnbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbrowseActionPerformed(evt);
            }
        });

        jLabel5.setText("Salary");
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtsalary.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbrowse))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsalary)
                            .addComponent(txtcontact)
                            .addComponent(txtjdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtname)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(cmbdesg, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnsave)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnreset))
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtjdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbdesg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbrowse)))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btnreset))
                .addGap(46, 46, 46))
        );

        jLabel10.setText("Search");
        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        cmbfield.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EmpID", "EmpName", "EmpAddress", "BirthDate", "JoinDate", "Designation" }));
        cmbfield.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtsearch.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employeer Name", "Address", "Joining Date", "Contact No", "Designation", "Salary", "Photo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setRowHeight(40);
        jScrollPane2.setViewportView(table1);

        btnedit.setText("Edit Employee");
        btnedit.setBackground(new java.awt.Color(250, 72, 37));
        btnedit.setContentAreaFilled(false);
        btnedit.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnedit.setForeground(new java.awt.Color(255, 255, 255));
        btnedit.setOpaque(true);
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btndelete.setText("Delete Employee");
        btndelete.setBackground(new java.awt.Color(250, 72, 37));
        btndelete.setContentAreaFilled(false);
        btndelete.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setOpaque(true);
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnprint.setText("Print");
        btnprint.setBackground(new java.awt.Color(250, 72, 37));
        btnprint.setContentAreaFilled(false);
        btnprint.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnprint.setForeground(new java.awt.Color(255, 255, 255));
        btnprint.setOpaque(true);
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(250, 72, 37));

        jLabel11.setText("Employee Form");
        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));

        btnclose.setText("X");
        btnclose.setBackground(new java.awt.Color(255, 255, 255));
        btnclose.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnclose.setContentAreaFilled(false);
        btnclose.setOpaque(true);
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bemp.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnedit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btndelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnprint)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(cmbfield, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
                        .addContainerGap())))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cmbfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btndelete)
                            .addComponent(btnedit)
                            .addComponent(btnprint))
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // Save              
        if(txtjdate.getText().equals(""))
        {
            Messages.showError("Join Date cannot be left empty..", "Input Error");
            txtjdate.requestFocus();
            return;
        }
        String id=txtid.getText();
        String name=txtname.getText();
        String address=txtaddress.getText();                
        String jdate=txtjdate.getDate().format(DateTimeFormatter.ISO_DATE);
        String contact=txtcontact.getText();        
        String salary=txtsalary.getText();        
        String desg=cmbdesg.getSelectedItem()+"";
        
        if(name.equals("")){
            Messages.showError("Employee Name cannot be left empty..", "Input Error");
            txtname.requestFocus();
            return;
        }
        if(address.equals("")){
            Messages.showError("Employee Address cannot be left empty..", "Input Error");
            txtaddress.requestFocus();
            return;
        }
        if(contact.equals("")){
            Messages.showError("Contact cannot be left empty..", "Input Error");
            txtcontact.requestFocus();
            return;
        }
        if(!Rules.isMobile(contact)){
            Messages.showError("Contact should be in number format..", "Input Error");
            txtcontact.requestFocus();
            return;
        }
        if(salary.equals("")){
            Messages.showError("Salary cannot be left empty..", "Input Error");
            txtsalary.requestFocus();
            return;
        }
        if(!Rules.isDouble(salary)){
            Messages.showError("Salary should be in number format..", "Input Error");
            txtsalary.requestFocus();
            return;
        }
        
        
        String btntext=btnsave.getText().toLowerCase();
        if(btntext.equals("save"))
        {
            if(file==null)
            {
                Messages.showError("Employee Image is Required..", "Input Error");
                return;
            }
            db.execute("Insert into Employee values(?,?,?,?,?,?,?,?)", id,name,address,jdate,contact,desg,salary,file);
            JOptionPane.showMessageDialog(this, "Employee is Saved Successfully");            
        }
        else
        {
            db.execute("Update Employee set EmpName=?,EmpAddress=?,JoinDate=?,MobileNo=?,Designation=?,Salary=?,EmpImage=? where EmpNo=?",name,address,jdate,contact,desg,salary,file,id);            
            JOptionPane.showMessageDialog(this, "Employee is Updated Successfully");
        }
        db.fillTable2(table1, "select * from Employee"); 
        db.updateID("EmpNo");
        btnreset.doClick();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // Reset
        txtid.setText(db.getID("EmpNo"));
        txtname.setText("");
        txtaddress.setText("");        
        txtjdate.setText("");
        txtcontact.setText("");        
        txtsalary.setText("");
        cmbdesg.setSelectedIndex(-1);
        lblphoto.setIcon(null);
        btnsave.setText("Save");
        txtname.requestFocus();
    }//GEN-LAST:event_btnresetActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // Edit
        int rowindex=table1.getSelectedRow();
        if(rowindex!=-1)
        {
        String id=table1.getValueAt(rowindex, 0)+"";
        edit(id);        
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Error:::Please select row which you have to edit...");
        }
    }//GEN-LAST:event_btneditActionPerformed
    void edit(String id)
    {
        try {
            
            
            ResultSet rs=db.getData("select * from Employee where EmpNo=?", id);
            if(rs.next())
            {
                String name=rs.getString(2);
                String address=rs.getString(3);                
                String jdate=rs.getString(4);
                String contact=rs.getString(5);                
                String desg=rs.getString(6);
                String sal=rs.getString(7);
                
                txtid.setText(id);
                txtname.setText(name);
                txtaddress.setText(address);
                txtjdate.setDate(LocalDate.parse(jdate));
                txtcontact.setText(contact);                
                cmbdesg.setSelectedItem(desg); 
                txtsalary.setText(sal);
                InputStream in=rs.getBinaryStream(8);                
                byte b[]=new byte[in.available()];
                in.read(b);
                file=File.createTempFile("bakery_emp", null);                
                FileOutputStream fos=new FileOutputStream(file);
                fos.write(b);
                fos.close();
                ImageUtiltiy.setLabelImage(file,lblphoto);                  
                btnsave.setText("Update");
                txtname.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EmployeeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // Delete
        int val=JOptionPane.showConfirmDialog(this, "Do you want delete selected record?","Confirm Delete",JOptionPane.YES_NO_OPTION);
        if(val==JOptionPane.YES_OPTION)
        {
        int rowindex=table1.getSelectedRow();
        String id=table1.getValueAt(rowindex, 0)+"";
        db.execute("delete from Employee where EmpNo=?", id);
        db.fillTable2(table1, "select * from Employee");          
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        // Print
        HashMap<String,Object> map=new HashMap<>();
        
        if(DBClass.pvalue.equals("")){
            DBClass.pvalue="EmpNo like '%%'";
        }
        String ptitle="";
        if(!txtsearch.getText().trim().equals(""))
        {
            ptitle=cmbfield.getSelectedItem()+" like "+txtsearch.getText();
        }
        map.put("param",DBClass.pvalue);
        map.put("paramtitle",ptitle);
        db.showReport("src/reports/EmployeeReport.jrxml",map);
    }//GEN-LAST:event_btnprintActionPerformed

    private void cmbdesgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbdesgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbdesgActionPerformed

    private void btnbrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbrowseActionPerformed
        // Browse Button
        JFileChooser jf=new JFileChooser();
        jf.setDialogTitle("Choose Employee Image");
        int ans=jf.showOpenDialog(this);
        //If click on open button it returns JFileChooser.APPROVE_OPTION and on cancel
        //returns JFileChooser.CANCEL_OPTION
        if(ans==JFileChooser.APPROVE_OPTION){
            file=jf.getSelectedFile(); //returns selected file object            
            ImageUtiltiy.setLabelImage(file,lblphoto);         
        }
    }//GEN-LAST:event_btnbrowseActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        dispose();
    }//GEN-LAST:event_btncloseActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbrowse;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox<String> cmbdesg;
    private javax.swing.JComboBox<String> cmbfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblphoto;
    private javax.swing.JTable table1;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtid;
    private com.github.lgooddatepicker.components.DatePicker txtjdate;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsalary;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
