package bank.system.core2;

public class WithdrawException extends Exception {

	private int clientId;
	private float currentBalance;
	private float withdrawAmount;

	public WithdrawException(String message, int clientId, float currentBalance, float withdrawAmount) {
		super("The withdrawn amount exceeds the client balance!");
//		this.clientId = clientId;
//		this.currentBalance = currentBalance;
//		this.withdrawAmount = withdrawAmount;

	}

	public int getClientId() {
		return clientId;
	}

	public float getCurrentBlanace() {
		return currentBalance;
	}

	public float getWithdrawAmount() {
		return withdrawAmount;
	}

}
