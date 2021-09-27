

package quiz1;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import javax.swing.AbstractButton;
import java.awt.LayoutManager;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;

public class quiz implements ActionListener, KeyListener
{
    Font font;
    Font font1;
    JPanel panel;
    JButton login_button;
    JButton register_button;
    JTextField username_text;
    JPasswordField password_text;
    JLabel label_back1;
    JLabel label_heading;
    JLabel username_label;
    JLabel password_label;
    JFrame framequiz;
    JLabel label_top;
    JLabel label_choose;
    JLabel Label_ques;
    JLabel label_describe;
    JLabel Label_correct;
    JLabel Label_show;
    JLabel label_back;
    JLabel label_marks;
    JLabel label_alert;
    JLabel label_back12;
    JLabel label_back123;
    JLabel label_back41;
    JRadioButton opt1_btn;
    JRadioButton opt2_btn;
    JRadioButton opt3_btn;
    JRadioButton opt4_btn;
    ButtonGroup bg;
    JPanel opt_panel;
    JPanel dashboard_panel;
    JPanel mydetails_panel;
    JPanel result_panel;
    JButton btn_dashboard;
    JButton btn_mydetails;
    JButton btn_result;
    JButton btn_logout;
    JButton btn_start;
    JButton btn_submit;
    JButton btn_next;
    JButton btn_previous;
    JLabel firstname_label;
    JLabel lastname_label;
    JLabel age_label;
    JLabel address_label;
    JLabel username_label1;
    JLabel password_label1;
    JTextField firstname;
    JTextField lastname;
    JTextField age;
    JTextField address;
    JTextField username;
    JTextField password;
    JButton update;
    JButton save_btn;
    String[] ques;
    String[] opt1;
    String[] opt2;
    String[] opt3;
    String[] opt4;
    String[] ans;
    int change;
    int marks;
    int clicked;
    
