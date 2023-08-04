package springcoreannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "acc")
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
	
	@Value("30001")
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccName() {
		return accName;
	}

	@Value("DFG")
	public void setAccName(String accName) {
		this.accName = accName;
	}

	@Override
	public String toString() {
		return "Account [accNumber=" + accNumber + ", accName=" + accName + "]";
	}
	
	
}
