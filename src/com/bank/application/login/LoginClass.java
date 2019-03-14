package com.bank.application.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.bank.application.modal.CustDetails;
public class LoginClass {
	class MyException extends Exception 
	{ 
	    public MyException(String s) 
	    { 
	        
	        super(s); 
	    } 
	} 

public void getLoginDetails() throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/BankApplication","root","root");
	String str1="insert into login (login_id,password,acc_no) values(?,?,?)";
	PreparedStatement pst1=con.prepareStatement(str1);
 Scanner sysin=new Scanner(System.in);
 
 CustDetails cdd=new CustDetails();
 
 System.out.println("enter the aadhar card number");
 String adno=sysin.next();
 
 String quary2="select * from customer";
 ResultSet rs=pst1.executeQuery(quary2);
 

 while(rs.next()) {
	 String s= rs.getString("aadhar_no");
	 
	 System.out.println(s);
	 boolean i=adno.contentEquals(s);
	 System.out.println(i);
	 if(adno.contentEquals(s)){
		 System.out.println("exist");
		 throw new MyException("customer already exist");	 
	 }
	else {
	System.out.println(" please enter your credentials for Registration"+"\n");
cdd.getCustDetails();
}		
 }

}
 
} 
 
 
 
 
 
 
 
 
 
 
 
 
 

