package pl.sda.behavioral.command;

public class Deposit implements UndoBankAccout{
    private BankAccount bankAccount;
    private int money;
    private boolean wasExecuted;
    public Deposit(BankAccount bankAccount,int money){
        this.bankAccount=bankAccount;
        this.money=money;
    }

    @Override
    public void execute() {
        bankAccount.deposit(money);
        wasExecuted=true;
    }

    @Override
    public void undo() {
        if(wasExecuted) {
            bankAccount.withdraw(money);
            wasExecuted = false;
        }
    }
}

