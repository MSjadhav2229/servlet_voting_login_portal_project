package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jsp.dto.Member;

public class RegisterDao {

	private String dburl = "jdbc:mysql://localhost:3306?user=root&password=root";
	// private String dbuname="root";
	// private String dbpassword="root";
	private String dbdriver = "com.mysql.jdbc.Driver";

	public void loadDriver(String db) {
		try {
			Class.forName(db);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() {

		Connection con = null;

		try {
			con = DriverManager.getConnection(dburl);
			// con=DriverManager.getConnection(dbuser,dbuname,dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}
//Register the data into server
	public String insert(Member member) {
		loadDriver(dbdriver);
		Connection con = getConnection();

		String qry = "insert into userdb.member values(?,?,?,?,?)";
		String result = "Data insert into member";
		try {
			PreparedStatement statement = con.prepareStatement(qry);
			statement.setString(1, member.getUname());
			statement.setString(2, member.getPassword());
			statement.setString(3, member.getEmail());
			statement.setString(4, member.getPhone());
			statement.setBoolean(5, false);
			statement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not enetered";
		}
		return result;
	}
//get username
	public String userName(Member member) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String username = null;

		try {
			PreparedStatement pstmt = con.prepareStatement("select * from userdb.member where uname=? ");
			pstmt.setString(1, member.getUname());
			ResultSet rc = pstmt.executeQuery();

			if (rc.next()) {

				username = rc.getString("uname");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return username;

	}
//get password
	public String passwordPs(Member member) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String password1 = null;

		try {
			PreparedStatement pstmt = con.prepareStatement("select * from userdb.member where uname=? ");
			pstmt.setString(1, member.getUname());
			ResultSet rc = pstmt.executeQuery();

			if (rc.next()) {

				password1 = rc.getString("password");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return password1;

	}
//find the duplicate vote
	public Boolean value1(Member member) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		boolean va = false;

		try {
			PreparedStatement pstmt = con.prepareStatement("select * from userdb.member where uname=? ");
			pstmt.setString(1, member.getUname());
			ResultSet rc = pstmt.executeQuery();

			if (rc.next()) {

				va = rc.getBoolean("value");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return va;

	}
//set value true after voting
	
	public void setValue(Member member) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String qry = "Update userdb.member set value=true where uname=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(qry);
			pstmt.setString(1, member.getUname1());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
//candidate vote
	public void candidate1() {
		loadDriver(dbdriver);
		Connection con = getConnection();

		String qry1 = "Update userdb.candidate set vote=vote+1 where id=1";

		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(qry1);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void candidate2() {
		loadDriver(dbdriver);
		Connection con = getConnection();

		String qry1 = "Update userdb.candidate set vote=vote+1 where id=2";

		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(qry1);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void candidate3() {
		loadDriver(dbdriver);
		Connection con = getConnection();

		String qry1 = "Update userdb.candidate set vote=vote+1 where id=3";

		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(qry1);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void candidate4() {
		loadDriver(dbdriver);
		Connection con = getConnection();

		String qry1 = "Update userdb.candidate set vote=vote+1 where id=4";

		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(qry1);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
//	public void candidateName() {
//		loadDriver(dbdriver);
//		Connection con = getConnection();
//		
//		String qry1="select * from userdb.candidate where id=1";
//		
//		try {
//			PreparedStatement statement=con.prepareStatement(qry1);
//			
//			statement.executeUpdate();
//			
//			ResultSet resultSet=statement.executeQuery();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
	public void cand1(Member member) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String qry = "Update userdb.member set cand='Candidate 1' where uname=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(qry);
			pstmt.setString(1, member.getUname1());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void cand2(Member member) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String qry = "Update userdb.member set cand='Candidate 2' where uname=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(qry);
			pstmt.setString(1, member.getUname1());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void cand3(Member member) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String qry = "Update userdb.member set cand='Candidate 3' where uname=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(qry);
			pstmt.setString(1, member.getUname1());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void cand4(Member member) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String qry = "Update userdb.member set cand='Candidate 4' where uname=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(qry);
			pstmt.setString(1, member.getUname1());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public String user(Member member) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String name=null;
		String qry="Select * from userdb.member where uname=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(qry);
			pstmt.setString(1, member.getUname());
			
			ResultSet resultSet=pstmt.executeQuery();
			if(resultSet.next()) {
				name=resultSet.getString("cand");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
	}
	
	
	

}
