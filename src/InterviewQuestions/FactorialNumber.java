package InterviewQuestions;

public class FactorialNumber {
	
	//without recursive-use for loop
	public static int factorial(int num) {
		int fact=1;
		if(num==0)
			return 1;
		for (int i=1;i<=num; i++) {
			fact=fact*i;//1*2*3*4
		}return fact;
		}
	
	//with recursive function
	public static int fact(int num) {
		if(num==0)
			return 1;
		else
			return(num* fact(num-1));
	}
		
		
	public static void main(String[] args) {
		System.out.println(factorial(4));
		System.out.println(factorial(1));
		System.out.println(factorial(0));
		
		System.out.println(fact(5));



		

	}

}
