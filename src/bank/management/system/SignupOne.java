package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {

	long random;
	JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField;
	JButton next;
	JRadioButton male, female, other, married, unmarried;
	JDateChooser dateChooser;

	SignupOne() {

		setLayout(null);

		Random ran = new Random();
		random = (Math.abs((ran.nextLong() % 9000L) + 1000L));

		JLabel formno = new JLabel("APPLICATION FORM NO." + random);
		formno.setFont(new Font("Railway", Font.BOLD, 38));
		formno.setBounds(140, 20, 600, 40);
		add(formno);

		JLabel personaldetails = new JLabel("Page 1 : Personal Details");
		personaldetails.setFont(new Font("Railway", Font.BOLD, 22));
		personaldetails.setBounds(290, 80, 300, 30);
		add(personaldetails);

		JLabel name = new JLabel("Name: ");
		name.setFont(new Font("Railway", Font.BOLD, 20));
		name.setBounds(100, 150, 100, 30);
		add(name);

		nameTextField = new JTextField();
		nameTextField.setBounds(300, 150, 400, 30);
		nameTextField.setFont(new Font("Railway", Font.BOLD, 15));
		add(nameTextField);

		JLabel fname = new JLabel("Fathers name: ");
		fname.setFont(new Font("Railway", Font.BOLD, 20));
		fname.setBounds(100, 200, 160, 30);
		add(fname);

		fnameTextField = new JTextField();
		fnameTextField.setBounds(300, 200, 400, 30);
		fnameTextField.setFont(new Font("Railway", Font.BOLD, 15));
		add(fnameTextField);

		JLabel dob = new JLabel("Date of Birth: ");
		dob.setFont(new Font("Railway", Font.BOLD, 20));
		dob.setBounds(100, 250, 160, 30);
		add(dob);

		dateChooser = new JDateChooser();
		dateChooser.setBounds(300, 250, 400, 30);
		dateChooser.setForeground(new Color(105, 105, 105));
		add(dateChooser);

		JLabel gender = new JLabel("Gender: ");
		gender.setFont(new Font("Railway", Font.BOLD, 20));
		gender.setBounds(100, 300, 160, 30);
		add(gender);

		male = new JRadioButton("Male");
		male.setBounds(300, 300, 60, 30);
		male.setBackground(Color.white);
		add(male);

		female = new JRadioButton("Female");
		female.setBounds(450, 300, 80, 30);
		female.setBackground(Color.white);
		add(female);

		ButtonGroup gendergroup = new ButtonGroup();
		gendergroup.add(male);
		;
		gendergroup.add(female);

		JLabel email = new JLabel("Email ID: ");
		email.setFont(new Font("Railway", Font.BOLD, 20));
		email.setBounds(100, 350, 160, 30);
		add(email);

		emailTextField = new JTextField();
		emailTextField.setBounds(300, 350, 400, 30);
		emailTextField.setFont(new Font("Railway", Font.BOLD, 15));
		add(emailTextField);

		JLabel marital = new JLabel("Marital Status: ");
		marital.setFont(new Font("Railway", Font.BOLD, 20));
		marital.setBounds(100, 400, 160, 30);
		add(marital);

		married = new JRadioButton("Married");
		married.setBounds(300, 400, 100, 30);
		married.setBackground(Color.white);
		add(married);

		unmarried = new JRadioButton("Unmarried");
		unmarried.setBounds(450, 400, 100, 30);
		unmarried.setBackground(Color.white);
		add(unmarried);

		other = new JRadioButton("Other");
		other.setBounds(600, 400, 100, 30);
		other.setBackground(Color.white);
		add(other);

		ButtonGroup marritalgroup = new ButtonGroup();
		marritalgroup.add(married);
		marritalgroup.add(unmarried);
		marritalgroup.add(other);

		JLabel address = new JLabel("Address: ");
		address.setFont(new Font("Railway", Font.BOLD, 20));
		address.setBounds(100, 450, 160, 30);
		add(address);

		addressTextField = new JTextField();
		addressTextField.setBounds(300, 450, 400, 30);
		addressTextField.setFont(new Font("Railway", Font.BOLD, 15));
		add(addressTextField);

		JLabel city = new JLabel("City: ");
		city.setFont(new Font("Railway", Font.BOLD, 20));
		city.setBounds(100, 500, 160, 30);
		add(city);

		cityTextField = new JTextField();
		cityTextField.setBounds(300, 500, 400, 30);
		cityTextField.setFont(new Font("Railway", Font.BOLD, 15));
		add(cityTextField);

		JLabel state = new JLabel("State: ");
		state.setFont(new Font("Railway", Font.BOLD, 20));
		state.setBounds(100, 550, 160, 30);
		add(state);

		stateTextField = new JTextField();
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

		next = new JButton("Next");
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(new Font("Railway", Font.BOLD, 14));
		next.setBounds(600, 590, 100, 40);
		next.addActionListener(this);
		add(next);

		getContentPane().setBackground(Color.white);

		setSize(850, 900);
		setLocation(200, 10);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String formno = "" + random;
		String name = nameTextField.getText();
		String fname = fnameTextField.getText();
		String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		String gender = null;
		if (male.isSelected()) {
			gender = "Male";
		} else if (female.isSelected()) {
			gender = "Female";
		}

		String email = emailTextField.getText();

		String marital = null;
		if (married.isSelected()) {
			marital = "Married";
		} else if (unmarried.isSelected()) {
			marital = "Unmarried";
		} else if (other.isSelected()) {
			marital = "Other";
		}

		String address = addressTextField.getText();
		String city = cityTextField.getText();
		String state = stateTextField.getText();

		try {
			if (name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is Required");
			}else {
				conn c = new conn();
				String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"','"+address+"', '"+city+"', '"+state+"')";
				c.s.executeUpdate(query);
				
				setVisible(false);
				new SignupTwo(formno).setVisible(true);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	
	public static void main(String[] args) {
		new SignupOne();
	}
}
