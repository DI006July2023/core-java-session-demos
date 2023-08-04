package springcorexml;

public class Account {
	private int accNumber;
	private String accName;
	
	public Account() {
	}

	public Account(int accNumber, String accName) {
		super();
		this.accNumber = accNumber;
		this.accName = accName;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	@Override
	public String toString() {
		return "Account [accNumber=" + accNumber + ", accName=" + accName + "]";
	}
	
	
}
