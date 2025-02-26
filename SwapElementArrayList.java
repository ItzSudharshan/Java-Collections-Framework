/*
	Given a list of colors, swap the first and 
	third elements if the list has at least three colors. 
	Print the list before and after swapping. If there are 
	fewer than three colors, display an appropriate message.
 */
import java.util.*;
import java.util.Collections;
public class SwapElementArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of elements:");
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<String> list = new ArrayList<>();
		System.out.println("Enter the Elements of the List:");
		for(int i = 0 ; i< n ; i++) {
			list.add(sc.next());
		}
		System.out.println("Array before Swapping:");
		for(String li : list) {
			System.out.print(li+" ");
		}
		System.out.println();
		if(n >= 3) {
			System.out.println("Array After Swapping the 0th index and 3rd Index is:");
			Collections.swap(list, 0, 3);
			for(String res: list) {
				System.out.print(res+" ");
			}
		}else {
			System.out.println("Enter Atleast 3 Elements to Swap:");
		}
 		
	}

}
