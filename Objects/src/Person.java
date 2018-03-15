
public class Person {
	
	//Fields/Attributes - describes object
	public int age;
	public String name;
	public String Jobtitle; 
	
	//Constructor - a state of object
public Person(int age, String name, String Jobtitle) {
	//super();
	this.age = age;
	this.name = name;
	this.Jobtitle = Jobtitle;
}
//Methods describes the behaviour
public void startwork() {
	System.out.println("work");
}

public String toString() {
	return "Workers:" +" "+ age +" "+ name +" "+ Jobtitle;
	
}
}
