/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.network.commonadm.ManageAccount;

import biz.EcoSystem;
import biz.account.Account;
import biz.enterprises.Enterprise;
import biz.org.Organization;
import biz.person.Person;
import biz.role.Role;
import javax.swing.JOptionPane;

/**
 *
 * @author royn
 */
public class AddOrEditAccounts extends javax.swing.JPanel {

    private Account account;
    private Enterprise enterprise;

    /**
     * Creates new form AddOrEditAccounts
     */
    public AddOrEditAccounts(Enterprise enterprise) {
        this(enterprise, null);
    }

    public AddOrEditAccounts(Enterprise enterprise, Account a) {
        initComponents();

        this.account = a;
        this.enterprise = enterprise;

        cbOrganization.removeAllItems();
        enterprise.getOrganizationArrayList().forEach((organization1) -> {
            cbOrganization.addItem(organization1);
        });

        cbRole.removeAllItems();
        cbPerson.removeAllItems();

        if (account != null) {
            txtUsername.setText(account.getUsername());
            txtPassword1.setText("");
            txtPassword2.setText("");
            btnAdd.setText("Save");
            cbOrganization.setSelectedItem(account.getOrg());
            cbPerson.setSelectedItem(account.getPerson());
            cbRole.setSelectedItem(account.getRole());
            cbOrganization.setEnabled(false);
            cbPerson.setEnabled(false);
            cbRole.setEnabled(false);
        }
                
        populate((Organization) cbOrganization.getItemAt(0));
    }

    public void checkAvail(String username) {
        if (username.equals("")) {
            JOptionPane.showMessageDialog(this, "Please input username!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (EcoSystem.getInstance().isUsernameExist(username)) {
            JOptionPane.showMessageDialog(this, "Username Exists! Please use another one.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Congratulations, You Can Use This Username.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JPasswordField();
        txtPassword2 = new javax.swing.JPasswordField();
        btnAdd = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbOrganization = new javax.swing.JComboBox();
        cbRole = new javax.swing.JComboBox();
        cbPerson = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        jLabel5.setText("Password");

        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        jLabel6.setText("Password");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel2.setText("Username");

        jLabel3.setText("Organization");

        jLabel4.setText("Role");

        jLabel7.setText("Person");

        cbOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrganizationActionPerformed(evt);
            }
        });

        cbRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRoleActionPerformed(evt);
            }
        });

        cbPerson.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(406, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(cbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(382, 382, 382))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnAdd)
                                        .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addComponent(btnCheck)
                        .addGap(282, 282, 282))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCheck)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(btnAdd)
                .addContainerGap(232, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        checkAvail(txtUsername.getText());
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String userName = txtUsername.getText();
        checkAvail(userName);
        String password = new String(txtPassword2.getPassword());
        String password1 = new String(txtPassword1.getPassword());
        Organization organization = (Organization) cbOrganization.getSelectedItem();
        Role role = (Role) cbRole.getSelectedItem();
        Person p = (Person) cbPerson.getSelectedItem();

        if (userName.isEmpty() || password.isEmpty() || password1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invaild! Please Input All Fields",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!password1.equals(password)) {
            JOptionPane.showMessageDialog(this, "Invaild! Confirm your password!",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (account != null) {
            account.setUsername(userName);
            account.setPassword(password);
        } else {
            try {
                organization.getAccountCatalog().newAccount(userName, password, role, p);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Create Failed please contact father of system");
            }
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void cbRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRoleActionPerformed

    private void cbOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrganizationActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) cbOrganization.getSelectedItem();
        if (organization == null) {
            return;
        }

        populate(organization);
    }//GEN-LAST:event_cbOrganizationActionPerformed

    private void populate(Organization organization) {
        cbRole.removeAllItems();
        cbPerson.removeAllItems();
        
        organization.getSupportedRoles().forEach((role) -> {
            cbRole.addItem(role);
        });
        organization.getPersonCatalog().getPersonList().forEach((person) -> {
            cbPerson.addItem(person);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCheck;
    private javax.swing.JComboBox cbOrganization;
    private javax.swing.JComboBox cbPerson;
    private javax.swing.JComboBox cbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JPasswordField txtPassword2;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}