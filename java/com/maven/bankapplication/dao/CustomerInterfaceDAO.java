package com.maven.bankapplication.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface CustomerInterfaceDAO {
		void registration() throws ClassNotFoundException, SQLException;
		void login() throws ClassNotFoundException, SQLException;
	}


