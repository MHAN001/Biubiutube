/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.network.university.college.departmentSupervisor;

import biz.account.Account;
import biz.org.Organization;
import biz.role.supervisorRole.UniversityDepartmentSupervisorRole;
import biz.video.Video;
import biz.video.VideoCatalog;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import javax.imageio.ImageIO;
import ui.components.HasTitle;
import ui.components.TablePopulatable;

import javax.swing.*;
import ui.components.ParentUI;

/**
 *
 * @author royn
 */
public class CensorVideos extends javax.swing.JPanel implements TablePopulatable<Video>, HasTitle {
    private ParentUI parent;
    private Account account;
        
    /**
     * Creates new form NewJPanel
     */
    public CensorVideos(ParentUI parent, Account account) {
        this.parent = parent;
        this.account = account;
        initComponents();
        populateTable();
        txtDescription.setEnabled(false);
        txtDescription.setLineWrap(true);
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
        tbl = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jpPic = new javax.swing.JPanel();
        btnApprove = new javax.swing.JButton();
        btnDeny = new javax.swing.JButton();

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Uploader", "Prime Only", "Ad Type", "Created At"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        btnView.setText("Watch Selected >>");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("Selected Description");

        jLabel2.setText("Selected Picture");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane2.setViewportView(txtDescription);

        jpPic.setBackground(new java.awt.Color(255, 255, 255));
        jpPic.setLayout(new javax.swing.BoxLayout(jpPic, javax.swing.BoxLayout.LINE_AXIS));

        btnApprove.setText("Approve Selected");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnDeny.setText("Deny Selected");
        btnDeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jpPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(btnApprove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeny, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpPic, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnApprove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeny)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnView))
                    .addComponent(jSeparator1)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        Video selected = getSelected();
        if (selected == null) {
            return;
        }
        parent.pushComponent(new WatchVideo(parent, selected, account));
    }//GEN-LAST:event_btnViewActionPerformed

    private void tblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseReleased
        Video selected = getSelected();
        if (selected == null) {
            return;
        }
        
        try {
            URL url = new URL(selected.getPicPath());
            BufferedImage image = ImageIO.read(url);
            jpPic.removeAll();
            jpPic.add(new JLabel(new ImageIcon(image)));
        } catch (Exception ex) {
            Logger.getLogger(CensorVideos.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtDescription.setText(selected.getDescription());
        validate();
    }//GEN-LAST:event_tblMouseReleased

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        Video selected = getSelected();
        if (selected == null) {
            return;
        }
        
        if (account.getRole() instanceof UniversityDepartmentSupervisorRole) {
            selected.setStatus(Video.VideoStatus.DSApproved);
        } else {
            selected.setStatus(Video.VideoStatus.ESApproved);
        }
        JOptionPane.showMessageDialog(this, "Video Approved!");
        populateTable();
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnDenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenyActionPerformed
        Video selected = getSelected();
        if (selected == null) {
            return;
        }
        selected.setStatus(Video.VideoStatus.Banned);
        JOptionPane.showMessageDialog(this, "Video Banned!");
        populateTable();
    }//GEN-LAST:event_btnDenyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnDeny;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpPic;
    private javax.swing.JTable tbl;
    private javax.swing.JTextArea txtDescription;
    // End of variables declaration//GEN-END:variables


    @Override
    public JTable getTable() {
        return tbl;
    }

    @Override
    public Object[] populateRow(Video video) {
        return new Object[] {
            video,
            video.getUploaderAccount(),
            video.isPrimeOnly(),
            video.getAdType(),
            video.getCreatedAt().getTime(),
        };
    }

    @Override
    public void populateTable() {
        jpPic.removeAll();
        txtDescription.setText("");
        Organization org = account.getOrg();
        VideoCatalog ctlg = org.getEnterprise().getNetwork().getVideoCatalog();
        Stream<Video> s = ctlg.getVideoArrayList().stream();
        if (account.getRole() instanceof UniversityDepartmentSupervisorRole) {
            s = s.filter(v -> v.getUploaderAccount().getOrg().equals(org) && v.getStatus().equals(Video.VideoStatus.Uploaded));
        } else {
            s = s.filter(v -> v.getStatus().equals(Video.VideoStatus.DSApproved));
        }
        populateTable(s);
    }

    @Override
    public String getTitle() {
        if (account.getRole() instanceof UniversityDepartmentSupervisorRole) {
            return String.format("Uploaded Videos in %s", account.getOrg());
        } else {
            return String.format("Uploaded Videos in %s", account.getOrg().getEnterprise());
        }
    }
}
