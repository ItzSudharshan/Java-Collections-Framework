import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListProgram2 {

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
		System.out.println("Enter the index of the Element that u want to Update:");
		int index = sc.nextInt();
		System.out.println("Enter the Element that u want to add at the "+index+"Index:");
		int element = sc.nextInt();
		System.out.println("The Elements of the Array Before Updating is: ");
		for(int elements : list) {
			System.out.print(elements+" ");
		}
		
		list.set(index, element);
		System.out.println();
		System.out.println("The Elements of the ArrayList After Updating is :");
		for(int result: list) {
			System.out.print(result+" ");
		}
		sc.close();
	}

}
/*
Enter the Number of Elements!:
4
Enter the Elements of the ArrayList
10 20 30 40
Enter the index of the Element that u want to Update:
2
Enter the Element that u want to add at the 2 Index:
100
The Elements of the Array Before Updating is: 
10 20 30 40 
The Elements of the ArrayList After Updating is :
10 20 100 40 


*/