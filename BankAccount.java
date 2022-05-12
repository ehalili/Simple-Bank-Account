package JavaBegginer.Session14;

import javax.xml.validation.Validator;
import java.util.Objects;

public class BankAccount {
    private long accountNr;
    private String client;
    private double balance;

    public BankAccount(long accountNr, String name){
        this.accountNr = accountNr;
        this.client = name;
    }

    public BankAccount(long accountNr, String name, double balance) {
        this.accountNr = accountNr;
        this.client = name;
        this.balance = balance;
    }

    public long getAccountNr() {
        return accountNr;
    }

    public String getClient() {
        return client;
    }

    public void deposit(int amount){
        if(amount <= 0){
            System.out.println("deposit: Amount must be positive!");
        } else {
            balance += amount;
        }
    }

    public void withdraw(int amount){
        if(amount <= 0){
            System.out.println("withdraw: Amount must be positive!");
        } else if (amount > balance){
            System.out.println("withdraw: Not enough funds!");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public String toString(){
        return String.format("[%d]-%s: %.2f", accountNr, client, balance);
    }

    @Override
    public int hashCode() {
        return (int) (accountNr ^ (accountNr >>> 32));
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof BankAccount){
            BankAccount ba = (BankAccount)obj;
            return accountNr == ba.accountNr;
        }
        return false;
    }
}
