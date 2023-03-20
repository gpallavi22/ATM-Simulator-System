import java.awt.Image;
import java.awt.event.*;
import java.sql.*;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;
import java.awt.*;
import java.util.*;


public class Deposite extends JFrame implements ActionListener{
	
	JTextField amount;
	JButton deposit,back;
	String pinnumber;
	
	Deposite(String pinnumber){
		
		this.pinnumber = pinnumber;
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon("atm.jpg");
		Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		
		JLabel image = new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		
		
		JLabel text = new JLabel("Enter the amount you want to deposite");
		text.setForeground(Color.white);
		text.setFont(new Font("System",Font.BOLD,16));
		text.setBounds(170,300,400,20);
		image.add(text);
		
		
	    amount = new JTextField();
		amount.setFont(new Font("Raleway",Font.BOLD,22));
		amount.setBounds(170,350,320,25);
		image.add(amount);
		
	    deposit = new JButton("Deposit");
		deposit.setBounds(355,485,150,30);
		deposit.addActionListener(this);
		image.add(deposit);
		
	    back = new JButton("Back");
		back.setBounds(355,520,150,30);
		back.addActionListener(this);
		image.add(back);
		
		
		
		
		setSize(900,900);
		setLocation(300,0);
		setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==deposit) {
			String number = amount.getText();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			   LocalDateTime date = LocalDateTime.now();
			
			
			
			
			if(number.equals("")) {
				JOptionPane.showMessageDialog(null,"Please enter the amount you want to deposit");
			}else {
				try {
					conn conn = new conn();
					String query="insert into bank values('"+pinnumber+"','"+date+"','Deposit','"+number+"')";
					conn.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null,"Rs"+number+"Deposited Sucessfully");
					setVisible(false);
					new Transactiona(pinnumber).setVisible(true);
					
				}catch(Exception e) {
					System.out.println(e);
				}
				
			}
			
		}else if(ae.getSource()==back) {
			  setVisible(false);
			new Transactiona(pinnumber).setVisible(true);
			
		}
	}	

	public static void main(String[] args) {
		new Deposite("");
		

	}

}