package MainMethodOverloading;

public class MainMethodOverload {

	public static void main(String[] args) {
		//jvm==main(string args[]--public static void


			System.out.println("Main Method1");
			main("Testing");
			main(10);
			main(10,20);

		}
		public static void main(String args) {
			System.out.println("Main Method2");

	}
		public static void main(int a) {
			System.out.println("Main Method3");
		}
		public static void main(int a,int b) {
			System.out.println("Main Method4");
		}
		



	}


