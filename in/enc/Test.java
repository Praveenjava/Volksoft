package in.enc;

public class Test {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.setaccountNumber(3474256578787l);
		ac.setname("Praveen");

		Long getaccountNumber = ac.getaccountNumber();
		String getname = ac.getname();

		System.out.println(getaccountNumber + "=" + getname);
	}

}
