import java.util.*;
public class CollectionsBinarySearchMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers ");
		ArrayList<Integer>  num = new ArrayList<>();
		for(int i = 0 ; i < 5 ; i++) {
			num.add(sc.nextInt());
		}
		int target = sc.nextInt();
		Collections.sort(num); //Binary Search Needs Sorted Array
		int index = Collections.binarySearch(num, target);
		if(index >=0 ) {
			System.out.println("The Element "+target+" is found at index "+index+".");
		}else {
			System.out.println("The Element "+target+"is not found.");
		}

	}

}
/*
Enter the Numbers 
5
15
25
35
45
25
The Element 25 is found at index 2.
*/