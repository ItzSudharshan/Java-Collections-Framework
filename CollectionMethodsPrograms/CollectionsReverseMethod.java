import java.util.*;
public class CollectionsReverseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of the Cities:");
		ArrayList<String> cities  = new ArrayList<>();
		for(int i =0 ; i< 5 ; i++) {
			cities.add(sc.nextLine());
		}
		Collections.reverse(cities);
		System.out.println("The City Names in Reverse Order is : ");
		System.out.println(String.join(", ", cities));
	}

}
/*
Enter the Name of the Cities:
Mumbai  
Delhi  
Chennai  
Kolkata  
Bangalore
The City Names in Reverse Order is : 
Bangalore, Kolkata  , Chennai  , Delhi  , Mumbai  

*/