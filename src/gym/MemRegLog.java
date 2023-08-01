/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

import static java.awt.SystemColor.info;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author MN
 */
public class MemRegLog extends javax.swing.JFrame {

    /**
     * Creates new form MemRegLog
     */
    Info info;
    public MemRegLog(Info info) {
        initComponents();
        this.info=info;
        
    }
    
int flag=0;
DBConnect dbc;

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pack = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        MemReg = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pane = new javax.swing.JEditorPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(350, 100, 700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pack.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pack.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Happy Member", "Super Saver", "Elite Member", "Holiday Member", "Female Member", " " }));
        pack.setSelectedIndex(5);
        pack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packActionPerformed(evt);
            }
        });
        getContentPane().add(pack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 42));

        jLabel1.setFont(new java.awt.Font("Niagara Engraved", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Member Registration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 363, 60));

        MemReg.setFont(new java.awt.Font("Niagara Engraved", 1, 24)); // NOI18N
        MemReg.setText("Register");
        MemReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemRegActionPerformed(evt);
            }
        });
        getContentPane().add(MemReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 137, 46));

        pane.setEditable(false);
        pane.setText("           \n\n\n          ***ADVANCE PAYMENT DISCOUNTS***\n\nOFFER 01: PAY FOR 3 MONTHS and GET 10% DISCOUNT \nOFFER 02: PAY FOR 6 MONTHS and GET 20% DISCOUNT \nOFFER 03: PAY FOR 12 MONTHS and GET 30% DISCOUNT");
        pane.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(pane);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 350, 250));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Package");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admission Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 140, 30));

        date.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 140, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/Pic/700X550(bg_pack).png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void packActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packActionPerformed
       
             
        
        if (pack.getSelectedIndex() == 0) {
            flag = 1;
            pane.setText("Gym hour: 7.00 am-5.00 pm " + "\n" + "Monthly Fee: 1200" + "\n" + "Admission Fee: 2000" + "\n" + "Locker, Treadmill, Cycle available\n\n" + "**ADVANCE PAYMENT DISCOUNTS** \n \n"
                    + "OFFER 01: PAY FOR 3 MONTHS and GET 10% DISCOUNT \n"
                    + "OFFER 02: PAY FOR 6 MONTHS and GET 20% DISCOUNT \n"
                    + "OFFER 03: PAY FOR 12 MONTHS and GET 30% DISCOUNT \n");
        } else if (pack.getSelectedIndex() == 1) {
            flag = 2;
             pane.setText("Gym hour: 7.00 am-11.00 pm " + "\n" + "Monthly Fee: 1500" + "\n" + "Admission Fee: 2000" + "\n" + "Locker, Treadmill, Cycle available\n\n" + "**ADVANCE PAYMENT DISCOUNTS** \n \n"
                    + "OFFER 01: PAY FOR 3 MONTHS and GET 10% DISCOUNT \n"
                    + "OFFER 02: PAY FOR 6 MONTHS and GET 20% DISCOUNT \n"
                    + "OFFER 03: PAY FOR 12 MONTHS and GET 30% DISCOUNT \n");
        } else if (pack.getSelectedIndex() == 2) {
            flag = 3;
            pane.setText("Gym hour: 7.00 am-11.00 pm " + "\n" + "Monthly Fee: 2000" + "\n" + "Admission Fee: 2000" + "\n" + "Locker, Treadmill, Cycle available,4 Steam bath every month, Shower facility\n\n" + "**ADVANCE PAYMENT DISCOUNTS** \n \n"
                    + "OFFER 01: PAY FOR 3 MONTHS and GET 10% DISCOUNT \n"
                    + "OFFER 02: PAY FOR 6 MONTHS and GET 20% DISCOUNT \n"
                    + "OFFER 03: PAY FOR 12 MONTHS and GET 30% DISCOUNT \n");
        } else if (pack.getSelectedIndex() == 3) {
            flag = 4;
            pane.setText("Gym hour: 7.00 am-5.00 pm (only can workout Friday and Saturday)" + "\n" + "Monthly Fee: 1200" + "\n" + "Admission Fee: 2000" + "\n" + "Locker, Treadmill, Cycle available\n\n" + "**ADVANCE PAYMENT DISCOUNTS** \n \n"
                    + "OFFER 01: PAY FOR 3 MONTHS and GET 10% DISCOUNT \n"
                    + "OFFER 02: PAY FOR 6 MONTHS and GET 20% DISCOUNT \n"
                    + "OFFER 03: PAY FOR 12 MONTHS and GET 30% DISCOUNT \n");
        } else if (pack.getSelectedIndex() == 4) {
            flag = 5;
             pane.setText("Gym hour: 7.00 am-10.00 pm\n" + "Monthly Fee: 1200\n" + "Admission Fee: 2000\n" + "Locker, Treadmill, Cycle available\n\n" + "**ADVANCE PAYMENT DISCOUNTS** \n \n"
                    + "OFFER 01: PAY FOR 3 MONTHS and GET 10% DISCOUNT \n"
                    + "OFFER 02: PAY FOR 6 MONTHS and GET 20% DISCOUNT \n"
                    + "OFFER 03: PAY FOR 12 MONTHS and GET 30% DISCOUNT \n");
        }
       
        else //if(pack.getSelectedIndex() == 5)
        {
            flag=0;
             pane.setText("\n\n\n\n\n                     ***ADVANCE PAYMENT DISCOUNTS*** \n \n"
                + "OFFER 01: PAY FOR 3 MONTHS and GET 10% DISCOUNT \n"
                + "OFFER 02: PAY FOR 6 MONTHS and GET 20% DISCOUNT \n"
                + "OFFER 03: PAY FOR 12 MONTHS and GET 30% DISCOUNT \n");
        }
    }//GEN-LAST:event_packActionPerformed

    private void MemRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemRegActionPerformed
    
        
        String fname = info.getFname();
        int ag = info.getAg();
        String gen = info.getGen();
        String ht = info.getHt();
        String wt = info.getWt();
        String bl = info.getBl();
        String mob = info.getMob();
        String mail = info.getMail();
        String nd = info.getNd();
        String pa = info.getPa();
        String pic = info.getPic();

        String da=  (  (JTextField)date.getDateEditor().getUiComponent()).getText();

     
     String pac=null;
     String tr_name=null;
     int bill=0;
     int tr_id=0;
     
     if (flag == 1) {
            pac = "Happy Member";
            tr_name = "Mr. Manik Azad";
            bill = 3200;
            tr_id=1601;
        }  if (flag == 2) {
            pac = "Super Saver";
            tr_name = "Mr.Rabbi";
            bill = 3500;
            tr_id=1602;
        }  if (flag == 3) {
            pac = "Elite Member";
            tr_name = "Mr. Asadul Islam Milon";
            bill = 4000;
             tr_id=1603;
        }  if (flag == 4) {
            pac = "Holiday Member";
            tr_name = "Mr.Shahin ";
            bill = 1500;
             tr_id=1604;
        }  if (flag == 5) {
            pac = "Female Member";
            tr_name = "Ms. Nighat Sultana";
            bill = 1200;
             tr_id=1605;
        }

      
    if(flag==0  || da.equals("")){
        JOptionPane.showMessageDialog(null, "Opps!! Try Again", "Warning!! Empty Field", JOptionPane.ERROR_MESSAGE);
    }
    else{
      
        
        dbc = new DBConnect();
            try {
                
                dbc.connectToDB();

                dbc.insertDataToDB("INSERT INTO MEMBEREG(NAME,AGE,GENDER,HEIGHT,WE,BL,MOBILE,EMAIL,NID,PASS,PIC,TNAME,TID,BILL,PAC,AOD) VALUES('" + fname+ "', " + ag + ",'" + gen + "','" + ht + "','" + wt + "','" + bl + "','" + mob + "','" + mail + "','" + nd + "','" + pa + "','" + pic + "','" +tr_name  + "'," + tr_id + "," + bill + ",'" + pac + "','" + da+ "')");
              
                 String sql = "SELECT MID FROM MEMBEREG WHERE NID='" + nd+ "' ";
                 String d=null;
                 ResultSet rs;
                rs = dbc.queryToDB(sql);
                while (rs.next()) {
                     d=rs.getString(1);
                    
                }
                
                dbc.disconnectFromDB();

                JOptionPane.showMessageDialog(null, " Your ID is  "+d , "Registration Successful!!", JOptionPane.DEFAULT_OPTION);
                
                dispose();
                MemberLog mem = new MemberLog();
                mem.setVisible(true);
               
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } 
    }
    }//GEN-LAST:event_MemRegActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MemRegLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemRegLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemRegLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemRegLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Info info = null;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemRegLog(info).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MemReg;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> pack;
    private javax.swing.JEditorPane pane;
    // End of variables declaration//GEN-END:variables
}
