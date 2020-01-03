package bank.system.core2;

import java.sql.Timestamp;
import java.util.ArrayList;

public abstract class Client {

	private int clientId;
	private String clientName;
	private float clientBalance;
	private ArrayList<Account> accounts = new ArrayList<Account>();
	protected float commissionRate;
	protected float interestRate;
	private Logger logger = new Logger("[Client Logger]");

	public Client(int clientId, String clientName, float clientBalance) {
		this.clientId = clientId;
		setName(clientName);
		setBalance(clientBalance);

	}

	public int getId() {
		return clientId;
	}

	public String getName() {
		return clientName;
	}

	public float getBalance() {
		return clientBalance;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setName(String clientName) {
		this.clientName = clientName;
	}

	public void setBalance(float clientBalance) {
		this.clientBalance = clientBalance;
	}

	public void addAccount(Account newAccount) {
		accounts.add(newAccount);
		// Log the operation in the loop.
		Log clientLog = new Log(System.currentTimeMillis(), this.clientId, "New account added to the client", newAccount.getBalance());
		Logger.log(clientLog);
		return;
	}

	public Account getAccount(int index) {
		if (index < accounts.size()) {
			return accounts.get(index); // returns the Account object at specified index in the Accounts array.
		} else {
			System.out.println("No account found in specified index.");
			return null;
		}
	}

	public void removeAccount(Account account) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).equals(account)) {
				clientBalance += account.getBalance();
				// Log the operation:
				Log clientLog = new Log(System.currentTimeMillis(), clientId, "This client has removed an account", account.getBalance());
				accounts.remove(i);
				Logger.log(clientLog);
				return;
			}
		}
	}

	public void deposit(float amount) {
		setBalance(clientBalance + (amount - amount * commissionRate));
	}

	public void withdraw(float amount) throws WithdrawException {
		if (amount < clientBalance) {
			setBalance(clientBalance - (amount + amount * commissionRate));
			Bank.addCommission(amount * commissionRate);
		} else {
			throw new WithdrawException("", clientId, clientBalance, amount);
		}
	}

	public void autoUpdateAccount() {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i) != null) {
				accounts.get(i).setBalance(accounts.get(i).getBalance() + accounts.get(i).getBalance() * interestRate);
			}
		}
	}

	public float getFortune() {
		float totalClientBalance = getBalance();
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i) != null) {
				totalClientBalance += accounts.get(i).getBalance();
			}
		}
		return totalClientBalance;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Client)) {
			return false;
		}
		Client clientCheck = (Client) obj;
		if (this.clientId == clientCheck.clientId) {
			return true;
		} else {
			return false;
		}
	}

}
