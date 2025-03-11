import java.util.*;
public class CollectionsSortReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks:");
		ArrayList<Integer> marks = new ArrayList<>();
		for(int i = 0; i< 5 ; i++) {
			marks.add(sc.nextInt());
		}
		
		Collections.sort(marks, Collections.reverseOrder());
		System.out.println("The Marks in Descending Order is : "+marks);

	}

}
/*
Enter the Marks:
60
75
55
80
70
The Marks in Descending Order is : [80, 75, 70, 60, 55]
*/