package set04.interface1;

import java.util.Scanner;

public class HrPortal {

	public static void main(String[] args) {	
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please choose the department you want to apply for");
			System.out.println("Enter HR for Human Resource");
			System.out.println("Enter TECH for Technology");
			System.out.println("Enter PROD for Product");
			System.out.print("Please make the selection:");
			String selDeptCode = sc.nextLine();
			System.out.println("Please enter your mark");
			byte mark = sc.nextByte();
			sc.close();
			if(mark > 100)
			{
				throw new ScoreException();
			}
			else if(mark <= 70)
			{
				throw new HiringException();
			}
			HrTeam dept; 
			if(selDeptCode.equalsIgnoreCase("HR"))
			{
				dept = new HumanResource();
			}
			else if(selDeptCode.equalsIgnoreCase("TECH"))
			{
				dept = new Technology();
			}
			else
			{
				dept = new Product();
			}
			dept.hireEmployee();
		}
		catch(HiringException ex)
		{
			System.out.println("We are sorry, your mark didn't meet the eligibility criteria");
		}
		catch(ScoreException ex)
		{
			System.out.println("The mark entered is not valid");
		}
		catch(Exception ex)
		{
			System.out.println("An exception has occurred");
		}
		finally
		{
			System.out.println("Message from finally block");
		}
	}

}
