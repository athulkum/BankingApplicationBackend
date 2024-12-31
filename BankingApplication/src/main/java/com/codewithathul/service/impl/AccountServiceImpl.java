package com.codewithathul.service.impl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.codewithathul.dto.AccountDto;
import com.codewithathul.entity.Account;
import com.codewithathul.mapper.AccountMapper;
import com.codewithathul.repository.AccountRepository;
import com.codewithathul.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	private AccountRepository accountRepository;
	
	
	public AccountServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}



	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		// TODO Auto-generated method stub
		
		Account account =AccountMapper.mapToAccount(accountDto);
	 Account savedAccount =	accountRepository.save(account);
		
		return AccountMapper.mapToAccountDto(savedAccount);
	}



	@Override
	public AccountDto getAccountById(Long id) {
		// TODO Auto-generated method stub
	Account account	= accountRepository.findById(id).orElseThrow(()-> new RuntimeException("Account does not exist"));
		
	return AccountMapper.mapToAccountDto(account);
	}



	@Override
	public AccountDto deposit(Long id, double amount) {
		// TODO Auto-generated method stub
		Account account	= accountRepository.findById(id).orElseThrow(()-> new RuntimeException("Account does not exist"));
	    double totalBalance = account.getBalance() +amount;
	    account.setBalance(totalBalance);
	    Account savedAccount =	accountRepository.save(account);
		
		return AccountMapper.mapToAccountDto(savedAccount);
	}



	@Override
	public AccountDto withdrow(long id, double amount) {
		// TODO Auto-generated method stub
		Account account	= accountRepository.findById(id).orElseThrow(()-> new RuntimeException("Account does not exist"));
	   if(account.getBalance() <amount) {
		   throw new RuntimeException ("insufficient Balance");
	   }
	  double totaBalance =  account.getBalance() -amount;
	  account.setBalance(totaBalance);
	  Account savedAccount = accountRepository.save(account);
	  
		return AccountMapper.mapToAccountDto(savedAccount);
	}



	@Override
	public List<AccountDto> getAllAccounts() {
		// TODO Auto-generated method stub
		
		return accountRepository.findAll().stream().map((account)->AccountMapper.mapToAccountDto(account)).collect(Collectors.toList());
		
	
	}



	@Override
	public void deletAccount(long id) {
		// TODO Auto-generated method stub
		
		Account account	= accountRepository.findById(id).orElseThrow(()-> new RuntimeException("Account does not exist"));
		accountRepository.delete(account);
		
		
	}
	
	
	


}
