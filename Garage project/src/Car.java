
public class Car extends Vehicle {
	
	     public int price;
	     public String type;
	     public String colour;
	     
	      //Constructor
	     public Car(int price, String type, String colour) {
	    		super();
	    		this.price = price;
	    		this.type = type;
	    		this.colour = colour;
	    	}
	  
	    	public String toString() {
	    		return "Cars:" +" "+ price +" "+ colour +" "+ type;

	    	}
 public void moves() {
	 System.out.println("A car vehicle is moving");
 }
 public void turns() {
	 System.out.println("A car vehicle is turning");}

public int price(int a, int b) {
	
	return 0;
}
}
