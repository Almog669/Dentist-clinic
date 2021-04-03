import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;

public class View extends JFrame{
    private JFrame frame,frame1,frame2,frame3,frame_error,doctor,schedule_f,d_w_hours,m_send;
    private JLabel label,photo_l,photo_s,view_op_d,salaries,chose_firm,assistant,wrong_,l_working,dual,m_sent,remindor,d,r_sent;
    private JButton bt1,bt_s_start, bt2,bt3,bt_s_1,bt_s_2,amazon,ebay,schedule,goback,next,go_tomain;
    private JPanel panel,panel_s,panel_go,panel_d,panel_error,w_hours;
    private JTextField appointment;
    ImageIcon image_main,image_S,image_go;
    Image I_M,welcome_i_m,Image_s,Image_s2,image_g,image_g_2;
    Resultset rs;
    ArrayList<Doctors_appointments> list_a=new ArrayList<Doctors_appointments>();//Creating arraylist
    int count =0;
    //image

    public void go(){

        //frame
        m_send = new JFrame("Message sent!");
        d_w_hours = new JFrame("working hours updated");
        frame = new JFrame("Dentist Clinic");
        frame1 = new JFrame("Session");
        frame2= new JFrame("session");
        frame3 =new JFrame("session");
        schedule_f=new JFrame("schdule meeting");
        frame_error =new JFrame("Wrong details");
        doctor =new JFrame("doctor options");
        frame1.setSize(400,800);
        d_w_hours.setSize(400,800);
        frame2.setSize(400,800);
        frame3.setSize(400,800);
        frame_error.setSize(400,800);
        doctor.setSize(400,800);
        m_send.setSize(400,800);

        //remindor labal
        remindor=new JLabel("   Send Remindors");
        remindor.setFont(new Font("Serif", Font.BOLD, 28));
        remindor.setBounds(60,40,275,40);

        //Welcome label
        label = new JLabel("         Dentist app");
        label.setFont(new Font("Calibri", Font.CENTER_BASELINE, 28));
        label.setBounds(60,40,275,40);

       //view_op_d
        view_op_d = new JLabel("       Options");
        view_op_d.setFont(new Font("Calibri", Font.CENTER_BASELINE, 32));
        view_op_d.setBounds(60,40,275,40);

        //assistant
        assistant = new JLabel(" Assistant Options");
        assistant.setFont(new Font("Calibri", Font.CENTER_BASELINE, 32));
        assistant.setBounds(60,40,275,40);


        //label r_sent
        r_sent = new JLabel(" Remindor Sent");
        r_sent.setFont(new Font("Calibri", Font.CENTER_BASELINE, 32));
        r_sent.setBounds(60,40,275,40);

        //chose_firm
        chose_firm = new JLabel("    Chose firm ");
        chose_firm.setFont(new Font("Calibri", Font.CENTER_BASELINE, 32));
        chose_firm.setBounds(60,40,275,40);

        //salaries
        salaries = new JLabel("No Salaries yet");
        salaries.setFont(new Font("Calibri", Font.CENTER_BASELINE, 23));
        salaries.setBounds(60,40,275,40);

        //Wrong details
        wrong_ = new JLabel("    ERROR! wrong date() ");
        wrong_.setFont(new Font("Calibri", Font.CENTER_BASELINE, 23));
        wrong_.setBounds(60,40,275,40);

        //dual date
        dual = new JLabel("    ERROR! meeting in Session already() ");
        dual.setFont(new Font("Calibri", Font.CENTER_BASELINE, 16));
        dual.setBounds(60,40,275,40);

        //panel working schedule
        l_working = new JLabel("Doctor Wroking Hours");
        l_working.setFont(new Font("Calibri", Font.CENTER_BASELINE, 23));
        l_working.setBounds(60,40,275,40);

//m_sent label
        m_sent = new JLabel("Message sent to client");
        m_sent.setFont(new Font("Calibri", Font.CENTER_BASELINE, 23));
        m_sent.setBounds(60,40,275,40);

        //photo label
        image_main = new ImageIcon(getClass().getResource("logo_dentist.jpg"));
        I_M  = image_main.getImage();
        welcome_i_m = I_M.getScaledInstance(350, 225, java.awt.Image.SCALE_SMOOTH);
        image_main = new ImageIcon(welcome_i_m);
        photo_l = new JLabel(image_main);
        photo_l.setSize(300,300);
        photo_l.setBounds(15,340,350,350);

        //appointments bound
        appointment = new JFormattedTextField("index");
        appointment.setBounds(10,120,320,100);
        appointment.setFont(new Font("Calibri", Font.CENTER_BASELINE, 14));
        appointment.setText("Jhons working hours : mon-thurs 10:00 - 20:00");




        /*
        //Image Session
        image_S= new ImageIcon(getClass().getResource("Photo_session.png"));
        Image_s = image_S.getImage();
        Image_s2 = Image_s.getScaledInstance(250, 225, java.awt.Image.SCALE_SMOOTH);
        image_S= new ImageIcon(Image_s);
        photo_s=new JLabel(image_S);
        //image_go
        image_go = new ImageIcon(getClass().getResource("start_icon.png"));
        image_g=image_go.getImage();
        image_g_2= image_g.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        image_go= new ImageIcon(image_g);
        JLabel photo_g= new JLabel (image_go);



        photo_s.setSize(1200,600);
        photo_s.setBounds(0,450,400,350);
        photo_g.setSize(100,100);
        photo_g.setBounds(50,340,100,100);



        //Image Session
        image_S= new ImageIcon(getClass().getResource("Photo_session.png"));
        Image_s = image_S.getImage();
        Image_s2 = Image_s.getScaledInstance(250, 225, java.awt.Image.SCALE_SMOOTH);
        image_S= new ImageIcon(Image_s);
        photo_s=new JLabel(image_S);
        //image_go
        image_go = new ImageIcon(getClass().getResource("start_icon.png"));
        image_g=image_go.getImage();
        image_g_2= image_g.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        image_go= new ImageIcon(image_g);
        JLabel photo_g= new JLabel (image_go);



        photo_s.setSize(1200,600);
        photo_s.setBounds(0,450,400,350);
        photo_g.setSize(100,100);
        photo_g.setBounds(50,340,100,100);
*/
        //panels
        panel=new JPanel();
        panel_s=new JPanel();
        panel_go=new JPanel();
        panel_d = new JPanel();
        panel_error= new JPanel();
        w_hours = new JPanel();

        //buttons
       schedule= new JButton("schedule meeting");
       amazon = new JButton("amazon");
       ebay = new JButton("ebay");
        bt1 = new JButton("Enter");
        bt2 = new JButton("Instructions");
        bt3= new JButton("Share");
        bt_s_start =new JButton("start");
        bt_s_1 =new JButton("View Salaries");
        bt_s_2 =new JButton("Send Remindor");
        goback = new JButton("Go Back ");
        next = new JButton("next");
        go_tomain=new JButton("Send");

        //bt_s_1.setRolloverSelectedIcon(image_S);
        go_tomain.setBackground(Color.ORANGE);
next.setBackground(Color.ORANGE);
        goback.setBackground(Color.ORANGE);
        schedule.setBackground(Color.ORANGE);
        amazon.setBackground(Color.ORANGE);
        ebay.setBackground(Color.ORANGE);
        bt1.setBackground(Color.ORANGE);
        bt2.setBackground(Color.ORANGE);
        bt3.setBackground(Color.ORANGE);
        bt_s_1.setBackground(Color.ORANGE);
        bt_s_2.setBackground(Color.ORANGE);
        bt_s_start.setBackground(Color.ORANGE);
        go_tomain.setMaximumSize( new Dimension(120,30));
        next.setMaximumSize( new Dimension(120,30));
        bt1.setMaximumSize( new Dimension(120,30));
        goback.setMaximumSize( new Dimension(120,30));
        bt2.setMaximumSize( new Dimension(120,30));
        bt3.setMaximumSize( new Dimension(120,30));
        bt_s_1.setMaximumSize( new Dimension(120,30));
        bt_s_2.setMaximumSize( new Dimension(120,30));
        bt1.setBounds(125,160,120,30);
        bt2.setBounds(125,200,120,30);
        bt3.setBounds(125,240,120,30);
        goback.setBounds(125,240,120,30);
        schedule.setBounds(125,370,120,40);
        bt_s_1.setBounds(125,250,120,40);
        bt_s_start.setBounds(125,250,120,40);
        bt_s_2.setBounds(125,310,120,40);
        amazon.setBounds(125,250,120,40);
        ebay.setBounds(125,310,120,40);
        next.setBounds(125,310,120,40);
        go_tomain.setBounds(125,270,120,40);
        Font font_b = new Font("Ariel", Font.BOLD, 12);
        bt1.setFont(font_b);
        bt2.setFont(font_b);
        bt3.setFont(font_b);
        bt_s_1.setFont(font_b);
        bt_s_2.setFont(font_b);
        bt_s_start.setFont(font_b);
        amazon.setFont(font_b);
        ebay.setFont(font_b);
        schedule.setFont(font_b);
        goback.setFont(font_b);
        next.setFont(font_b);
go_tomain.setFont(font_b);

        //button affects
        bt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame1.setVisible(true);
                Container S = frame1.getContentPane();
                S.add(panel_s);
                panel_s.setLayout(null);
                panel_s.setBackground(Color.LIGHT_GRAY);
                panel_s.add(bt_s_start);
               //panel_s.add(photo_s);

                //Labels
                final JLabel[] name = new JLabel[1];
                JLabel ID;
                JLabel Subject;
                JLabel Please_;
                Please_=new JLabel("Enter Credentials");
                Please_.setFont(new Font("Serif", Font.BOLD, 28));
                Please_.setBounds(60,40,275,40);
                panel_s.add(Please_);

                name[0] = new JLabel("Name : ");
                name[0].setFont(new Font("TimesRoman", Font.CENTER_BASELINE, 14));
                name[0].setBounds(25,110,275,40);
                panel_s.add(name[0]);

                ID= new JLabel("Phone  : ");
                ID.setFont(new Font("TimesRoman", Font.CENTER_BASELINE, 14));
                ID.setBounds(25,140,275,40);
                panel_s.add(ID);

                Subject= new JLabel("Password : ");
                Subject.setFont(new Font("TimesRoman", Font.CENTER_BASELINE, 14));
                Subject.setBounds(25,170,275,40);
                panel_s.add(Subject);


                //text fields
                JTextField tf_n,tf_ID,tf_Subject;
                tf_n= new JTextField();
                tf_n.setBounds(120,125,120,20);
                tf_n.setBackground(Color.white);
                panel_s.add(tf_n);

                tf_ID= new JTextField();
                tf_ID.setBounds(120,155,120,20);
                tf_ID.setBackground(Color.white);
                panel_s.add(tf_ID);

                tf_Subject= new JTextField();
                tf_Subject.setBounds(120,185,120,20);
                tf_Subject.setBackground(Color.white);
                panel_s.add(tf_Subject);
                panel_s.add(photo_l);

                bt_s_start.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String sub[];
                        int Time= 0;
                        sub=new String[3];
                        String input =tf_n.getText();
                        String name=input;
                        String input_id =tf_ID.getText();
                        String Id =input_id;
                        String input_S =tf_Subject.getText();
                        String j = new String("Jhon");
                        if(name.equals(j))
                        {
                            frame1.setVisible(false);
                            doctor.setVisible(true);
                            Container doc = doctor.getContentPane();

                            panel_d.setLayout(null);
                            panel_d.setBackground(Color.lightGray);
                            panel_d.add(bt_s_1);
                            panel_d.add(bt_s_2);
                            panel_d.add(photo_l);
                            panel_d.add(view_op_d);
                            doc.add(panel_d);
                            bt_s_1.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    doctor.setVisible(false);
                                    frame2.setVisible(true);
                                    Container go = frame2.getContentPane();
                                    go.add(panel_go);
                                    panel_go.setLayout(null);
                                    panel_go.setBackground(Color.darkGray);
                                    panel_go.add(salaries);
                                    panel_go.add(photo_l);


                                }
                            });
                            bt_s_2.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    doctor.setVisible(false);
                                    frame2.setVisible(true);
                                    Container go = frame2.getContentPane();
                                    go.add(panel_go);
                                    panel_go.setLayout(null);
                                    panel_go.setBackground(Color.darkGray);
                                    panel_go.add(chose_firm);
                                    panel_go.add(amazon);
                                    panel_go.add(ebay);
                                    panel_go.add(photo_l);
                                }
                            });
                        }
                        else{
                            frame1.setVisible(false);
                            doctor.setVisible(true);
                            Container doc = doctor.getContentPane();
                            panel_d.add(assistant);
                            panel_d.setLayout(null);
                            panel_d.setBackground(Color.darkGray);
                            panel_d.add(bt_s_1);
                            panel_d.add(bt_s_2);
                            panel_d.add(photo_l);
                            panel_d.add(schedule);
                            doc.add(panel_d);
                            bt_s_2.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    doctor.setVisible(false);
                                    frame2.setVisible(true);
                                    Container go = frame2.getContentPane();
                                    go.add(panel_go);
                                    panel_go.setLayout(null);
                                    panel_go.setBackground(Color.lightGray);
                                    d= new JLabel("Date  : ");
                                    d.setFont(new Font("TimesRoman", Font.CENTER_BASELINE, 16));
                                    d.setBounds(25,140,275,40);
                                    JTextField d_1;
                                    d_1= new JTextField();
                                    d_1.setBounds(120,150,120,20);
                                    d_1.setBackground(Color.white);
                                    panel_go.add(d);
                                    panel_go.add(d_1);
                                    String s = d_1.getText();
                                    panel_go.add(go_tomain);
                                    panel_go.add(photo_l);
                                    panel_go.add(remindor);
                                    go_tomain.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            frame2.setVisible(false);
                                            doctor.setVisible(true);
                                            panel_d.add(photo_l);
                                            panel_d.remove(bt_s_1);
                                            panel_d.remove(bt_s_2);
                                            panel_d.remove(schedule);
                                            panel_d.add(r_sent);
                                            panel_d.remove(remindor);
                                            panel_d.remove(assistant);
                                            remindor r = new remindor();
                                            r.send_details();
                                            panel_d.setBackground(Color.lightGray);

                                        }
                                    });

                                }
                            });
                            schedule.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    doctor.setVisible(false);
                                    schedule_f.setVisible(true);
                                    Container go = schedule_f.getContentPane();
                                    go.add(panel_go);
                                    panel_go.setLayout(null);
                                    panel_go.setBackground(Color.lightGray);
                                    final JLabel[] name = new JLabel[1];
                                    JLabel ID;
                                    JLabel Subject;
                                    JLabel Please_;
                                    JLabel time_a;
                                    Please_=new JLabel("   Enter details");
                                    Please_.setFont(new Font("Serif", Font.BOLD, 28));
                                    Please_.setBounds(60,40,275,40);
                                    panel_go.add(Please_);

                                    name[0] = new JLabel("Name : ");
                                    name[0].setFont(new Font("TimesRoman", Font.CENTER_BASELINE, 14));
                                    name[0].setBounds(25,110,275,40);
                                    panel_go.add(name[0]);

                                    ID= new JLabel("Date  : ");
                                    ID.setFont(new Font("TimesRoman", Font.CENTER_BASELINE, 14));
                                    ID.setBounds(25,140,275,40);
                                    panel_go.add(ID);


                                    Subject= new JLabel("type : ");
                                    Subject.setFont(new Font("TimesRoman", Font.CENTER_BASELINE, 14));
                                    Subject.setBounds(25,170,275,40);
                                    panel_go.add(Subject);

                                    time_a =  new JLabel("time : ");
                                    time_a.setFont(new Font("TimesRoman", Font.CENTER_BASELINE, 14));
                                    time_a.setBounds(25,200,275,40);
                                    panel_go.add(time_a);


                                    //text fields
                                    JTextField tf_n,tf_ID,tf_Subject,time_;
                                    tf_n= new JTextField();
                                    tf_n.setBounds(120,125,120,20);
                                    tf_n.setBackground(Color.white);
                                    panel_go.add(tf_n);

                                    tf_ID= new JTextField();
                                    tf_ID.setBounds(120,155,120,20);
                                    tf_ID.setBackground(Color.white);
                                    panel_go.add(tf_ID);


                                    tf_Subject= new JTextField();
                                    tf_Subject.setBounds(120,185,120,20);
                                    tf_Subject.setBackground(Color.white);
                                    panel_go.add(tf_Subject);

                                    time_= new JTextField();
                                    time_.setBounds(120,215,120,20);
                                    time_.setBackground(Color.black);
                                    panel_go.add(time_);

                                    JButton save_Exit = new JButton("Save ");
                                    save_Exit.setBackground(Color.ORANGE);
                                    save_Exit.setMaximumSize( new Dimension(50,30));
                                    save_Exit.setBounds(120,310,120,30);
                                    save_Exit.setFont(font_b);
                                    panel_go.add(save_Exit);
                                    panel_go.add(photo_l);
                                    Doctors_appointments fresh = new Doctors_appointments(tf_ID.getText(), tf_Subject.getText(), time_.getText());
                                    list_a.add(fresh);
                                    save_Exit.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            schedule_f.setVisible(false);
                                            d_w_hours.setVisible(true);
                                            Container d = d_w_hours.getContentPane();
                                            d.add(w_hours);
                                            w_hours.setLayout(null);
                                            w_hours.setBackground(Color.LIGHT_GRAY);
                                           w_hours.add(l_working);
                                           w_hours.add(photo_l);
                                           w_hours.add(appointment);
                                            w_hours.add(next);
                                            next.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    String appoint = tf_ID.getText();
                                                    if(!appoint.contains(".21"))
                                                    {
                                                        d_w_hours.setVisible(false);
                                                        frame_error.setVisible(true);
                                                        Container S = frame_error.getContentPane();
                                                        S.add(panel_error);
                                                        panel_error.setLayout(null);
                                                        panel_error.setBackground(Color.LIGHT_GRAY);
                                                        panel_error.add(goback);
                                                        panel_error.add(wrong_);
                                                        panel_error.add(photo_l);
                                                        goback.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent e) {
                                                                tf_Subject.setText("");
                                                                tf_ID.setText("");
                                                                tf_n.setText("");
                                                                time_.setText("");
                                                                frame_error.setVisible(false);
                                                                schedule_f.setVisible(true);
                                                            }


                                                        });
                                                        count++;
                                                    }
                                                        String timefrom =time_.getText();
                                                        String comp = "18:00";
                                                        String comp_1= "1800";
                                                     if(timefrom.equals(comp))
                                                     {
                                                    d_w_hours.setVisible(false);
                                                         Container S = frame_error.getContentPane();
                                                         S.add(panel_error);
                                                         panel_error.setLayout(null);
                                                         panel_error.setBackground(Color.LIGHT_GRAY);
                                                         panel_error.add(goback);
                                                         panel_error.add(dual);
                                                         panel_error.remove(wrong_);
                                                         panel_error.add(photo_l);
                                                    frame_error.setVisible(true);
                                                    count++;
                                                     }
                                                     if(timefrom.equals(comp_1)){
                                                         send_email_sms one = new send_email_sms(tf_n.getText(),tf_ID.getText(),time_.getText(),tf_Subject.getText());
                                                         one.send_details();
                                                         d_w_hours.setVisible(false);
                                                         panel_error.remove(dual);
                                                         panel_error.remove(wrong_);
                                                         panel_error.add(m_sent);
                                                         panel_error.add(photo_l);
                                                         Container m = m_send.getContentPane();
                                                         m.add(panel_error);
                                                         //m.add(go_tomain);
                                                         m_send.setVisible(true);
                                                         goback.addActionListener(new ActionListener() {
                                                             @Override
                                                             public void actionPerformed(ActionEvent e) {
                                                                 tf_Subject.setText("");
                                                                 tf_ID.setText("");
                                                                 tf_n.setText("");
                                                                 time_.setText("");
                                                                 frame_error.setVisible(false);
                                                                 doctor.setVisible(true);
                                                             }

                                                         });

                                                     }
                                                                                                    }
                                            });
