package set03;

public class HumanResourceActivity {
	public static void main(String[] args) {
		EmployeeWorking emp = new Tester();
		emp.setSalary(18000);
		emp.earn();
		emp.work();
		
		System.out.println();
		emp = new Developer();
		emp.setSalary(20000);
		emp.work();
		emp.earn();
	}
}
