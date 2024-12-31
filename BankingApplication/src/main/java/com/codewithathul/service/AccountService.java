package com.codewithathul.service;

import java.util.List;

import com.codewithathul.dto.AccountDto;


public interface AccountService {

     AccountDto createAccount(AccountDto account);
     
     AccountDto  getAccountById (Long id);
     
     AccountDto deposit(Long id, double amount);
     
     AccountDto withdrow(long id, double amount);
     
     List<AccountDto> getAllAccounts();
     
     void deletAccount(long id);
	
}
