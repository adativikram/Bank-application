package com.maven.bankapplication.ui;


import java.sql.SQLException;
import java.util.Scanner;

import com.maven.bankapplication.service.CustomerInterfaceService;
import com.maven.bankapplication.service.CustomerInterfaceServiceImpl;
import com.maven.bankapplication.service.TransactionInterfaceService;
import com.maven.bankapplication.service.TransactionInterfaceServiceImpl;

public class MainClass {

 static Scanner input;
 static CustomerInterfaceService cif=new CustomerInterfaceServiceImpl();
 static TransactionInterfaceService tif=new TransactionInterfaceServiceImpl();
 
 
  static void choice() throws ClassNotFoundException, SQLException {
		System.out.println("please enter \n 1. for registration \n 2. for login \n 3. to exit from application");
		input = new Scanner(System.in);
		
		int ch=input.nextInt();
		
			switch(ch) {
			case 1:
			cif.registration();
				break;
			case 2:
				cif.login();
				break;
			case 3:System.out.println("*****application terminated*****");
				System.exit(0);
				break;
			}

		}

  
 
	public void transactionMethod() throws ClassNotFoundException, SQLException{
		System.out.println("************************************");
		System.out.println("please enter  \n 1.for withdraw \n 2.for deposit \n 3.for transfer"
				+ " \n 4. for balance\n 5.main menu \n 6.for exit");
		int ch2=input.nextInt();
		switch(ch2) { 
		case 1:tif.withdraw();
		transactionMethod();
			break;
		case 2:tif.deposit();
		transactionMethod();
			break;
		case 3:tif.transfer();
		transactionMethod();
			break;
		case 4:tif.balanceEnquiry();
		transactionMethod();
			break;
		case 5:choice();
			break;
		case 6:System.out.println("*****application terminated*****");
		System.exit(0);
			break;

		}

	}

	 	public void fname() {System.out.println("f name");}
		public void lname() {System.out.println("l name");}
		public void mail() {System.out.println("email id");}
		public void address() {System.out.println("address");}
		public void password() {System.out.println("enter password");}
		public void pancard() { System.out.println("enter pancard number");}
		public void aadhar(){System.out.println("enter aadhar card number");}
		public void balance() {System.out.println("balance");}
		public void mobileNo() {System.out.println("enter mobile number");} 
		public void successMessage() {System.out.println("you are successfully loged in ");}

	 
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub
					choice();
		}
}
