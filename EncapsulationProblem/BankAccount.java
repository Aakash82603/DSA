package EncapsulationProblem;

 class Bank {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;

    }
    public void setBalance(double balance){
        if(balance>0){
            this.balance=balance;
        }
        else{
            System.out.println("Balance cannot be negative");
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }else{
            System.out.println("Balance cannot be negative");
        }


    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }
        else{
            System.out.println("Invalid  insufficient balance");
        }

    }


}
public class BankAccount{
    public static void main(String[] args) {
        Bank b=new Bank();
        b.setAccountHolderName("Aakash");
        b.setAccountNumber("123456789");
        b.setBalance(5000);
        b.deposit(5000);
        b.withdraw(12000);
       // b.display();

        System.out.println("Name: " + b.getAccountHolderName());
        System.out.println("Account No: " + b.getAccountNumber());
        System.out.println("Balance: " + b.getBalance());

    }

}
