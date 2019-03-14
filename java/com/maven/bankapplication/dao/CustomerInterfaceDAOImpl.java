package com.maven.bankapplication.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.maven.bankapplication.service.CustomerInterfaceService;
import com.maven.bankapplication.ui.MainClass;

public class CustomerInterfaceDAOImpl implements CustomerInterfaceDAO{
	MainClass mc=new MainClass();
	Scanner scan=new Scanner(System.in);
	public void registration() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int x=100;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","capgemini","oracle");
		PreparedStatement pst=con.prepareStatement("insert into customer_details ( ACCOUNT_NO,FIRST_NAME, LAST_NAME, EMAIL_ID, PASSWORD, PANCARD_NO, AADHAAR_NO, ADDRESS, MOBILE_NO, BALANCE) \r\n" + 
				"values (s3.nextval,?,?,?,?,?,?,?,?,?)") ;

		System.out.println("f name");
		pst.setString(1,scan.next());
		System.out.println("l name");
		pst.setString(2,scan.next());
		System.out.println("email id");
		pst.setString(3,scan.next());
		System.out.println("pass");
		pst.setString(4,scan.next());
		System.out.println("pan card");
		pst.setString(5,scan.next());
		System.out.println("aadhar");
		pst.setLong(6,scan.nextLong());
		System.out.println("address");
		pst.setString(7,scan.next());
		System.out.println("mobile no");
		pst.setLong(8,scan.nextLong());
		System.out.println("balance");
		pst.setFloat(9,scan.nextFloat());

	boolean value=	pst.execute();
	System.out.println(value);
		
	}

	public void login() {
		// TODO Auto-generated method stub
		
	}

}