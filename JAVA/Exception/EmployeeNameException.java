package exception;

public class EmployeeNameException extends Exception{
	private static final long serialVersionUID = 1L;
	private String msg;
	public EmployeeNameException() {
		
	}
	public EmployeeNameException(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString()
	{
		if(msg==null)
			return("Name must contain alphabets only...");
		else
			return msg;
	}
}