package capgemini.bankapplication.bank;

import capgemini.bankapplication.model.Model;

public class HDFC extends Model{
	@Override
	public void addAmount(double amount) {
		
		setAccountBalance(getAccountBalance()+amount);
		
		setAddCounter(getAddCounter()+1);
		if(getAddCounter()>3)
			setAccountBalance(getAccountBalance()+0.0275*getAccountBalance());
		
		showDetails(getAccountBalance()+"");
		
	}

	@Override
	public void withdrawAmount(double amount) {
		// TODO Auto-generated method stub
		
		if(getAccountBalance()>amount && getAccountBalance()>getMIN_BALANCE()) {
			setAccountBalance(getAccountBalance()-amount);	
			setWithdrawCounter(getWithdrawCounter()+1);
			if(getWithdrawCounter()>3)
				setAccountBalance(getAccountBalance()-0.02*getAccountBalance());
		}
			
		showDetails(getAccountBalance()+"");
			
		
	}

}
