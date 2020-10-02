package Encapsulation;

public class EmployeeData {
	private int ssn;
	private String empName;
	private int empAge;
	

	public static void main(String[] args) {
		EmployeeData emp=new EmployeeData();
		emp.setEmpName("Tom Peter");
		emp.setEmpAge(25);
		emp.setSsn(123456);
		
		System.out.println("Employee name is:"+emp.getEmpName());
		System.out.println("Employee age is:"+emp.getEmpAge());
		System.out.println("Employee ssn is:"+emp.getSsn());


		
	}


	public int getSsn() {
		return ssn;
	}


	public void setSsn(int ssn) {
		this.ssn = ssn;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
		

}
