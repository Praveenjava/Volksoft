package in.arr;

class RBI {
	boolean checkElgibility() {
		// docs verification logic
		return false;
	}

	double getHomeLoanRofi() {
		return 10.85;
	}
}

public class SBIBank extends RBI {

	// overriding parent method to give my own rofi
	double getHomeLoanRofi() {
		return 36.85;
	}

	public String applyHomeLoan() {
		boolean status = checkElgibility(); // parent method
		if (status) {
			double homeLoanRofi = getHomeLoanRofi(); // child method
			String msg = "Your loan approved with RI as ::" + homeLoanRofi;
			return msg;
		} else {
			return "You are not elgible for home loan";
		}
	}

	public static void main(String[] args) {
		SBIBank bank = new SBIBank();
		String msg = bank.applyHomeLoan();
		System.out.println(msg);
	}

}
