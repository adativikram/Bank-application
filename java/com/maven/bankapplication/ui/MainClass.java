package com.maven.bankapplication.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.maven.bankapplication.service.CustomerInterfaceService;
import com.maven.bankapplication.service.CustomerInterfaceServiceImpl;

public class MainClass {

 static Scanner input;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("please enter \n 1. for registration \n 2. for login \n 3. to exit from application");
		input = new Scanner(System.in);
		CustomerInterfaceService cif;
		int ch=input.nextInt();
			switch(ch) {
			case 1:cif=new CustomerInterfaceServiceImpl();
			cif.registration();
				break;
			case 2:
				break;
			case 3:
				break;
			}

	}

}
