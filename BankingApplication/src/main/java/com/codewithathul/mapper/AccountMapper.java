package com.codewithathul.mapper;

import com.codewithathul.dto.AccountDto;
import com.codewithathul.entity.Account;

public class AccountMapper {

	public static Account mapToAccount(AccountDto accountDto) {
		
		Account account  = new Account(
				
				accountDto.getId(),
				accountDto.getAccountholdername(),
				accountDto.getBalance()	
				
				);
		return account;
		
	}
	
	
	public static AccountDto  mapToAccountDto(Account account) {
		
		AccountDto accountDto = new AccountDto(
				
				account.getId(),
				account.getAccountholdername(),
				account.getBalance()
			
				);
		
		return  accountDto;
		
	 
		
	}
	
}
