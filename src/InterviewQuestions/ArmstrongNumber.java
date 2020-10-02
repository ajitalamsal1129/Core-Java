package InterviewQuestions;

public class ArmstrongNumber {
	public static void isArmstrongmeNumber(int num) {
		System.out.println("Given number is:"+ num);
		int cube=0;
		int r;
		int t;
		
		t=num;
		
		while(num>0) {
			r=num%10;//get the remainder
			num=num/10;
			cube=cube+(r*r*r);
		}
		if(t==cube) {
			System.out.println("this is an Armstrongnumber");
		}else {
			System.out.println("this is not an Armstrong number");

			
		}
	}
	
	

	public static void main(String[] args) {
		isArmstrongmeNumber(153);
		isArmstrongmeNumber(370);
		isArmstrongmeNumber(371);
		isArmstrongmeNumber(0);
		isArmstrongmeNumber(1);




		
	}

	}


