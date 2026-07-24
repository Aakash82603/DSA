package EncapsulationProblem;

 class Atm {
     private int pin;
     private int balance;
     private int attempts=0;
     public Atm(int pin, int balance) {
         if(pin>=1000 && pin<=9999){
             this.pin = pin;
         }
         else{
             System.out.println("Invalid PIN! Default PIN set to 1234.");
             this.pin = 1234;
         }
         if(balance>=0){
             this.balance = balance;
         }else {
             this.balance = 0;
         }
     }

     public void login(int enteredpin){
          if(attempts>=3){
              System.out.println("ATM Blocked. Too many wrong attempts.");
              return;
          }
          else if(enteredpin==pin){
              System.out.println("Login successful");
              attempts=0;
          }
          else{
              attempts++;
              System.out.println("Wrong PIN");
              System.out.println("Attempts Left: " + (3 - attempts));
              if(attempts>=3){
                  System.out.println("Atm blocked");
              }
          }
     }
     public void deposit(int amount){
         if(amount>=0){
             System.out.println("Current balance: " + balance);
             this.balance += amount;
             System.out.println("Deposited: " + amount);
         }
            else{
                System.out.println("Invalid amount");
            }
     }
     public void withdraw(int amount){
            System.out.println("Current balance: " + balance);
            if(amount>=0 && amount<=balance){
                this.balance -= amount;
                System.out.println("Withdrawn: " + amount);
            }
            else{
                System.out.println("Invalid amount or insufficient balance");
            }
     }
     public void changepin(int newpin){
         if(newpin>=1000 && newpin<=9999){
             this.pin = newpin;
             System.out.println("PIN changed successfully");
         }
         else{
             System.out.println("Invalid PIN! Please enter a 4-digit PIN.");
         }
     }
     public void checkbalance(){
         System.out.println("Current balance: " + balance);
     }
 }
 public class AtmMachine{
     public static void main(String[] args) {
         Atm atm = new Atm(9876,10000);
         atm.login(9876);
         atm.deposit(50000);
         atm.withdraw(8000);
         atm.checkbalance();

     }
 }
