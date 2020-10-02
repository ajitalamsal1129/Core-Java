
public class NullConcept {
	static 	Object obj;
	static String str;
	static NullConcept nc;
	

	public static void main(String[] args) {
		//1,case sensitive
		//Object obj=null;
		
		//2.default ref value will be null
		//System.out.println(obj);
		//System.out.println(str);
		//System.out.println(nc);
		
		//3.
		//Integer i=null;
		//int j=i;
		
		//4.instanceof
		Integer i=null;
		Integer j=10;
		
		System.out.println(j instanceof Integer);//true
		System.out.println(i instanceof Integer);//false
		
		//4.static vs non-static
		NullConcept obj=null;
		//obj.send();
		obj.sum();
		
		//5.== and !=
		System.out.println(null==null);
		System.out.println(null!=null);
		
		//6
		String str=null;//can be assigned to any wrapper class
		Integer i1=null;
		Double d1=null;
		
		String s1=(String)null;
		System.out.println(s1+"123");
		//System.out.println(s1.length());//we caut any peration cannot be donen typecast b
		//System.out.println(s1.charAt(0));
		
		Integer i2=(Integer)null;
		Double d2=(Double) null;
		
	}
	public static void sum() {
		System.out.println("sum...");
	}
	public void send() {
		System.out.println("sum...");
	}
}

		



		



		



		
		

	


