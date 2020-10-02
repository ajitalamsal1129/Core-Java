package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x="100";
		System.out.println(x+20);//10020
		
		
		//data conversion:String to int
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer, Double, Boolean
		
		//String to Double conversion
		String y="12.33";
		double d=Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to Boolean
		String k="true";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to string conversion
		int j=200;
		System.out.println(j+20);
		
		String s=String.valueOf(j);//200
		System.out.println(s+20);
		
//		String u="100A";
//		Integer.parseInt(u);//NumberFormatException-for input string:"100A"

		

/*10020
120
22.33
true
220
20020
*/

		
				

	}

}
