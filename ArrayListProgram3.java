import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Elements!:");
		int n = sc.nextInt();
		System.out.println("Enter the Elements of the ArrayList");
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i< n ; i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Enter the index of the Element that u want to Add:");
		int index = sc.nextInt();
		System.out.println("Enter the Element that u want to add at the "+index+":");
		int element = sc.nextInt();
		System.out.println("The Elements of the Array Before Updating is: ");
		for(int elements : list) {
			System.out.print(elements+" ");
		}
		
		list.add(index, element);
		System.out.println();
		System.out.println("The Elements of the ArrayList After Adding the Element is :");
		for(int result: list) {
			System.out.print(result+" ");
		}
		System.out.println();
		System.out.println("Enter the Index of the Element that You want to remove:");
		int index1 = sc.nextInt();
		list.remove(index1);
		System.out.println("The Elements of the ArrayList After Removing the Element is :");
		for(int result: list) {
			System.out.print(result+" ");
		}
		
		sc.close();
	}

}
/*
 * 
Enter the Number of Elements!:
4
Enter the Elements of the ArrayList
10 20 30 40
Enter the index of the Element that u want to Add:
3
Enter the Element that u want to add at the 3:
35
The Elements of the Array Before Updating is: 
10 20 30 40 
The Elements of the ArrayList After Adding the Element is :
10 20 30 35 40 
Enter the Index of the Element that You want to remove:
3
The Elements of the ArrayList After Removing the Element is :
10 20 30 40 
 */
