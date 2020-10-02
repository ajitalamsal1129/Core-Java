package JavaSessions;

public class Car {
	String name;
	String modelnumber;
	int price;
	String engine;
	
	public Car(String name, String modelnumber, int price, String engine) {
		this.name=name;
		this.modelnumber=modelnumber;
		this.price=price;
		this.engine=engine;
	}
 

	public static void main(String[] args) {
		Car obj1=new Car("BMW","320d",10,"Automatic");
		Car obj2=new Car("Audi","AB",25,"Automatic");
		Car obj3=new Car("Honda","City",5,"amANUAL");
		
		System.out.println(obj1.name+" "+obj1.modelnumber+" "+obj1.price+" "+obj1.engine);


		
		
		
	}

}
