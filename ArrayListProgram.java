import java.util.*;
public class ArrayListProgram {

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
		System.out.println("Enter the index of the Element that u want to Find:");
		int index = sc.nextInt();
		System.out.println("The Elements inside the ArrayList are Given Below");
		for(int listItems : list) {
			System.out.print(listItems+" ");
		}
		System.out.println();
		System.out.println("The Element at index "+index+" is "+list.get(index));
		sc.close();
	}

}
/*
 * 
Enter the Number of Elements!:
4
Enter the Elements of the ArrayList
5 15 25 35
Enter the index of the Element that u want to Find:
0
The Elements inside the ArrayList are Given Below
5 15 25 35 
The Element at index 0 is 5
 */

