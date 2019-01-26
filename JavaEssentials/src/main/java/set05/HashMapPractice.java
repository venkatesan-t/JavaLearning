package set05;

import java.util.HashMap;

public class HashMapPractice {

	public static void main(String[] args) {
		HashMap<Long, Employee> map = new HashMap<Long, Employee>();
		map.put(1L, new Employee(1L, "John", "Developer"));
		map.put(2L, new Employee(2L, "Jack", "Senior Developer"));
		map.put(3L, new Employee(3L, "Vernon", "Architect"));
		map.put(4L, new Employee(4L, "Richard", "Manager"));
		map.put(5L, new Employee(5L, "Tom", "Senior Architect"));
		
		for(Employee item: map.values())
		{
			System.out.println("Id: " + item.employeeId + " Name: " + item.name + " Designation: " + item.designation);
		}
	}

}
