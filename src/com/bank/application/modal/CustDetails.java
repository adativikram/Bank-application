package com.bank.application.modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class CustDetails {

//	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	public void getCustDetails() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/BankApplication","root","root");
		
		String str="insert into customer (cust_id,cust_name,aadhar_no,acc_no) values(?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(str);
	
	 Scanner sysin=new Scanner(System.in);
	 System.out.println("enter cust id");
	pst.setString(1,sysin.next());
	 System.out.println("enter cust name");
	pst.setString(2, sysin.next());
	 System.out.println("enter cust aadhar number");
	pst.setString(3, sysin.next());
	 System.out.println("generating account number");
	pst.setInt(4, getAccNo());
	pst.execute();
	}
	private static int getAccNo() {
		// TODO Auto-generated method stub
		Random rand=new Random();
		int accountNo;
		accountNo=rand.nextInt(999999);
		System.out.println("Your account number is :"+accountNo);
        return accountNo;
	}
	



}
