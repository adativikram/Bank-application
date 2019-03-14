package com.maven.bankapplication.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.maven.bankapplication.service.CustomerInterfaceService;
import com.maven.bankapplication.service.TransactionInterfaceService;
import com.maven.bankapplication.service.TransactionInterfaceServiceImpl;
import com.maven.bankapplication.ui.MainClass;

public class CustomerInterfaceDAOImpl implements CustomerInterfaceDAO{
	MainClass mc=new MainClass();
	Scanner scan=new Scanner(System.in);
	Connection con;
	TransactionInterfaceService tis=new TransactionInterfaceServiceImpl();
	public void connection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","capgemini","oracle");
	}
	public void registration() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub/*	connection();
		PreparedStatement pst=con.prepareStatement("insert into customer_details ( ACCOUNT_NO,FIRST_NAME, LAST_NAME, EMAIL_ID, PASSWORD, PANCARD_NO, AADHAAR_NO, ADDRESS, MOBILE_NO, BALANCE) \r\n" + 
				"values (s3.nextval,?,?,?,?,?,?,?,?,?)") ;

		
		mc.fname();
		pst.setString(1,scan.next());
		mc.lname();	
		pst.setString(2,scan.next());
		mc.mail();
		pst.setString(3,scan.next());
		mc.password();
		pst.setString(4,scan.next());
		mc.pancard();
		pst.setString(5,scan.next());
		mc.aadhar();
		pst.setLong(6,scan.nextLong());
		mc.address();
		pst.setString(7,scan.next());
		mc.mobileNo();
		pst.setLong(8,scan.nextLong());
		mc.balance();
		pst.setFloat(9,scan.nextFloat());
		ResultSet rs=pst.executeQuery();
		
		
		PreparedStatement pst2=con.prepareStatement("select count(*) from customer_details" );
		ResultSet rs1=pst2.executeQuery();
		int count=0;
		while(rs1.next())
		count=rs1.getInt(1);//it will give the total number of rows in the table

		
		PreparedStatement pst3=con.prepareStatement("select * from customer_details" );
		ResultSet rs2=pst3.executeQuery();
		 
		for(int i=0;i<count;i++)
		rs2.next();// the cursor selects the last row
		
		
		System.out.println("you are succesfully registered and your account number is :  "+rs2.getString(1));
		login();

	}

	public void login() throws ClassNotFoundException, SQLException {
		
			System.out.println("enter your account number");
			String accNo=scan.next();
			System.out.println("enter your password");
			String psw=scan.next();

			connection();

			PreparedStatement pst4=con.prepareStatement("select * from customer_details" );
			ResultSet rs4=pst4.executeQuery();
			
			while(rs4.next()) {
				String acNo=rs4.getString(1);
				String pswrd=rs4.getString(5);
					if(accNo.contains(acNo) && psw.contains(pswrd )) {
						mc.successMessage();
						mc.transactionMethod();
					}
				}
		
		}
}	
