package com.maven.bankapplication.dao;

import java.sql.SQLException;

public interface CustomerInterfaceDAO {
		void registration() throws ClassNotFoundException, SQLException;
		void login();
	}


