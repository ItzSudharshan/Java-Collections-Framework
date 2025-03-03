/*
 * You are given a list of product prices, 
 * and your task is to find all products within a specified price range. 
 * Using a TreeSet, store the prices in sorted order and efficiently 
 * retrieve the products that fall within the given range using the 
 * subSet() method.
 * *#
import java.util.*;
import java.util.TreeSet;
public class TreeSetSubsetMethodprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Elements:");
		int n = sc.nextInt();
		System.out.println("Enter the Elements:");
		TreeSet<Integer> treeSet = new TreeSet<>();
		for(int i =0 ; i< n ; i++) {
			treeSet.add(sc.nextInt());
		}
		System.out.println("Enter the Min Value:");
		int minValue = sc.nextInt();
		System.out.println("Enter the Max Value:");
		int maxValue = sc.nextInt();
		NavigableSet<Integer> resultSet = treeSet.subSet(minValue, true, maxValue, true);
		
		if(resultSet.isEmpty()) {
			System.out.println("NO PRODUCTS");
		}else {
			for(int num : resultSet) {
				System.out.print(num+" ");
			}
		}

	}

}
/*
Enter the Number of Elements:
5
Enter the Elements:
1000 1500 2000 2500 3000
Enter the Min Value:
500
Enter the Max Value:
900
NO PRODUCTS
-------------------------------------
Enter the Number of Elements:
6
Enter the Elements:
100 200 300 400 500 600 
Enter the Min Value:
250 550
Enter the Max Value:
300 400 500 
 */
