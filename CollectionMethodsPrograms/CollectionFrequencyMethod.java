import java.util.*;
public class CollectionFrequencyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the List of Student Names:");
		ArrayList<String> students = new ArrayList<>();
		students.addAll(Arrays.asList(sc.nextLine().split(" ")));
		System.out.println("Enter the Name that You want to get the Frequency of:-> ");
		String name = sc.nextLine();
		int frequency = Collections.frequency(students, name);
		System.out.println("The Frequency is "+frequency);
	}

}
/*
Enter the List of Student Names:
John Emma Sarah Emma Mike
Enter the Name that You want to get the Frequency of:-> 
Emma
The Frequency is 2

*/