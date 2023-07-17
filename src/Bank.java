
public class Bank 
{
	private String bankName;
	private String branchName;
	Account[] accounts=new Account[10];
	private int index=0;
	public Bank(String bankName, String branchName) 
	{
	
		this.bankName = bankName;
		this.branchName = branchName;
	}
	public String getBankName() 
	{
		return bankName;
	}
	public void setBankName(String bankName) 
	{
		this.bankName = bankName;
	}
	public String getBranchName()
	{
		return branchName;
	}
	public void setBranchName(String branchName)
	{
		this.branchName = branchName;
	}
	
	public boolean addAccount(Account account)
	{
		if(index<10)
		{
			if(accounts==null)
			{
				accounts=new Account[10];
			}
			accounts[index]=account;
			index++;
			return true;
		}
		throw new RuntimeException("cannot add more accounts than 10");		
	}
	public boolean transaction(char Transactiontype,int accountNo,double amount)
	{
		for(int i=0;i<index;i++)
		{
			if(accounts[i].getAccountNo()==accountNo)
			{
				if(Transactiontype=='W')
				{
					if(accounts[i] instanceof SavingAccount)
					{
						
						if(accounts[i].getBalance()-amount>=SavingAccount.getMinimumDepositAmount())
						{
							accounts[i].setBalance(accounts[i].getBalance()-amount);
							return true;
						}
						else
							throw new RuntimeException("no sufficient funds");
							
					}
					if(accounts[i].getBalance()-amount>=0)
					{
						accounts[i].setBalance(accounts[i].getBalance()-amount);
					}
					else
						throw new RuntimeException("no sufficient funds");
				}
				else if(Transactiontype=='D')
				{
					accounts[i].setBalance(accounts[i].getBalance()+amount);
				}
				else
					throw new RuntimeException("Invalid trnsaction type");	
			}
		}
		return false;
			
	}
	public void ShowAccounts()
	{
		for(int i=0;i<index;i++)
		{
			System.out.println("BankName : "+bankName);
			System.out.println("BankBranchName : "+branchName);
			System.out.println("AccountNo : "+accounts[i].getAccountNo());
			System.out.println("Acc OpenedDate : "+accounts[i].getOpenedDate());
			System.out.println("Acc Balance : "+accounts[i].getBalance());
			
		}
	}
	
}
