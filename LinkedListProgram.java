import java.util.*;

public class LinkedListProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number of Names in the LinkedList:->");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        
        LinkedList<String> attendees = new LinkedList<>();
        
        System.out.println("Enter the " + n + " Attendees:");
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            attendees.addLast(name);
        }
        
        System.out.println();
        System.out.println("The Total Attendees in the List is " + attendees.size());
        System.out.println("All the Attendees in the List are:");
        
        for (String person : attendees) {
            System.out.println(person);
        }
        
        if (!attendees.isEmpty()) {
            System.out.println("First Attendee is " + attendees.getFirst());
            System.out.println("Last Attendee is " + attendees.getLast());
        } else {
            System.out.println("The list is empty.");
        }
        
        sc.close(); // Close the Scanner to prevent resource leak
    }
}
/*
Enter the Number of Names in the LinkedList:->
4
Enter the 4 Attendees:
Alice
Bob
Charlie
David

The Total Attendees in the List is 4
All the Attendees in the List are:
Alice
Bob
Charlie
David
First Attendee is Alice
Last Attendee is David
*/