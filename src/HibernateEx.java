import java.sql.*;
public class HibernateEx {

	public static void main(String[] args) throws Exception {
		
	String url ="jdbc:mysql://localhost:3306/firstDB";
	String uname="root";
	String password= "Workhard@1"; 
	
	//String querry = "select * from student where rollNO=3";
	
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection con = DriverManager.getConnection(url,uname,password);
	
	Statement st = con.createStatement();
	
	// For DQL querry (select)
//	String DQLquerry = "select * from student";
//	ResultSet rs =  st.executeQuery(DQLquerry);
//	
//	while(rs.next()) {
//		String Data = rs.getInt(1) + "   " + rs.getString(2);
//		System.out.println(Data);
//		
//	}
	
	
	// for DML querry (insert update delete) >> return will be int how many row updated
//	String DMLquerry = "Insert into student values(5,'java')";	
//	int count = st.executeUpdate(DMLquerry);
//	System.out.println("rows updated  "+ count);
	
	
	// to use prepared statement instead of statement (when need to send dynamic values)
 int rollNo=10;
String name ="Prepared Statement";
	String querry = "insert into student values (?,?)";
	PreparedStatement preparedStatement = con.prepareStatement(querry);
	preparedStatement.setInt(1,rollNo);
	preparedStatement.setString(2, name);
	
	int count = preparedStatement.executeUpdate();
	System.out.println(count + "rows updated ");
			
			
	st.close();
   con.close();
	
	
	
	}
}
