
class BankAccount{
    String accountNumber;
    double balence;

    BankAccount(String accountNumber, double balence){
        this.accountNumber = accountNumber;
        this.balence = balence;
    }
    double CalculateInterest(){
        return 0.0;
    }
    void DisplayBalence(){
        System.out.println("Account: "+ accountNumber);
        System.out.println("Balence: " + balence);
    }
}
class SavingsAccount extends BankAccount{
    SavingsAccount(String accountNumber, double balence){
        super(accountNumber, balence);
    }
    @Override
    double CalculateInterest(){
        return balence * 0.05;
    }
}
class FixedDepositAccount extends BankAccount{
    FixedDepositAccount(String accountNumber, double balence){
        super(accountNumber, balence);
    }
    @Override
    double CalculateInterest(){
        return balence * 0.08;
    }
}

public class Java_6 {
    static void showAccount(BankAccount account){
        account.DisplayBalence();
        System.out.println(account.CalculateInterest());
    }
    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount("001", 1000);
        FixedDepositAccount fixed = new FixedDepositAccount("001", 1000);

        showAccount(savings);
        System.out.println();
        showAccount(fixed);
    }
}