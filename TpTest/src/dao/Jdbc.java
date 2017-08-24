package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entity.Student;


public class Jdbc {
	public void testOracle() {
		Connection con = null;
		PreparedStatement pre = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("开始连接数据库");
			String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
			String user = "c##scott";
			String password = "tiger";
			con = DriverManager.getConnection(url,user,password);
			System.out.println("connection successful");
			String sql = "select * from student";
			pre = con.prepareStatement(sql);
			rs = pre.executeQuery();
			while(rs.next()) {
				Student stu = new Student();
				stu.setSname(rs.getString("sname"));
				stu.setSpwd(rs.getString("spwd"));
				System.out.println(stu.getSname()+stu.getSpwd());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Jdbc jdbc = new Jdbc();
		jdbc.testOracle();
	}
}
