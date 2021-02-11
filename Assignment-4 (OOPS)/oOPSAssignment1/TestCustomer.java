package oOPSAssignment1;

public class TestCustomer extends Customer
{

	public TestCustomer(String custName, String resiAddress) {
		super(custName, resiAddress);
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestCustomer test=new TestCustomer("sagar","1st Main Road BTM,Bangalore");
test.getResidentialAddress();
test.getCustomerName();
	}
	
}
