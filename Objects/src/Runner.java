import java.lang.reflect.Array;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

// runner class pulling data from people class
public class Runner {

	public static void main(String[] args) {
	
		Person a = new Person(25 ,"Phyllis", "Manager"); //Naming person 1
		Person a2 = new Person(31 ,"John", "Secretary");
		
	    String[][] arrayofworkers = {{"25","Phyllis", "Manager"},{"31","John", "Secretary"}};
	    
		//a.startwork();
		a2.startwork();
		
		//System.out.println(a.age + a.name);
		System.out.println("Age " +a2.getAge());
		
		System.out.println(a.equals(a2)); //is person 1 same as person 2? true/false
		System.out.println(a.toString());
		
		//prints all data in array
		for (String [] aa:arrayofworkers)
			
			for (String b : aa) //
				System.out.print(b);
	             }
	//public static String searchPerson() {
		//for (String a)
	//	return a;
	}
	
	

