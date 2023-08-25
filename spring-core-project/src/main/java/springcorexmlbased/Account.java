package springcorexmlbased;

public class Account {
	private int accNo;
	private String accType;
	private double accBalance;
	
	public int getAccNo() {
		return accNo;
	}
	
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccType() {
		return accType;
	}
	
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getAccBalance() {
		return accBalance;
	}
	
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accType=" + accType + ", accBalance=" + accBalance + "]";
	}

	
}
