package oOPSAssignment1;

public class Customer {

	
	
	private static final String Addressdetails="1st Main Road,BTM,Bangalore ";
	private String custName;
	String resiAddress;
	public Customer(String custName, String resiAddress) {
		super();
		this.custName = custName;
		this.resiAddress = resiAddress;
	}
	public void getCustomerDetails() {
		System.out.println("CustomerName is "+ custName);
		System.out.println("Residential Address is"+ Addressdetails);
	}
	public String getCustomerName() {
		return custName;
	}
	public void setCustomerName(String custName) {
		this.custName = custName;
	}
	public String getResidentialAddress() {
		return resiAddress;
	}
	public void setResidentialAddress(String resiAddress) {
		this.resiAddress = resiAddress;
	}
	

}
