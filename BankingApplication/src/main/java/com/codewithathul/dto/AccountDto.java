package com.codewithathul.dto;

public class AccountDto {
	
   private	Long id;
	
   private String accountholdername;

   private double balance;

public AccountDto() {
	super();
	// TODO Auto-generated constructor stub
}

public AccountDto(Long id, String accountholdername, double balance) {
	super();
	this.id = id;
	this.accountholdername = accountholdername;
	this.balance = balance;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getAccountholdername() {
	return accountholdername;
}

public void setAccountholdername(String accountholdername) {
	this.accountholdername = accountholdername;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

   
   
   
}
