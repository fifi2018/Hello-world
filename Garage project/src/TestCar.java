
public class TestCar {
 //inheritance
	
	public static void main(String[] args) {
		// testing garage
		Car x = new Car(1100, null, null); //Vehicle is super class
		Vehicle y = new Vehicle(); //Car is child class
		Bicycle z = new Bicycle();
	
		
		x.moves();
		x.turns();
		y.turns();
		z.moves();
		
		System.out.println(x instanceof Car);

	}

}
