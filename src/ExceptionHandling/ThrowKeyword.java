package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
//		System.out.println("ABC");
//		
//		try {
//			throw new Exception("Ajita Exception");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("PQR");
//		
		String Exec_Flag=" ";
		if(Exec_Flag.contentEquals(" ")){
			try{
				throw new Exception("Exec Flag is blank exception");
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Test");
		}
				
		}

	}


