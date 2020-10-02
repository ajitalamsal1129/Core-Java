package InterviewQuestions;

public class PallindromeNumber {

		
		public static void isPallindromeNumber(int num) {
			System.out.println("Given number is:"+ num);
			int r=0;
			int sum=0;
			int t;
			
			t=num;
			
			while(num>0) {
				r=num%10;//get the remainder
				sum=(sum*10)+r;
				num=num/10;
			}
			if(t==sum) {
				System.out.println("Pallindrome number");
			}else {
				System.out.println("Not Pallindrome number");

				
			}
		}
		public static void main(String[] args) {
			isPallindromeNumber(151);
			isPallindromeNumber(152);
			isPallindromeNumber(78987);


			
			


	}

}
