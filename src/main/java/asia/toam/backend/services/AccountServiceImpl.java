package asia.toam.backend.services;

import asia.toam.backend.models.Account;
import asia.toam.backend.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountRepository accountRepository;
    @Override
    public Iterable<Account> getAllAccount() {
        return accountRepository.findAll();
    }
}
