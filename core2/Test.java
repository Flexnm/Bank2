package bank.system.core2;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
	
	Bank b = Bank.getInstance();
		
	Client c1 = new RegularClient(101, "Reg", 500);
	Client c2 = new GoldClient(102, "Gold", 1500);
	Client c3 = new PlatinumClient(103, "Plat", 0);
	b.addClient(c1);
	b.addClient(c2);
	b.addClient(c3);
	Account a1 = new Account(1001, 1000);
	Account a2 = new Account(1002, 500);
	Account a3 = new Account(1003, 2000);
	
	Account ac1 = new Account(2001, 1000);
	Account ac2 = new Account(2002, 500);
	Account ac3 = new Account(2003, 2000);
	
	
	Account acc1 = new Account(3001, 1000);
	Account acc2 = new Account(3002, 2000);
	Account acc3 = new Account(3003, 3000);
	
	
	c1.addAccount(a1);
	c1.addAccount(a2);
	c1.addAccount(a3);
	
	c2.addAccount(ac1);
	c2.addAccount(ac2);
	c2.addAccount(ac3);

	c3.addAccount(acc1);
	c3.addAccount(acc2);
	c3.addAccount(acc3);
	
	c3.removeAccount(acc1);
	c3.removeAccount(acc2);
	c3.removeAccount(acc3);
	b.removeClient(c3);
	
	System.out.println("Client: " + c1.getBalance());
	System.out.println("Bank: " + b.getBalance());
	try {
		c1.withdraw(100);
		
	} catch (WithdrawException e) {
		System.out.println(e.getMessage());
	}
	
	System.out.println(c1.getBalance());
	
	System.out.println(b.getClients());
	}	
}
