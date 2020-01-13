package gram.william;

import java.lang.reflect.AccessibleObject;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    // Constructor: something special that has only the access modifier and the name of the class
    public BankAccount() {
        // We call a default constructor, if no parameters are set
        // must be first statement to be called!
        this(
                12345, 950.00, "WGRAM",
                "wgr@mail.com", 12345
        );
        System.out.println("Default account generated.");
    }

    // Overloading constructor (must change no. of parameters)
    public BankAccount(int accountNumber, double balance,
                       String name, String email, int phoneNumber) {

        // Most agree that constructors should define fields directly - not calling other methods
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Account with user parameters called.");
    }

    public BankAccount(String name, String email, int phoneNumber) {
        this(12345, 101.15, name, email, phoneNumber);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(double funds) {
        if (funds < 0) {
            System.out.println("Cannot deposit negative funds." +
                    " Do you want to make a withdrawal instead?");
        } else {
            this.balance += funds;
            System.out.println("Funds deposited: " + funds + "." +
                    " New balance is: " + this.balance);
        }
    }

    public void withdrawFunds(double funds) {
        if (funds < 0) {
            System.out.println("Cannot withdraw negative funds. " +
                    "Do you want to make a deposit instead?");
        } else if (funds > this.balance) {
            System.out.println("Insuficient funds.");
        } else {
            this.balance -= funds;
            System.out.println("Funds withdrawn: " + funds + ". " +
                    "New balance is " + this.balance);
        }
    }


}
