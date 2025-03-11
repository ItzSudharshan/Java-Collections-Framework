import java.util.*;
public class CollectionsDisjointProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		System.out.println("Enter the List 1:");
		list1.addAll(Arrays.asList(sc.nextLine().split(" ")));
		System.out.println("Enter the List2:");
		list2.addAll(Arrays.asList(sc.nextLine().split(" ")));
		boolean result = Collections.disjoint(list1, list2);
		System.out.println("IS Disjoint?: "+result);
	}

}
/*
 * Enter the List 1:
Alice Bob Charlie
Enter the List2:
David Eve Frank
IS Disjoint?: true
-------------------
Enter the List 1:
Alice Bob Charlie
Enter the List2:
Charlie David Frank
IS Disjoint?: false
------------------
 */
