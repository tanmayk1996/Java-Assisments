package oOpsAssignment5;



class Medicine1
{
	double price;
	String expiry_date;
    public Medicine1(double price, String expiry_date) {
		super();
		this.price = price;
		this.expiry_date = expiry_date;
	}
    void displayLabel() {
    }
 }

class Tablet extends Medicine1
{

	public Tablet(double price, String expiry_date) {
		super(price, expiry_date);
	}

	@Override
	void displayLabel() {
		System.out.println("Store in cool and dry place");
	}
}

class Syrup extends Medicine1
{

	public Syrup(double price, String expiry_date) {
		super(price, expiry_date);
	}

	@Override
	void displayLabel() {
		System.out.println("consult your doctor");
	}
}

class Ointment extends Medicine1
{

	public Ointment(double price, String expiry_date) {
		super(price, expiry_date);
	}

	@Override
	void displayLabel() {
		System.out.println("For external use only");
	}
}



public class Medicine {
	
	
	
		public static void main(String[] args) {

	       double i = Math.random()*3;
	       int j = (int) i;
	       System.out.println(j);
	       
	       switch(j)
	       {
	       case 1:
	    	   Medicine1 m= new Tablet(30.1, " 04-11-2023");
	    	   m.displayLabel();
	    	   break;
	    	   
	       case 2:
	    	   Medicine1 m1= new Syrup(60.2, " 04-11-2022");
	    	   m1.displayLabel();
	    	   break;
	    	
	       case 3:
	    	   Medicine1 m2= new Ointment(98.4, " 25-07-2021");
	    	   m2.displayLabel();
	    	   break;
		}
		}
	}
	


