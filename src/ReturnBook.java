import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.sql.*;
import java.text.ParseException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class ReturnBook extends javax.swing.JFrame {
    
    String host = "jdbc:mysql://localhost:3306/db3";
    String username = "root";
    String password = "ayush88111";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    ResultSetMetaData rsmd = null;
    int q,i = 0;
    
    public ReturnBook() {
        initComponents();
        Show();
    }
    
    public void Show() {
  try {
    con = DriverManager.getConnection(host, username, password);
    pst = con.prepareStatement("select * from issue1");
    rs = pst.executeQuery();
    rsmd = rs.getMetaData();
    q = rsmd.getColumnCount();

    DefaultTableModel model = (DefaultTableModel) tab.getModel();
    model.setRowCount(0);

    while (rs.next()) {
      Vector V = new Vector();
      for (int i = 1; i <= q; i++) {
    
        String columnName = rsmd.getColumnName(i);
        switch (columnName) {
          case "BookID":
            V.add(rs.getInt("BookID"));
            break;
          case "StudentId":
            V.add(rs.getInt("StudentId"));
            break;
          case "IssueDate":  
            V.add(rs.getString("IssueDate"));  
            break;
          default:
            V.add(rs.getString("DueDate"));  
        }
      }
      model.addRow(V);
    }
  } catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
  }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        txtissue = new com.toedter.calendar.JDateChooser();
        txtdue = new com.toedter.calendar.JDateChooser();
        txtreturn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("                RETURN BOOK");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("Book ID:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("Student ID:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("Issue Date:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setText("Due Date:");

        txtreturn.setBackground(new java.awt.Color(0, 255, 0));
        txtreturn.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        txtreturn.setText("RETURN");
        txtreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreturnActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "BookID", "StudentId", "IssueDate", "DueDate"
            }
        ));
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 269, 269))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(txtreturn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtissue, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtdue, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtissue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtdue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(txtreturn))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(726, 726, 726))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreturnActionPerformed
     DefaultTableModel model = (DefaultTableModel) tab.getModel();
    int sr = tab.getSelectedRow();
    if (sr < 0) {
        JOptionPane.showMessageDialog(null, "Please select a book to return.");
        return;
    }

    try {
        con = DriverManager.getConnection(host, username, password);
        pst = con.prepareStatement("DELETE from issue1 where BookID=? and StudentId=?");
        pst.setInt(1, (int) model.getValueAt(sr, 0)); 
        pst.setInt(2, (int) model.getValueAt(sr, 1)); 
        pst.executeUpdate();
        model.removeRow(sr);
        JOptionPane.showMessageDialog(null, "Returned Successfully");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Connection Error: " + e.getMessage());
    }
    try {
        con = DriverManager.getConnection(host, username, password);
        pst = con.prepareStatement("UPDATE data set ReturnStatus='Returned'");   
        pst.executeUpdate();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Connection Error: " + e.getMessage());
    }

    }//GEN-LAST:event_txtreturnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Homepage h = new Homepage();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
   int sr = tab.getSelectedRow();
try {
    if (sr < 0) {
        JOptionPane.showMessageDialog(null, "No row selected.");
        return;
    }

    for (int i = 0; i < tab.getColumnCount(); i++) {
        Object value = tab.getValueAt(sr, i);
        System.out.println("Value at column " + i + ": " + (value != null ? value.toString() : "null"));
    }

    Object valueAt0 = tab.getValueAt(sr, 0);
    Object valueAt1 = tab.getValueAt(sr, 1);
    Object valueAt2 = tab.getValueAt(sr, 2);
    Object valueAt3 = tab.getValueAt(sr, 3);

    jTextField1.setText(valueAt0 != null ? valueAt0.toString() : "");
    jTextField2.setText(valueAt1 != null ? valueAt1.toString() : "");

    String issueDateString = valueAt2 != null ? valueAt2.toString() : null;  
    String dueDateString = valueAt3 != null ? valueAt3.toString() : null;   

    
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    java.util.Date issueDate = null;
    java.util.Date dueDate = null;
    try {
        if (issueDateString != null) {
            issueDate = sdf.parse(issueDateString);
        }
        if (dueDateString != null) {
            dueDate = sdf.parse(dueDateString);
        }
    } catch (ParseException e) {
        System.out.println("Error parsing date: " + e.getMessage());
    }

    if (issueDate != null) {
        txtissue.setDate(new java.sql.Date(issueDate.getTime()));
    }

    if (dueDate != null) {
        txtdue.setDate(new java.sql.Date(dueDate.getTime()));
    }

} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
}

    }//GEN-LAST:event_tabMouseClicked


    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tab;
    private com.toedter.calendar.JDateChooser txtdue;
    private com.toedter.calendar.JDateChooser txtissue;
    private javax.swing.JButton txtreturn;
    // End of variables declaration//GEN-END:variables
}
