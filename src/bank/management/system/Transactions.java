package bank;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Transactions extends JFrame implements ActionListener {

    JButton deposit, withdrawl, fastCash, miniStatement, pinChange, balenceEnquiry, exit;
    String pinnumber;
    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(850, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(0, 0, 850, 900);
        add(Image);

        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(200, 300, 700, 30);
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD, 16));
        Image.add(text);

        deposit = new JButton("Deposit");
        deposit.setBounds(170, 415, 135, 30);
        deposit.addActionListener(this);
        Image.add(deposit);

        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(340, 415, 135, 30);
        withdrawl.addActionListener(this);
        Image.add(withdrawl);

        fastCash = new JButton("Fast Cash");
        fastCash.setBounds(170, 450, 135, 30);
        fastCash.addActionListener(this);
        Image.add(fastCash);
        
        miniStatement = new JButton("Mini Statement");
        miniStatement.setBounds(340, 450, 135, 30);
        miniStatement.addActionListener(this);
        Image.add(miniStatement);

        pinChange = new JButton("PIN Change");
        pinChange.setBounds(170, 485, 135, 30);
        pinChange.addActionListener(this);
        Image.add(pinChange);

        balenceEnquiry = new JButton("Balence Enquiry");
        balenceEnquiry.setBounds(340, 485, 135, 30);
        balenceEnquiry.addActionListener(this);
        Image.add(balenceEnquiry);
        
        exit = new JButton("Exit");
        exit.setBounds(340, 520, 135, 30);
        exit.addActionListener(this);
        Image.add(exit);
        
        setSize(850, 900);
        setLocation(200, 0);
        setUndecorated(true);
        setVisible(true);
        

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == exit){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new Transactions("");
    }
}