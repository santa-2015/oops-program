package oopsProblems;
import java.util.ArrayList;


public class Bank {

private  ArrayList <Account>accounts;

public Bank() {
	accounts=new ArrayList<Account>();
}
public void addAccount(Account account) {
	accounts.add(account);
}
public void removeAccount(Account account) {
	accounts.remove(account);
}
public void depositMoney(Account account,double amount) {
	
	account.deposit(amount);
}
public void withdraw(Account account,double amount) {
	account.withdraw(amount);
}
public ArrayList<Account>getAcccounts(){
	return accounts;
}
public static void main(String[]args) {
	Bank bank=new Bank();
	Account account1=new Account("santa","v123",20000);
	Account account2=new Account("rita","v456",39876);
	Account account3=new Account("gandha","v789",768558);
	
	bank.addAccount(account3);
	bank.addAccount(account2);
	bank.addAccount(account1);
	ArrayList<Account>accounts=bank.getAcccounts();
	for(Account account:accounts) {
		System.out.println(account.getAccountInfo());
		
	}
	
}
}
