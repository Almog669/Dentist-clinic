import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class View extends JFrame{
    private JFrame frame,frame1,frame2,frame3,frame_error,doctor,schedule_f;
    private JLabel label,photo_l,photo_s,view_op_d,salaries,chose_firm,assistant;
    private JButton bt1,bt_s_start, bt2,bt3,bt_s_1,bt_s_2,amazon,ebay,schedule;
    private JPanel panel,panel_s,panel_go,panel_d;

    ImageIcon image_main,image_S,image_go;
    Image I_M,welcome_i_m,Image_s,Image_s2,image_g,image_g_2;
    Resultset rs;
    //image

    public void go(){

        //frame
        frame = new JFrame("Dentist Clinic");
        frame1 = new JFrame("Session");
        frame2= new JFrame("session");
        frame3 =new JFrame("session");
        schedule_f=new JFrame("schdule meeting");
        frame_error =new JFrame("Wrong details");
        doctor =new JFrame("doctor options");
        frame1.setSize(400,800);
        frame2.setSize(400,800);
        frame3.setSize(400,800);
        frame_error.setSize(400,800);
        doctor.setSize(400,800);

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


        //chose_firm
        chose_firm = new JLabel("    Chose firm ");
        chose_firm.setFont(new Font("Calibri", Font.CENTER_BASELINE, 32));
        chose_firm.setBounds(60,40,275,40);

        //salaries
        salaries = new JLabel("No Salaries yet");
        salaries.setFont(new Font("Calibri", Font.CENTER_BASELINE, 23));
        salaries.setBounds(60,40,275,40);

        //photo label
        image_main = new ImageIcon(getClass().getResource("logo_dentist.jpg"));
        I_M  = image_main.getImage();
        welcome_i_m = I_M.getScaledInstance(350, 225, java.awt.Image.SCALE_SMOOTH);
        image_main = new ImageIcon(welcome_i_m);
        photo_l = new JLabel(image_main);
        photo_l.setSize(300,300);
        photo_l.setBounds(15,340,350,350);
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
*/
        //panels
        panel=new JPanel();
        panel_s=new JPanel();
        panel_go=new JPanel();
        panel_d = new JPanel();

       schedule= new JButton("schedule meeting");
       amazon = new JButton("amazon");
       ebay = new JButton("ebay");
        bt1 = new JButton("Enter");
        bt2 = new JButton("Instructions");
        bt3= new JButton("Share");
        bt_s_start =new JButton("start");
        bt_s_1 =new JButton("View Salaries");
        bt_s_2 =new JButton("Buy aquiptment");
        //bt_s_1.setRolloverSelectedIcon(image_S);

        schedule.setBackground(Color.ORANGE);
        amazon.setBackground(Color.ORANGE);
        ebay.setBackground(Color.ORANGE);
        bt1.setBackground(Color.ORANGE);
        bt2.setBackground(Color.ORANGE);
        bt3.setBackground(Color.ORANGE);
        bt_s_1.setBackground(Color.ORANGE);
        bt_s_2.setBackground(Color.ORANGE);
        bt_s_start.setBackground(Color.ORANGE);
        bt1.setMaximumSize( new Dimension(120,30));
        bt2.setMaximumSize( new Dimension(120,30));
        bt3.setMaximumSize( new Dimension(120,30));
        bt_s_1.setMaximumSize( new Dimension(120,30));
        bt_s_2.setMaximumSize( new Dimension(120,30));
        bt1.setBounds(125,160,120,30);
        bt2.setBounds(125,200,120,30);
        bt3.setBounds(125,240,120,30);
        schedule.setBounds(125,370,120,40);
        bt_s_1.setBounds(125,250,120,40);
        bt_s_start.setBounds(125,250,120,40);
        bt_s_2.setBounds(125,310,120,40);
        amazon.setBounds(125,250,120,40);
        ebay.setBounds(125,310,120,40);
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
                            panel_d.setBackground(Color.DARK_GRAY);
                            panel_d.add(bt_s_1);
                            panel_d.add(bt_s_2);
                            panel_d.add(photo_l);
                            panel_d.add(schedule);
                            doc.add(panel_d);
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


                                    //text fields
                                    JTextField tf_n,tf_ID,tf_Subject;
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
                                    JButton save_Exit = new JButton("Save ");
                                    save_Exit.setBackground(Color.ORANGE);
                                    save_Exit.setMaximumSize( new Dimension(50,30));
                                    save_Exit.setBounds(120,310,120,30);
                                    save_Exit.setFont(font_b);
                                    panel_go.add(save_Exit);

                                    panel_go.add(photo_l);
                                    save_Exit.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            schedule_f.setVisible(false);
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
                                            JLabel label1 = new JLabel("Thank you for Using Pomodore App");
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
    }
}