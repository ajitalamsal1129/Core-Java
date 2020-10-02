package AbstractionConcept;

public abstract class Bank {
	
	int amt=100;
	final int rate=10;
	static int loanrate=5;
	//partial abstraction
	//hiding the implementation logic is called absrtraction
	//abs class can have abs methods and non-abs methods
	//cannot create the object of abstract class
	
	public abstract void loan();//abstract method--no method body
	
	//non-abstract methods
	public void credit() {
		System.out.println("Bank--credit");
	}
	
	public void debit() {
		System.out.println("Bank--deit");
	}
	
	
	

}
