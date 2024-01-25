package CH6_ВведениеВКлассы.BankAccount;

public class Main {

    public static void main(String[] args) {

        var Steve = new AccountInBank(9_0000_0000, "Steve", 0);

        Steve.blce();

        Steve.Deposit(3920.23);

        Steve.unDepos(4000);

        Steve.blce();

        Steve.returnInfo();
    }
}
