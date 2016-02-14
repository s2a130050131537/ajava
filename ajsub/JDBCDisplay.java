import java.sql.*;
class JDBCDisplay{
	public static void main(String[] args){
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			System.out.println("Enrollment:130050131537");
			MyData1 m1=new MyData1();
			con=m1.SetConnection("s2a130050131537");
			stmt=con.prepareStatement("Select display()");
			ResultSet rs=stmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("display"));
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}