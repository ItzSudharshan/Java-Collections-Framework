/*Create a Java program using PriorityQueue to manage task priorities.
It should read n task priorities, add a new task, remove the highest-priority task, and print the updated queue.
Ensure lower numbers indicate higher priority.
It should read n task priorities, add a new task, remove the highest-priority task, and print the updated queue.
Ensure lower numbers indicate higher priority.*/
import java.util.*;

public class PriorityQueueProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number of tasks
        System.out.println("Enter the number of tasks:");
        int n = sc.nextInt();
        
        // PriorityQueue with natural ordering (min-heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // Input task priorities
        System.out.println("Enter the task priorities:");
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }
        
        // Input new task priority
        System.out.println("Enter the new task priority:");
        int task = sc.nextInt();
        pq.add(task);

        // Display queue after adding the new task
        System.out.println("Queue after adding new task:");
        printQueue(pq);
        
        // Remove the highest-priority task
        System.out.println("Removing the highest-priority task...");
        pq.poll();

        // Display updated queue
        System.out.println("Updated Queue of Task Priorities:");
        printQueue(pq);
        
        sc.close();
    }

    // Method to print elements in sorted order without modifying the queue
    private static void printQueue(PriorityQueue<Integer> pq) {
        PriorityQueue<Integer> tempQueue = new PriorityQueue<>(pq);
        while (!tempQueue.isEmpty()) {
            System.out.print(tempQueue.poll() + " ");
        }
        System.out.println();
    }
}
/*
 * Enter the number of tasks:
4
Enter the task priorities:
5 1 3 4
Enter the new task priority:
2
Queue after adding new task:
1 2 3 4 5 
Removing the highest-priority task...
Updated Queue of Task Priorities:
2 3 4 5 

 */


