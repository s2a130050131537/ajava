import java.sql.*;
class MyData1{
	public Connection SetConnection(String database){
		Connection con=null;
		try{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+database,"postgres","1234");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return con;
	}
}