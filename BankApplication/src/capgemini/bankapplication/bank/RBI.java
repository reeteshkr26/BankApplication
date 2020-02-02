package capgemini.bankapplication.bank;

import capgemini.bankapplication.model.Model;

public class RBI extends Model{
	
	
	@Override
	public void addAmount(double amount) {
		//super.addAmount(amount);
		setAccountBalance(getAccountBalance()+amount);
		
		setAddCounter(getAddCounter()+1);
		if(getAddCounter()>3)
			setAccountBalance(getAccountBalance()+0.038*getAccountBalance());
		
		showDetails(getAccountBalance()+"");
		
	}

	

	@Override
	public void withdrawAmount(double amount) {
		
		//super.withdrawAmount(amount);
		if(getAccountBalance()>amount && getAccountBalance()>getMIN_BALANCE()) {
			setAccountBalance(getAccountBalance()-amount);
		    setWithdrawCounter(getWithdrawCounter()+1);
	
			if(getWithdrawCounter()>3)
				setAccountBalance(getAccountBalance()-0.017*getAccountBalance());
		}
			
		showDetails(getAccountBalance()+"");
			
		
	}

	
	

	
	

}
