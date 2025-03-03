import java.util.*;
public class TreeSetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Elements: ");
		int n = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<>();
		System.out.println("Enter the Elements in the Tree Set: ");
		for(int i = 0 ;i< n ; i++) {
		set.add(sc.nextInt());
		}
		System.out.println("Tree List will not only remove Duplicate elements but will also Order the Elements:");

		for(int ele: set) {
			System.out.println(ele+" ");
		}

	}

}

/*
Enter the Number of Elements: 
5
Enter the Elements in the Tree Set: 
20 10 30 20 10
Tree List will not only remove Duplicate elements but will also Order the Elements:
10 
20 
30 
*/