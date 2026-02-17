import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

public class User {

    private String username;
    private String password;
    //OneToMany: one user yo many bank Accounts
    private BankAccount[] bankAccount;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.bankAccount = new BankAccount[10];
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BankAccount[] getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount[] bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void addBankAccount(BankAccount newAccount) {
        for (int i = 0; i < getBankAccount().length; i++) {
            if (getBankAccount()[i] == null) {
                bankAccount[i] = newAccount;
                break;
            }
        }
    }

    public void removeBankAccount(BankAccount forRemove) {
        for (int i = 0; i < getBankAccount().length; i++) {
            if(getBankAccount()[i] == forRemove) {
                bankAccount[i] = null;
                break;
            }
        }
    }

    public void showInfo() {

        double total = 0.0;
        for (BankAccount account : bankAccount) {
            if (account != null) {
                total += account.getBalance();
            }
        }

        System.out.printf("Username='%s', Password='%s', Total Balance=%,.0f'",
                username, password, total);
    }
}
