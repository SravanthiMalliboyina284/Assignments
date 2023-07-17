
public class BankMain {

	public static void main(String[] args)
	{
		Bank bank=new Bank("Abc","Madhapur");
		
		bank.addAccount(new SavingAccount(100,"17-07-2023",5000,2000,2));
		bank.addAccount(new SavingAccount(101,"17-07-2023",5000,2000,2));
		bank.addAccount(new SavingAccount(102,"17-07-2023",5000,2000,2));
		bank.addAccount(new SavingAccount(103,"17-07-2023",5000,2000,2));
		bank.addAccount(new SavingAccount(104,"17-07-2023",5000,2000,2));
		bank.addAccount(new CurrentAccount(200,"17-07-2023",5000,5000));
		bank.addAccount(new CurrentAccount(201,"17-07-2023",5000,5000));
		bank.addAccount(new CurrentAccount(202,"17-07-2023",5000,5000));
		bank.addAccount(new CurrentAccount(203,"17-07-2023",5000,5000));
		bank.addAccount(new CurrentAccount(204,"17-07-2023",5000,5000));
		//bank.addAccount(new CurrentAccount(100,"17-07-2023",5000,5000));
		
		
		
		bank.transaction('W', 101, 2000);
		bank.transaction('D', 203, 10000);
		bank.ShowAccounts();

	}

}
