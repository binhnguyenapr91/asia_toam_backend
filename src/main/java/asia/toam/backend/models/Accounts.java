package asia.toam.backend.models;

import java.util.ArrayList;
import java.util.List;

public class Accounts {
    private List<Account> accounts;

    public List<Account> getAccounts() {
        if(accounts == null){
            return new ArrayList<>();
        }else
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
