import java.util.ArrayList;

public class Person {
	
	//Fields/Attributes - describes object
	private int age;
	public String name;
	public String Jobtitle; 
	
	//Constructor - a state of object
public Person(int age, String name, String Jobtitle) {
	//super();
	this.setAge(age);
	this.name = name;
	this.Jobtitle = Jobtitle;
}
//Methods describes the behaviour
public void startwork() {
	System.out.println("work");
}

public String toString() {
	return "Workers:" +" "+ getAge() +" "+ name +" "+ Jobtitle;

}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
