package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
@Service
public class BankAccountService {
    @Autowired
    private BankAccountRepository accountRepository;
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
    public Account createAccount(Account account) {
        account.setCreatedDate(new Date());
        /*account.setStatus(AccountStatus.ACTIVE);
        account.setStatus(AccountStatus.CLOSED); */
        return accountRepository.save(account);
    }
    public Account getAccountById(Long id) {
        return accountRepository.findById(id).orElse(null);
    }
    public boolean deposit(Long accountId, double amount) {
        // Implement deposit logic here
        // Update account balance and record the transaction
        return true; // Return true if successful
    }
}

