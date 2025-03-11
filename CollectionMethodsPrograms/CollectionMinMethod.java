import java.util.*;
public class CollectionMinMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The List of Numbers :");
		ArrayList<Integer> num = new ArrayList<>();
		for(String s : sc.nextLine().split(" ")){
			num.add(Integer.parseInt(s));
		}
		int minValue = Collections.min(num);
		System.out.println("The Min value in the List is: "+minValue);
	}

}
/*
Enter The List of Numbers :
45 65 85 72 68
The Min value in the List is: 45

*/