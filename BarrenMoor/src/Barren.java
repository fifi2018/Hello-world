import java.util.Scanner;

public class Barren  {
	
	public static void main(String[] args) {
	
		TreasureGrid x = new TreasureGrid ( "Foggy clouds", "in North drection"); //Naming person 1
		
		{Scanner sc = new Scanner(System.in); // sc variable declared
		
		//double i = sc.nextDouble();
		System.out.println(x.toString());
		
		System.out.println("Welcome,You are standing 5m away from the treasure walk North.");
		String north = sc.nextLine();
	
		String input = (" ");
		boolean wrongInput = true;
		
		//if     {
		//System.out.println("incorrect, please type in 'North' ");}
			//sc.nextLine();
			
		//if(input = (" ");s
		//}
		
		System.out.println("You are 4.472m away from the treasure walk a few steps East");
		String east = sc.nextLine();

		//third line input
		System.out.println("Congradulations!! you have found the tresure");
		
		sc.close();
		}
		
double gridArray[][] = {{1.0,1.5,2.0}, {2.5, 3.0, 3.5},{ 4.0, 4.5, 5.0}};
		
		// prints the columns
		for (double i = 0; i < gridArray.length; i++) {
		
	    // prints the columns
		for (double j = 0; j < gridArray[(int) i].length; j++) {
		System.out.print(gridArray[(int) i][(int) j]);
		}
		
		System.out.println(" ");}
}
	}
