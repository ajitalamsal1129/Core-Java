package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
		
		
	}
	public static void main(int p) {
	}
	public static void main(int q,int h) {

	
	}
		
		//You can overload main method also
		//You cannot create method inside a method
		//duplicate methods--i.e same method name with same number of arguments are not allowed
		//method overloading--when the method name is same with different argumentsor input parameters
		
		public void sum() {//o input parameter
			System.out.println("Sum method-zero parameter");
		}
		public void sum(double d) {//1 input parameter
			System.out.println("Sum method-zero parameter");

		}
		public void sum(int i) {//1 input parameter
			System.out.println("Sum method-1 input parameter");
			System.out.println(i);

		}
		
		public void sum(int k,int l) {//2 input parameter
			System.out.println("Sum method-2 input parameter");
			System.out.println(k+l);

		
		

		
		

	}

}
