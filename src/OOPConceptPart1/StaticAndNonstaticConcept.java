package OOPConceptPart1;

public class StaticAndNonstaticConcept {
	String name="Tom";//non-static global variable
	static int age=25;//static global variable

	public static void main(String[] args) {
		//how to call static variables and methods?
		//1.direct calling
		
		sum();
		
		//2.calling by classname
		StaticAndNonstaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonstaticConcept.age);
		
		//how to call non-static variables and methods
		StaticAndNonstaticConcept obj=new StaticAndNonstaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
				
		//can i aceess static methods by using object reference?yes but it is not suggested
				obj.sum();
	}
	public void sendMail() {//non-static method
		System.out.println("send mail method");
	}
	public static void sum() {//static method
		System.out.println("Sum method");
	}
}
	

		
		
		

		

		
		
		

	


