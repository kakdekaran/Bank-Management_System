package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class withdrawl extends JFrame implements ActionListener{
    JTextField amount;
    JButton withdraw, back;
    String pinnumber;

    withdrawl(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 850, 900);
        add(image);

        JLabel text = new JLabel("Enter the amount you want to Withdraw");
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setForeground(Color.WHITE);
        text.setBounds(170, 300, 400, 20);
        image.add(text);

        amount = new JTextField();
        amount.setFont(new Font("Railway", Font.BOLD, 14));
        amount.setBounds(170, 350, 300, 20);
        image.add(amount);

        withdraw = new JButton("Withdraw");
        withdraw.setBounds(335, 485, 150, 25);
        withdraw.addActionListener(this);
        image.add(withdraw);

        
        back = new JButton("Back");
        back.setBounds(335, 520, 150, 25);
        back.addActionListener(this);
        image.add(back);


        setSize(850, 900);
        setLocation(200, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == withdraw){
            String number = amount.getText();
            Date date = new Date();
            if (number.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter the amount you want to Withdraw");
            } else {
                try{
                conn Con = new conn();
                String query = "insert into bank values('"+pinnumber+"', + '"+date+"', 'Debited', '"+number+"')";
                Con.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs " + number +" Debited Succesfully");
                setVisible(true);
                new Transactions(pinnumber).setVisible(true);
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        }else if (ae.getSource() == back){
            new Transactions(pinnumber).setVisible(true);
        }

    }
    public static void main(String[] args) {
        new withdrawl("");
    }
}
