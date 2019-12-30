package Exception;

public class BankApp {
	private String ename;
	private int age;
	
	public BankApp(String ename, int age) {
		this.ename = ename;
		this.age = age;
	}
	public void verify() throws BankAgeExcept
	{
		if(age<18)
			throw new BankAgeExcept("Age has to be 18....");
		else
			System.out.println("Registration successful...");
	}
	public static void main(String args[]) {
		BankApp b1= new BankApp("Rohan",22);
		BankApp b2= new BankApp("Ajinkya",12);
		try
		{
			b1.verify();
			b2.verify();
		}
		catch(BankAgeExcept e)
		{
			System.out.println(e);
		}
	}

}
