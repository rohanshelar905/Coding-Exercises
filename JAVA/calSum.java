import java.util.Scanner;
public class calSum {
	int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String args[])
	{
		calSum cs= new calSum();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num: ");
		int n= sc.nextInt();
		
		System.out.println("Sum of natural no.s : "+cs.calculateSum(n));
		sc.close();
	}
}
