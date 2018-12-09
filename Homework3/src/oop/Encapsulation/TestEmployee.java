package oop.Encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmpName("monir");
		emp1.setEmpID("1760");
		emp1.setEmpDOB("01-29-1978");
		System.out.println(emp1.getEmpName()+ "  " +emp1.getEmpID()+ " " +emp1.getEmpDOB());
	
		Employee emp2 = new Employee("Tom", "1000", "01-29-1900" );
	//emp2.setEmpName("tom"); 
	//emp2.setEmpID("1000");
	//.setEmpDOB("01-29-1900");
		System.out.println(emp2.getEmpName()+ "  " +emp2.getEmpID()+ " " +emp2.getEmpDOB());
	
	
	
	
		
	}

}
