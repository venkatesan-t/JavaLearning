package set03;

public class Developer extends EmployeeWorking {
	@Override
	public double earn()
	{
		System.out.println("Developer is earning " + getSalary());
		return getSalary();
	}
	
	@Override
	public void work()
	{
		System.out.println("Developer is developing and Unit Testing code");
	}
}
