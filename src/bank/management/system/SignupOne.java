package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;


public class SignupOne extends JFrame{
		
		
		
		SignupOne(){
			
			setLayout(null);
			
			Random ran = new Random();
			long random = (Math.abs((ran.nextLong() % 9000L) + 1000L));
			
			JLabel formno = new JLabel("APPLICATION FORM NO." + random);
			formno.setFont(new Font("Railway", Font.BOLD, 38));
			formno.setBounds(140, 20, 600, 40);
			add(formno);

			JLabel personaldetails = new JLabel("Page 1 : Personal Details");
			personaldetails.setFont(new Font("Railway", Font.BOLD, 22));
			personaldetails.setBounds(290, 80, 300, 30);
			add(personaldetails);
 
			JLabel name= new JLabel("Name: ");
			name.setFont(new Font("Railway", Font.BOLD, 20));
			name.setBounds(100, 150, 100, 30);
			add(name);
			
			JTextField nameTextField = new JTextField();
			nameTextField.setBounds(300, 150, 400, 30);
			nameTextField.setFont(new Font("Railway", Font.BOLD, 15));
			add(nameTextField);

			JLabel fname = new JLabel("Fathers name: ");
			fname.setFont(new Font("Railway", Font.BOLD, 20));
			fname.setBounds(100, 200, 160, 30);
			add(fname);
			
			JTextField fnameTextField = new JTextField();
			fnameTextField.setBounds(300, 200, 400, 30);
			fnameTextField.setFont(new Font("Railway", Font.BOLD, 15));
			add(fnameTextField);
			
			JLabel dob = new JLabel("Date of Birth: ");
			dob.setFont(new Font("Railway", Font.BOLD, 20));
			dob.setBounds(100, 250, 160, 30);
			add(dob);
			
			JDateChooser dateChooser = new JDateChooser();
			dateChooser.setBounds(300, 250, 400, 30);
			dateChooser.setForeground(new Color(105, 105, 105));
			add(dateChooser);

			JLabel gender= new JLabel("Gender: ");
			gender.setFont(new Font("Railway", Font.BOLD, 20));
			gender.setBounds(100, 300, 160, 30);
			add(gender);
			
			JRadioButton male = new JRadioButton("Male");
			male.setBounds(300, 300, 60, 30);
			male.setBackground(Color.white);
			add(male);
			
			JRadioButton female = new JRadioButton("Female");
			female.setBounds(450, 300, 80, 30);
			female.setBackground(Color.white);
			add(female);
			
			ButtonGroup gendergroup = new ButtonGroup();
			gendergroup.add(male);;
			gendergroup.add(female);

			JLabel email = new JLabel("Email ID: ");
			email.setFont(new Font("Railway", Font.BOLD, 20));
			email.setBounds(100, 350, 160, 30);
			add(email);
			
			JTextField emailTextfield = new JTextField();
			emailTextfield.setBounds(300, 350, 400, 30);
			emailTextfield.setFont(new Font("Railway", Font.BOLD, 15));
			add(emailTextfield);

			JLabel marital = new JLabel("Marital Status: ");
			marital.setFont(new Font("Railway", Font.BOLD, 20));
			marital.setBounds(100, 400, 160, 30);
			add(marital);
			
			JRadioButton married = new JRadioButton("Married");
			married.setBounds(300, 400, 100, 30);
			married.setBackground(Color.white);
			add(married);
			
			JRadioButton unmarried = new JRadioButton("Unmarried");
			unmarried.setBounds(450, 400, 100, 30);
			unmarried.setBackground(Color.white);
			add(unmarried);
			
			JRadioButton other = new JRadioButton("Other");
			other.setBounds(600, 400, 100, 30);
			other.setBackground(Color.white);
			add(other);
			
			ButtonGroup marritalgroup = new ButtonGroup();
			marritalgroup.add(married);;
			marritalgroup.add(unmarried);
			marritalgroup.add(other);
			
			JLabel address = new JLabel("Address: ");
			address.setFont(new Font("Railway", Font.BOLD, 20));
			address.setBounds(100, 450, 160, 30);
			add(address);
			
			JTextField addressTextField = new JTextField();
			addressTextField.setBounds(300, 450, 400, 30);
			addressTextField.setFont(new Font("Railway", Font.BOLD, 15));
			add(addressTextField);

			JLabel city = new JLabel("City: ");
			city.setFont(new Font("Railway", Font.BOLD, 20));
			city.setBounds(100, 500, 160, 30);
			add(city);
			
			JTextField cityTextField = new JTextField();
			cityTextField.setBounds(300, 500, 400, 30);
			cityTextField.setFont(new Font("Railway", Font.BOLD, 15));
			add(cityTextField);
			
			JLabel state = new JLabel("State: ");
			state.setFont(new Font("Railway", Font.BOLD, 20));
			state.setBounds(100, 550, 160, 30);
			add(state);
			
			JTextField stateTextField = new JTextField();
			stateTextField.setBounds(300, 550, 400, 30);
			stateTextField.setFont(new Font("Railway", Font.BOLD, 15));
			add(stateTextField);
			
			/*
			 * JLabel pincode = new JLabel("Pincode: "); pincode.setFont(new Font("Railway",
			 * Font.BOLD, 20)); pincode.setBounds(100, 600, 160, 30); add(pincode);
			 * 
			 * JTextField pinTextField = new JTextField(); pinTextField.setBounds(300, 600,
			 * 400, 30); pinTextField.setFont(new Font("Railway", Font.BOLD, 15));
			 * add(pinTextField);
			 */
			
			JButton next = new JButton("Next");
			next.setBackground(Color.black);
			next.setForeground(Color.white);
			next.setFont(new Font("Railway", Font.BOLD, 14));
			next.setBounds(600, 590, 100, 40);
			add(next);
			
			getContentPane().setBackground(Color.white);
			
			setSize(850, 900);
			setLocation(350,10);
			setVisible(true);
		}


	public static void main(String[] args) {
		new SignupOne();
	}
}
