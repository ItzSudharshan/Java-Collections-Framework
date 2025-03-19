import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class ConcurrentCopyOnWriteListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList list = new CopyOnWriteArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("Before Concurrent Modification: "+list);
		
		for(Object o : list) {
			System.err.println(o);
			list.add(99);
		}
		System.out.println("After Concurrent Modification: "+list);
	}

}
/*
A concurrent collection is a special type of data structure 
that lets different parts of a program use it at the same time
without causing problems. Think of it like a shared resource that
everyone can use without getting in each other's way. This is super helpful 
when different parts of an app (like Swiggy's backend) need to use or change 
the same data at the same time.
*/