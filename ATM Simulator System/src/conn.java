import java.sql.*;
public class conn {
	
	Connection c;
	Statement s;
	conn(){
		try {
		
			c= DriverManager.getConnection("jdbc:mysql:///atmsimulatorsystem","root","");
			s= c.createStatement();
			
		}catch(Exception e) {
			
			System.out.println(e);
			
		}
	}

	public static void main(String[] args) {
		

	}

}
