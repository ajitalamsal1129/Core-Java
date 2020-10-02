package JavaSessions;

public class B extends A{
//	public B() {
//		super(10,20);
//		System.out.println("Child class const");
//
//		
//	}
//
//	public static void main(String[] args) {
//		B obj=new B();
//
//	}
//
//}
//If you want to call all the constuctors of parent class
           public B() {
        	   super();
           }
           
           public B(int i) {
        	   super();
           }
           
           public B(int i,int j) {
        	   super(i,j);
           }
           
           public static void main(String[] args) {
        	   B obj=new B();
        	   B obj1=new B(10);
        	   B obj2=new B(10,20);


        	   
           }
}
           
           

