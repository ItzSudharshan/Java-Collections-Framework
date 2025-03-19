import java.util.*;
public class KthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter the Number of Elements :");
		int  num = sc.nextInt();
		for(int i =0 ; i< num; i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Enter the Value of K");
		int k = sc.nextInt();
		Collections.sort(list, Collections.reverseOrder());
		int kthLargestElement = list.get(k - 1);
		System.out.println("The Kth Largest Element in Array is "+kthLargestElement);

	}

}
