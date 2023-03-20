
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class signupTwo extends JFrame implements ActionListener{
	
	
	JTextField pan,aadhar;
	JButton next;
	JRadioButton yes,no,eyes,eno;
	JComboBox religion,category,income,education,occupation;
	String formno;
	
	

	signupTwo(String formno){
		this.formno= formno;
		setLayout(null); 
		
	    setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
		
		
		JLabel additionalDetails = new JLabel("Page 2 : Additional Details ");
		additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
		additionalDetails.setBounds(290,80,400,30);
		add(additionalDetails);
		
		
		JLabel Lreligion = new JLabel("Religion:");
		Lreligion.setFont(new Font("Raleway",Font.BOLD,22));
		Lreligion.setBounds(100,140,100,30);
		add(Lreligion);
		
		
	    String valReligion[]= {"Hindu","Muslim","Sikh","Christian","Other"};
	    religion = new JComboBox(valReligion);
	    religion.setBounds(300,140,400,30);
	    religion.setBackground(Color.WHITE);
		add(religion);
		
		
		
		JLabel Lcategory = new JLabel("Category:");
		Lcategory.setFont(new Font("Raleway",Font.BOLD,22));
		Lcategory.setBounds(100,190,200,30);
		add(Lcategory);
		
		
		
	    String valcategory[]= {"General","OBC","SC","ST","Other"};
	    category = new JComboBox(valcategory);
	    category.setBounds(300,190,400,30);
	    category.setBackground(Color.WHITE);
		add(category);
		
		
		
	
		JLabel Lincome = new JLabel("Income:");
		Lincome.setFont(new Font("Raleway",Font.BOLD,22));
		Lincome.setBounds(100,240,200,30);
		add(Lincome);
		

	    String valincome[]= {"Null","<1,50,000","<2,50,000","5,00,000","Upto 10,00,000"};
	    income = new JComboBox(valincome);
	    income.setBounds(300,240,400,30);
	    income.setBackground(Color.WHITE);
		add(income);
		
		
		
		JLabel Leducation = new JLabel("Education /");
		Leducation.setFont(new Font("Raleway",Font.BOLD,22));
		Leducation.setBounds(100,290,200,30);
		add(Leducation);

		JLabel Lqualification = new JLabel("Qualification:");
		Lqualification.setFont(new Font("Raleway",Font.BOLD,22));
		Lqualification.setBounds(100,315,200,30);
		add(Lqualification);
		
		  String educationvalues[]= {"Non-graducation","Graduate","post-graducation","Doctrate","Other"};
		    education= new JComboBox(educationvalues);
		    education.setBounds(300,315,400,30);
		    education.setBackground(Color.WHITE);
			add(education);
		
		
		
		JLabel Loccupation = new JLabel("Occupation:");
		Loccupation.setFont(new Font("Raleway",Font.BOLD,22));
		Loccupation.setBounds(100,390,200,30);
		add(Loccupation);
		
		
		  String occuptionvalues[]= {"Salaried","Self-Employed","Bussiness","Student","Retired","Other"};
		    occupation= new JComboBox(occuptionvalues);
		    occupation.setBounds(300,390,400,30);
		    occupation.setBackground(Color.WHITE);
			add(occupation);
		

		JLabel Lpannumber = new JLabel("PAN Number:");
		Lpannumber.setFont(new Font("Raleway",Font.BOLD,22));
		Lpannumber.setBounds(100,440,200,30);
		add(Lpannumber);
		
		
		pan = new JTextField();
		pan.setFont(new Font("Raleway",Font.BOLD,14));
		pan.setBounds(300,440,400,30);
		add(pan);
		
		
		
		JLabel Laadharnumber = new JLabel("Aadhar Number:");
		Laadharnumber.setFont(new Font("Raleway",Font.BOLD,22));
		Laadharnumber.setBounds(100,490,200,30);
		add(Laadharnumber);
		
		aadhar = new JTextField();
		aadhar.setFont(new Font("Raleway",Font.BOLD,14));
		aadhar.setBounds(300,490,400,30);
		add(aadhar);
		
		
		
		JLabel Lcitizen = new JLabel("Senior Citizen:");
		Lcitizen.setFont(new Font("Raleway",Font.BOLD,22));
		Lcitizen.setBounds(100,540,200,30);
		add(Lcitizen);
		
			yes = new JRadioButton("Yes");
			yes.setBounds(300,540,100,30);
			yes.setBackground(Color.WHITE);
			add(yes);
			
			
			no = new JRadioButton("No");
			no.setBounds(450,540,100,30);
			no.setBackground(Color.WHITE);
			add(no);
			
			ButtonGroup seniorcitizen = new ButtonGroup();
			seniorcitizen.add(yes);
			seniorcitizen.add(no);
			
		
		
		
		JLabel Laccount = new JLabel("Existing Account:");
		Laccount.setFont(new Font("Raleway",Font.BOLD,22));
		Laccount.setBounds(100,590,200,30);
		add(Laccount);
		
		
		eyes = new JRadioButton("Yes");
		eyes.setBounds(300,590,100,30);
		eyes.setBackground(Color.WHITE);
		add(eyes);
		
		
		eno = new JRadioButton("No");
		eno.setBounds(450,590,100,30);
		eno.setBackground(Color.WHITE);
		add(eno);
		
		ButtonGroup eaccount = new ButtonGroup();
		eaccount.add(eyes);
		eaccount.add(eno);
		

	    next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setBounds(620,660,80,30);
		next.addActionListener(this);
		add(next);
		
		
		getContentPane().setBackground(Color.WHITE);
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);	
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		
		String sreligion =(String) religion.getSelectedItem();
		String scategory =(String) category.getSelectedItem();
		String sincome =(String)   income.getSelectedItem();
		String seducation =(String) education.getSelectedItem();
		String soccupation =(String) occupation.getSelectedItem();
		String seniorcitizen = null;

		if(yes.isSelected()) {
			seniorcitizen = "Yes";
		}else if(no.isSelected()) {
			seniorcitizen = "No";
		}
		String existingaccount = null;
		if(eyes.isSelected()) {
			existingaccount ="Yes";
		}else if(eno.isSelected()) {
			existingaccount = "No";
		}
		
		String span = pan.getText();
		String saadhar = aadhar.getText();
		
		
		try {
			conn c = new conn();
			String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
			c.s.executeUpdate(query	);
			
			setVisible(true);
			new signupThree(formno).setVisible(true);;
			
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		new signupTwo("");

 
		

	}

	

}
