import java.lang.reflect.Array;

// runner class pulling data from people class
public class Runner {

	public static void main(String[] args) {
	
		Person a = new Person(25 ,"Phyllis", "Manager"); //Naming person 1
		Person a2 = new Person(31 ,"John", "Secretary");
		
	    String[][] arrayofworkers = {{"25","Phyllis", "Manager"},{"31","John", "Secretary"}};
	    
		//a.startwork();
		a2.startwork();
		
		//System.out.println(a.age + a.name);
		System.out.println("Age " +a2.age);
		
		System.out.println(a.equals(a));
		System.out.println(a.toString());
		
		//prints all data in array
		for (String [] aa:arrayofworkers)
			
			for (String b : aa)
				System.out.print(b);
	             }
	           // System.out.println();
               //   }
			
		//System.out.println(arrayofworkers[0][0]);	
	}
	
	

