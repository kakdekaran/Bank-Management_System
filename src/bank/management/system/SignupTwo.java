package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

	long random;
	JTextField  panTextField, aadharTextField;
	JButton next;
	JRadioButton syes, sno;
	JComboBox categoryvalue, incomevalue, educationvalue, religionvalue, occupationvalue;
	String formno;

	SignupTwo(String formno) {
		this.formno = formno;
		setLayout(null);
		
		setTitle("NEW APPLICATION FORM  - PAGE 2");


		JLabel additionalDetails = new JLabel("Page 2 : Additional Details");
		additionalDetails.setFont(new Font("Railway", Font.BOLD, 22));
		additionalDetails.setBounds(290, 80, 300, 30);
		add(additionalDetails);

		JLabel religion = new JLabel("Religion: ");
		religion.setFont(new Font("Railway", Font.BOLD, 20));
		religion.setBounds(100, 150, 100, 30);
		add(religion);
		
		
		String validReligion[] = {"Hindu", "Muslim", "Christian", "Sikh", "Other"};
		religionvalue = new JComboBox<>(validReligion);
		religionvalue.setBounds(300, 150, 400, 30);
		religionvalue.setFont(new Font("Railway", Font.BOLD, 15));
		religionvalue.setBackground(Color.white);
		add(religionvalue);
		
		
		JLabel category = new JLabel("Category:  ");
		category.setFont(new Font("Railway", Font.BOLD, 20));
		category.setBounds(100, 200, 160, 30);
		add(category);
		
		String valcategory[] = {"General", "OBC", "SC", "ST", "Other"};
		categoryvalue = new JComboBox<>(valcategory);
		categoryvalue.setBounds(300, 200, 400, 30);
		categoryvalue.setFont(new Font("Railway", Font.BOLD, 15));
		categoryvalue.setBackground(Color.white);
		add(categoryvalue);

		JLabel income = new JLabel("Income: ");
		income.setFont(new Font("Railway", Font.BOLD, 20));
		income.setBounds(100, 250, 160, 30);
		add(income);
		
		String incomecategory[] = {"Null", "< 1,05,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
		incomevalue = new JComboBox<>(incomecategory);
		incomevalue.setBounds(300, 250, 400, 30);
		incomevalue.setFont(new Font("Railway", Font.BOLD, 15));
		incomevalue.setBackground(Color.white);
		add(incomevalue);

		JLabel gender = new JLabel("Educational: ");
		gender.setFont(new Font("Railway", Font.BOLD, 20));
		gender.setBounds(100, 300, 160, 30);
		add(gender);


		JLabel qualification = new JLabel("Qualification: ");
		qualification.setFont(new Font("Railway", Font.BOLD, 20));
		qualification.setBounds(100, 325, 160, 30);
		add(qualification);
		
		String educationValues[] = {"Non-Graduate", "Graduate", "Post-Graduataion", "Phd", "Other"};
		educationvalue = new JComboBox<>(educationValues);
		educationvalue.setBounds(300, 315, 400, 30);
		educationvalue.setBackground(Color.white);
		add(educationvalue);


		JLabel marital = new JLabel("Occupation: ");
		marital.setFont(new Font("Railway", Font.BOLD, 20));
		marital.setBounds(100, 400, 160, 30);
		add(marital);
		
		String occupationValues[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Other"};
		occupationvalue = new JComboBox<>(occupationValues);
		occupationvalue.setBounds(300, 400, 400, 30);
		occupationvalue.setBackground(Color.white);
		add(occupationvalue);

		

		JLabel pan = new JLabel("PAN Number: ");
		pan.setFont(new Font("Railway", Font.BOLD, 20));
		pan.setBounds(100, 450, 160, 30);
		add(pan);

		panTextField = new JTextField();
		panTextField.setBounds(300, 450, 400, 30);
		panTextField.setFont(new Font("Railway", Font.BOLD, 15));
		add(panTextField);

		JLabel aadhar = new JLabel("Aadhar Number: ");
		aadhar.setFont(new Font("Railway", Font.BOLD, 20));
		aadhar.setBounds(100, 500, 200, 30);
		add(aadhar);

		aadharTextField = new JTextField();
		aadharTextField.setBounds(300, 500, 400, 30);
		aadharTextField.setFont(new Font("Railway", Font.BOLD, 15));
		add(aadharTextField);

		JLabel citizen = new JLabel("Senior Citizen: ");
		citizen.setFont(new Font("Railway", Font.BOLD, 20));
		citizen.setBounds(100, 550, 160, 30);
		add(citizen);
		
		syes = new JRadioButton("Yes");
		syes.setBounds(300, 550, 100, 30);
		syes.setBackground(Color.white);
		add(syes);
		
		sno = new JRadioButton("No");
		sno.setBounds(400, 550, 100, 30);
		sno.setBackground(Color.white);
		add(sno);

		ButtonGroup marritalgroup = new ButtonGroup();
		marritalgroup.add(syes);
		marritalgroup.add(sno);
	
		
//		citizenTextField = new JTextField();
//		citizenTextField.setBounds(300, 550, 400, 30);
//		citizenTextField.setFont(new Font("Railway", Font.BOLD, 15));
//		add(citizenTextField);

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
		
		String sreligion = (String) religionvalue.getSelectedItem();
		String scategory = (String) categoryvalue.getSelectedItem();
		String sincome = (String) incomevalue.getSelectedItem();
		String seducation = (String) educationvalue.getSelectedItem();
		String soccupation = (String) occupationvalue.getSelectedItem();
		
		
		String Seniorcitizen = null;
		if (syes.isSelected()) {
			Seniorcitizen = "Yes";
		} else if (sno.isSelected()) {
			Seniorcitizen = "No";
		}

		

		String pan = panTextField.getText();
		String aadhar = aadharTextField.getText();
		

		try {
			if (aadhar.equals("")) {
				JOptionPane.showMessageDialog(null, "Aadhar no. is Required");
			}else {
				conn c = new conn();
				
				String query =
						"INSERT INTO signuptwo(formno,religion,education,category,income,occupation,pan,aadhar,citizen) " +
						"VALUES('" + formno + "','" + sreligion + "','" + seducation + "','" +
						scategory + "','" + sincome + "','" + soccupation + "','" +
						pan + "','" + aadhar + "','" + Seniorcitizen + "')";
				System.out.println("Form No Received = " + formno);
				c.s.executeUpdate(query);
				
				setVisible(false);
				new SignupThree(formno).setVisible(true);
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	
	public static void main(String[] args) {
		new SignupTwo("");
	}
}
