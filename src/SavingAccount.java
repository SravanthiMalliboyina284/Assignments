
public class SavingAccount extends Account
{
	private static double minimumDepositAmount;
	private static int noOfTransactionsPerDay;
	public SavingAccount() {}
	public SavingAccount(int accountNo, String openedDate, double balance, int minimumDepositAmount,
			int noOfTransactionsPerDay) {
		super(accountNo, openedDate, balance);
		this.minimumDepositAmount = minimumDepositAmount;
		this.noOfTransactionsPerDay = noOfTransactionsPerDay;
	}
	public static double getMinimumDepositAmount()
	{
		return minimumDepositAmount;
	}
	public void setMinimumDepositAmount(double minimumDepositAmount) 
	{
		this.minimumDepositAmount = validateMinimumDepositAmount(minimumDepositAmount);
	}
	public static int getNoOfTransactionsPerDay() 
	{
		return noOfTransactionsPerDay;
	}
	public void setNoOfTransactionsPerDay(int noOfTransactionsPerDay)
	{
		this.noOfTransactionsPerDay = validateNoOfTransactionsPerDay(noOfTransactionsPerDay);
	}
	public double validateMinimumDepositAmount(double minimumDepositAmount)
	{
		if(minimumDepositAmount>2000)
			return minimumDepositAmount;
		throw new RuntimeException("Minimum balance must be above 2000");
	}
	public int validateNoOfTransactionsPerDay(int noOfTransactionsPerDay)
	{
		if(noOfTransactionsPerDay<2)
			return noOfTransactionsPerDay;
		throw new RuntimeException("Minimum transactionslimit exceeded");
	}

	
	
	
}
