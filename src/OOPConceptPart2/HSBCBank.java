package OOPConceptPart2;

public class HSBCBank implements USBank,BrazilBank {//we are achieving multiple inheritance
	//Is-a relationship
	//Overriding from USBank
	@Override
	public void credit() {
		System.out.println("hsbc--credit");
	}
	
	@Override
    public void debit() {
		System.out.println("hsbc--debit");
	}
	
	@Override

	public void transferMoney() {
		System.out.println("hsbc--transferMoney");
	}
	//separate methods of HSBC Bank class
	public void educationLoan() {
		System.out.println("hsbc--educationLoan");
	}
	
	public void carLoan() {
		System.out.println("hsbc--carLoan");
	}
	
	//brazil bank method.Overriding frpm BrazilBank
	@Override

	public void mutualFund() {
		System.out.println("hsbc--carLoan");
	}
	
	@Override //both
	public void accounbtreceivable() {
		System.out.println("account receivable-us,brazil");

		
	}
    //ReserveBank
	@Override
	public void pension() {
		// TODO Auto-generated method stub
		
	}

	
	

}
