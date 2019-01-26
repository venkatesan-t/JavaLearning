package set03;

public abstract class EmployeeWorking {
	private double salary;
	
	protected abstract double earn();
	protected abstract void work();
	
	public void setSalary(double sal)
	{
		salary = sal;
	}
	
	public double getSalary()
	{
		return salary;
	}
}
