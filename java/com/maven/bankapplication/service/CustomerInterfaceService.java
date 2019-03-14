package com.maven.bankapplication.service;

import java.sql.SQLException;

public interface CustomerInterfaceService {
	void registration() throws ClassNotFoundException, SQLException;
	void login() throws ClassNotFoundException, SQLException;
}
