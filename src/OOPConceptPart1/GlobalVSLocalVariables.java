package OOPConceptPart1;

public class GlobalVSLocalVariables {
	//Global variables--Class variables
			String name="Tom";
			int age=25;
			


	public static void main(String[] args) {
		int i=10;//loval variable for main method
		System.out.println(i);
		
		GlobalVSLocalVariables obj=new GlobalVSLocalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
	public void sum() {
		int i=15;//loval variables for sum method
		int j=20;
		int age=25;
	


		
		
		
	}

}