    quiz() {
        font = new Font(null, 0, 30);
        font1 = new Font("Times New Roman", 1, 20);
        panel = new JPanel();
        login_button = new JButton("Login");
        register_button = new JButton("Click here to register for attempting the quiz");
        username_text = new JTextField();
        password_text = new JPasswordField();
        label_back1 = new JLabel();
        label_heading = new JLabel();
        username_label = new JLabel();
        password_label = new JLabel();
        framequiz = new JFrame();
        label_top = new JLabel();
        label_choose = new JLabel();
        Label_ques = new JLabel();
        label_describe = new JLabel();
        Label_correct = new JLabel();
        Label_show = new JLabel();
        label_back = new JLabel();
        label_marks = new JLabel();
        label_alert = new JLabel();
        label_back12 = new JLabel();
        label_back123 = new JLabel();
        label_back41 = new JLabel();
        opt1_btn = new JRadioButton();
        opt2_btn = new JRadioButton();
        opt3_btn = new JRadioButton();
        opt4_btn = new JRadioButton();
        bg = new ButtonGroup();
        opt_panel = new JPanel();
        dashboard_panel = new JPanel();
        mydetails_panel = new JPanel();
        result_panel = new JPanel();
        btn_dashboard = new JButton("Dashboard");
        btn_mydetails = new JButton("My Details");
        btn_result = new JButton(" My Results");
        btn_logout = new JButton("Log Out ");
        btn_start = new JButton("Start");
        btn_submit = new JButton("Submit");
        btn_next = new JButton("Next ");
        btn_previous = new JButton("Previous ");
        firstname_label = new JLabel();
        lastname_label = new JLabel();
        age_label = new JLabel();
        address_label = new JLabel();
        username_label1 = new JLabel();
        password_label1 = new JLabel();
        firstname = new JTextField();
        lastname = new JTextField();
        age = new JTextField();
        address = new JTextField();
        username = new JTextField();
        password = new JTextField();
        update = new JButton("Edit");
        save_btn = new JButton("Save");
        ques = new String[] { " 1. Which of the following is not a Java features?", " 2. The \\u0021 article referred to as a", "3. ____ is used to find and fix bugs in the Java programs.", "4. Which option is false about the  keyword?", "5. Which keyword is used for accessing the features of a package?", "6. Which of the following is false?", "7. In java, jar stands for_____.", "8. What is the initial quantity of the ArrayList list?", "9. The default value of a static integer variable of a class in Java is,", "10. Multiple inheritance means," };
        opt1 = new String[] { "a. Dynamic", "a. Unicode escape sequence", "a. JVM", "a. A  method cannot be overridden in its subclasses.", "a. package", "a. The rt.jar stands for the runtime jar", "a. Java Archive Runner", "a. 5", "a. 0", "a. one class inheriting from more super classes" };
        opt2 = new String[] { "b. Architecture Neutral", "Octal escape", "b. JRE", "b. A  class cannot be extended.", "b. import", "b. It is an optional jar file.", "b. Java Application Resource", "b. 10", "b. 1", "b. more classes inheriting from one super class" };
        opt3 = new String[] { "c. Use of pointers", "c. Hexadecimal", "c . JDK", "c. A  class cannot extend other classes.", "c. extends", "c. It contains all the compiled class files", "c. Java Application Runner", "c. 0", "c. Garbage value", "c. more classes inheriting from more super classes" };
        opt4 = new String[] { "d. Object-oriented", "d. Line feed", "d. JDB", "d. A  method can be inherited.", "d. export", "d. All the classes available in rt.jar is known to the JVM", "d. None of the above", "d. 100", "d. Null", "d. None of the above" };
        ans = new String[] { "c. Use of pointers", "a. Unicode escape sequence", "d. JDB", "c. A  class cannot extend other classes.", "b. import", "b. It is an optional jar file.", "d. None of the above", "b. 10", "a. 0", "a. one class inheriting from more super classes" };
        clicked = 0;
        firstname_label.setBounds(290, 70, 100, 50);
        firstname_label.setText("First Name:");
        firstname_label.setVisible(false);
        firstname_label.setForeground(Color.white);
        firstname.setBounds(370, 80, 200, 30);
        firstname.setVisible(false);
        firstname.setEditable(false);
        lastname_label.setBounds(290, 120, 100, 50);
        lastname_label.setText("Last Name:");
        lastname_label.setVisible(false);
        lastname_label.setForeground(Color.white);
        lastname.setBounds(370, 130, 200, 30);
        lastname.setEditable(false);
        lastname.setVisible(false);
        age_label.setBounds(290, 170, 100, 50);
        age_label.setText("Age:");
        age_label.setVisible(false);
        age_label.setForeground(Color.white);
        age.setBounds(370, 180, 200, 30);
        age.setEditable(false);
        age.setVisible(false);
        address_label.setBounds(290, 220, 100, 50);
        address_label.setText("Department :");
        address_label.setVisible(false);
        address_label.setForeground(Color.white);
        address.setBounds(370, 230, 200, 30);
        address.setEditable(false);
        address.setVisible(false);
        username_label1.setBounds(290, 270, 300, 50);
        username_label1.setText("Username  :");
        username_label1.setVisible(false);
        username_label1.setForeground(Color.white);
        username.setBounds(370, 280, 200, 30);
        username.setEditable(false);
        username.setVisible(false);
        password_label1.setBounds(290, 320, 300, 50);
        password_label1.setText("Password :");
        password_label1.setVisible(false);
        password_label1.setForeground(Color.white);
        password.setBounds(370, 330, 200, 30);
        password.setEditable(false);
        password.setVisible(false);
        update.setBounds(490, 380, 200, 30);
        update.addActionListener(this);
        update.setBorder(new EtchedBorder(10));
        update.setForeground(Color.blue);
        update.setBackground(Color.white);
        update.setVisible(false);
        save_btn.setBounds(350, 380, 100, 30);
        save_btn.addActionListener(this);
        save_btn.setFocusable(false);
        save_btn.setVisible(false);
        save_btn.setBorder(new EtchedBorder(10));
        save_btn.setForeground(Color.blue);
        save_btn.setBackground(Color.white);
        save_btn.addActionListener(this);
        label_heading.setText("WELCOME TO THE QUIZ SYSTEM");
        label_heading.setBounds(100, 5, 500, 200);
        label_heading.setFont(font);
        username_label.setBounds(230, 250, 300, 50);
        username_label.setText("Username :");
        username_label.setFont(font1);
        username_text.setBounds(200, 290, 200, 30);
        username_text.setVisible(true);
        username_text.setEditable(true);
        password_label.setBounds(230, 330, 300, 50);
        password_label.setText("Password :");
        password_label.setFont(font1);
        password_text.setBounds(200, 370, 200, 30);
        password_text.setVisible(true);
        password_text.setEditable(true);
        login_button.setBounds(240, 430, 100, 50);
        login_button.setFocusable(false);
        login_button.addActionListener(this);
        login_button.setVisible(true);
        login_button.setBorder(new EtchedBorder(10));
        login_button.setForeground(Color.black);
        login_button.setBackground(Color.white);
        login_button.setFont(font1);
        register_button.setBounds(180, 500, 400, 50);
        register_button.setFocusable(false);
        register_button.addActionListener(this);
        register_button.setBorder(new EtchedBorder(10));
        register_button.setForeground(Color.black);
        register_button.setBackground(Color.CYAN);
        register_button.setFont(font1);
         ImageIcon image12 = new ImageIcon("adminback1.jpg");
        label_back1.setIcon(image12);
        label_back1.setBounds(0, 0, 800, 800);
        panel.setBounds(0, 0, 800, 800);
        panel.setVisible(true);
        panel.add(username_text);
        panel.add(label_heading);
        panel.add(username_label);
        panel.add(password_label);
        panel.add(password_text);
        panel.add(login_button);
        panel.add(register_button);
        panel.add(label_back1);
        panel.setLayout(new BorderLayout());
        Label_ques.setText(ques[0]);
        Label_ques.setBounds(50, 50, 500, 30);
        Label_ques.setVisible(false);
        opt1_btn.setBounds(100, 120, 200, 30);
        opt1_btn.setText(opt1[0]);
        opt1_btn.setVisible(false);
        opt1_btn.addActionListener(this);
        opt2_btn.setBounds(350, 120, 200, 30);
        opt2_btn.setText(opt2[0]);
        opt2_btn.setVisible(false);
        opt2_btn.addActionListener(this);
        opt3_btn.setBounds(100, 200, 200, 30);
        opt3_btn.setText(opt3[0]);
        opt3_btn.setVisible(false);
        opt3_btn.addActionListener(this);
        opt4_btn.setBounds(350, 200, 200, 30);
        opt4_btn.setText(opt4[0]);
        opt4_btn.setVisible(false);
        opt4_btn.addActionListener(this);
        bg.add(opt1_btn);
        bg.add(opt2_btn);
        bg.add(opt3_btn);
        bg.add(opt4_btn);
        btn_submit.setBounds(250, 400, 100, 30);
        btn_submit.setVisible(false);
        btn_submit.addActionListener(this);
        btn_next.setBounds(400, 400, 100, 30);
        btn_next.setVisible(false);
        btn_next.addActionListener(this);
        btn_previous.setBounds(100, 400, 100, 30);
        btn_previous.setVisible(false);
        btn_previous.addActionListener(this);
        btn_previous.setEnabled(false);
        Label_correct.setBounds(150, 500, 500, 30);
        Label_correct.setVisible(false);
        Label_show.setBounds(150, 500, 700, 30);
        Label_show.setVisible(false);
        label_describe.setBounds(250, 250, 700, 100);
        label_describe.setText("Finished !! please press the result button to view your result");
        label_describe.setVisible(false);
        label_describe.setFont(new Font("Times New Roman", 1, 25));
        label_top.setForeground(Color.RED);
        label_top.setBackground(Color.WHITE);
        label_top.setFont(new Font("Consolas", 1, 35));
        label_top.setHorizontalAlignment(0);
        label_top.setBounds(204, 13, 862, 88);
        label_top.setText("Welcome");
        label_choose.setText(" Please Click on start button to start your quiz");
        label_choose.setBounds(250, 250, 700, 100);
        label_choose.setFont(new Font("Times New Roman", 1, 25));
        btn_dashboard.setBounds(20, 20, 200, 50);
        btn_dashboard.setFocusable(false);
        btn_dashboard.addActionListener(this);
        btn_dashboard.setVisible(true);
        btn_dashboard.setBorder(new EtchedBorder(5));
        btn_dashboard.setForeground(Color.black);
        btn_dashboard.setBackground(Color.white);
        btn_mydetails.setBounds(20, 80, 200, 50);
        btn_mydetails.setFocusable(false);
        btn_mydetails.addActionListener(this);
        btn_mydetails.setVisible(true);
        btn_mydetails.setBorder(new EtchedBorder(5));
        btn_mydetails.setForeground(Color.black);
        btn_mydetails.setBackground(Color.white);
        btn_result.setBounds(20, 140, 200, 50);
        btn_result.setFocusable(false);
        btn_result.addActionListener(this);
        btn_result.setVisible(true);
        btn_result.setBorder(new EtchedBorder(5));
        btn_result.setForeground(Color.black);
        btn_result.setBackground(Color.white);
        btn_logout.setBounds(20, 200, 200, 50);
        btn_logout.setFocusable(false);
        btn_logout.addActionListener(this);
        btn_logout.setVisible(true);
        btn_logout.setBorder(new EtchedBorder(5));
        btn_logout.setForeground(Color.black);
        btn_logout.setBackground(Color.white);
         ImageIcon image13 = new ImageIcon("back_opt.jpg");
        label_back41.setIcon(image13);
        label_back41.setBounds(0, 0, 250, 900);
        opt_panel.setBounds(0, 0, 250, 900);
        opt_panel.setBackground(Color.blue);
        opt_panel.add(btn_dashboard);
        opt_panel.add(btn_mydetails);
        opt_panel.add(btn_result);
        opt_panel.add(btn_logout);
        opt_panel.add(label_back41);
        opt_panel.setVisible(false);
        opt_panel.setLayout(new BorderLayout());
        btn_start.setBounds(600, 500, 200, 50);
        btn_start.setFocusable(false);
        btn_start.addActionListener(this);
        btn_start.setVisible(true);
        btn_start.setBorder(new EtchedBorder(5));
        btn_start.setForeground(Color.black);
        btn_start.setBackground(Color.white);
         ImageIcon image14 = new ImageIcon("back_das.png");
        label_back.setIcon(image14);
        label_back.setBounds(0, 0, 1000, 896);
        dashboard_panel.setBounds(0, 0, 1400, 900);
        dashboard_panel.setBackground(Color.white);
        dashboard_panel.setVisible(false);
        dashboard_panel.add(label_choose);
        dashboard_panel.add(label_top);
        dashboard_panel.add(btn_start);
        dashboard_panel.add(Label_ques);
        dashboard_panel.add(opt1_btn);
        dashboard_panel.add(opt2_btn);
        dashboard_panel.add(opt3_btn);
        dashboard_panel.add(opt4_btn);
        dashboard_panel.add(btn_submit);
        dashboard_panel.add(btn_next);
        dashboard_panel.add(Label_show);
        dashboard_panel.add(Label_correct);
        dashboard_panel.add(btn_previous);
        dashboard_panel.add(label_describe);
        dashboard_panel.add(label_back);
        dashboard_panel.setLayout(new BorderLayout());
        label_alert.setBounds(400, 0, 300, 50);
        label_alert.setFont(font);
        label_alert.setForeground(Color.red);
        label_marks.setBounds(500, 100, 500, 300);
        label_marks.setFont(new Font(null, 1, 100));
        label_marks.setForeground(Color.red);
         ImageIcon image15 = new ImageIcon("back_res.jpg");
        label_back123.setIcon(image15);
        label_back123.setBounds(0, 0, 1000, 896);
        result_panel.setBounds(0, 0, 1400, 900);
        result_panel.setBackground(Color.white);
        result_panel.setVisible(false);
        result_panel.add(label_alert);
        result_panel.add(label_marks);
        result_panel.add(label_back123);
        result_panel.setLayout(new BorderLayout());
         ImageIcon image16 = new ImageIcon("back_mydetails.jpg");
        label_back12.setIcon(image16);
        label_back12.setBounds(0, 0, 1000, 896);
        mydetails_panel.setBounds(0, 0, 1400, 900);
        mydetails_panel.setVisible(false);
        mydetails_panel.add(firstname_label);
        mydetails_panel.add(firstname);
        mydetails_panel.add(lastname_label);
        mydetails_panel.add(lastname);
        mydetails_panel.add(age_label);
        mydetails_panel.add(age);
        mydetails_panel.add(address_label);
        mydetails_panel.add(address);
        mydetails_panel.add(username_label1);
        mydetails_panel.add(username);
        mydetails_panel.add(password_label1);
        mydetails_panel.add(password);
        mydetails_panel.add(update);
        mydetails_panel.add(save_btn);
        mydetails_panel.add(label_back12);
        mydetails_panel.setLayout(new BorderLayout());
        framequiz.add(opt_panel);
        framequiz.add(dashboard_panel);
        framequiz.add(mydetails_panel);
        framequiz.add(result_panel);
        framequiz.add(panel);
        framequiz.setResizable(false);
        framequiz.setTitle("Quiz System");
        framequiz.setBounds(150, 0, 800, 800);
        framequiz.setDefaultCloseOperation(3);
        framequiz.setLayout(new BorderLayout());
        framequiz.setVisible(true);
    }
    
