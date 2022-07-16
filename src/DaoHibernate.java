import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DaoHibernate {
public static void main(String[] args) throws Exception {
	Students obj = new Students();
	System.out.println(obj.getName(3));
}
}

class Students{
	String getName(int a) throws Exception {
		String name="";
		String url ="jdbc:mysql://localhost:3306/firstDB";
		String uname="root";
		String password= "Workhard@1";
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,uname,password);
		
		String querry = "select * from student where rollNo =(?)";
		
		PreparedStatement st = con.prepareStatement(querry);
		st.setInt(1, a);
		
		ResultSet rs = st.executeQuery();
		rs.next();
		name = rs.getString("name");
		
		
	
	
      
		
		
		return name;
		
	}
}
