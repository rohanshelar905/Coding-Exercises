package exception;

public class ValidateEmployee {
	private String fname;
	private String lname;
	
	
	public ValidateEmployee(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}

	public void validate() throws EmployeeNameException
	{
		if(!lname.matches( "[A-Z][a-z]*" ) || !fname.matches( "[A-Z][a-z]*" ))
			throw new EmployeeNameException();
		else
			System.out.println("Employee Name is valid");
	}
	public static void main(String[] args) {
		ValidateEmployee v= new ValidateEmployee("Rohan","Shelar");
		try
		{
		v.validate();
		}
		catch(EmployeeNameException e)
		{
			System.out.println(e);
		}
	}
}
