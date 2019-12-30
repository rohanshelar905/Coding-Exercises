package Exception;

public class BankAgeExcept extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String  msg;

	public BankAgeExcept() {
		
	}
	public BankAgeExcept(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString()
	{
		if(msg==null)
			return("Age must not be less than 18");
		else
			return msg;
	}
}
