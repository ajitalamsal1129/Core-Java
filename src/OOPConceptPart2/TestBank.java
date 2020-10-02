package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		System.out.println(USBank.min_bal);//because variable is static by default
		
		HSBCBank hs=new HSBCBank();
		hs.credit();;
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		USBank.us911_services();
		BrazilBank.brazil911_services();
		
		hs.marketing();
		
		
		//dynamic polymorphism
		//child class object can be referred by parent Interface reference variable
		USBank b=new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
		
		
		b.marketing();
		//you cannot call child class methods using the parent interface interface

	}

}
