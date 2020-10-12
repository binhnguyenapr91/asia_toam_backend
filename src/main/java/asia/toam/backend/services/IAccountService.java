package asia.toam.backend.services;

import asia.toam.backend.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountService {
    Iterable<Account> getAllAccount();
}
