
 class custDetails {
	static int count=0;
	private int id;
	private String name;
	private String email;
	private long mobileNo;
	
	public custDetails()
	{
		
	}
	
	public custDetails(int id, String name, String email, long mobileNo) {
		count++;
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
	}
	public static int getCount() {
		return count;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public static void setCount(int count) {
		custDetails.count = count;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	void addCust(int id, String name, String email, long mobileNo) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", mobileNo=" + mobileNo + "]";
	}
	public void editCust(int id, String name, String email, long mobileNo) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
	}
	public void deleteCust(custDetails cd)
	{
		cd =null;
	}

}