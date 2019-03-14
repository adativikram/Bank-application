package com.maven.bankapplication.service;

import com.maven.bankapplication.dao.TransactionInterfaceDAO;
import com.maven.bankapplication.dao.TransactionInterfaceDAOImpl;

public class TransactionInterfaceServiceImpl implements TransactionInterfaceService {

	TransactionInterfaceDAOImpl tifDAO= new TransactionInterfaceDAOImpl();
	
	 public void withdraw() {
		// TODO Auto-generated method stub
		
		tifDAO.withdraw();
	}

	public void deposit() {
		// TODO Auto-generated method stub
		tifDAO.deposit();
	}

	public void transfer() {
		// TODO Auto-generated method stub
		tifDAO.transfer();
	}

	public void balanceEnquiry() {
		// TODO Auto-generated method stub
		tifDAO.balanceEnquiry();
	}

}
