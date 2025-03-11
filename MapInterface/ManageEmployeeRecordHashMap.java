import java.util.*;
public class ManageEmployeeRecordHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Employees:");
		int n = sc.nextInt();
		sc.nextLine();
		HashMap<Integer, String> employees = new HashMap<>();
		//Adding Employees
		System.out.println("Enter the ID and Employee Name");
		for(int i =0 ; i< n  ; i ++) {
			int id = sc.nextInt();
			String name = sc.nextLine();
			employees.put(id, name);
			System.out.println("Added ID: "+id+" -> "+name);
		}
		
		//Printing All Employees
		System.out.println("The Employee List :");
		for(Map.Entry<Integer, String> entry: employees.entrySet()) {
			System.out.println("Employee ID: "+entry.getKey()+", Name: "+entry.getValue());
		}
		//Retrieving Employee Names
		System.out.println("Enter the Employee ID That You want to Search");
		int searchId = sc.nextInt();
		if(employees.containsKey(searchId)) {
			System.out.println("Employee Name: "+employees.get(searchId));
		}else {
			System.out.println("Employee Not Found!");
		}
		//Removing Employee By Id
		System.out.println("Enter the Id of the Employee That You want to remove: ");
		int removeId = sc.nextInt();
		if(employees.containsKey(removeId)) {
			System.out.println("Employee Removed: "+employees.remove(removeId));
		}else {
			System.out.println("Employee Not Found!");
		}
		//Printing All Employees
		System.out.println("The Final Employee List :");
		for(Map.Entry<Integer, String> entry: employees.entrySet()) {
			System.out.println("Employee ID: "+entry.getKey()+", Name: "+entry.getValue());
		}

	}

}
/*
Enter the Number of Employees:
3
Enter the ID and Employee Name
101 Alice
Added ID: 101 ->  Alice
102 Bob
Added ID: 102 ->  Bob
103 Charlie
Added ID: 103 ->  Charlie
The Employee List :
Employee ID: 101, Name:  Alice
Employee ID: 102, Name:  Bob
Employee ID: 103, Name:  Charlie
Enter the Employee ID That You want to Search
102
Employee Name:  Bob
Enter the Id of the Employee That You want to remove: 
103
Employee Removed:  Charlie
The Final Employee List :
Employee ID: 101, Name:  Alice
Employee ID: 102, Name:  Bob
*/