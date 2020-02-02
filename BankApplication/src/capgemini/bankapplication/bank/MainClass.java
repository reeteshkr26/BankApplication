/*
 * 
 * @Author Capgemini
 * @Developer Reetesh Kumar Mondal
 * @Description This class is performing the banking process
 * @Created 28/01/2020
 * @Version 1.1
 * @Status release Beta
 * 
 */
package capgemini.bankapplication.bank;

import java.util.Scanner;

import capgemini.bankapplication.model.Model;

//import capgemini.bankapplication.model.Model;

public class MainClass{
	Scanner sc=new Scanner(System.in);
	public static void main(String args[]) {
		MainClass mObject=new MainClass();
		
		mObject.initiatingBank(mObject);
	}

	public void initiatingBank(MainClass object) {
		
		
		System.out.println("\n 1.ICICI Bank \n 2.HDFC Bank \n 3.RBI Bank \n 4.SC Bank \n");
		System.out.print("Enter Your Choice:");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Model ic=new ICICI();
			ic.setMIN_BALANCE(3000.0);
			selectOperation(ic);
			break;
			
		case 2:
			Model hd=new HDFC();
			hd.setMIN_BALANCE(2000.0);
			selectOperation(hd);
			break;
			
		case 3:
			Model rb=new RBI();
			rb.setMIN_BALANCE(4000.0);
			selectOperation(rb);
			break;
			
		case 4:
			Model s=new SC();
			s.setMIN_BALANCE(5000.0);
			selectOperation(s);
			break;
			
		default:
			break;
		}
		
	}
	
	private void selectOperation(Model ic) {
		// TODO Auto-generated method stub
		//System.out.println(" Welcome to ICICI Bank ");
		
		double amount;
		String opr;
		do {
			
			System.out.println("\n Select Operation \n 1. Add Amount \n 2. Withdraw Amount");
			System.out.print("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter your amount which is want to add in your account= ");
				amount=sc.nextDouble();
				ic.addAmount(amount);
				break;
			case 2:
				System.out.print("Enter your amount which is want to withdraw from your account= ");
				amount=sc.nextDouble();
				ic.withdrawAmount(amount);
				break;
			}
			System.out.print("Do you want to continue plz press (y/n)?");
			opr=sc.next();
		}while(opr.equals("y"));
		
		
		
	}

	/*private void selectOperationForICICI(ICICI ic) {
		// TODO Auto-generated method stub
		System.out.println(" Welcome to ICICI Bank ");
		ic.setMIN_BALANCE(3000.0);
		double amount;
		String opr;
		do {
			
			System.out.println("\n Select Operation \n 1. Add Amount \n 2. Withdraw Amount");
			System.out.print("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter your amount which is want to add in your account= ");
				amount=sc.nextDouble();
				ic.addAmount(amount);
				break;
			case 2:
				System.out.print("Enter your amount which is want to withdraw from your account= ");
				amount=sc.nextDouble();
				ic.withdrawAmount(amount);
				break;
			}
			System.out.print("Do you want to continue plz press (y/n)?");
			opr=sc.next();
		}while(opr.equals("y"));
		
		
		
	}
	private void selectOperationForHDFC(HDFC hd) {
		// TODO Auto-generated method stub
		System.out.println(" Welcome to HDFC Bank ");
		
		double amount;
		String opr;
		do {
			System.out.println("\n Select Operation \n 1. Add Amount \n 2. Withdraw Amount");
			System.out.print("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter your amount which is want to add in your account= ");
				amount=sc.nextDouble();
				hd.addAmount(amount);
				break;
			case 2:
				System.out.print("Enter your amount which is want to withdraw from your account= ");
				amount=sc.nextDouble();
				hd.withdrawAmount(amount);
				break;
			}
			System.out.print("Do you want to continue plz press (y/n)?");
			opr=sc.next();
		}while(opr.equals("y"));
		
	}
	private void selectOperationForRBI(RBI rb) {
		// TODO Auto-generated method stub
		System.out.println(" Welcome to RBI Bank ");
		
		double amount;
		String opr;
		do {
			System.out.println("\n Select Operation \n 1. Add Amount \n 2. Withdraw Amount");
			System.out.print("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter your amount which is want to add in your account= ");
				amount=sc.nextDouble();
				rb.addAmount(amount);
				break;
			case 2:
				System.out.print("Enter your amount which is want to withdraw from your account= ");
				amount=sc.nextDouble();
				rb.withdrawAmount(amount);
				break;
			}
			System.out.print("Do you want to continue plz press (y/n)?");
			opr=sc.next();
		}while(opr.equals("y"));
		
	}
	private void selectOperationForSC(SC s) {
		// TODO Auto-generated method stub
		System.out.println(" Welcome to SC Bank ");
		
		double amount;
		String opr;
		do {
			System.out.println("\n Select Operation \n 1. Add Amount \n 2. Withdraw Amount");
			System.out.print("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter your amount which is want to add in your account= ");
				amount=sc.nextDouble();
				s.addAmount(amount);
				break;
			case 2:
				System.out.print("Enter your amount which is want to withdraw from your account= ");
				amount=sc.nextDouble();
				s.withdrawAmount(amount);
				break;
			}
			System.out.print("Do you want to continue plz press (y/n)?");
			opr=sc.next();
		}while(opr.equals("y"));
		
	}*/

}