    public static void main( String[] args) {
        new quiz();
    }
    
    @Override
    public void actionPerformed( ActionEvent e) {
        if (e.getSource() == login_button) {
             String u_name = username_text.getText();
             String password = password_text.getText();
             String query = "Select * from register where username ='" + u_name + "' and password = '" + password + "'";
             dbOperation12 db = new dbOperation12();
             ResultSet rs = db.select(query);
            try {
                if (rs.next()) {
                    JOptionPane.showMessageDialog(framequiz, "login Successfull");
                    framequiz.setSize(1000, 896);
                    dashboard_panel.setVisible(true);
                    mydetails_panel.setVisible(true);
                    result_panel.setVisible(true);
                    opt_panel.setVisible(true);
                    username_text.setVisible(false);
                    password_text.setVisible(false);
                    login_button.setVisible(false);
                    register_button.setVisible(false);
                }
                else {
                    JOptionPane.showMessageDialog(framequiz, "incorrect username or password");
                }
            }
            catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        else if (e.getSource() == register_button) {
            new Register();
        }
        else if (e.getSource() == btn_dashboard) {
            label_choose.setText(" you have already given the quiz previously");
            dashboard_panel.setVisible(true);
            mydetails_panel.setVisible(false);
            result_panel.setVisible(false);
            label_choose.setVisible(true);
            label_top.setVisible(true);
            btn_start.setVisible(false);
            dashboard_panel.setVisible(true);
            mydetails_panel.setVisible(false);
            result_panel.setVisible(false);
            opt_panel.setVisible(true);
            Label_ques.setVisible(false);
            opt1_btn.setVisible(false);
            opt2_btn.setVisible(false);
            opt3_btn.setVisible(false);
            opt4_btn.setVisible(false);
            btn_submit.setVisible(false);
            Label_correct.setVisible(false);
            btn_next.setVisible(false);
            btn_previous.setVisible(false);
            label_describe.setVisible(false);
        }
        else if (e.getSource() == btn_mydetails) {
            dashboard_panel.setVisible(false);
            mydetails_panel.setVisible(true);
            result_panel.setVisible(false);
            firstname_label.setVisible(true);
            lastname_label.setVisible(true);
            age_label.setVisible(true);
            address_label.setVisible(true);
            username_label1.setVisible(true);
            password_label1.setVisible(true);
            firstname.setVisible(true);
            lastname.setVisible(true);
            age.setVisible(true);
            address.setVisible(true);
            username.setVisible(true);
            password.setVisible(true);
            update.setVisible(true);
           String username_user = username_text.getText();
             String query2 = "Select * from register where username ='" + username_user + "'";
            dbOperation12 db2 = new dbOperation12();
             ResultSet rs2 = db2.select(query2);
            try {
                while (rs2.next()) {
                    firstname.setText(rs2.getString("first_name"));
                    lastname.setText(rs2.getString("last_name"));
                    age.setText(rs2.getString("age"));
                    address.setText(rs2.getString("department"));
                    username.setText(rs2.getString("username"));
                    password.setText(rs2.getString("password"));
                }
            }
            catch (SQLException e3) {
                e3.printStackTrace();
            }
        }
        else if (e.getSource() == btn_result) {
            dashboard_panel.setVisible(false);
            mydetails_panel.setVisible(false);
            result_panel.setVisible(true);
        }
        else if (e.getSource() == btn_start) {
            dashboard_panel.setSize(1000, 896);
            label_choose.setVisible(false);
            label_top.setVisible(false);
            btn_start.setVisible(false);
            dashboard_panel.setVisible(true);
            mydetails_panel.setVisible(false);
            result_panel.setVisible(false);
            opt_panel.setVisible(false);
            Label_ques.setVisible(true);
            opt1_btn.setVisible(true);
            opt2_btn.setVisible(true);
            opt3_btn.setVisible(true);
            opt4_btn.setVisible(true);
            btn_submit.setVisible(true);
            Label_show.setVisible(true);
            Label_correct.setVisible(false);
            btn_next.setVisible(true);
            btn_previous.setVisible(true);
            marks = 0;
            Label_show.setText("NOTE :: Next and Previous Buttons are only for navigation they are not for submiting your answers");
            Label_show.setForeground(Color.red);
        }
        else if (e.getSource() == btn_submit) {
            Label_show.setVisible(false);
            String selected_opt = "";
            if (opt1_btn.isSelected()) {
                selected_opt = opt1_btn.getText();
            }
            if (opt2_btn.isSelected()) {
                selected_opt = opt2_btn.getText();
            }
            if (opt3_btn.isSelected()) {
                selected_opt = opt3_btn.getText();
            }
            else if (opt4_btn.isSelected()) {
                selected_opt = opt4_btn.getText();
            }
            if (selected_opt.equals(ans[change])) {
                JOptionPane.showMessageDialog(dashboard_panel, "Right answer");
                opt3_btn.setSelected(false);
                ++marks;
            }
            else {
                JOptionPane.showMessageDialog(dashboard_panel, "Wrong answer");
                btn_submit.setEnabled(false);
                Label_correct.setForeground(Color.blue);
                Label_correct.setVisible(true);
                Label_correct.setText("The correct answer is " + ans[change]);
            }
        }
        if (e.getSource() == btn_next) {
            Label_show.setVisible(false);
            ++change;
            if (change == 10) {
                btn_next.setVisible(false);
                label_describe.setVisible(true);
                System.out.println(marks);
                dashboard_panel.setSize(1400, 900);
                label_choose.setVisible(false);
                label_top.setVisible(false);
                btn_start.setVisible(false);
                dashboard_panel.setVisible(true);
                mydetails_panel.setVisible(true);
                result_panel.setVisible(true);
                opt_panel.setVisible(true);
                Label_ques.setVisible(false);
                opt1_btn.setVisible(false);
                opt2_btn.setVisible(false);
                opt3_btn.setVisible(false);
                opt4_btn.setVisible(false);
                btn_submit.setVisible(false);
                btn_previous.setVisible(false);
            }
            else {
                Label_correct.setText("");
                btn_submit.setEnabled(true);
                btn_previous.setEnabled(true);
                Label_ques.setText(ques[change]);
                opt1_btn.setText(opt1[change]);
                opt2_btn.setText(opt2[change]);
                opt3_btn.setText(opt3[change]);
                opt4_btn.setText(opt4[change]);
                if (change == 3) {
                    opt1_btn.setBounds(10, 120, 350, 30);
                    opt2_btn.setBounds(390, 120, 300, 30);
                    opt3_btn.setBounds(10, 200, 300, 30);
                    opt4_btn.setBounds(390, 200, 300, 30);
                }
                else if (change != 0) {
                    if (change == 9) {
                        opt1_btn.setBounds(10, 120, 350, 30);
                        opt2_btn.setBounds(390, 120, 300, 30);
                        opt3_btn.setBounds(10, 200, 300, 30);
                        opt4_btn.setBounds(390, 200, 300, 30);
                    }
                    else {
                        opt1_btn.setBounds(100, 120, 200, 30);
                        opt2_btn.setBounds(350, 120, 200, 30);
                        opt3_btn.setBounds(100, 200, 200, 30);
                        opt4_btn.setBounds(350, 200, 200, 30);
                    }
                }
            }
        }
        else if (e.getSource() == btn_previous) {
            --change;
            Label_ques.setText(ques[change]);
            opt1_btn.setText(opt1[change]);
            opt2_btn.setText(opt2[change]);
            opt3_btn.setText(opt3[change]);
            opt4_btn.setText(opt4[change]);
            if (change == 3) {
                opt1_btn.setBounds(10, 120, 350, 30);
                opt2_btn.setBounds(390, 120, 300, 30);
                opt3_btn.setBounds(10, 200, 300, 30);
                opt4_btn.setBounds(390, 200, 300, 30);
            }
            else if (change == 9) {
                opt1_btn.setBounds(10, 120, 350, 30);
                opt2_btn.setBounds(390, 120, 300, 30);
                opt3_btn.setBounds(10, 200, 300, 30);
                opt4_btn.setBounds(390, 200, 300, 30);
            }
            else if (change == 0) {
                btn_previous.setEnabled(false);
            }
            else {
                opt1_btn.setBounds(100, 120, 200, 30);
                opt2_btn.setBounds(350, 120, 200, 30);
                opt3_btn.setBounds(100, 200, 200, 30);
                opt4_btn.setBounds(350, 200, 200, 30);
            }
        }
        else if (e.getSource() == btn_logout) {
             int reply = JOptionPane.showConfirmDialog(dashboard_panel, "Do you want to logout", "Its sad to see you go", 0);
            if (reply == 0) {
                framequiz.setSize(800, 800);
                dashboard_panel.setVisible(false);
                mydetails_panel.setVisible(false);
                result_panel.setVisible(false);
                opt_panel.setVisible(false);
                username_text.setVisible(true);
                password_text.setVisible(true);
                login_button.setVisible(true);
                register_button.setVisible(true);
                username_text.setText("");
                password_text.setText("");
            }
        }
        else if (e.getSource() == btn_result) {
            String name = username_text.getText();
             String sql = "Select *  from register where username ='" + username_text.getText() + "'";
             dbOperation12 db3 = new dbOperation12();
             ResultSet rs3 = db3.select(sql);
            try {
                while (rs3.next()) {
                    name = rs3.getString("first_name");
                }
            }
            catch (SQLException e3) {
                e3.printStackTrace();
            }
            System.out.println(name);
             int result = marks;
             String query3 = "insert into result(name,marks) values('" + name + "','" + marks + "')";
             dbOperation12 db4 = new dbOperation12();
             int ans = db4.insert(query3);
            if (ans > 0) {
                if (result >= 4) {
                    JOptionPane.showMessageDialog(framequiz, "You have passed the quiz");
                }
                else {
                    JOptionPane.showMessageDialog(framequiz, "You have failed the quiz");
                }
            }
             String query4 = "select * from result where name = '" + name + "' ";
             dbOperation12 db5 = new dbOperation12();
             ResultSet rs4 = db5.select(query4);
            try {
                while (rs4.next()) {
                    label_alert.setText("Dear " + name + "," + " your marks is ");
                    label_marks.setText(rs4.getString("marks"));
                }
            }
            catch (SQLException e4) {
                e4.printStackTrace();
            }
        }
        else if (e.getSource() == update) {
            save_btn.setVisible(true);
            firstname.setEditable(true);
            lastname.setEditable(true);
            age.setEditable(true);
            address.setEditable(true);
        }
        else if (e.getSource() == save_btn) {
            ++clicked;
            if (clicked == 1) {
                 String firstName = firstname.getText();
                 String lastName = lastname.getText();
                 int Age = Integer.parseInt(age.getText());
                age.setText(Integer.toString(Age));
                 String Address = address.getText();
                 String sql2 = "update register set first_name ='" + firstName + "',last_name='" + lastName + "',age='" + Age + "',department='" + Address + "'";
                 dbOperation12 db6 = new dbOperation12();
                 int ans2 = db6.update(sql2);
                if (ans2 != 0) {
                    JOptionPane.showMessageDialog(mydetails_panel, "Data Updated Successfully");
                }
            }
        }
    }
    
    @Override
    public void keyTyped( KeyEvent e) {
    }
    
    @Override
    public void keyPressed( KeyEvent e) {
    }
    
    @Override
    public void keyReleased( KeyEvent e) {
    }
}
