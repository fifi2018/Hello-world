
public class TreasureGrid  {

	//Attributes within the grid
	public String weather;
	public String direction;
	
	//Constructors
		public TreasureGrid(String weather, String direction) {
			super();
			this.weather = weather;
			this.direction = direction;
	}
		
		public String toString() {
			return "Inside the Grid:" +" "+ weather +" "+ direction;
}
	public static void main(String[] args) {
		
		// Arraylist for the grid
		//double gridArray[] = {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0,};
		
		double gridArray[][] = {{1.0,1.5,2.0}, {2.5, 3.0, 3.5},{ 4.0, 4.5, 5.0}};
		
		// prints the columns
		for (double i = 0; i < gridArray.length; i++) {
		
	    // prints the columns
		for (double j = 0; j < gridArray[(int) i].length; j++) {
		System.out.print(gridArray[(int) i][(int) j]);
		}
		
		System.out.println(" ");

	}
		}
}
