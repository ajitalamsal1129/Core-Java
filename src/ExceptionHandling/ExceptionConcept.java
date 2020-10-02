package ExceptionHandling;

public class ExceptionConcept {
//	int a=10;
//	static ExceptionConcept obj;


	public static void main(String[] args) {
//uncaught exception
//		int i=9/0;
//		System.out.println(i);
		
		//caught exception
		//Thread.sleep(2000);
		
//		ExceptionConcept obj=new ExceptionConcept();
//		obj=null;
//		System.out.println(obj.a);
		
		//1.try catch block
		try {
			int i=9/0;//this code will throw an exception
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("hey---this/by zero error");


			}
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");


		
		

		
		
		

	}

}
