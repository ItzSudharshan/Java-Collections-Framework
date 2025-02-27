import java.util.*;
public class UnboundedWildCards {
	public static void main(String args[]) {
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
		printList(intList);
		
		List<String> strList = new ArrayList<>();
		strList.add("Kalki 2");
		strList.add("Bahubali");
		strList.add("Krish");
		strList.add("Pushpa 2");
		printList(strList);	
		
		Student s1 = new Student(101, "Sudharshan");
		Student s2 = new Student(102, "Shashank");
		List<Student> st = new ArrayList<Student>();
		st.add(s1);
		st.add(s2);
		printList(st);
		
		
		
	}
	
	//Unbounded WildCards
	public static void printList(List<?> list) {
		for(Object element : list) {
			System.out.println(element);
		}
	}
	
	static class Student {
		int rollNumber;
		String Name;
		public Student(int rollNumber, String Name) {
			this.rollNumber = rollNumber;
			this.Name = Name;
		}
		public String toString() {
			return rollNumber + "-" + Name; 
		}
	}

}

/*
10
20
30
40
Kalki 2
Bahubali
Krish
Pushpa 2
101-Sudharshan
102-Shashank
*/
