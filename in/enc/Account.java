package in.enc;

public class Account {
	private Long accountNumber;
	private String name;

//	public static void main(String[] args) {
//		Account ac = new Account();
//		ac.AccountNumber = 34576348433l;
//		ac.name = "Praveen";
//		System.out.println(ac.AccountNumber + "=" + ac.name);
//	}
	
	public void setaccountNumber(Long accountNumber) {
		this.accountNumber=accountNumber;
	}
	
	public Long getaccountNumber() {
		return this.accountNumber;
	}
	
	public void setname (String name) {
		this.name = name;
	}
	
	public String getname() {
		return this.name;
	}

}
