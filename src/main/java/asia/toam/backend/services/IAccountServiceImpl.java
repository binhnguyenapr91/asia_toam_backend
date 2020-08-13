package asia.toam.backend.services;

import asia.toam.backend.models.Account;
import asia.toam.backend.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IAccountServiceImpl implements IAccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Override
    public Iterable<Account> getAllAccount() {
        return accountRepository.findAll();
    }
}
