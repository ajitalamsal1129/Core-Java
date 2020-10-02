package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		BMW b=new BMW();
		b.start();
		b.stopt();
		b.refuelt();
		b.theftSafety();
		b.engine();
		
		System.out.println("####");
		
		Car c=new Car();
		c.start();
		c.stopt();
		c.refuelt();
		
		
		
		System.out.println("####");
		
		//Also called top casting
		Car c1=new BMW();//dynamic polymorphism/runtime polymorphism
		c1.start();
		c1.stopt();
		c1.refuelt();
		
		Vehicle v=new BMW();
		v.engine();
		

		
		
		

	}

}
