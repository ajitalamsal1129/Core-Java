package AbstractionConcept;

public class Test extends Shape{
	
	Test(){
		System.out.println("Testclass constructor");

	}

	public static void main(String[] args) {
		Shape s=new Test();
		s.drawing();
		s.fill();
		
		Test test=new Test();//before calling the constructor of child class,it will call the constructor of parent class

	}
	@Override
	
	public void drawing() {
		System.out.println("Test--drawing");

	}

}
