package capgemini.bankapplication.model;



abstract public class Model {
	double accountBalance=0.0;
	double MIN_BALANCE;
	int addCounter=0,withdrawCounter=0;
	
	
	public Model() {
		
	}
	public abstract void withdrawAmount(double amount);
	
	public abstract void addAmount(double amount);
	
	public void showDetails(String balance) {
		System.out.println("Your Balance is " + balance);
		
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getAddCounter() {
		return addCounter;
	}
	public void setAddCounter(int addCounter) {
		this.addCounter = addCounter;
	}
	public int getWithdrawCounter() {
		return withdrawCounter;
	}
	public void setWithdrawCounter(int withdrawCounter) {
		this.withdrawCounter = withdrawCounter;
	}
	
	public double getMIN_BALANCE() {
		return MIN_BALANCE;
	}
	public void setMIN_BALANCE(double mIN_BALANCE) {
		MIN_BALANCE = mIN_BALANCE;
	}

	
	

}
