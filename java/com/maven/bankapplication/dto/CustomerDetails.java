package com.maven.bankapplication.dto;

public class CustomerDetails {
private int accountNo,aadharNo,mobileNo,balance;
private String firstName,lastName,emailId,password,pancardNo,address;
public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public int getAadharNo() {
	return aadharNo;
}
public void setAadharNo(int aadharNo) {
	this.aadharNo = aadharNo;
}
public int getMobileNo() {
	return mobileNo;
}
public void setMobileNo(int mobileNo) {
	this.mobileNo = mobileNo;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPancardNo() {
	return pancardNo;
}
public void setPancardNo(String pancardNo) {
	this.pancardNo = pancardNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


}