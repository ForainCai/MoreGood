package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcUtil {
	private static String username;
	private static String password;
	private static String driver;
	private static String url;
	private Connection connection;
	private PreparedStatement pstmt;
	private ResultSet rs;
	static {
		loadConfig();
	}
	public static void loadConfig() {
		
	}
	//Î´Íê´ýÐø
}
