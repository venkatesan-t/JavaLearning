package set05;

import java.util.Hashtable;

public class HashtablePractice {

	public static void main(String[] args) {
		Hashtable<Long, Student> list = new Hashtable<Long, Student>();
		list.put(1L, new Student(1L, "John", 78));
		list.put(2L, new Student(2L, "Jack", 89));
		list.put(3L, new Student(3L, "Vernon", 60));
		list.put(4L, new Student(4L, "Richard", 91));
		list.put(5L, new Student(5L, "Tom", 98));
		
		Student studentWithMaxMark = new Student(0, "", 0f);
		
		for(Student s: list.values())
		{			
			if(studentWithMaxMark.studentId <= 0)
			{
				studentWithMaxMark = s;
			}
			else if(s.mark > studentWithMaxMark.mark)
			{
				studentWithMaxMark = s;
			}
		}
		System.out.println("Id: " + studentWithMaxMark.studentId + " Name: " + studentWithMaxMark.name + " Mark: " + studentWithMaxMark.mark);
	}

}
