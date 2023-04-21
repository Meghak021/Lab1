abstract class BankAccount{
	int account_number;
	double Balance;
	
	abstract double Deposit();
	abstract double Withdraw();
	
}

class CheckingAccount extends BankAccount{
	double Balance;
	double Deposit;
	double Withdraw;
	public CheckingAccount(double Balance , double Deposit , double Withdraw) {
    this.Balance=Balance;
		this.Deposit=Deposit;
		this.Withdraw=Withdraw;
		
	}

	@Override
	double Deposit() {
		
		Deposit=Balance+Deposit;
		return Deposit;	
		
	}

	@Override
	double Withdraw() {
		
		Withdraw=Balance - Withdraw;
		return Withdraw;	
		
	}
	
}

public class Abstraction2 {

	public static void main(String[] args) {
		CheckingAccount ac = new CheckingAccount(1000 , 500 , 300);
		System.out.println("Deposit : " + ac.Deposit());
		System.out.println("Withdraw : " + ac.Withdraw());
		

	}

}
