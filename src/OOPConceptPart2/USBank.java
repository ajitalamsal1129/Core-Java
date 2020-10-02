package OOPConceptPart2;

public interface USBank extends ReserveBank {
	//only define abstract methods...
	//no method body
	//only method declaration
	//achieve 100% abstraction
	//cannot create object of interface
	
	int min_bal=100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	public void accounbtreceivable();

	
	//From JDK 1.8 YOU CAN HAVE STATIC METHODS IN INTERFACEBUT WITH METHOD BODY
	//CANNOT BE OVERRIDDEN
	
	public static void us911_services() {
     System.out.println("US911--services");
	}
	
	default void marketing() {
	     System.out.println("USBank--marketing");

		
	}
	
	
	
	}
	


