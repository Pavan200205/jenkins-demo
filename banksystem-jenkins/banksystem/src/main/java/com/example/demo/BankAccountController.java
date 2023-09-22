package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class BankAccountController {
	@Autowired
	private BankAccountService accountService;
	@GetMapping
	public List<Account> getAllAccounts() {
		return accountService.getAllAccounts();
	}
	@PostMapping
	public Account createAccount(@RequestBody Account account) {
		return accountService.createAccount(account);
	}
	@GetMapping("/{id}")
	public Account getAccountById(@PathVariable Long id) {
		return accountService.getAccountById(id);
	}
	@PostMapping("/{id}/deposit")
    public boolean deposit(@PathVariable Long id, @RequestParam double amount) {
        return accountService.deposit(id, amount);
    }
}