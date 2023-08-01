/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.File;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author MN
 */
public class TrainerMain extends javax.swing.JFrame {

    /**
     * Creates new form TrainerMain
     */
    Fresher_Info fi;
    Mentor_Info mi;
    int flag;
    int count = 0;
    DBConnect dbc;
    String path = null;
    String id_equip = null;
    

    public TrainerMain(Fresher_Info fi, Mentor_Info mi, int flag) {
        initComponents();
        this.fi = fi;
        this.mi = mi;
        this.flag = flag;

        if (flag == 2) {
            tid.setText(Integer.toString(fi.getOwn_id()));
            f_name.setText(fi.getFname());
            age.setText(Integer.toString(fi.getAg()));
            gender.setText(fi.getGen());
            height.setText(fi.getHt());
            weight.setText(fi.getWt());
            bg.setText(fi.getBl());
            mobile.setText(fi.getMob());
            email.setText(fi.getMail());
            nid.setText(fi.getNd());
            String img = fi.getPic();
            ImageIcon newimage = new ImageIcon(img);
            pic.setIcon(newimage);
            pack.setText(fi.getPack());
            time.setText(fi.getTime());
            m_name.setText("Working Under " + fi.getMt_name());
            m_time.setText("Shift :" + fi.getMtime());
            date.setText(fi.getJdate());
            salary.setText(Integer.toString(fi.getSalary()));

            tr_pic_choser.setVisible(false);
            pic_path.setVisible(false);
            tr_apply.setVisible(false);
            ad_clr.setVisible(false);

            path = img;
            TP.setEnabledAt(1, true);
            TP.setEnabledAt(2, false);
            TP.setEnabledAt(3, true);

            apply_equip.setVisible(false);
            Cancel_equip.setVisible(false);
            p.setForeground(Color.WHITE);
            prb.setEditable(false);

        }
        if (flag == 1) {

            tid.setText(Integer.toString(mi.getOwn_id()));
            f_name.setText(mi.getFname());
            age.setText(Integer.toString(mi.getAg()));
            gender.setText(mi.getGen());
            height.setText(mi.getHt());
            weight.setText(mi.getWt());
            bg.setText(mi.getBl());
            mobile.setText(mi.getMob());
            email.setText(mi.getMail());
            nid.setText(mi.getNd());
            String img = mi.getPic();
            ImageIcon newimage2 = new ImageIcon(img);
            pic.setIcon(newimage2);
            pack.setText(mi.getPack());
            time.setText(mi.getTime());
            date.setText(mi.getDate());
            salary.setText(Integer.toString(mi.getSalary()));

            tr_pic_choser.setVisible(false);
            pic_path.setVisible(false);
            tr_apply.setVisible(false);
            ad_clr.setVisible(false);

            path = img;
            TP.setEnabledAt(1, false);
            TP.setEnabledAt(2, true);
            TP.setEnabledAt(3, false);

            apply_equip.setVisible(false);
            Cancel_equip.setVisible(false);
            p.setForeground(Color.WHITE);
            prb.setEditable(false);

        }
    }

