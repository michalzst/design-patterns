package pl.sda.behavioral.command;

public class Withdraw implements UndoBankAccout {
    private BankAccount bankAccount;
    private int money;
    private boolean wasExecuted;

    public Withdraw(BankAccount bankAccount, int money) {
        this.bankAccount = bankAccount;
        this.money = money;
    }

    @Override
    public void execute() {
        bankAccount.withdraw(money);
        wasExecuted = true;
    }


    public void undo() {
        if (wasExecuted) {
            bankAccount.deposit(money);
            wasExecuted = false;
        }
    }
}




