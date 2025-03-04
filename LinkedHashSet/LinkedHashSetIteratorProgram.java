import java.util.*;
public class LinkedHashSetIteratorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Items:");
		int num = sc.nextInt();
		sc.nextLine();
		LinkedHashSet<String> namesList = new LinkedHashSet<>();
		System.out.println("Enter the Names in the List:");
		for(int i =0; i<num ; i++) {
			namesList.add(sc.nextLine());
		}
		System.out.println("Iterating using for-each loop: ");
		for(String names: namesList) {
			System.out.println(names);
		}
		
		System.out.println("Iterating using an Iterator: ");
		Iterator<String> iterator = namesList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
/*
 * Enter the Number of Items:
4
Enter the Names in the List:
Alice
Bob
carol
David
Iterating using for-each loop: 
Alice
Bob
carol
David
Iterating using an Iterator: 
Alice
Bob
carol
David
*/