    public boolean checkmobile(String str) {
        int upper = 0, lower = 0, number = 0, special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else if (ch >= 'a' && ch <= 'z') {
                lower++;
            } else if (ch >= '0' && ch <= '9') {
                number++;
            } else {
                special++;
            }
        }
        if (special == 0 && upper == 0 && number == 11 && lower == 0) {
            return true;
        } else {
            return false;

        }
    }

    public boolean checkemail(String str) {
        int upper = 0, lower = 0, number = 0, special1 = 0, special2 = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            }
            if (ch >= 'a' && ch <= 'z') {
                lower++;
            }
            if (ch >= '0' && ch <= '9') {
                number++;
            }
            if (ch == '@') {
                special1++;
            }
            if (ch == '.') {
                special2++;
            }
        }
        if (special1 == 1 && special2 == 1 && upper == 0 && number >= 1 && lower >= 1) {
            return true;
        } else {
            return false;

        }
    }

    ResultSet resultset;
    ResultSet resultset2;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TP = new javax.swing.JTabbedPane();
        profile = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ag = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        f_name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        height = new javax.swing.JTextField();
        bg = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        pack = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        w = new javax.swing.JLabel();
        m = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tid = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        nid = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        show_paaa = new javax.swing.JLabel();
        m_name = new javax.swing.JLabel();
        m_time = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        pic_path = new javax.swing.JTextField();
        tr_pic_choser = new javax.swing.JButton();
        tr_apply = new javax.swing.JButton();
        tr_up = new javax.swing.JButton();
        ad_clr = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        salary = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        assign = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Assign_Table = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        assign_member_fr_btn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        allot_member = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        member_id = new javax.swing.JTextField();
        tram_clr_btn = new javax.swing.JButton();
        member_show_btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        member_name = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Fresher_Table = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        fr_id = new javax.swing.JTextField();
        fr_name = new javax.swing.JTextField();
        fresher_shw_btn = new javax.swing.JButton();
        mentor_allot = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        routine = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wopt = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        work = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        set = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        rep = new javax.swing.JTextField();
        legs = new javax.swing.JComboBox<>();
        chest = new javax.swing.JComboBox<>();
        shoulder = new javax.swing.JComboBox<>();
        triceps = new javax.swing.JComboBox<>();
        biceps = new javax.swing.JComboBox<>();
        back = new javax.swing.JComboBox<>();
        cardio = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tdate = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        tw_clr = new javax.swing.JButton();
        tw_add = new javax.swing.JButton();
        Pin = new javax.swing.JLabel();
        search_memid = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        con = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        weekly = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        week_day = new javax.swing.JTextField();
        tr_search_wday = new javax.swing.JButton();
        mem_id = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        combiend_search = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        equipment = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        equip_table = new javax.swing.JTable();
        show_equip = new javax.swing.JButton();
        p = new javax.swing.JLabel();
        prb = new javax.swing.JTextField();
        apply_equip = new javax.swing.JButton();
        update_equip = new javax.swing.JButton();
        Cancel_equip = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1200, 700));
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TP.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N

        profile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Name");
        jLabel2.setToolTipText("");
        profile.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        ag.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        ag.setForeground(new java.awt.Color(255, 255, 255));
        ag.setText("Age");
        profile.add(ag, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Height(cm)");
        profile.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Blood Group");
        profile.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        e.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        e.setForeground(new java.awt.Color(255, 255, 255));
        e.setText("Email");
        profile.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Package");
        profile.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, 30));

        f_name.setEditable(false);
        f_name.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        profile.add(f_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 200, 30));

        age.setEditable(false);
        age.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        profile.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 200, -1));

        height.setEditable(false);
        height.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        height.setToolTipText("");
        profile.add(height, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 200, 29));

        bg.setEditable(false);
        bg.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        bg.setToolTipText("");
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bgMouseExited(evt);
            }
        });
        profile.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 200, 30));

        email.setEditable(false);
        email.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                emailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                emailMouseExited(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        profile.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 210, 28));

        pack.setEditable(false);
        pack.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        pack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                packMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                packMouseExited(evt);
            }
        });
        profile.add(pack, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 200, 30));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Trainer Id");
        profile.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 107, 31));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Gender (M/F)");
        jLabel5.setToolTipText("");
        profile.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        w.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        w.setForeground(new java.awt.Color(255, 255, 255));
        w.setText("Weight(kg)");
        w.setToolTipText("");
        profile.add(w, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        m.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        m.setForeground(new java.awt.Color(255, 255, 255));
        m.setText("Mobile");
        m.setToolTipText("");
        profile.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 55, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("NID");
        profile.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));

        tid.setEditable(false);
        tid.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        profile.add(tid, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 200, 31));

        gender.setEditable(false);
        gender.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        profile.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 200, -1));

        weight.setEditable(false);
        weight.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        profile.add(weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 200, 29));

        mobile.setEditable(false);
        mobile.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        mobile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mobileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mobileMouseExited(evt);
            }
        });
        profile.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 200, 30));

        nid.setEditable(false);
        nid.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        nid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nidMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nidMouseExited(evt);
            }
        });
        profile.add(nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 200, 28));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Shift");
        profile.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        profile.add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 250, 240));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Niagara Engraved", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 204));
        jButton2.setText("Log Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        profile.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 449, 80, 30));

        jLabel1.setFont(new java.awt.Font("Niagara Engraved", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Personal Info");
        profile.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 270, 50));

        show_paaa.setBackground(new java.awt.Color(0, 0, 0));
        show_paaa.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        show_paaa.setForeground(new java.awt.Color(255, 0, 0));
        profile.add(show_paaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 230, 60));

        m_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        m_name.setForeground(new java.awt.Color(255, 0, 0));
        m_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.add(m_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 350, 30));

        m_time.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        m_time.setForeground(new java.awt.Color(255, 0, 0));
        m_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.add(m_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 370, 30));

        time.setEditable(false);
        time.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });
        profile.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 200, 30));

        pic_path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pic_pathActionPerformed(evt);
            }
        });
        profile.add(pic_path, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 250, 30));

        tr_pic_choser.setFont(new java.awt.Font("Niagara Engraved", 1, 18)); // NOI18N
        tr_pic_choser.setText("Attach");
        tr_pic_choser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_pic_choserActionPerformed(evt);
            }
        });
        profile.add(tr_pic_choser, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 320, 90, 30));

        tr_apply.setBackground(new java.awt.Color(153, 255, 153));
        tr_apply.setFont(new java.awt.Font("Niagara Engraved", 1, 18)); // NOI18N
        tr_apply.setText("Apply");
        tr_apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_applyActionPerformed(evt);
            }
        });
        profile.add(tr_apply, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, -1, 30));

        tr_up.setBackground(new java.awt.Color(255, 204, 153));
        tr_up.setFont(new java.awt.Font("Niagara Engraved", 1, 18)); // NOI18N
        tr_up.setText("Update");
        tr_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_upActionPerformed(evt);
            }
        });
        profile.add(tr_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, 110, 30));

        ad_clr.setBackground(new java.awt.Color(255, 0, 0));
        ad_clr.setFont(new java.awt.Font("Niagara Engraved", 1, 14)); // NOI18N
        ad_clr.setText("Clear");
        ad_clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad_clrActionPerformed(evt);
            }
        });
        profile.add(ad_clr, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, 80, 30));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Joinning Date");
        profile.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 110, 30));

        date.setEditable(false);
        date.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        profile.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 200, 30));

        salary.setEditable(false);
        salary.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        profile.add(salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 200, 30));

        jLabel30.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Salary");
        profile.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 80, 30));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/Pic/table.png"))); // NOI18N
        profile.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 500));

        TP.addTab("Profile", profile);

        assign.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Assign_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member_ID", "Member_Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Assign_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Assign_TableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(Assign_Table);
        if (Assign_Table.getColumnModel().getColumnCount() > 0) {
            Assign_Table.getColumnModel().getColumn(0).setResizable(false);
            Assign_Table.getColumnModel().getColumn(1).setResizable(false);
        }

        assign.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 600, 280));

        jLabel29.setFont(new java.awt.Font("Niagara Engraved", 1, 48)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Assigned Member");
        assign.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 240, 50));

        assign_member_fr_btn.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        assign_member_fr_btn.setText("Show");
        assign_member_fr_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assign_member_fr_btnActionPerformed(evt);
            }
        });
        assign.add(assign_member_fr_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 130, 50));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Niagara Engraved", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 204));
        jButton5.setText("Log Out");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        assign.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 440, 100, 40));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/Pic/table.png"))); // NOI18N
        jLabel42.setText("jLabel42");
        jLabel42.setMaximumSize(new java.awt.Dimension(1100, 700));
        jLabel42.setPreferredSize(new java.awt.Dimension(1100, 700));
        assign.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        TP.addTab("Assigned Member", assign);

        allot_member.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", " Member Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(1).setResizable(false);
        }

        allot_member.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 400, 240));

        jLabel27.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("ID");
        allot_member.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, -1, -1));

        member_id.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        allot_member.add(member_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, 200, 40));

        tram_clr_btn.setBackground(new java.awt.Color(0, 0, 0));
        tram_clr_btn.setFont(new java.awt.Font("Niagara Engraved", 1, 18)); // NOI18N
        tram_clr_btn.setForeground(new java.awt.Color(255, 0, 51));
        tram_clr_btn.setText("Clear");
        tram_clr_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tram_clr_btnActionPerformed(evt);
            }
        });
        allot_member.add(tram_clr_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 100, 40));

        member_show_btn.setBackground(new java.awt.Color(0, 0, 0));
        member_show_btn.setFont(new java.awt.Font("Niagara Engraved", 1, 18)); // NOI18N
        member_show_btn.setForeground(new java.awt.Color(255, 153, 255));
        member_show_btn.setText("Show");
        member_show_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                member_show_btnMouseClicked(evt);
            }
        });
        member_show_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_show_btnActionPerformed(evt);
            }
        });
        allot_member.add(member_show_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, 120, 40));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Niagara Engraved", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 204));
        jButton3.setText("Log Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        allot_member.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 100, 40));

        jLabel31.setFont(new java.awt.Font("Niagara Engraved", 1, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText(" Member List");
        allot_member.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 170, 70));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Name");
        allot_member.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 50, -1));

        member_name.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        member_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_nameActionPerformed(evt);
            }
        });
        allot_member.add(member_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 200, 40));

        Fresher_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fresher ID", "Fresher Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Fresher_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Fresher_TableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Fresher_Table);
        if (Fresher_Table.getColumnModel().getColumnCount() > 0) {
            Fresher_Table.getColumnModel().getColumn(0).setResizable(false);
            Fresher_Table.getColumnModel().getColumn(1).setResizable(false);
        }

        allot_member.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 410, 240));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fresher ID");
        allot_member.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 120, 30));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Fresher Name");
        allot_member.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 140, 30));

        fr_id.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        allot_member.add(fr_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 170, 40));

        fr_name.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        fr_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fr_nameActionPerformed(evt);
            }
        });
        allot_member.add(fr_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 170, 40));

        fresher_shw_btn.setBackground(new java.awt.Color(0, 0, 0));
        fresher_shw_btn.setFont(new java.awt.Font("Niagara Engraved", 1, 18)); // NOI18N
        fresher_shw_btn.setForeground(new java.awt.Color(255, 102, 255));
        fresher_shw_btn.setText("Show");
        fresher_shw_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fresher_shw_btnActionPerformed(evt);
            }
        });
        allot_member.add(fresher_shw_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 120, 40));

        mentor_allot.setBackground(new java.awt.Color(0, 0, 0));
        mentor_allot.setFont(new java.awt.Font("Niagara Engraved", 1, 24)); // NOI18N
        mentor_allot.setForeground(new java.awt.Color(0, 153, 0));
        mentor_allot.setText("Allot");
        mentor_allot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mentor_allotActionPerformed(evt);
            }
        });
        allot_member.add(mentor_allot, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 100, 40));

        jLabel38.setFont(new java.awt.Font("Niagara Engraved", 1, 36)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Fresher List");
        allot_member.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 200, 50));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/Pic/table.png"))); // NOI18N
        allot_member.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 500));

        TP.addTab("Alloted Member", allot_member);

        routine.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wopt.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        wopt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "WorkOut Name", "Set", "Reps", "Date", "Week ", "Continue (Days)", "Member ID", "Trainer ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        wopt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                woptMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(wopt);
        if (wopt.getColumnModel().getColumnCount() > 0) {
            wopt.getColumnModel().getColumn(0).setResizable(false);
            wopt.getColumnModel().getColumn(0).setPreferredWidth(110);
            wopt.getColumnModel().getColumn(1).setResizable(false);
            wopt.getColumnModel().getColumn(2).setResizable(false);
            wopt.getColumnModel().getColumn(3).setResizable(false);
            wopt.getColumnModel().getColumn(4).setResizable(false);
            wopt.getColumnModel().getColumn(5).setResizable(false);
            wopt.getColumnModel().getColumn(6).setResizable(false);
            wopt.getColumnModel().getColumn(7).setResizable(false);
        }

        routine.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 1060, 140));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("WorkOut Name");
        routine.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        work.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        work.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        routine.add(work, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 200, 30));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Sets");
        routine.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, -1, -1));

        set.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        set.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        routine.add(set, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, 200, 30));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Reps");
        routine.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, -1, -1));

        rep.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        rep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        routine.add(rep, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, 200, 30));

        legs.setBackground(new java.awt.Color(255, 51, 255));
        legs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Free Squat", "Barbell Squat", "Leg Press", "Hack Squat", "Leg Extension", "Leg Curl", "Leg Seated  Pull Up", "Leg Stand Pull Up", " " }));
        legs.setSelectedIndex(8);
        legs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legsActionPerformed(evt);
            }
        });
        routine.add(legs, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, -1));

        chest.setBackground(new java.awt.Color(255, 51, 255));
        chest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Push Up", "Chin Up", "Flat Bench Press", "Inclined Bench Press", "Declined Bench Press", "Flat Dumbell Fly", "Inclined Dumbell Fly", "Flat Dumbell Press", "Inclined Dumbell Press", "Pec Deck Fly", "Cable Fly ", " " }));
        chest.setSelectedIndex(11);
        chest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chestActionPerformed(evt);
            }
        });
        routine.add(chest, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 150, -1));

        shoulder.setBackground(new java.awt.Color(255, 51, 255));
        shoulder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dumbell Shoulder Press", "Barbell Overhead Press", "Standing Dumbell Fly", "Trap Rise", "Military Barbell Press", "Dips", "Upright rows", " ", " " }));
        shoulder.setSelectedIndex(8);
        shoulder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoulderActionPerformed(evt);
            }
        });
        routine.add(shoulder, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 150, -1));

        triceps.setBackground(new java.awt.Color(255, 51, 255));
        triceps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Close Grip Bench Press", "Close Grip Floor Press", "Dips", "Machine Dips", "Kickback", "Skull-Crusher", "One hand Extension", "Cable Row", " " }));
        triceps.setSelectedIndex(8);
        triceps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tricepsActionPerformed(evt);
            }
        });
        routine.add(triceps, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, -1));

        biceps.setBackground(new java.awt.Color(255, 51, 255));
        biceps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dumbell Curl", "Barbell Curl", "Hammer Curl", "Ez Bar Curl", "Concentration Curl", "Over Head Cable Curl", " ", " " }));
        biceps.setSelectedIndex(6);
        biceps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bicepsActionPerformed(evt);
            }
        });
        routine.add(biceps, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 150, -1));

        back.setBackground(new java.awt.Color(255, 51, 255));
        back.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Front Machine lat ", "Back Machine Lat", "DeadLift", "Pull Up", "Bent Over Row", "One Arm Dumbell row", "Standing T Bar Row", " " }));
        back.setSelectedIndex(7);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        routine.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 150, -1));

        cardio.setBackground(new java.awt.Color(255, 0, 255));
        cardio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TreadMill", "Cycle", "Crossfit", "Push Up", "Chin Up", "Skipping", "Twist", "Rope", "Free Squat", "Box", " ", " " }));
        cardio.setSelectedIndex(10);
        cardio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardioActionPerformed(evt);
            }
        });
        routine.add(cardio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 120, -1));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Cardio");
        routine.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 100, -1));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Back");
        routine.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Shoulder");
        routine.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Biceps");
        routine.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Chest");
        routine.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Triceps");
        routine.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Legs");
        routine.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        tdate.setDateFormatString("yyyy-MM-dd");
        tdate.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        routine.add(tdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, 200, 30));

        jLabel26.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Date");
        routine.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, -1, 30));

        tw_clr.setBackground(new java.awt.Color(0, 0, 0));
        tw_clr.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        tw_clr.setForeground(new java.awt.Color(255, 0, 51));
        tw_clr.setText("Clear");
        tw_clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tw_clrActionPerformed(evt);
            }
        });
        routine.add(tw_clr, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 100, 30));

        tw_add.setBackground(new java.awt.Color(0, 0, 0));
        tw_add.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        tw_add.setForeground(new java.awt.Color(51, 255, 51));
        tw_add.setText("Add");
        tw_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tw_addActionPerformed(evt);
            }
        });
        routine.add(tw_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 100, 30));

        Pin.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Pin.setForeground(new java.awt.Color(255, 255, 255));
        Pin.setText("Member ID");
        routine.add(Pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, 30));

        search_memid.setBackground(new java.awt.Color(0, 0, 0));
        search_memid.setFont(new java.awt.Font("Niagara Engraved", 1, 14)); // NOI18N
        search_memid.setForeground(new java.awt.Color(255, 204, 204));
        search_memid.setText("Search");
        search_memid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_memidActionPerformed(evt);
            }
        });
        routine.add(search_memid, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 80, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Niagara Engraved", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 204));
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        routine.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 460, 80, 30));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 204, 204));
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        routine.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 100, 30));

        jLabel33.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Continue");
        routine.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, -1, 30));

        con.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        con.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        routine.add(con, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 200, 30));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Day");
        routine.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        weekly.setBackground(new java.awt.Color(255, 51, 255));
        weekly.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", " " }));
        weekly.setSelectedIndex(7);
        weekly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weeklyActionPerformed(evt);
            }
        });
        routine.add(weekly, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 120, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Week Day");
        routine.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, 30));

        week_day.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        routine.add(week_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 110, 30));

        tr_search_wday.setBackground(new java.awt.Color(0, 0, 0));
        tr_search_wday.setFont(new java.awt.Font("Niagara Engraved", 1, 14)); // NOI18N
        tr_search_wday.setForeground(new java.awt.Color(51, 255, 51));
        tr_search_wday.setText("Search");
        tr_search_wday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_search_wdayActionPerformed(evt);
            }
        });
        routine.add(tr_search_wday, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 80, 30));

        mem_id.setEditable(false);
        routine.add(mem_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 110, 30));

        jLabel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        routine.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 240, 90));

        jLabel34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        routine.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 230, 90));

        jLabel35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.red, null, null));
        routine.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1050, 170));

        combiend_search.setFont(new java.awt.Font("Niagara Engraved", 1, 24)); // NOI18N
        combiend_search.setText("Combined Search");
        combiend_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combiend_searchActionPerformed(evt);
            }
        });
        routine.add(combiend_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, 150, 30));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/Pic/1200X700(backsteel).png"))); // NOI18N
        routine.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 1100, 500));

        TP.addTab("Member Routine", routine);

        equipment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Niagara Engraved", 1, 48)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Equipment Info");
        equipment.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 430, 50));

        equip_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipment ID", "Equipment Name", "Problem"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        equip_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equip_tableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(equip_table);

        equipment.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 600, 230));

        show_equip.setBackground(new java.awt.Color(0, 0, 0));
        show_equip.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        show_equip.setForeground(new java.awt.Color(0, 51, 255));
        show_equip.setText("Show");
        show_equip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_equipActionPerformed(evt);
            }
        });
        equipment.add(show_equip, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 120, 40));

        p.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        p.setForeground(new java.awt.Color(255, 255, 255));
        p.setText("Problem");
        equipment.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 110, 30));

        prb.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        equipment.add(prb, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 310, 50));

        apply_equip.setBackground(new java.awt.Color(0, 153, 0));
        apply_equip.setFont(new java.awt.Font("Niagara Engraved", 1, 18)); // NOI18N
        apply_equip.setText("Apply");
        apply_equip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apply_equipActionPerformed(evt);
            }
        });
        equipment.add(apply_equip, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 150, 100, 40));

        update_equip.setBackground(new java.awt.Color(255, 153, 51));
        update_equip.setFont(new java.awt.Font("Niagara Engraved", 1, 18)); // NOI18N
        update_equip.setText("Update");
        update_equip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_equipActionPerformed(evt);
            }
        });
        equipment.add(update_equip, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 210, 100, 40));

        Cancel_equip.setBackground(new java.awt.Color(255, 0, 0));
        Cancel_equip.setFont(new java.awt.Font("Niagara Solid", 1, 18)); // NOI18N
        Cancel_equip.setText("Cancel");
        Cancel_equip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_equipActionPerformed(evt);
            }
        });
        equipment.add(Cancel_equip, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 270, 100, 40));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Niagara Engraved", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 204));
        jButton6.setText("Log Out");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        equipment.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 450, 80, 30));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/Pic/table.png"))); // NOI18N
        equipment.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1095, 500));

        TP.addTab("Equipment", equipment);

        getContentPane().add(TP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 1100, 530));
        TP.getAccessibleContext().setAccessibleName("Profile");

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/Pic/1200X700(backsteel).png"))); // NOI18N
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseEntered

    }//GEN-LAST:event_bgMouseEntered

    private void bgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseExited

    }//GEN-LAST:event_bgMouseExited

    private void emailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseEntered

    }//GEN-LAST:event_emailMouseEntered

    private void emailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseExited

    }//GEN-LAST:event_emailMouseExited

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed

    }//GEN-LAST:event_emailActionPerformed

    private void packMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packMouseEntered

    }//GEN-LAST:event_packMouseEntered

    private void packMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packMouseExited

    }//GEN-LAST:event_packMouseExited

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void mobileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileMouseEntered

    }//GEN-LAST:event_mobileMouseEntered

    private void mobileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileMouseExited

    }//GEN-LAST:event_mobileMouseExited

    private void nidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nidMouseEntered

    }//GEN-LAST:event_nidMouseEntered

    private void nidMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nidMouseExited

    }//GEN-LAST:event_nidMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TrainerLog trlg = new TrainerLog();
        trlg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void legsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legsActionPerformed
        if (legs.getSelectedIndex() == 0) {
            work.setText("Free Squat");
        } else if (legs.getSelectedIndex() == 1) {
            work.setText("Barbell Squat");
        } else if (legs.getSelectedIndex() == 2) {
            work.setText("Leg Press");
        } else if (legs.getSelectedIndex() == 3) {
            work.setText("Hack Squat");
        } else if (legs.getSelectedIndex() == 4) {
            work.setText("Leg Extension");
        } else if (legs.getSelectedIndex() == 5) {
            work.setText("Leg Curl");
        } else if (legs.getSelectedIndex() == 6) {
            work.setText("Leg Seated Pull Up");
        } else if (legs.getSelectedIndex() == 7) {
            work.setText("Leg Stand Pull Up");
        }
    }//GEN-LAST:event_legsActionPerformed

    private void chestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chestActionPerformed
        if (chest.getSelectedIndex() == 0) {
            work.setText("Push Up");
        } else if (chest.getSelectedIndex() == 1) {
            work.setText("Chin Up");
        } else if (chest.getSelectedIndex() == 2) {
            work.setText("Flat Bench Press");
        } else if (chest.getSelectedIndex() == 3) {
            work.setText("Inclined Bench Press");
        } else if (chest.getSelectedIndex() == 4) {
            work.setText("Declined Bench Press");
        } else if (chest.getSelectedIndex() == 5) {
            work.setText("Flat Dumbell Fly");
        } else if (chest.getSelectedIndex() == 6) {
            work.setText("Inclined Dumbell Fly");
        } else if (chest.getSelectedIndex() == 7) {
            work.setText("Flat Dumbell Press");
        } else if (chest.getSelectedIndex() == 8) {
            work.setText("Inclined Dumbell Press");
        } else if (chest.getSelectedIndex() == 9) {
            work.setText("Pec Deck Fly");
        } else if (chest.getSelectedIndex() == 10) {
            work.setText("Cable Fly");
        }
    }//GEN-LAST:event_chestActionPerformed

    private void shoulderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoulderActionPerformed
        if (shoulder.getSelectedIndex() == 0) {
            work.setText("Dumbell Shoulder Press");
        } else if (shoulder.getSelectedIndex() == 1) {
            work.setText("Barbell Overhead Press");
        } else if (shoulder.getSelectedIndex() == 2) {
            work.setText("Standing Dumbell Fly");
        } else if (shoulder.getSelectedIndex() == 3) {
            work.setText("Trap Rise");
        } else if (shoulder.getSelectedIndex() == 4) {
            work.setText("Military Barbell Press");
        } else if (shoulder.getSelectedIndex() == 5) {
            work.setText("Dips");
        } else if (shoulder.getSelectedIndex() == 6) {
            work.setText("Upright rows");
        }
    }//GEN-LAST:event_shoulderActionPerformed

    private void tricepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tricepsActionPerformed
        if (triceps.getSelectedIndex() == 0) {
            work.setText("Close Grip Bench Press");
        } else if (triceps.getSelectedIndex() == 1) {
            work.setText("Close Grip Floor Press");
        } else if (triceps.getSelectedIndex() == 2) {
            work.setText("Dips");
        } else if (triceps.getSelectedIndex() == 3) {
            work.setText("Machine Dips");
        } else if (triceps.getSelectedIndex() == 4) {
            work.setText("Kickbacks");
        } else if (triceps.getSelectedIndex() == 5) {
            work.setText("Skull-crusher");
        } else if (triceps.getSelectedIndex() == 6) {
            work.setText("One hand Extention");
        } else if (triceps.getSelectedIndex() == 7) {
            work.setText("Cable row");
        }
    }//GEN-LAST:event_tricepsActionPerformed

    private void bicepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bicepsActionPerformed
        if (biceps.getSelectedIndex() == 0) {
            work.setText("Dumbell Curl");
        } else if (biceps.getSelectedIndex() == 1) {
            work.setText("Barbell Curl");
        } else if (biceps.getSelectedIndex() == 2) {
            work.setText("Hammer Curl");
        } else if (biceps.getSelectedIndex() == 3) {
            work.setText("Ez bar Curl");
        } else if (biceps.getSelectedIndex() == 4) {
            work.setText("Concentration Curl");
        } else if (biceps.getSelectedIndex() == 5) {
            work.setText("Over Head Cable Curl");
        }
    }//GEN-LAST:event_bicepsActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if (back.getSelectedIndex() == 0) {
            work.setText("Front  Machine Lat");
        } else if (back.getSelectedIndex() == 1) {
            work.setText("Back Machine Lat");
        } else if (back.getSelectedIndex() == 2) {
            work.setText("DeadLift");
        } else if (back.getSelectedIndex() == 3) {
            work.setText("Pull Up");
        } else if (back.getSelectedIndex() == 4) {
            work.setText("Bent Over row");
        } else if (back.getSelectedIndex() == 5) {
            work.setText("One Arm Dumbell row");
        } else if (back.getSelectedIndex() == 6) {
            work.setText("Standing T bar row");
        }
    }//GEN-LAST:event_backActionPerformed

    private void cardioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardioActionPerformed
        if (cardio.getSelectedIndex() == 0) {
            work.setText("TreadMill");
        } else if (cardio.getSelectedIndex() == 1) {
            work.setText("Cycle");
        } else if (cardio.getSelectedIndex() == 2) {
            work.setText("Crossfit");
        } else if (cardio.getSelectedIndex() == 3) {
            work.setText("Push Up");
        } else if (cardio.getSelectedIndex() == 4) {
            work.setText("Chin Up");
        } else if (cardio.getSelectedIndex() == 5) {
            work.setText("Skipping");
        } else if (cardio.getSelectedIndex() == 6) {
            work.setText("Twist");
        } else if (cardio.getSelectedIndex() == 7) {
            work.setText("Rope");
        } else if (cardio.getSelectedIndex() == 8) {
            work.setText("Free Squat");
        } else if (cardio.getSelectedIndex() == 9) {
            work.setText("Box");
        }
    }//GEN-LAST:event_cardioActionPerformed

    private void tw_clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tw_clrActionPerformed
        work.setText("");
        set.setText("");
        rep.setText("");
        con.setText("");
        tdate.setCalendar(null);
        mem_id.setText("");
        week_day.setText("");
        
    }//GEN-LAST:event_tw_clrActionPerformed

    private void tw_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tw_addActionPerformed
        String wo = work.getText();
        String se = set.getText();
        String re = rep.getText();
        String cn = con.getText();
        String da = ((JTextField) tdate.getDateEditor().getUiComponent()).getText();
        String mid = mem_id.getText();
        String week = week_day.getText();
        String t_id = tid.getText();

        if (wo.equals("") || se.equals("") || re.equals("") || cn.equals("") || da.equals("") || mid.equals("") || week.equals("")) {
        
        } else {

            if (flag == 1) {

                try {
                    dbc = new DBConnect();
                    dbc.connectToDB();
                    String sql = "INSERT INTO ROUTINE(WN,SE,REPS,AD,WEE,CON,MID,TID ) VALUES('" + wo + "', " + se + "," + re + ",'" + da + "','" + week + "'," + cn + "," + mid + "," + t_id + ")";
                    boolean b = dbc.insertDataToDB(sql);
                    if (b) {

                        dbc.disconnectFromDB();
                        JOptionPane.showMessageDialog(null, " Successfully Inserted", "Hurrah!!", JOptionPane.DEFAULT_OPTION);
                        
                            try {
            dbc = new DBConnect();
            dbc.connectToDB();

            DefaultTableModel model = (DefaultTableModel) wopt.getModel();
            model.setRowCount(0);

            resultset = dbc.queryToDB("SELECT * FROM  ROUTINE  MID='"+mid+"'  ");

            while (resultset.next()) {

                String wn = resultset.getString("WN");
                String set = String.valueOf(resultset.getInt("SE"));
                String rep = String.valueOf(resultset.getInt("REPS"));
                String ad = resultset.getString("AD");
                String we = resultset.getString("WEE");
                String con= String.valueOf(resultset.getInt("CON"));
                String midi = String.valueOf(resultset.getInt("MID"));
                String tid = String.valueOf(resultset.getInt("TID"));
              

                String tableData[] = {wn, set, rep, ad, we, con, midi, tid};
                DefaultTableModel tableModel = (DefaultTableModel) wopt.getModel();
                tableModel.addRow(tableData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
                        
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }

            if (flag == 2) {
                    try {
                    dbc = new DBConnect();
                    dbc.connectToDB();
                    String sql = "INSERT INTO ROUTINE(WN,SE,REPS,AD,WEE,CON,MID,TID ) VALUES('" + wo + "', " + se + "," + re + ",'" + da + "','" + week + "'," + cn + "," + mid + "," + t_id + ")";
                    boolean b = dbc.insertDataToDB(sql);
                    if (b) {

                        dbc.disconnectFromDB();
                        JOptionPane.showMessageDialog(null, " Successfully Inserted", "Hurrah!!", JOptionPane.DEFAULT_OPTION);
                        
                            try {
            dbc = new DBConnect();
            dbc.connectToDB();

            DefaultTableModel model = (DefaultTableModel) wopt.getModel();
            model.setRowCount(0);

            resultset = dbc.queryToDB("SELECT * FROM  ROUTINE WHERE  MID = '"+mid+"' ");

            while (resultset.next()) {

                String wn = resultset.getString("WN");
                String set = String.valueOf(resultset.getInt("SE"));
                String rep = String.valueOf(resultset.getInt("REPS"));
                String ad = resultset.getString("AD");
                String we = resultset.getString("WEE");
                String con= String.valueOf(resultset.getInt("CON"));
                String midi = String.valueOf(resultset.getInt("MID"));
                String tid = String.valueOf(resultset.getInt("TID"));
              

                String tableData[] = {wn, set, rep, ad, we, con, midi, tid};
                DefaultTableModel tableModel = (DefaultTableModel) wopt.getModel();
                tableModel.addRow(tableData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
                        
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }


    }//GEN-LAST:event_tw_addActionPerformed

    private void search_memidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_memidActionPerformed
        String mi=mem_id.getText();
        
        if(mi.equals("")){
                    JOptionPane.showMessageDialog(null, " Caution ", " Empty Member Id", JOptionPane.ERROR_MESSAGE);
            }
        else{
              try {
            dbc = new DBConnect();
            dbc.connectToDB();

            DefaultTableModel model = (DefaultTableModel) wopt.getModel();
            model.setRowCount(0);

            resultset = dbc.queryToDB("SELECT * FROM  ROUTINE WHERE MID="+mi+"  ");

            while (resultset.next()) {

                String wn = resultset.getString("WN");
                String set = String.valueOf(resultset.getInt("SE"));
                String rep = String.valueOf(resultset.getInt("REPS"));
                String ad = resultset.getString("AD");
                String we = resultset.getString("WEE");
                String con= String.valueOf(resultset.getInt("CON"));
                String mid = String.valueOf(resultset.getInt("MID"));
                String tid = String.valueOf(resultset.getInt("TID"));
              

                String tableData[] = {wn, set, rep, ad, we, con, mid, tid};
                DefaultTableModel tableModel = (DefaultTableModel) wopt.getModel();
                tableModel.addRow(tableData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_search_memidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TrainerLog trlg = new TrainerLog();
        trlg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tram_clr_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tram_clr_btnActionPerformed
          member_id.setText("");
          member_name.setText("");
          fr_id.setText("");
          fr_name.setText("");

    }//GEN-LAST:event_tram_clr_btnActionPerformed

    private void member_show_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_member_show_btnActionPerformed
        if (flag == 1) {
            int trid = mi.getOwn_id();
            try {
                dbc = new DBConnect();
                dbc.connectToDB();

                DefaultTableModel model = (DefaultTableModel) Table.getModel();
                model.setRowCount(0);

                resultset = dbc.queryToDB("SELECT * FROM MEMBEREG WHERE TID =" + trid + " ");

                while (resultset.next()) {
                    String id = String.valueOf(resultset.getInt("MID"));
                    String name = resultset.getString("NAME");

                    String tableData[] = {id, name};
                    DefaultTableModel tableModel = (DefaultTableModel) Table.getModel();
                    tableModel.addRow(tableData);

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_member_show_btnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TrainerLog trlg = new TrainerLog();
        trlg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed

    private void pic_pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pic_pathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pic_pathActionPerformed

    private void tr_pic_choserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_pic_choserActionPerformed
        try {
            pic.setIcon(null);
            pic_path.setText("");
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            String filename = f.getAbsolutePath();
            pic_path.setText(filename);
            Image getAbsolutePath = null;
            ImageIcon icon = new ImageIcon(filename);
            Image image = icon.getImage().getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
            pic.setIcon(icon);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tr_pic_choserActionPerformed

    private void tr_applyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_applyActionPerformed
        if (flag == 1) {
            String pin = JOptionPane.showInputDialog("Please Enter Your Password");
            String id = tid.getText();
            try {
                dbc = new DBConnect();
                dbc.connectToDB();

                String sql = "SELECT * FROM MENTOR WHERE TID='" + id + "' AND PASS='" + pin + "' ";

                ResultSet rs;
                rs = dbc.queryToDB(sql);

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, " Thank you", "Verified!!", JOptionPane.DEFAULT_OPTION);
                    count = 1;

                } else {

                    JOptionPane.showMessageDialog(null, "Opps!! Wrong Password", "Warning", JOptionPane.ERROR_MESSAGE);

                }
                dbc.disconnectFromDB();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            if (count == 1) {
                dbc = new DBConnect();
                try {
                    String a = age.getText();
                    String wt = weight.getText();
                    String mob = mobile.getText();
                    String mail = email.getText();
                    String pic = pic_path.getText();

                    boolean cm = checkmobile(mob);
                    boolean ce = checkemail(mail);

                    if (cm && ce) {
                        dbc.connectToDB();
                        String sql = " UPDATE MENTOR SET AGE='" + a + "' ,WE='" + wt + "' ,MOBILE='" + mob + "',EMAIL='" + mail + "',PIC='" + pic + "'  WHERE TID='" + id + "' AND PASS='" + pin + "' ";
                        dbc.insertDataToDB(sql);

                        JOptionPane.showMessageDialog(null, " Successfully Updated", "Hurrah!!", JOptionPane.DEFAULT_OPTION);

                        dbc.disconnectFromDB();

                        tr_pic_choser.setVisible(false);
                        pic_path.setVisible(false);
                        tr_apply.setVisible(false);
                        ad_clr.setVisible(false);

                        ag.setForeground(Color.WHITE);
                        w.setForeground(Color.WHITE);
                        m.setForeground(Color.WHITE);
                        e.setForeground(Color.WHITE);
                        
                        age.setEditable(false);
                        weight.setEditable(false);
                        email.setEditable(false);
                        mobile.setEditable(false);


                    } else {
                        JOptionPane.showMessageDialog(null, "Opps!! Wrong Format", "Warning", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }

        if (flag == 2) {
            String pin = JOptionPane.showInputDialog("Please Enter Your Password");
            String id = tid.getText();
            try {
                dbc = new DBConnect();
                dbc.connectToDB();

                String sql = "SELECT * FROM TRAINEREG WHERE TID='" + id + "' AND PASS='" + pin + "' ";

                ResultSet rs;
                rs = dbc.queryToDB(sql);

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, " Thank you", "Verified!!", JOptionPane.DEFAULT_OPTION);
                    count = 1;

                } else {

                    JOptionPane.showMessageDialog(null, "Opps!! Wrong Password", "Warning", JOptionPane.ERROR_MESSAGE);

                }
                dbc.disconnectFromDB();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            if (count == 1) {
                dbc = new DBConnect();
                try {
                    String a = age.getText();
                    String wt = weight.getText();
                    String mob = mobile.getText();
                    String mail = email.getText();
                    String pic = pic_path.getText();

                    boolean cm = checkmobile(mob);
                    boolean ce = checkemail(mail);

                    if (cm && ce) {
                        dbc.connectToDB();
                        String sql = " UPDATE TRAINEREG SET AGE='" + a + "' ,WE='" + wt + "' ,MOBILE='" + mob + "',EMAIL='" + mail + "',PIC='" + pic + "'  WHERE TID='" + id + "' AND PASS='" + pin + "' ";
                        dbc.insertDataToDB(sql);

                        JOptionPane.showMessageDialog(null, " Successfully Updated", "Hurrah!!", JOptionPane.DEFAULT_OPTION);

                        dbc.disconnectFromDB();

                        tr_pic_choser.setVisible(false);
                        pic_path.setVisible(false);
                        tr_apply.setVisible(false);
                        ad_clr.setVisible(false);
                        
                        age.setEditable(false);
                        weight.setEditable(false);
                        email.setEditable(false);
                        mobile.setEditable(false);


                        ag.setForeground(Color.WHITE);
                        w.setForeground(Color.WHITE);
                        m.setForeground(Color.WHITE);
                        e.setForeground(Color.WHITE);

                    } else {
                        JOptionPane.showMessageDialog(null, "Opps!! Wrong Format", "Warning", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_tr_applyActionPerformed

    private void tr_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_upActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING!!!",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            age.setEditable(true);
            weight.setEditable(true);
            email.setEditable(true);
            mobile.setEditable(true);

            ag.setForeground(Color.red);
            w.setForeground(Color.red);
            m.setForeground(Color.red);
            e.setForeground(Color.red);

            tr_pic_choser.setVisible(true);
            pic_path.setVisible(true);
            pic_path.setText(path);
            tr_apply.setVisible(true);
            ad_clr.setVisible(true);

        } else {

        }
    }//GEN-LAST:event_tr_upActionPerformed

    private void ad_clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad_clrActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING!!!",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            age.setEditable(false);
            weight.setEditable(false);
            email.setEditable(false);
            mobile.setEditable(false);

            ag.setForeground(Color.WHITE);
            w.setForeground(Color.WHITE);
            m.setForeground(Color.WHITE);
            e.setForeground(Color.WHITE);

            tr_pic_choser.setVisible(false);
            pic_path.setVisible(false);

            tr_apply.setVisible(false);
            ad_clr.setVisible(false);

        } else {

        }
    }//GEN-LAST:event_ad_clrActionPerformed

    private void member_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_member_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_member_nameActionPerformed

    private void fr_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fr_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fr_nameActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        int index = Table.getSelectedRow();
        TableModel model = Table.getModel();
        String id = model.getValueAt(index, 0).toString();
        String name = model.getValueAt(index, 1).toString();

        member_id.setText(id);
        member_name.setText(name);


    }//GEN-LAST:event_TableMouseClicked

    private void Fresher_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fresher_TableMouseClicked
        int index = Fresher_Table.getSelectedRow();
        TableModel model = Fresher_Table.getModel();
        String id = model.getValueAt(index, 0).toString();
        String name = model.getValueAt(index, 1).toString();

        fr_id.setText(id);
        fr_name.setText(name);
    }//GEN-LAST:event_Fresher_TableMouseClicked

    private void fresher_shw_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fresher_shw_btnActionPerformed
        if (flag == 1) {
            int trid = mi.getOwn_id();
            try {
                dbc = new DBConnect();
                dbc.connectToDB();

                DefaultTableModel model = (DefaultTableModel) Fresher_Table.getModel();
                model.setRowCount(0);

                resultset = dbc.queryToDB("SELECT * FROM TRAINEREG WHERE M_TID =" + trid + " ");

                while (resultset.next()) {
                    String idf = String.valueOf(resultset.getInt("TID"));
                    String namef = resultset.getString("NAME");

                    String tableData[] = {idf, namef};
                    DefaultTableModel tableModel = (DefaultTableModel) Fresher_Table.getModel();
                    tableModel.addRow(tableData);

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_fresher_shw_btnActionPerformed

    private void member_show_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_show_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_member_show_btnMouseClicked

    private void mentor_allotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mentor_allotActionPerformed
        int mnid = mi.getOwn_id();
        String fre_id = fr_id.getText();
        String fre_name = fr_name.getText();
        String mem_id = member_id.getText();
        String mem_name = member_name.getText();
        if (fre_id.equals("") || fre_name.equals("") || mem_id.equals("") || mem_name.equals("")) {
            JOptionPane.showMessageDialog(null, " Select First ", "Warning !!! Empty Field", JOptionPane.ERROR_MESSAGE);
        } else {
            int fres_id = Integer.parseInt(fr_id.getText());
            int memb_id = Integer.parseInt(member_id.getText());

            dbc = new DBConnect();
            try {
                dbc.connectToDB();

                boolean b = dbc.ADDToDB("INSERT INTO ALLOT(MN_ID, FR_ID,FR_NAME,MEM_ID,MEM_NAME) VALUES(" + mnid + "," + fres_id + ", '" + fre_name + "'," + memb_id + ",'" + mem_name + "')");
                if (b) {
                    JOptionPane.showMessageDialog(null, " Successfully Alloted the Member ", "Hurrah!!", JOptionPane.DEFAULT_OPTION);
                    dbc.disconnectFromDB();
                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e);
            }

        }


    }//GEN-LAST:event_mentor_allotActionPerformed

    private void assign_member_fr_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assign_member_fr_btnActionPerformed
        if (flag == 2) {
            int trid = fi.getOwn_id();
            try {
                dbc = new DBConnect();
                dbc.connectToDB();

                DefaultTableModel model = (DefaultTableModel) Assign_Table.getModel();
                model.setRowCount(0);

                resultset = dbc.queryToDB("SELECT * FROM ALLOT WHERE FR_ID =" + trid + " ");

                while (resultset.next()) {

                    String idf = String.valueOf(resultset.getInt("MEM_ID"));
                    String namef = resultset.getString("MEM_NAME");

                    String tableData[] = {idf, namef};
                    DefaultTableModel tableModel = (DefaultTableModel) Assign_Table.getModel();
                    tableModel.addRow(tableData);

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_assign_member_fr_btnActionPerformed

    private void equip_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equip_tableMouseClicked
        int index = equip_table.getSelectedRow();
        TableModel model = equip_table.getModel();
        id_equip = model.getValueAt(index, 0).toString();
        String name = model.getValueAt(index, 1).toString();
        String pr = model.getValueAt(index, 2).toString();

        prb.setText(pr);

    }//GEN-LAST:event_equip_tableMouseClicked

    private void show_equipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_equipActionPerformed
        try {
            dbc = new DBConnect();
            dbc.connectToDB();

            DefaultTableModel model = (DefaultTableModel) equip_table.getModel();
            model.setRowCount(0);

            resultset = dbc.queryToDB("SELECT * FROM  EQUIPMENT ");

            while (resultset.next()) {
                String id = resultset.getString("EID");
                String name = resultset.getString("ENAME");

                String prb = resultset.getString("PROBLEM");

                String tableData[] = {id, name, prb};
                DefaultTableModel tableModel = (DefaultTableModel) equip_table.getModel();
                tableModel.addRow(tableData);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_show_equipActionPerformed

    private void apply_equipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apply_equipActionPerformed

        String problem = prb.getText();
        int ida = Integer.parseInt(tid.getText());

        dbc = new DBConnect();
        try {
            dbc.connectToDB();
            String sql = " UPDATE EQUIPMENT SET PROBLEM='" + problem + "' ,ENID=" + ida + " WHERE EID='" + id_equip + "' ";
            boolean b = dbc.insertDataToDB(sql);
            if (b) {
                JOptionPane.showMessageDialog(null, " Successfully Updated the Info", "Hurrah!!", JOptionPane.DEFAULT_OPTION);
                dbc.disconnectFromDB();

                p.setForeground(Color.WHITE);
                prb.setEditable(true);
                apply_equip.setVisible(false);
                Cancel_equip.setVisible(false);
                prb.setText("");

                try {
                    dbc = new DBConnect();
                    dbc.connectToDB();

                    DefaultTableModel model = (DefaultTableModel) equip_table.getModel();
                    model.setRowCount(0);

                    resultset = dbc.queryToDB("SELECT * FROM  EQUIPMENT ");

                    while (resultset.next()) {
                        String ide = resultset.getString("EID");
                        String namee = resultset.getString("ENAME");
                        String prb = resultset.getString("PROBLEM");

                        String tableData[] = {ide, namee, prb};
                        DefaultTableModel tableModel = (DefaultTableModel) equip_table.getModel();
                        tableModel.addRow(tableData);

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_apply_equipActionPerformed

    private void update_equipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_equipActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING!!!",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            String problem = prb.getText();
            if (problem.equals("")) {
                JOptionPane.showMessageDialog(null, "Opps!! Empty Field", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {
                apply_equip.setVisible(true);
                Cancel_equip.setVisible(true);
                p.setForeground(Color.red);
                prb.setEditable(true);

            }

        }

    }//GEN-LAST:event_update_equipActionPerformed

    private void Cancel_equipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_equipActionPerformed
        apply_equip.setVisible(false);
        Cancel_equip.setVisible(false);
        p.setForeground(Color.WHITE);
        prb.setEditable(false);
    }//GEN-LAST:event_Cancel_equipActionPerformed

    private void weeklyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weeklyActionPerformed
        if (weekly.getSelectedIndex() == 0) {
            week_day.setText("Sunday");
        } else if (weekly.getSelectedIndex() == 1) {
            week_day.setText("Monday");
        } else if (weekly.getSelectedIndex() == 2) {
            week_day.setText("Tuesday");
        } else if (weekly.getSelectedIndex() == 3) {
            week_day.setText("Wednesday");
        } else if (weekly.getSelectedIndex() == 4) {
            week_day.setText("Thursday");
        } else if (weekly.getSelectedIndex() == 5) {
            week_day.setText("Friday");
        } else if (weekly.getSelectedIndex() == 6) {
            week_day.setText("Saturday");
        }
    }//GEN-LAST:event_weeklyActionPerformed

    private void tr_search_wdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_search_wdayActionPerformed
          String wee=week_day.getText();
        if(wee.equals("")){
                    JOptionPane.showMessageDialog(null, " Caution ", " Empty Week", JOptionPane.ERROR_MESSAGE);
            }
        else{
              try {
            dbc = new DBConnect();
            dbc.connectToDB();

            DefaultTableModel model = (DefaultTableModel) wopt.getModel();
            model.setRowCount(0);

            resultset = dbc.queryToDB("SELECT * FROM  ROUTINE WHERE WEE='"+wee+"'  ");

            while (resultset.next()) {

                String wn = resultset.getString("WN");
                String set = String.valueOf(resultset.getInt("SE"));
                String rep = String.valueOf(resultset.getInt("REPS"));
                String ad = resultset.getString("AD");
                String we = resultset.getString("WEE");
                String con= String.valueOf(resultset.getInt("CON"));
                String mid = String.valueOf(resultset.getInt("MID"));
                String tid = String.valueOf(resultset.getInt("TID"));
              

                String tableData[] = {wn, set, rep, ad, we, con, mid, tid};
                DefaultTableModel tableModel = (DefaultTableModel) wopt.getModel();
                tableModel.addRow(tableData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_tr_search_wdayActionPerformed

    private void woptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_woptMouseClicked
           int index = wopt.getSelectedRow();
        TableModel model = wopt.getModel();
        String wn= model.getValueAt(index, 0).toString();
        String se = model.getValueAt(index, 1).toString();
        String reps = model.getValueAt(index, 2).toString();
        String dat = model.getValueAt(index, 3).toString();
        String we = model.getValueAt(index, 4).toString();
        String cont= model.getValueAt(index, 5).toString();
        String mid = model.getValueAt(index, 6).toString();
        
        
         work.setText(wn);
        set.setText(se);
        rep.setText(reps);
        con.setText(cont);
      
        mem_id.setText(mid);
        week_day.setText(we);
        
         Date da = null;
        try {
            da = new SimpleDateFormat("yyyy-MM-dd").parse(dat);
        } catch (ParseException ex) {
            Logger.getLogger(AdminMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        tdate.setDate(da);
        
        

    }//GEN-LAST:event_woptMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          String wo = work.getText();
        String se = set.getText();
        String re = rep.getText();
        String cn = con.getText();
        String da = ((JTextField) tdate.getDateEditor().getUiComponent()).getText();
        String mid = mem_id.getText();
        String week = week_day.getText();
        String t_id = tid.getText();

        if (wo.equals("") || se.equals("") || re.equals("") || cn.equals("") || da.equals("") || mid.equals("") || week.equals("")) {
        
        } else {

            if (flag == 1) {

                try {
                    dbc = new DBConnect();
                    dbc.connectToDB();
                    String sql = "UPDATE  ROUTINE SET WN='"+wo+"', SE='"+se+"', REPS='"+re+"', AD='"+da+"' ,WEE='"+week+"' , CON='"+cn+"', MID='"+mid+"' ,TID='"+t_id+"' WHERE MID='"+mid+"'  ";
                    boolean b = dbc.insertDataToDB(sql);
                    if (b) {

                        dbc.disconnectFromDB();
                        JOptionPane.showMessageDialog(null, " Successfully Updated", "Hurrah!!", JOptionPane.DEFAULT_OPTION);
                        
                            try {
            dbc = new DBConnect();
            dbc.connectToDB();

            DefaultTableModel model = (DefaultTableModel) wopt.getModel();
            model.setRowCount(0);

            resultset = dbc.queryToDB("SELECT * FROM  ROUTINE WHERE MID='"+mid+"'  ");

            while (resultset.next()) {

                String wn = resultset.getString("WN");
                String set = String.valueOf(resultset.getInt("SE"));
                String rep = String.valueOf(resultset.getInt("REPS"));
                String ad = resultset.getString("AD");
                String we = resultset.getString("WEE");
                String con= String.valueOf(resultset.getInt("CON"));
                String midi = String.valueOf(resultset.getInt("MID"));
                String tid = String.valueOf(resultset.getInt("TID"));
              

                String tableData[] = {wn, set, rep, ad, we, con, midi, tid};
                DefaultTableModel tableModel = (DefaultTableModel) wopt.getModel();
                tableModel.addRow(tableData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
                        
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }

            if (flag == 2) {
                    try {
                    dbc = new DBConnect();
                    dbc.connectToDB();
                    String sql = "UPDATE  ROUTINE SET WN='"+wo+"', SE='"+se+"', REPS='"+re+"', AD='"+da+"' ,WEE='"+week+"' , CON='"+cn+"', MID='"+mid+"' ,TID='"+t_id+"' WHERE MID='"+mid+"'  ";
                    boolean b = dbc.insertDataToDB(sql);
                    if (b) {

                        dbc.disconnectFromDB();
                        JOptionPane.showMessageDialog(null, " Successfully Updated", "Hurrah!!", JOptionPane.DEFAULT_OPTION);
                        
                            try {
            dbc = new DBConnect();
            dbc.connectToDB();

            DefaultTableModel model = (DefaultTableModel) wopt.getModel();
            model.setRowCount(0);

            resultset = dbc.queryToDB("SELECT * FROM  ROUTINE  WHERE MID='"+mid+"'  ");

            while (resultset.next()) {

                String wn = resultset.getString("WN");
                String set = String.valueOf(resultset.getInt("SE"));
                String rep = String.valueOf(resultset.getInt("REPS"));
                String ad = resultset.getString("AD");
                String we = resultset.getString("WEE");
                String con= String.valueOf(resultset.getInt("CON"));
                String midi = String.valueOf(resultset.getInt("MID"));
                String tid = String.valueOf(resultset.getInt("TID"));
              

                String tableData[] = {wn, set, rep, ad, we, con, midi, tid};
                DefaultTableModel tableModel = (DefaultTableModel) wopt.getModel();
                tableModel.addRow(tableData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
                        
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void combiend_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combiend_searchActionPerformed
        String wee=week_day.getText();
        String mi=mem_id.getText();
          if(wee.equals("") ||mi.equals("")){
                    JOptionPane.showMessageDialog(null, " Caution ", " Empty Field", JOptionPane.ERROR_MESSAGE);
            }
        else{
              try {
            dbc = new DBConnect();
            dbc.connectToDB();

            DefaultTableModel model = (DefaultTableModel) wopt.getModel();
            model.setRowCount(0);

            resultset = dbc.queryToDB("SELECT * FROM  ROUTINE WHERE MID="+mi+" AND WEE='"+wee+"'  ");

            while (resultset.next()) {

                String wn = resultset.getString("WN");
                String set = String.valueOf(resultset.getInt("SE"));
                String rep = String.valueOf(resultset.getInt("REPS"));
                String ad = resultset.getString("AD");
                String we = resultset.getString("WEE");
                String con= String.valueOf(resultset.getInt("CON"));
                String mid = String.valueOf(resultset.getInt("MID"));
                String tid = String.valueOf(resultset.getInt("TID"));
              

                String tableData[] = {wn, set, rep, ad, we, con, mid, tid};
                DefaultTableModel tableModel = (DefaultTableModel) wopt.getModel();
                tableModel.addRow(tableData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_combiend_searchActionPerformed

    private void Assign_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Assign_TableMouseClicked
         int index = Assign_Table.getSelectedRow();
        TableModel model = Assign_Table.getModel();
        String id = model.getValueAt(index, 0).toString();
        mem_id.setText(id);
       
    }//GEN-LAST:event_Assign_TableMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       TrainerLog trlg = new TrainerLog();
        trlg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        TrainerLog trlg = new TrainerLog();
        trlg.setVisible(true);
        dispose();        
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(TrainerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Fresher_Info fi = null;
        Mentor_Info mi = null;
        int flag = 0;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainerMain(fi, mi, flag).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Assign_Table;
    private javax.swing.JButton Cancel_equip;
    private javax.swing.JTable Fresher_Table;
    private javax.swing.JLabel Pin;
    private javax.swing.JTabbedPane TP;
    private javax.swing.JTable Table;
    private javax.swing.JButton ad_clr;
    private javax.swing.JLabel ag;
    private javax.swing.JTextField age;
    private javax.swing.JPanel allot_member;
    private javax.swing.JButton apply_equip;
    private javax.swing.JPanel assign;
    private javax.swing.JButton assign_member_fr_btn;
    private javax.swing.JComboBox<String> back;
    private javax.swing.JTextField bg;
    private javax.swing.JComboBox<String> biceps;
    private javax.swing.JComboBox<String> cardio;
    private javax.swing.JComboBox<String> chest;
    private javax.swing.JButton combiend_search;
    private javax.swing.JTextField con;
    private javax.swing.JTextField date;
    private javax.swing.JLabel e;
    private javax.swing.JTextField email;
    private javax.swing.JTable equip_table;
    private javax.swing.JPanel equipment;
    private javax.swing.JTextField f_name;
    private javax.swing.JTextField fr_id;
    private javax.swing.JTextField fr_name;
    private javax.swing.JButton fresher_shw_btn;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField height;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JComboBox<String> legs;
    private javax.swing.JLabel m;
    private javax.swing.JLabel m_name;
    private javax.swing.JLabel m_time;
    private javax.swing.JTextField mem_id;
    private javax.swing.JTextField member_id;
    private javax.swing.JTextField member_name;
    private javax.swing.JButton member_show_btn;
    private javax.swing.JButton mentor_allot;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField nid;
    private javax.swing.JLabel p;
    private javax.swing.JTextField pack;
    private javax.swing.JLabel pic;
    private javax.swing.JTextField pic_path;
    private javax.swing.JTextField prb;
    private javax.swing.JPanel profile;
    private javax.swing.JTextField rep;
    private javax.swing.JPanel routine;
    private javax.swing.JTextField salary;
    private javax.swing.JButton search_memid;
    private javax.swing.JTextField set;
    private javax.swing.JComboBox<String> shoulder;
    private javax.swing.JButton show_equip;
    private javax.swing.JLabel show_paaa;
    private com.toedter.calendar.JDateChooser tdate;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField time;
    private javax.swing.JButton tr_apply;
    private javax.swing.JButton tr_pic_choser;
    private javax.swing.JButton tr_search_wday;
    private javax.swing.JButton tr_up;
    private javax.swing.JButton tram_clr_btn;
    private javax.swing.JComboBox<String> triceps;
    private javax.swing.JButton tw_add;
    private javax.swing.JButton tw_clr;
    private javax.swing.JButton update_equip;
    private javax.swing.JLabel w;
    private javax.swing.JTextField week_day;
    private javax.swing.JComboBox<String> weekly;
    private javax.swing.JTextField weight;
    private javax.swing.JTable wopt;
    private javax.swing.JTextField work;
    // End of variables declaration//GEN-END:variables
}
