
public class CurrentAccount extends Account
{
	private int OverDraftLimit;
	public CurrentAccount() {}
	public CurrentAccount(int accountNo, String openedDate, double balance, int overDraftLimit) 
	{
		super(accountNo, openedDate, balance);
		OverDraftLimit = overDraftLimit;
	}
	public int getOverDraftLimit() {
		return OverDraftLimit;
	}
	public void setOverDraftLimit(int overDraftLimit) {
		OverDraftLimit = overDraftLimit;
	}
	public double getUpdatedBalance() 
	{
		return (getBalance()+getOverDraftLimit());
	}
	
}
