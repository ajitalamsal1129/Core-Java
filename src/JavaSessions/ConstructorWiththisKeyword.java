package JavaSessions;

public class ConstructorWiththisKeyword {
	//class variables
	String name;
	int age;
	
	public ConstructorWiththisKeyword(String name,int age) {
		this.name=name;
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);

		
	}
	
    public static void main(String[]args) { 
    	ConstructorWiththisKeyword obj=new ConstructorWiththisKeyword("Tom",30);
    	
    }


}
