package bank.system.core2;

public class PlatinumClient extends Client {

	private float commissionRate = 0.1f;
	private float interestRate = 0.5f;

	public PlatinumClient(int clientId, String clientName, float clientBalance) {
		super(clientId, clientName, clientBalance);
		}
	
	public String toString() {
		return "Platinum Client with id: " + this.getId();
	}
	
	public void withdraw(float amount) throws WithdrawException {
		if(amount < super.getBalance()) {
		super.setBalance(super.getBalance() - (amount + amount * commissionRate));
		Bank.addCommission(amount * commissionRate);
		} else {
			throw new WithdrawException("", super.getId(), super.getBalance(), amount);
		}
	}

}
