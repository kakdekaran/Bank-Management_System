package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
	
	JRadioButton r1, r2, r3, r4;
	JCheckBox c1, c2, c3, c4, c5, c6, c7;
	JButton submit, cancel;
	String formno;
	
	SignupThree(String formno){
		
		this.formno = formno;
		setLayout(null);
		
		JLabel l1 = new JLabel("Page 3: Account Details");
		l1.setFont(new Font("Railway", Font.BOLD, 22));
		l1.setBounds(280, 40, 400, 40);
		add(l1);
		
		JLabel type = new JLabel("Account Type: ");
		type.setFont(new Font("Railway", Font.BOLD, 18));
		type.setBounds(100, 140, 200, 30);
		add(type);
		
		r1 = new JRadioButton("Saving Account");
		r1.setFont(new Font("Railway", Font.BOLD, 16));
		r1.setBackground(Color.white);
		r1.setBounds(100, 180, 150, 20);
		add(r1);
		
		r2 = new JRadioButton("Fixed Deposit Account");
		r2.setFont(new Font("Railway", Font.BOLD, 16));
		r2.setBackground(Color.white);
		r2.setBounds(350, 180, 200, 20);
		add(r2);
		
		r3 = new JRadioButton("Current Account");
		r3.setFont(new Font("Railway", Font.BOLD, 16));
		r3.setBackground(Color.white);
		r3.setBounds(100, 220, 160, 20);
		add(r3);
		
		r4 = new JRadioButton("Recurring Deposit Account");
		r4.setFont(new Font("Railway", Font.BOLD, 16));
		r4.setBackground(Color.white);
		r4.setBounds(350, 220, 250, 20);
		add(r4);
		
		ButtonGroup groupaccount = new ButtonGroup();
		groupaccount.add(r1);
		groupaccount.add(r2);
		groupaccount.add(r3);
		groupaccount.add(r4);
		
		
		JLabel card = new JLabel("Card Number: ");
		card.setFont(new Font("Railway", Font.BOLD, 18));
		card.setBounds(100, 300, 200, 30);
		add(card);
		
		JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
		number.setFont(new Font("Railway", Font.BOLD, 18));
		number.setBounds(330, 300, 300, 30);
		add(number);
		
		JLabel carddetail = new JLabel("This is your 16 Digit Card Number");
		carddetail.setFont(new Font("Railway", Font.BOLD, 12));
		carddetail.setBounds(100, 330, 300, 20);
		add(carddetail);
		
		JLabel pin = new JLabel("PIN: ");
		pin.setFont(new Font("Railway", Font.BOLD, 18));
		pin.setBounds(100, 370, 200, 30);
		add(pin);
		
		JLabel pnumber = new JLabel("XXXX");
		pnumber.setFont(new Font("Railway", Font.BOLD, 18));
		pnumber.setBounds(330, 370, 150, 30);
		add(pnumber);
		
		JLabel pindetail = new JLabel("Your 4 Digit PIN");
		pindetail.setFont(new Font("Railway", Font.BOLD, 12));
		pindetail.setBounds(100, 395, 300, 20);
		add(pindetail);
		
		JLabel services = new JLabel("Services Required: ");
		services.setFont(new Font("Railway", Font.BOLD, 18));
		services.setBounds(100, 420, 200, 30);
		add(services);
		
		c1 = new JCheckBox("ATM Card");
		c1.setBackground(Color.white);
		c1.setFont(new Font("Railway", Font.BOLD, 14));
		c1.setBounds(100, 450, 100, 20);
		add(c1);
		
		c2 = new JCheckBox("Internet Banking");
		c2.setBackground(Color.white);
		c2.setFont(new Font("Railway", Font.BOLD, 14));
		c2.setBounds(220, 450, 140, 20);
		add(c2);
		
		c3 = new JCheckBox("Mobile Banking");
		c3.setBackground(Color.white);
		c3.setFont(new Font("Railway", Font.BOLD, 14));
		c3.setBounds(380, 450, 150, 20);
		add(c3);
		
		c4 = new JCheckBox("Eamil & SMS");
		c4.setBackground(Color.white);
		c4.setFont(new Font("Railway", Font.BOLD, 14));
		c4.setBounds(540, 450, 150, 20);
		add(c4);
		
		c5 = new JCheckBox("Cheque Service");
		c5.setBackground(Color.white);
		c5.setFont(new Font("Railway", Font.BOLD, 14));
		c5.setBounds(100, 490, 150, 20);
		add(c5);
		
		c6 = new JCheckBox("E-Statement");
		c6.setBackground(Color.white);
		c6.setFont(new Font("Railway", Font.BOLD, 14));
		c6.setBounds(270, 490, 150, 20);
		add(c6);

		c7 = new JCheckBox("I heareby declares that the above entered details are correct");
		c7.setBackground(Color.white);
		c7.setFont(new Font("Railway", Font.BOLD, 10));
		c7.setBounds(100, 530, 700, 20);
		add(c7);
		
		submit = new JButton("Submit");
		submit.addActionListener(this);
		submit.setBackground(Color.black);
		submit.setForeground(Color.white);
		submit.setBounds(650, 580, 100, 30);
		submit.setFont(new Font("Arial", Font.BOLD, 18));
		add(submit);
	
		cancel = new JButton("Cancel");
		cancel.addActionListener(this);
		cancel.setBackground(Color.black);
		cancel.setForeground(Color.white);
		cancel.setBounds(530, 580, 100, 30);
		cancel.setFont(new Font("Arial", Font.BOLD, 18));
		add(cancel);
		
		getContentPane().setBackground(Color.white);
		
		
		setSize(850, 900);
		setLocation(200, 10);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == submit) {
			String accountType = null;
			if (r1.isSelected()) {
				accountType = "Savings Account";
			}else if (r2.isSelected()) {
				accountType = "Fixed Deposit Account";
			}else if (r3.isSelected()) {
				accountType = "Current Account";
			}else if (r4.isSelected()) {
				accountType = "Recurring Deposit Account";
			}
			
			Random random = new Random();
			String cardnumber = "" +  Math.abs((random.nextLong() % 90000000L) + 5407897000000000L);
			String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);

			String facility = "";
			if(c1.isSelected()){
				facility = facility + " ATM Card";
			} else if(c2.isSelected()){
				facility = facility + " Internet Banking";
			} else if(c3.isSelected()){
				facility = facility + " Mobile Banking";
			} else if(c4.isSelected()){
				facility = facility + " Email & SMS";
			} else if(c5.isSelected()){
				facility = facility + " Cheque Service";
			} else if(c6.isSelected()){
				facility = facility + " E-Statement";
			}
			
			try {
				if (accountType.equals("")){
					JOptionPane.showMessageDialog(null, "Account Type Required");
				} else{
					conn Con = new conn();
					String query1 = "insert into signupThree values('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
					String query2 = "insert into login values('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";

					Con.s.executeUpdate(query1);
					Con.s.executeUpdate(query2);
					JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin: " + pinnumber);
					
				}
			} catch (Exception e){
				System.out.println(e);
			}


		}else if(ae.getSource() == cancel){
			
		}
	}
	
		public static void main(String[] args) {
			new SignupThree("");
			
		}
}
