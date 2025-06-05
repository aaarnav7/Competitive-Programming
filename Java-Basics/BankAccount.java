
import java.util.Scanner;


public class BankAccount {

    String name;
    String password;
    double balance;

    public void withdraw (String enteredPassword, double ammount) {
      if (enteredPassword.equals(password)) {
       if (balance >= ammount) {
         balance -= ammount;
         System.out.println("transaction successful" + balance);  
       }
      }
      else {
        System.out.println("transaction failed");
     }   
    }
    
    public void deposit (String enteredPassword, double ammount) {
        if (enteredPassword.equals(password)) {
          balance += ammount;
          System.out.println("transaction successful" + balance);
        }
    }

    public double getBalance(String enteredPassword) {
        if (enteredPassword.equals(password))
            return balance;
        else return -1;
         
    }

    public void transfer(BankAccount other, String enteredPassword, double amount) {
    // check if entered password matches first users password
    if (enteredPassword.equals(password)) {
        // get other accounts password
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter other account's pass:");
        String tmp = sc.next(); // tmp stores other acc's pass

        if (tmp.equals(other.password)) { // not safe!!

            // withdraw money from first account
            this.withdraw(enteredPassword, amount); // first

            // depost money to second account
            other.deposit(tmp, amount); // second
        }
        }
     else {
        System.out.println("Transaction failed!: err code" + "23");
    }
}
}

            



       
    
