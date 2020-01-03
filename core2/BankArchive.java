package bank.system.core2;

public class BankArchive {
	
//	package bank.system.core2;
//
//	public class Bank {
//		
//		// singleton
//		public static Bank instance = new Bank();
//		
//		private float bankTotal;
//		private Client[] clients;
//		private Logger logService;
//		// private accunt updater;
//		//private Logger logger = new Logger("Driver name");;
//		
//		private static float commissionSum;
//		
//		private Bank() {
//			clients = new Client[100];
//			logService = new Logger("Driver name");
//
//		}
//		
//		// singleton method:
//		public static Bank getInstance() {
//			return instance;
//		}
//
//		public void setBalance() {
//			float total = 0;
//			for (int i = 0; i < clients.length; i++) {
//				if (clients[i] != null) {
//					total += clients[i].getFortune();
//				}
//			}
//			total += commissionSum;
//			bankTotal = total;
//		}
//
//		public float getBalance() {
//			setBalance();
//			return bankTotal;
//		}
//
//		public void addClient(Client newClient) {
//			for (int i = 0; i < clients.length; i++) {
//				if (clients[i] == null) {
//					clients[i] = newClient;
//					// Log the operation:
//					Log bankLog = new Log(0, newClient.getId(), "Client was added to the bank.", newClient.getBalance());
//					Logger.log(bankLog);
//					return;
//				}
//			}
//		}
//
//		public void removeClient(Client client) {
//			for (int i = 0; i < clients.length; i++) {
//				if (clients[i] != null && clients[i].equals(client)) {
//					Log bankLog = new Log(0, client.getId(), "Client removed from bank.", client.getFortune());
//					Logger.log(bankLog);
//					clients[i] = null;
//					setBalance();
//					return;
//				}
//			}
//		}
//		
//		public Client[] getClients() {
//			return clients;
//		}
//		
//		public void printClientList() {
//			// toString
//		}
//		
//		// view logs
//		
//		public void startAccountUpdater() {
//			
//		}
//		
//		public static void addCommission(float commission) {
//			commissionSum += commission;
//		}
//
//	}

}
