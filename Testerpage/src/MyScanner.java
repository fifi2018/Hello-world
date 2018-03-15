import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args)
	
	{Scanner s = new Scanner(System.in); //Inputs the data
	
	//First question
	System.out.println("Your name?");
	String firstname = s.nextLine();
	
	//Second question
	System.out.println("What is your Surname"); 
	String surname = s.nextLine(); //saves input data under variable'Surname'
	
	//System.out.println(Surname);


	System.out.println("How old are you");

	int age = s.nextInt();
	
	System.out.println("Hello " + firstname + " "+ surname + ", in 10 years you will be " + (age + 10)+" years old"
			+ "...Gosh that's really old");
	
	//if (firstname.isEmpty() {
	//	System.out.println("Please input your Surname");
//	}
	
	}
}
