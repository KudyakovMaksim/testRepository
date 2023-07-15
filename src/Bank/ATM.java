package Bank;

public class ATM {
    private double balance;
    private boolean depositAmount;
    private boolean withdrawAmount;

    public ATM(){}

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(boolean depositAmount) {
        this.depositAmount = depositAmount;
    }

    public boolean isWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(boolean withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
