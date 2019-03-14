package com.bank.application.presentation;

import com.bank.application.login.LoginClass;
import com.bank.application.modal.CustDetails;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CustDetails customerObj=new CustDetails();
		LoginClass login=new LoginClass();
		login.getLoginDetails();
	//customerObj.getCustDetails();
	}

}
