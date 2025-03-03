/*You are given a list of integers, and your task is to find the Kth smallest unique element from the list. 
 * Since the list may contain duplicates, use a TreeSet to store elements 
 * in sorted order and efficiently retrieve the Kth smallest element. #
 import java.util.*;

public class KthSmallestElementInTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Elements in the List:");
		int n = sc.nextInt();
		TreeSet<Integer> treeSet = new TreeSet<>();
		System.out.println("Enter the Elements in the Tree Set");
		for(int i =0 ; i< n ; i++) {
			treeSet.add(sc.nextInt());
		}
		System.out.println("Enter the Value of K");
		int k = sc.nextInt();
		
		int count = 1;
		for(int num: treeSet) {
			if(count == k) {
				System.out.println(num+" is the "+k+"th Smallest Number");
				break;
			}
			count++;
		}

	}

}
/*
Enter the Number of Elements in the List:
6
Enter the Elements in the Tree Set
7 5 3 5 1 4
Enter the Value of K
4
5 is the 4th Smallest Number
*/