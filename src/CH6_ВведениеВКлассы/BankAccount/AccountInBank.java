package CH6_ВведениеВКлассы.BankAccount;


public class AccountInBank {

    long accountNumber;
    String accountHolder;
    double balance;

    AccountInBank (long accountNumber, String accountHolder, double balance) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void Deposit (double Sum) {

        balance += Sum;

        System.out.print("Действия по счёту № " + accountNumber);
        System.out.println(", владелец счёта " + accountHolder);
        System.out.println("Депозит на сумму: " + Sum + " RUB. Текущий баланс: " + balance + " RUB.\n");
    }

    void unDepos (double Sum) {

        if (balance < Sum) {
            System.out.println("Недостаточно средств для выполнения операции.\n");
            return;
        }

        balance -= Sum;

        System.out.print("Действия по счёту № " + accountNumber);
        System.out.println(", владелец счёта " + accountHolder + ".");
        System.out.println("Снятие средств: " + Sum + " RUB. Текущий баланс: " + balance + " RUB.\n");
    }

    void blce () {

        System.out.println("Текущий баланс - " + balance + " RUB.\n");
    }

    void returnInfo () {

        System.out.print("Cчёт № " + accountNumber);
        System.out.println(", владелец счёта " + accountHolder + ".");
        System.out.println("Текущий баланс средств: " + balance + " RUB.\n");
    }
}
