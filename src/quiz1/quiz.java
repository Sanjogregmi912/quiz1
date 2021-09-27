

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
        this.font = new Font(null, 0, 30);
        this.font1 = new Font("Times New Roman", 1, 20);
        this.panel = new JPanel();
        this.login_button = new JButton("Login");
        this.register_button = new JButton("Click here to register for attempting the quiz");
        this.username_text = new JTextField();
        this.password_text = new JPasswordField();
        this.label_back1 = new JLabel();
        this.label_heading = new JLabel();
        this.username_label = new JLabel();
        this.password_label = new JLabel();
        this.framequiz = new JFrame();
        this.label_top = new JLabel();
        this.label_choose = new JLabel();
        this.Label_ques = new JLabel();
        this.label_describe = new JLabel();
        this.Label_correct = new JLabel();
        this.Label_show = new JLabel();
        this.label_back = new JLabel();
        this.label_marks = new JLabel();
        this.label_alert = new JLabel();
        this.label_back12 = new JLabel();
        this.label_back123 = new JLabel();
        this.label_back41 = new JLabel();
        this.opt1_btn = new JRadioButton();
        this.opt2_btn = new JRadioButton();
        this.opt3_btn = new JRadioButton();
        this.opt4_btn = new JRadioButton();
        this.bg = new ButtonGroup();
        this.opt_panel = new JPanel();
        this.dashboard_panel = new JPanel();
        this.mydetails_panel = new JPanel();
        this.result_panel = new JPanel();
        this.btn_dashboard = new JButton("Dashboard");
        this.btn_mydetails = new JButton("My Details");
        this.btn_result = new JButton(" My Results");
        this.btn_logout = new JButton("Log Out ");
        this.btn_start = new JButton("Start");
        this.btn_submit = new JButton("Submit");
        this.btn_next = new JButton("Next ");
        this.btn_previous = new JButton("Previous ");
        this.firstname_label = new JLabel();
        this.lastname_label = new JLabel();
        this.age_label = new JLabel();
        this.address_label = new JLabel();
        this.username_label1 = new JLabel();
        this.password_label1 = new JLabel();
        this.firstname = new JTextField();
        this.lastname = new JTextField();
        this.age = new JTextField();
        this.address = new JTextField();
        this.username = new JTextField();
        this.password = new JTextField();
        this.update = new JButton("Edit");
        this.save_btn = new JButton("Save");
        this.ques = new String[] { " 1. Which of the following is not a Java features?", " 2. The \\u0021 article referred to as a", "3. ____ is used to find and fix bugs in the Java programs.", "4. Which option is false about the final keyword?", "5. Which keyword is used for accessing the features of a package?", "6. Which of the following is false?", "7. In java, jar stands for_____.", "8. What is the initial quantity of the ArrayList list?", "9. The default value of a static integer variable of a class in Java is,", "10. Multiple inheritance means," };
        this.opt1 = new String[] { "a. Dynamic", "a. Unicode escape sequence", "a. JVM", "a. A final method cannot be overridden in its subclasses.", "a. package", "a. The rt.jar stands for the runtime jar", "a. Java Archive Runner", "a. 5", "a. 0", "a. one class inheriting from more super classes" };
        this.opt2 = new String[] { "b. Architecture Neutral", "Octal escape", "b. JRE", "b. A final class cannot be extended.", "b. import", "b. It is an optional jar file.", "b. Java Application Resource", "b. 10", "b. 1", "b. more classes inheriting from one super class" };
        this.opt3 = new String[] { "c. Use of pointers", "c. Hexadecimal", "c . JDK", "c. A final class cannot extend other classes.", "c. extends", "c. It contains all the compiled class files", "c. Java Application Runner", "c. 0", "c. Garbage value", "c. more classes inheriting from more super classes" };
        this.opt4 = new String[] { "d. Object-oriented", "d. Line feed", "d. JDB", "d. A final method can be inherited.", "d. export", "d. All the classes available in rt.jar is known to the JVM", "d. None of the above", "d. 100", "d. Null", "d. None of the above" };
        this.ans = new String[] { "c. Use of pointers", "a. Unicode escape sequence", "d. JDB", "c. A final class cannot extend other classes.", "b. import", "b. It is an optional jar file.", "d. None of the above", "b. 10", "a. 0", "a. one class inheriting from more super classes" };
        this.clicked = 0;
        this.firstname_label.setBounds(290, 70, 100, 50);
        this.firstname_label.setText("First Name:");
        this.firstname_label.setVisible(false);
        this.firstname_label.setForeground(Color.white);
        this.firstname.setBounds(370, 80, 200, 30);
        this.firstname.setVisible(false);
        this.firstname.setEditable(false);
        this.lastname_label.setBounds(290, 120, 100, 50);
        this.lastname_label.setText("Last Name:");
        this.lastname_label.setVisible(false);
        this.lastname_label.setForeground(Color.white);
        this.lastname.setBounds(370, 130, 200, 30);
        this.lastname.setEditable(false);
        this.lastname.setVisible(false);
        this.age_label.setBounds(290, 170, 100, 50);
        this.age_label.setText("Age:");
        this.age_label.setVisible(false);
        this.age_label.setForeground(Color.white);
        this.age.setBounds(370, 180, 200, 30);
        this.age.setEditable(false);
        this.age.setVisible(false);
        this.address_label.setBounds(290, 220, 100, 50);
        this.address_label.setText("Department :");
        this.address_label.setVisible(false);
        this.address_label.setForeground(Color.white);
        this.address.setBounds(370, 230, 200, 30);
        this.address.setEditable(false);
        this.address.setVisible(false);
        this.username_label1.setBounds(290, 270, 300, 50);
        this.username_label1.setText("Username  :");
        this.username_label1.setVisible(false);
        this.username_label1.setForeground(Color.white);
        this.username.setBounds(370, 280, 200, 30);
        this.username.setEditable(false);
        this.username.setVisible(false);
        this.password_label1.setBounds(290, 320, 300, 50);
        this.password_label1.setText("Password :");
        this.password_label1.setVisible(false);
        this.password_label1.setForeground(Color.white);
        this.password.setBounds(370, 330, 200, 30);
        this.password.setEditable(false);
        this.password.setVisible(false);
        this.update.setBounds(490, 380, 200, 30);
        this.update.addActionListener(this);
        this.update.setBorder(new EtchedBorder(10));
        this.update.setForeground(Color.blue);
        this.update.setBackground(Color.white);
        this.update.setVisible(false);
        this.save_btn.setBounds(350, 380, 100, 30);
        this.save_btn.addActionListener(this);
        this.save_btn.setFocusable(false);
        this.save_btn.setVisible(false);
        this.save_btn.setBorder(new EtchedBorder(10));
        this.save_btn.setForeground(Color.blue);
        this.save_btn.setBackground(Color.white);
        this.save_btn.addActionListener(this);
        this.label_heading.setText("WELCOME TO THE QUIZ SYSTEM");
        this.label_heading.setBounds(100, 5, 500, 200);
        this.label_heading.setFont(this.font);
        this.username_label.setBounds(230, 250, 300, 50);
        this.username_label.setText("Username :");
        this.username_label.setFont(this.font1);
        this.username_text.setBounds(200, 290, 200, 30);
        this.username_text.setVisible(true);
        this.username_text.setEditable(true);
        this.password_label.setBounds(230, 330, 300, 50);
        this.password_label.setText("Password :");
        this.password_label.setFont(this.font1);
        this.password_text.setBounds(200, 370, 200, 30);
        this.password_text.setVisible(true);
        this.password_text.setEditable(true);
        this.login_button.setBounds(240, 430, 100, 50);
        this.login_button.setFocusable(false);
        this.login_button.addActionListener(this);
        this.login_button.setVisible(true);
        this.login_button.setBorder(new EtchedBorder(10));
        this.login_button.setForeground(Color.black);
        this.login_button.setBackground(Color.white);
        this.login_button.setFont(this.font1);
        this.register_button.setBounds(180, 500, 400, 50);
        this.register_button.setFocusable(false);
        this.register_button.addActionListener(this);
        this.register_button.setBorder(new EtchedBorder(10));
        this.register_button.setForeground(Color.black);
        this.register_button.setBackground(Color.CYAN);
        this.register_button.setFont(this.font1);
        final ImageIcon image12 = new ImageIcon("adminback1.jpg");
        this.label_back1.setIcon(image12);
        this.label_back1.setBounds(0, 0, 800, 800);
        this.panel.setBounds(0, 0, 800, 800);
        this.panel.setVisible(true);
        this.panel.add(this.username_text);
        this.panel.add(this.label_heading);
        this.panel.add(this.username_label);
        this.panel.add(this.password_label);
        this.panel.add(this.password_text);
        this.panel.add(this.login_button);
        this.panel.add(this.register_button);
        this.panel.add(this.label_back1);
        this.panel.setLayout(new BorderLayout());
        this.Label_ques.setText(this.ques[0]);
        this.Label_ques.setBounds(50, 50, 500, 30);
        this.Label_ques.setVisible(false);
        this.opt1_btn.setBounds(100, 120, 200, 30);
        this.opt1_btn.setText(this.opt1[0]);
        this.opt1_btn.setVisible(false);
        this.opt1_btn.addActionListener(this);
        this.opt2_btn.setBounds(350, 120, 200, 30);
        this.opt2_btn.setText(this.opt2[0]);
        this.opt2_btn.setVisible(false);
        this.opt2_btn.addActionListener(this);
        this.opt3_btn.setBounds(100, 200, 200, 30);
        this.opt3_btn.setText(this.opt3[0]);
        this.opt3_btn.setVisible(false);
        this.opt3_btn.addActionListener(this);
        this.opt4_btn.setBounds(350, 200, 200, 30);
        this.opt4_btn.setText(this.opt4[0]);
        this.opt4_btn.setVisible(false);
        this.opt4_btn.addActionListener(this);
        this.bg.add(this.opt1_btn);
        this.bg.add(this.opt2_btn);
        this.bg.add(this.opt3_btn);
        this.bg.add(this.opt4_btn);
        this.btn_submit.setBounds(250, 400, 100, 30);
        this.btn_submit.setVisible(false);
        this.btn_submit.addActionListener(this);
        this.btn_next.setBounds(400, 400, 100, 30);
        this.btn_next.setVisible(false);
        this.btn_next.addActionListener(this);
        this.btn_previous.setBounds(100, 400, 100, 30);
        this.btn_previous.setVisible(false);
        this.btn_previous.addActionListener(this);
        this.btn_previous.setEnabled(false);
        this.Label_correct.setBounds(150, 500, 500, 30);
        this.Label_correct.setVisible(false);
        this.Label_show.setBounds(150, 500, 700, 30);
        this.Label_show.setVisible(false);
        this.label_describe.setBounds(250, 250, 700, 100);
        this.label_describe.setText("Finished !! please press the result button to view your result");
        this.label_describe.setVisible(false);
        this.label_describe.setFont(new Font("Times New Roman", 1, 25));
        this.label_top.setForeground(Color.RED);
        this.label_top.setBackground(Color.WHITE);
        this.label_top.setFont(new Font("Consolas", 1, 35));
        this.label_top.setHorizontalAlignment(0);
        this.label_top.setBounds(204, 13, 862, 88);
        this.label_top.setText("Welcome");
        this.label_choose.setText(" Please Click on start button to start your quiz");
        this.label_choose.setBounds(250, 250, 700, 100);
        this.label_choose.setFont(new Font("Times New Roman", 1, 25));
        this.btn_dashboard.setBounds(20, 20, 200, 50);
        this.btn_dashboard.setFocusable(false);
        this.btn_dashboard.addActionListener(this);
        this.btn_dashboard.setVisible(true);
        this.btn_dashboard.setBorder(new EtchedBorder(5));
        this.btn_dashboard.setForeground(Color.black);
        this.btn_dashboard.setBackground(Color.white);
        this.btn_mydetails.setBounds(20, 80, 200, 50);
        this.btn_mydetails.setFocusable(false);
        this.btn_mydetails.addActionListener(this);
        this.btn_mydetails.setVisible(true);
        this.btn_mydetails.setBorder(new EtchedBorder(5));
        this.btn_mydetails.setForeground(Color.black);
        this.btn_mydetails.setBackground(Color.white);
        this.btn_result.setBounds(20, 140, 200, 50);
        this.btn_result.setFocusable(false);
        this.btn_result.addActionListener(this);
        this.btn_result.setVisible(true);
        this.btn_result.setBorder(new EtchedBorder(5));
        this.btn_result.setForeground(Color.black);
        this.btn_result.setBackground(Color.white);
        this.btn_logout.setBounds(20, 200, 200, 50);
        this.btn_logout.setFocusable(false);
        this.btn_logout.addActionListener(this);
        this.btn_logout.setVisible(true);
        this.btn_logout.setBorder(new EtchedBorder(5));
        this.btn_logout.setForeground(Color.black);
        this.btn_logout.setBackground(Color.white);
        final ImageIcon image13 = new ImageIcon("back_opt.jpg");
        this.label_back41.setIcon(image13);
        this.label_back41.setBounds(0, 0, 250, 900);
        this.opt_panel.setBounds(0, 0, 250, 900);
        this.opt_panel.setBackground(Color.blue);
        this.opt_panel.add(this.btn_dashboard);
        this.opt_panel.add(this.btn_mydetails);
        this.opt_panel.add(this.btn_result);
        this.opt_panel.add(this.btn_logout);
        this.opt_panel.add(this.label_back41);
        this.opt_panel.setVisible(false);
        this.opt_panel.setLayout(new BorderLayout());
        this.btn_start.setBounds(600, 500, 200, 50);
        this.btn_start.setFocusable(false);
        this.btn_start.addActionListener(this);
        this.btn_start.setVisible(true);
        this.btn_start.setBorder(new EtchedBorder(5));
        this.btn_start.setForeground(Color.black);
        this.btn_start.setBackground(Color.white);
        final ImageIcon image14 = new ImageIcon("back_das.png");
        this.label_back.setIcon(image14);
        this.label_back.setBounds(0, 0, 1000, 896);
        this.dashboard_panel.setBounds(0, 0, 1400, 900);
        this.dashboard_panel.setBackground(Color.white);
        this.dashboard_panel.setVisible(false);
        this.dashboard_panel.add(this.label_choose);
        this.dashboard_panel.add(this.label_top);
        this.dashboard_panel.add(this.btn_start);
        this.dashboard_panel.add(this.Label_ques);
        this.dashboard_panel.add(this.opt1_btn);
        this.dashboard_panel.add(this.opt2_btn);
        this.dashboard_panel.add(this.opt3_btn);
        this.dashboard_panel.add(this.opt4_btn);
        this.dashboard_panel.add(this.btn_submit);
        this.dashboard_panel.add(this.btn_next);
        this.dashboard_panel.add(this.Label_show);
        this.dashboard_panel.add(this.Label_correct);
        this.dashboard_panel.add(this.btn_previous);
        this.dashboard_panel.add(this.label_describe);
        this.dashboard_panel.add(this.label_back);
        this.dashboard_panel.setLayout(new BorderLayout());
        this.label_alert.setBounds(400, 0, 300, 50);
        this.label_alert.setFont(this.font);
        this.label_alert.setForeground(Color.red);
        this.label_marks.setBounds(500, 100, 500, 300);
        this.label_marks.setFont(new Font(null, 1, 100));
        this.label_marks.setForeground(Color.red);
        final ImageIcon image15 = new ImageIcon("back_res.jpg");
        this.label_back123.setIcon(image15);
        this.label_back123.setBounds(0, 0, 1000, 896);
        this.result_panel.setBounds(0, 0, 1400, 900);
        this.result_panel.setBackground(Color.white);
        this.result_panel.setVisible(false);
        this.result_panel.add(this.label_alert);
        this.result_panel.add(this.label_marks);
        this.result_panel.add(this.label_back123);
        this.result_panel.setLayout(new BorderLayout());
        final ImageIcon image16 = new ImageIcon("back_mydetails.jpg");
        this.label_back12.setIcon(image16);
        this.label_back12.setBounds(0, 0, 1000, 896);
        this.mydetails_panel.setBounds(0, 0, 1400, 900);
        this.mydetails_panel.setVisible(false);
        this.mydetails_panel.add(this.firstname_label);
        this.mydetails_panel.add(this.firstname);
        this.mydetails_panel.add(this.lastname_label);
        this.mydetails_panel.add(this.lastname);
        this.mydetails_panel.add(this.age_label);
        this.mydetails_panel.add(this.age);
        this.mydetails_panel.add(this.address_label);
        this.mydetails_panel.add(this.address);
        this.mydetails_panel.add(this.username_label1);
        this.mydetails_panel.add(this.username);
        this.mydetails_panel.add(this.password_label1);
        this.mydetails_panel.add(this.password);
        this.mydetails_panel.add(this.update);
        this.mydetails_panel.add(this.save_btn);
        this.mydetails_panel.add(this.label_back12);
        this.mydetails_panel.setLayout(new BorderLayout());
        this.framequiz.add(this.opt_panel);
        this.framequiz.add(this.dashboard_panel);
        this.framequiz.add(this.mydetails_panel);
        this.framequiz.add(this.result_panel);
        this.framequiz.add(this.panel);
        this.framequiz.setResizable(false);
        this.framequiz.setTitle("Quiz System");
        this.framequiz.setBounds(150, 0, 800, 800);
        this.framequiz.setDefaultCloseOperation(3);
        this.framequiz.setLayout(new BorderLayout());
        this.framequiz.setVisible(true);
    }
    
    public static void main(final String[] args) {
        new quiz();
    }
    
    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == this.login_button) {
            final String u_name = this.username_text.getText();
            final String password = this.password_text.getText();
            final String query = "Select * from register where username ='" + u_name + "' and password = '" + password + "'";
            final dbOperation1 db = new dbOperation1();
            final ResultSet rs = db.select(query);
            try {
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this.framequiz, "login Successfull");
                    this.framequiz.setSize(1000, 896);
                    this.dashboard_panel.setVisible(true);
                    this.mydetails_panel.setVisible(true);
                    this.result_panel.setVisible(true);
                    this.opt_panel.setVisible(true);
                    this.username_text.setVisible(false);
                    this.password_text.setVisible(false);
                    this.login_button.setVisible(false);
                    this.register_button.setVisible(false);
                }
                else {
                    JOptionPane.showMessageDialog(this.framequiz, "incorrect username or password");
                }
            }
            catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        else if (e.getSource() == this.register_button) {
            new Register();
        }
        else if (e.getSource() == this.btn_dashboard) {
            this.label_choose.setText(" you have already given the quiz previously");
            this.dashboard_panel.setVisible(true);
            this.mydetails_panel.setVisible(false);
            this.result_panel.setVisible(false);
            this.label_choose.setVisible(true);
            this.label_top.setVisible(true);
            this.btn_start.setVisible(false);
            this.dashboard_panel.setVisible(true);
            this.mydetails_panel.setVisible(false);
            this.result_panel.setVisible(false);
            this.opt_panel.setVisible(true);
            this.Label_ques.setVisible(false);
            this.opt1_btn.setVisible(false);
            this.opt2_btn.setVisible(false);
            this.opt3_btn.setVisible(false);
            this.opt4_btn.setVisible(false);
            this.btn_submit.setVisible(false);
            this.Label_correct.setVisible(false);
            this.btn_next.setVisible(false);
            this.btn_previous.setVisible(false);
            this.label_describe.setVisible(false);
        }
        else if (e.getSource() == this.btn_mydetails) {
            this.dashboard_panel.setVisible(false);
            this.mydetails_panel.setVisible(true);
            this.result_panel.setVisible(false);
            this.firstname_label.setVisible(true);
            this.lastname_label.setVisible(true);
            this.age_label.setVisible(true);
            this.address_label.setVisible(true);
            this.username_label1.setVisible(true);
            this.password_label1.setVisible(true);
            this.firstname.setVisible(true);
            this.lastname.setVisible(true);
            this.age.setVisible(true);
            this.address.setVisible(true);
            this.username.setVisible(true);
            this.password.setVisible(true);
            this.update.setVisible(true);
            final String username_user = this.username_text.getText();
            final String query2 = "Select * from register where username ='" + username_user + "'";
            final dbOperation1 db2 = new dbOperation1();
            final ResultSet rs2 = db2.select(query2);
            try {
                while (rs2.next()) {
                    this.firstname.setText(rs2.getString("first_name"));
                    this.lastname.setText(rs2.getString("last_name"));
                    this.age.setText(rs2.getString("age"));
                    this.address.setText(rs2.getString("department"));
                    this.username.setText(rs2.getString("username"));
                    this.password.setText(rs2.getString("password"));
                }
            }
            catch (SQLException e3) {
                e3.printStackTrace();
            }
        }
        else if (e.getSource() == this.btn_result) {
            this.dashboard_panel.setVisible(false);
            this.mydetails_panel.setVisible(false);
            this.result_panel.setVisible(true);
        }
        else if (e.getSource() == this.btn_start) {
            this.dashboard_panel.setSize(1000, 896);
            this.label_choose.setVisible(false);
            this.label_top.setVisible(false);
            this.btn_start.setVisible(false);
            this.dashboard_panel.setVisible(true);
            this.mydetails_panel.setVisible(false);
            this.result_panel.setVisible(false);
            this.opt_panel.setVisible(false);
            this.Label_ques.setVisible(true);
            this.opt1_btn.setVisible(true);
            this.opt2_btn.setVisible(true);
            this.opt3_btn.setVisible(true);
            this.opt4_btn.setVisible(true);
            this.btn_submit.setVisible(true);
            this.Label_show.setVisible(true);
            this.Label_correct.setVisible(false);
            this.btn_next.setVisible(true);
            this.btn_previous.setVisible(true);
            this.marks = 0;
            this.Label_show.setText("NOTE :: Next and Previous Buttons are only for navigation they are not for submiting your answers");
            this.Label_show.setForeground(Color.red);
        }
        else if (e.getSource() == this.btn_submit) {
            this.Label_show.setVisible(false);
            String selected_opt = "";
            if (this.opt1_btn.isSelected()) {
                selected_opt = this.opt1_btn.getText();
            }
            if (this.opt2_btn.isSelected()) {
                selected_opt = this.opt2_btn.getText();
            }
            if (this.opt3_btn.isSelected()) {
                selected_opt = this.opt3_btn.getText();
            }
            else if (this.opt4_btn.isSelected()) {
                selected_opt = this.opt4_btn.getText();
            }
            if (selected_opt.equals(this.ans[this.change])) {
                JOptionPane.showMessageDialog(this.dashboard_panel, "Right answer");
                this.opt3_btn.setSelected(false);
                ++this.marks;
            }
            else {
                JOptionPane.showMessageDialog(this.dashboard_panel, "Wrong answer");
                this.btn_submit.setEnabled(false);
                this.Label_correct.setForeground(Color.blue);
                this.Label_correct.setVisible(true);
                this.Label_correct.setText("The correct answer is " + this.ans[this.change]);
            }
        }
        if (e.getSource() == this.btn_next) {
            this.Label_show.setVisible(false);
            ++this.change;
            if (this.change == 10) {
                this.btn_next.setVisible(false);
                this.label_describe.setVisible(true);
                System.out.println(this.marks);
                this.dashboard_panel.setSize(1400, 900);
                this.label_choose.setVisible(false);
                this.label_top.setVisible(false);
                this.btn_start.setVisible(false);
                this.dashboard_panel.setVisible(true);
                this.mydetails_panel.setVisible(true);
                this.result_panel.setVisible(true);
                this.opt_panel.setVisible(true);
                this.Label_ques.setVisible(false);
                this.opt1_btn.setVisible(false);
                this.opt2_btn.setVisible(false);
                this.opt3_btn.setVisible(false);
                this.opt4_btn.setVisible(false);
                this.btn_submit.setVisible(false);
                this.btn_previous.setVisible(false);
            }
            else {
                this.Label_correct.setText("");
                this.btn_submit.setEnabled(true);
                this.btn_previous.setEnabled(true);
                this.Label_ques.setText(this.ques[this.change]);
                this.opt1_btn.setText(this.opt1[this.change]);
                this.opt2_btn.setText(this.opt2[this.change]);
                this.opt3_btn.setText(this.opt3[this.change]);
                this.opt4_btn.setText(this.opt4[this.change]);
                if (this.change == 3) {
                    this.opt1_btn.setBounds(10, 120, 350, 30);
                    this.opt2_btn.setBounds(390, 120, 300, 30);
                    this.opt3_btn.setBounds(10, 200, 300, 30);
                    this.opt4_btn.setBounds(390, 200, 300, 30);
                }
                else if (this.change != 0) {
                    if (this.change == 9) {
                        this.opt1_btn.setBounds(10, 120, 350, 30);
                        this.opt2_btn.setBounds(390, 120, 300, 30);
                        this.opt3_btn.setBounds(10, 200, 300, 30);
                        this.opt4_btn.setBounds(390, 200, 300, 30);
                    }
                    else {
                        this.opt1_btn.setBounds(100, 120, 200, 30);
                        this.opt2_btn.setBounds(350, 120, 200, 30);
                        this.opt3_btn.setBounds(100, 200, 200, 30);
                        this.opt4_btn.setBounds(350, 200, 200, 30);
                    }
                }
            }
        }
        else if (e.getSource() == this.btn_previous) {
            --this.change;
            this.Label_ques.setText(this.ques[this.change]);
            this.opt1_btn.setText(this.opt1[this.change]);
            this.opt2_btn.setText(this.opt2[this.change]);
            this.opt3_btn.setText(this.opt3[this.change]);
            this.opt4_btn.setText(this.opt4[this.change]);
            if (this.change == 3) {
                this.opt1_btn.setBounds(10, 120, 350, 30);
                this.opt2_btn.setBounds(390, 120, 300, 30);
                this.opt3_btn.setBounds(10, 200, 300, 30);
                this.opt4_btn.setBounds(390, 200, 300, 30);
            }
            else if (this.change == 9) {
                this.opt1_btn.setBounds(10, 120, 350, 30);
                this.opt2_btn.setBounds(390, 120, 300, 30);
                this.opt3_btn.setBounds(10, 200, 300, 30);
                this.opt4_btn.setBounds(390, 200, 300, 30);
            }
            else if (this.change == 0) {
                this.btn_previous.setEnabled(false);
            }
            else {
                this.opt1_btn.setBounds(100, 120, 200, 30);
                this.opt2_btn.setBounds(350, 120, 200, 30);
                this.opt3_btn.setBounds(100, 200, 200, 30);
                this.opt4_btn.setBounds(350, 200, 200, 30);
            }
        }
        else if (e.getSource() == this.btn_logout) {
            final int reply = JOptionPane.showConfirmDialog(this.dashboard_panel, "Do you want to logout", "Its sad to see you go", 0);
            if (reply == 0) {
                this.framequiz.setSize(800, 800);
                this.dashboard_panel.setVisible(false);
                this.mydetails_panel.setVisible(false);
                this.result_panel.setVisible(false);
                this.opt_panel.setVisible(false);
                this.username_text.setVisible(true);
                this.password_text.setVisible(true);
                this.login_button.setVisible(true);
                this.register_button.setVisible(true);
                this.username_text.setText("");
                this.password_text.setText("");
            }
        }
        else if (e.getSource() == this.btn_result) {
            String name = this.username_text.getText();
            final String sql = "Select *  from register where username ='" + this.username_text.getText() + "'";
            final dbOperation1 db3 = new dbOperation1();
            final ResultSet rs3 = db3.select(sql);
            try {
                while (rs3.next()) {
                    name = rs3.getString("first_name");
                }
            }
            catch (SQLException e3) {
                e3.printStackTrace();
            }
            System.out.println(name);
            final int result = this.marks;
            final String query3 = "insert into result(name,marks) values('" + name + "','" + this.marks + "')";
            final dbOperation1 db4 = new dbOperation1();
            final int ans = db4.insert(query3);
            if (ans > 0) {
                if (result >= 4) {
                    JOptionPane.showMessageDialog(this.framequiz, "You have passed the quiz");
                }
                else {
                    JOptionPane.showMessageDialog(this.framequiz, "You have failed the quiz");
                }
            }
            final String query4 = "select * from result where name = '" + name + "' ";
            final dbOperation1 db5 = new dbOperation1();
            final ResultSet rs4 = db5.select(query4);
            try {
                while (rs4.next()) {
                    this.label_alert.setText("Dear " + name + "," + " your marks is ");
                    this.label_marks.setText(rs4.getString("marks"));
                }
            }
            catch (SQLException e4) {
                e4.printStackTrace();
            }
        }
        else if (e.getSource() == this.update) {
            this.save_btn.setVisible(true);
            this.firstname.setEditable(true);
            this.lastname.setEditable(true);
            this.age.setEditable(true);
            this.address.setEditable(true);
        }
        else if (e.getSource() == this.save_btn) {
            ++this.clicked;
            if (this.clicked == 1) {
                final String firstName = this.firstname.getText();
                final String lastName = this.lastname.getText();
                final int Age = Integer.parseInt(this.age.getText());
                this.age.setText(Integer.toString(Age));
                final String Address = this.address.getText();
                final String sql2 = "update register set first_name ='" + firstName + "',last_name='" + lastName + "',age='" + Age + "',department='" + Address + "'";
                final dbOperation1 db6 = new dbOperation1();
                final int ans2 = db6.update(sql2);
                if (ans2 != 0) {
                    JOptionPane.showMessageDialog(this.mydetails_panel, "Data Updated Successfully");
                }
            }
        }
    }
    
    @Override
    public void keyTyped(final KeyEvent e) {
    }
    
    @Override
    public void keyPressed(final KeyEvent e) {
    }
    
    @Override
    public void keyReleased(final KeyEvent e) {
    }
}
