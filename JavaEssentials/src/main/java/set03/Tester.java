package set03;

public class Tester extends EmployeeWorking {
	@Override
	public double earn()
	{
		System.out.println("Tester is earning " + getSalary());
		return getSalary();
	}
	
	@Override
	public void work()
	{
		System.out.println("Tester is Testing Software");
	}
}
