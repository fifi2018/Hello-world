
public class TestCar {
 //inheritance
	
	public static void main(String[] args) {
		// testing garage
		Car x = new Car(); //Vehicle is super class
		Vehicle y = new Vehicle(); //Car is child class
		Bicycle z = new Bicycle();
	
		
		x.moves();
		x.turns();
		y.turns();
		z.moves();
		
		System.out.println(x instanceof Car);

	}

}
