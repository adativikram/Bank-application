package com.maven.bankapplication.service;

import java.sql.SQLException;

import com.maven.bankapplication.dao.CustomerInterfaceDAO;
import com.maven.bankapplication.dao.CustomerInterfaceDAOImpl;

public class CustomerInterfaceServiceImpl implements CustomerInterfaceService{
	CustomerInterfaceDAO  daoObj=new CustomerInterfaceDAOImpl(); 
	public void registration() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	
		
		daoObj.registration();	
	}

	public void login() {
		// TODO Auto-generated method stub
		daoObj.login();
	}

}
