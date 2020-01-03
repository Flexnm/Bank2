package bank.system.core2;

import java.util.ArrayList;

public class Logger {

	private String driverName;

	public Logger(String driverName) {
		this.driverName = driverName;
	}

	public static void log(Log log) { // Prints a Log to the screen.
		System.out.println(log);
	}

	public ArrayList<Log> getLogs() {
		ArrayList<Log> logs = new ArrayList<Log>();
		return logs;
	}

}
