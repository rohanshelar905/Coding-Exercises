package exception;

import java.util.Scanner;

public class PersonAge {
	private String ename;
	private int age;
	
	
	public String getEname() {
		return ename;
	}
	public int getAge() {
		return age;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public PersonAge(String ename, int age) {
		this.ename = ename;
		this.age = age;
	}
	public void verify() throws BankAgeExcept
	{
		if(age<15)
			throw new BankAgeExcept("Age must be greater than 15....");
		else
			System.out.println("Valid Age.....");
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter NAME ,AGE: ");
		String name=sc.next();
		int age=sc.nextInt();
		
		BankApp b1= new BankApp(name,age);
		try
		{
			b1.verify();
		}
		catch(BankAgeExcept e)
		{
			System.out.println(e);
		}
	}

}