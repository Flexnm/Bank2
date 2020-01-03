package bank.system.core2;

public class Account {
	
	private int id;
	private float balance;
	
	public Account(int id, float balance) {
		this.id = id;
		setBalance(balance);
	}
	
	public int getId() {
		return id;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void setBalance(float balance) {
		this.balance = balance;
		
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Account)) {
			return false;
		}
		Account accountCheck = (Account)obj;
		if(this.id == accountCheck.id) {
			return true;
		} else {
			return false;
		}
	}
	

}
