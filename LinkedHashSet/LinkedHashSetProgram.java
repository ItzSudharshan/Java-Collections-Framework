import java.util.*;
public class LinkedHashSetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Elements:");
		int num = sc.nextInt();
		sc.nextLine();
		LinkedHashSet<String> namesSet = new LinkedHashSet<>();
		System.out.println("Enter the Elements in the Set");
		for(int i =0 ; i< num ; i++) {
			String names = sc.nextLine();
			namesSet.add(names);
		}
		System.out.println("Size of LinkedHashSet = "+namesSet.size());
		System.out.println("LinkedHashSet elements: "+namesSet);

	}

}
/*
vEnter the Number of Elements:
3
Enter the Elements in the Set
Apple
Banana
Apple
Size of LinkedHashSet = 2
LinkedHashSet elements: [Apple, Banana]
*/