import java.util.*;
import java.math.*;
public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		//Access and Print the Elements
		for(int i = 0 ; i< numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println("---------------------------------");
		//Access and Multiple *10 and Print the Element 
		for(int i = 0 ; i< numbers.size(); i++) {
			System.out.println(numbers.get(i) * 10);
		}
	}

}

/*
 * 
10
20
30
40
50
---------------------------------
100
200
300
400
500
 */
