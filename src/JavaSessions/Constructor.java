package JavaSessions;

public class Constructor {
	//class variables
		String name;
		int age;
		
		public Constructor() {
			System.out.println("Default Const");
		}
		
		public Constructor(int i) {
			System.out.println("1 param Const");
			System.out.println(i);
		}
		
		public Constructor(int i,int j) {
			System.out.println("Two param Const");
			System.out.println(i+" "+ i);

}
		
//		public Constructor(String name,int age) {
//			this.name=name;
//			this.age=age;
			
			//0r
		public Constructor(String name1,int age1) {
			name=name1;
			age=age1;


			
		}
	      public static void main(String[]args) { 
	    	  Constructor obj=new Constructor();
	    	  Constructor obj1=new Constructor(10);
	    	  Constructor obj2=new Constructor(10,20);
	    	  Constructor obj3=new Constructor("Tom",25);

	    	  System.out.println(obj3.name);
				System.out.println(obj3.age);


	    	  
	    	  
	    	  
	      }
	      }