/*
                                                schedule_f.setVisible(false);
                                                frame1.setVisible(true);
*/
                                        }
                                    });
                                }
                            });
                        }
                        tf_Subject.setText("");
                        tf_ID.setText("");
                        tf_n.setText("");
                       /* frame1.setVisible(false);
                        frame2.setVisible(true);
                        Container go = frame2.getContentPane();
                        go.add(panel_go);
                        panel_go.setLayout(null);
                        panel_go.setBackground(Color.darkGray);
                        panel_go.add(photo_l);

                        JButton start = new JButton( "Go !"  );
                        start.setBackground(Color.ORANGE);
                        start.setMaximumSize( new Dimension(50,30));
                        start.setBounds(120,270,120,30);
                        start.setFont(font_b);
                        panel_go.add(start);
                        start.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                    JButton save_Exit = new JButton("Save ");
                                    save_Exit.setBackground(Color.ORANGE);
                                    save_Exit.setMaximumSize( new Dimension(50,30));
                                    save_Exit.setBounds(120,20,120,30);
                                    save_Exit.setFont(font_b);
                                    panel_go.add(save_Exit);
                                    save_Exit.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            frame2.setVisible(false);
                                            frame3.setVisible(true);
                                            Container loop = frame3.getContentPane();
                                            JPanel loop_p = new JPanel();
                                            loop_p.setLayout(null);
                                            JLabel label1 = new JLabel();
                                            label1.setFont(new Font("Serif", Font.CENTER_BASELINE, 14));
                                            label1.setBounds(60,40,275,40);
                                            loop_p.add(label1);
                                            loop_p.setBackground(Color.LIGHT_GRAY);
                                            loop_p.add(photo_s);
                                            loop.add(loop_p);
                                        }
                                    });



                            }
                        });*/
                    }
                });
            }
        });

        Container container = frame.getContentPane();
        container.add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.add(Box.createRigidArea( new Dimension(0,20)));

        panel.add(label);
        panel.add(Box.createRigidArea( new Dimension(0,20)));
        panel.add(bt1);
        panel.add(Box.createRigidArea( new Dimension(0,5)));
        panel.add(bt2);
        panel.add(bt3);
        panel.add(Box.createRigidArea( new Dimension(0,100)));
       panel.add(photo_l);
        frame.setVisible(true);
        frame.add(panel);


        /*
        Container container = frame.getContentPane();
        container.add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.add(Box.createRigidArea( new Dimension(0,20)));
        panel.add(label);
        panel.add(Box.createRigidArea( new Dimension(0,20)));
        panel.add(bt1);
        panel.add(Box.createRigidArea( new Dimension(0,5)));
        panel.add(bt2);
        panel.add(bt3);
        panel.add(Box.createRigidArea( new Dimension(0,100)));
       panel.add(photo_l);
        frame.setVisible(true);
        frame.add(panel);
        Container container = frame.getContentPane();
        container.add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.add(Box.createRigidArea( new Dimension(0,20)));
        Container container = frame.getContentPane();
        container.add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.add(Box.createRigidArea( new Dimension(0,20)));
        panel.add(label);
        panel.add(Box.createRigidArea( new Dimension(0,20)));
        panel.add(bt1);
        panel.add(Box.createRigidArea( new Dimension(0,5)));
        panel.add(bt2);
        panel.add(bt3);
        panel.add(Box.createRigidArea( new Dimension(0,100)));
       panel.add(photo_l);
        frame.setVisible(true);
        frame.add(panel);
        panel.add(label);
        panel.add(Box.createRigidArea( new Dimension(0,20)));
        panel.add(bt1);
        panel.add(Box.createRigidArea( new Dimension(0,5)));
        panel.add(bt2);
        panel.add(bt3);
        panel.add(Box.createRigidArea( new Dimension(0,100)));
       panel.add(photo_l);
        frame.setVisible(true);
        frame.add(panel);
         */
    }
}