import java.util.*;
import java.util.ArrayDeque;
public class ArrayDequeReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		
		ArrayDeque<Character> deque = new ArrayDeque<>();
		for(char c : s.toCharArray()) {
			deque.addFirst(c);
		}
		StringBuilder reverse = new StringBuilder();
		while(!deque.isEmpty()) {
			reverse.append(deque.pollFirst());
		}
		System.out.println("The revered String of the given of "+s+" is "+reverse);

	}

}
/*
Enter the String: 
JavaProgramming
The revered String of the given of JavaProgramming is gnimmargorPavaJ
*/