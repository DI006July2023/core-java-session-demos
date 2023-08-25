package springcoreannotationbased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="acc") // this annotations configures Account as a bean
public class Account {
	private int accNo;
	private String accType;
	private double accBalance;
	
	public int getAccNo() {
		return accNo;
	}
	
	@Value("44444")
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccType() {
		return accType;
	}
	
	@Value("Checking")
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getAccBalance() {
		return accBalance;
	}
	
	@Value("500")
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accType=" + accType + ", accBalance=" + accBalance + "]";
	}

	
}
