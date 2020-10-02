package OOPConceptPart1;

public class FunctionsInJava {
//main method starting point of execution
	public static void main(String[] args) {
		FunctionsInJava obj=new FunctionsInJava();
		//one object will be created,obj is the reference variable,referring to this object
		//We can create n number of object
		//after creating the object,the copy of all non-static methods will be given to this object
		
		obj.test();
		
		int l=obj.pqr();//int l will take the value of obj.pqr()
		System.out.println(l);
		
		String s1=obj.qa();
		System.out.println(s1);
		
//	    int div=obj.division(30,10);//d will be given to obj.division
		System.out.println(obj.division(30,10));
		
		System.out.println(obj.sendMail(10,"Ajita"));

		}
	
	//non-static methods
	
	//void--does not return any value
	//return type=void
	public void test() {//no input,no output
		System.out.println("test method");
	}

	

//return type=int
	public int pqr() {//no input,some output
		System.out.println("pqr method");
		int a=10;
		int b=20;
		int c=a+b;
		 return c;
	}
	
	//return type=String
	public String qa() {//no input,some output
		System.out.println("qa method");
		String s="Selenium";
		return s;
	}
		
		//return type=int
		//x,y--input parameters/arguments
		public int division(int x,int y) {
			int d=x/y;
			
			return d;
			

		}
		
		public String sendMail(int p,String q) {
			System.out.println("sendmail method");
			String h=q+p;
			return h;

			
			
		}
	}
				


		
		
		
		
		

	