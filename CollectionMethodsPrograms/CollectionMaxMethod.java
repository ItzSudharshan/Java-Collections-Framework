import java.util.*;
public class CollectionMaxMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the List of Numbers:");
		ArrayList<Integer> num = new ArrayList<>();
		for(String s : sc.nextLine().split(" ")) {
			num.add(Integer.parseInt(s));
		}
		int maxScore = Collections.max(num);
		System.out.println("The Maximum Number is : "+maxScore);

	}

}
/*
Enter the List of Numbers:
45 65 85 72 68
The Maximum Number is : 85
*/