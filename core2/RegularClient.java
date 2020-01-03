package bank.system.core2;

public class RegularClient extends Client {

	private float commissionRate = 0.3f;
	private float interestRate = 0.1f;

	public RegularClient(int clientId, String clientName, float clientBalance) {
		super(clientId, clientName, clientBalance);
	}
	
	public String toString() {
		return "Regular Client with id: " + this.getId();
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
