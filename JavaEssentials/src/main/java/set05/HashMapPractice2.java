package set05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Comparator;

public class HashMapPractice2 {

	public static void main(String[] args) {
		HashMap<Long, Student> list = new HashMap<Long, Student>();
		//add the name and id of 5 students
		list.put(5L, new Student(5L, "Tom", 98));
		list.put(3L, new Student(3L, "Vernon", 60));
		list.put(1L, new Student(1L, "John", 78));		
		list.put(4L, new Student(4L, "Heather", 91));
		list.put(2L, new Student(2L, "Jack", 89));		
		System.out.println(list.size());
		
		//delete 2 student records
		list.remove(1L);
		list.remove(2L);
		System.out.println(list.size());
		
		//modify the name of the student having id number 3 and 5
		list.get(3L).name = "Juliet";
		list.get(5L).name = "Heather";
		for(Student stu: list.values())
		{
			System.out.println("Id: " + stu.studentId + ", Name: " + stu.name + ", Mark: " + stu.mark);
		}
		
		//compare two students records
		//get student record for Juliet
		Student juliet = list.get(3L);
		//get student record for Heather
		Student heather = list.get(5L);
		if(juliet.mark > heather.mark)
		{
			System.out.println("Juliet got more marks than Heather");
		}
		else
		{
			System.out.println("Juliet got more marks than Heather");
		}
		
		List<Student> stuList = new ArrayList<Student>(list.values());
		//sort students by name and id
		Collections.sort(stuList, new Comparator<Student>()
		{
	        public int compare(Student o1, Student o2) {
	        	int diff = o1.name.compareTo(o2.name);
	        	if(diff == 0)
	        	{
	        		diff = ((int)o1.studentId) - ((int)o2.studentId);
	        	}
	            return diff;
	        }
		});
		for(Student stu: stuList)
		{
			System.out.println("Id: " + stu.studentId + ", Name: " + stu.name + ", Mark: " + stu.mark);
		}
	}

}
