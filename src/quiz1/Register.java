package quiz1;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class Register  implements ActionListener,KeyListener{
	Font font = new Font("Times New Roman",Font.PLAIN,18);
	
	JFrame frame = new JFrame();
	
	JPanel Register_panel = new JPanel();
	
	JLabel toplabel = new JLabel();
	JLabel firstname_label = new JLabel();
	JLabel lastname_label = new JLabel();
	JLabel age_label = new JLabel();
	JLabel faculty_label = new JLabel();
	JLabel Contact_label = new JLabel();
	JLabel user_name = new JLabel();
	JLabel password_label = new JLabel();
	JLabel confirm_password_label = new JLabel();
	JLabel label_back = new JLabel();
	JLabel time = new JLabel();
	
	
	JTextField firstname = new JTextField();
	JTextField lastname = new JTextField();
	JTextField age = new JTextField();
	JTextField contact = new JTextField();
	JTextField Username = new JTextField();
	JPasswordField password = new JPasswordField();
	JPasswordField confirm_password = new JPasswordField();
	
	JButton submit = new JButton("Submit");
	JButton back_button = new JButton("Back");
	
	String[] department_option = {"Select Here","BSc Hons Computing","BSc Hons Ethical Hacking",};
	
	JComboBox department = new JComboBox(department_option);
	
	JCheckBox show_password = new JCheckBox("Show Password");
	
	public Register(){
		toplabel.setBounds(200,0,400,50);
		toplabel.setText("Kindly Fill Your Appropirate Detail ");
		toplabel.setFont(new Font(null,Font.PLAIN,26));
		toplabel.setForeground(Color.black);
		
		// firstname label
		firstname_label.setBounds(100,30,100,50);
		firstname_label.setText("First Name:");
		firstname_label.setFont(font);
		//first name text field
		firstname.setBounds(100,70,200,30);
		// lastname label and textfield
		lastname_label.setBounds(100,100,100,50);
		lastname_label.setText("Last Name:");
		lastname_label.setFont(font);
		
		lastname.setBounds(100,140,200,30);
		
		// age label and field
		age_label.setBounds(100,160,100,50);
		age_label.setText("Age:");
		age_label.setFont(font);
		
		age.setBounds(100,200,200,30);
		age.addKeyListener(this);
		// faculty label and combobox
		faculty_label.setBounds(100,400,100,50);
		faculty_label.setText("Department:");
		faculty_label.setFont(font);
		
		department.setBounds(100,440,200,30);
		department.addActionListener(this);
		// username field and labels
		user_name.setBounds(100,220,300,50);
		user_name.setText("Username  :");
		user_name.setFont(font);
		
		Username.setBounds(100,260,200,30);
		
		// password label and field
		password_label.setBounds(100,280,300,50);
		password_label.setText("Password :");
		password_label.setFont(font);
		
		password.setBounds(100,320,200,30);
	
		// to show the written password in both textfield
		show_password.setBounds(300,350,150,30);
		show_password.addActionListener(this);
		
		
		// to  confirm if they match or not
		confirm_password_label.setBounds(100,350,200,30);
		confirm_password_label.setText("Confirm Password : ");
		confirm_password_label.setFont(font);
		
		confirm_password.setBounds(100,380,200,30);
		// to enter the type data to get insert in database 
		submit.setEnabled(true);
		submit.setBackground(Color.white);
		submit.setBounds(250,500,160,30);
		submit.addActionListener(this);
		
		// background image
		ImageIcon image1 = new ImageIcon("regback.jpg");
		label_back.setIcon(image1);
	 	label_back.setBounds(0,0,1000,800);
	 	
	 	// displaying current time
		
		Currenttime();
		
		// back button  			

		back_button.setBounds(5,5,100,30);
		back_button.setFocusable(false);
		back_button.addActionListener(this);
		back_button.setBorder(new EtchedBorder(10));
		back_button.setForeground(Color.black);
		back_button.setBackground(Color.white );
		back_button.setFont(font);
	
		ImageIcon image12 = new ImageIcon("back_register.jpg");
		label_back.setIcon(image12);
	 	label_back.setBounds(0,0,800,600);
		
		Register_panel.add(toplabel);
		Register_panel.add(lastname_label);
		Register_panel.add(age_label);
		Register_panel.add(faculty_label);
		Register_panel.add(Contact_label);
		Register_panel.add(firstname_label);
		Register_panel.add(user_name);
		Register_panel.add(password_label);
		Register_panel.add(confirm_password_label);
		Register_panel.add(firstname);
		Register_panel.add(lastname);
		Register_panel.add(age);
		Register_panel.add(department);
		Register_panel.add(contact);
		Register_panel.add(Username);
		Register_panel.add(password);
		Register_panel.add(show_password);
		Register_panel.add(confirm_password);
		Register_panel.add(submit);
		Register_panel.add(back_button);
		Register_panel.add(label_back);
		
		Register_panel.add(time);
		Register_panel.add(label_back);
		Register_panel.setBounds(0,0,1000,800);
		Register_panel.setLayout(new BorderLayout());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(Register_panel);
		frame.setLayout(new BorderLayout());
		

		
		
	}
	 String f1 = password.getText();
	 String f2 = confirm_password.getText();
	 public String check(String f1,String f2 ) {

		 if(f1.equals(f2)) {
			 
			 String f_name = firstname.getText();
				String l_name = lastname.getText();
				int Age = Integer.parseInt(age.getText());
				age.setText(Integer.toString(Age));
				String Department = (String) department.getSelectedItem();
				String username = Username.getText();
				String Password =confirm_password.getText();
				
				String sql = "insert into register"
						+"(first_name,last_name,age,department,username,password)"
						+"values('"+f_name+"','"+l_name+"','"+Age+"','"+Department+"','"+username+"','"+Password+"')";
				
				dbOperation12 db = new dbOperation12();
				int ans = db.insert(sql);
				if(ans>0) {
					JOptionPane.showMessageDialog(frame, "user created successfully");
				}
				firstname.setText("");
				lastname.setText("");
				age.setText("");
				Username.setText("");
				password.setText("");
				confirm_password.setText("");
		 }
		 else {
			 JOptionPane.showMessageDialog(frame,"password didnot match" );
		 }
		return f1 ;
		 
	 }
	// function to display current time
	public String Currenttime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		time.setText("Time of Registation : "+dtf.format(now));
		time.setBounds(400,40,200,30);
		return dtf.format(now);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() ==submit ) {
			 String p1 = password.getText();
			 String p2 = confirm_password.getText();
			check(p1,p2);
			
		}
		else if(show_password.isSelected()) {
			password.setEchoChar((char)0);
			confirm_password.setEchoChar((char)0);
		}
		else if(e.getSource() == back_button) {
			frame.setVisible(false);
			
		}
		else {
			password.setEchoChar('*');
			confirm_password.setEchoChar('*');
		}
	}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
   
	String value = age.getText();
	
	

	 if(e.getKeyChar() >'0' && e.getKeyChar() <= '9') {
		age.setEditable(true);
	 }
	 else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE &&  age.getText().length()>0 ) {
			StringBuilder strBuilder = new StringBuilder(age.getText());
		  strBuilder.deleteCharAt(age.getText().length()-1);
		  age.setEditable(true);
		 }
	

		
	else {
		age.setEditable(false);
	}
	
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
