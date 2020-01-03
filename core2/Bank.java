package bank.system.core2;

import java.util.ArrayList;

public class Bank {

	// singleton
	public static Bank instance = new Bank();

	private float bankTotal;
	private ArrayList<Client> clients;
	private Logger logService;
	// private accunt updater;
	// private Logger logger = new Logger("Driver name");;

	private static float commissionSum;

	private Bank() {
		clients = new ArrayList<Client>();
		logService = new Logger("Driver name");

	}

	// singleton method:
	public static Bank getInstance() {
		return instance;
	}

	public void setBalance() {
		float total = 0;
		for (int i = 0; i < clients.size(); i++) {
			if (clients.get(i) != null) {
				total += clients.get(i).getFortune();
			}
		}
		total += commissionSum;
		bankTotal = total;
	}

	public float getBalance() {
		setBalance();
		return bankTotal;
	}

	public void addClient(Client newClient) {
		clients.add(newClient);
		// Log the operation:
		Log bankLog = new Log(System.currentTimeMillis(), newClient.getId(), "Client was added to the bank.", newClient.getBalance());
		Logger.log(bankLog);
		return;
	}

	public void removeClient(Client client) {
		for (int i = 0; i < clients.size(); i++) {
			if (clients.get(i).equals(client)) {
				Log bankLog = new Log(System.currentTimeMillis(), client.getId(), "Client removed from bank.", client.getFortune());
				Logger.log(bankLog);
				clients.remove(i);
				setBalance();
				return;
			}
		}
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void printClientList() {
		// toString
	}

	// view logs

	public void startAccountUpdater() {

	}

	public static void addCommission(float commission) {
		commissionSum += commission;
	}

}
