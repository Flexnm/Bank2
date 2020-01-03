package bank.system.core2;



public class Log {
	
	private long timestamp;
	private int clientId;
	private String description;
	private float amount;
	
	public Log(long timestamp, int clientId, String description, float amount) { // Creates a log with those details in it.
		this.timestamp = timestamp;
		this.clientId = clientId;
		this.description = description;
		this.amount = amount;
	}
	
	public String toString() {
		String details = "Log: [" + "Time: " + timestamp + ", Client ID: " + clientId + ", Description: " + description + ", Amount: " + amount + "]";
		return details; // Prints a description of an action, who did it, with how much money and when.
		
	}
	

}
