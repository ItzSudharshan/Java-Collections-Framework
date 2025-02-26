import java.util.*;
public class GenericMethods {
		
	public static <T> void  displayItem(T item){
		System.out.println("The Item Object is: "+item);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayItem(500);
		displayItem("Java Collections Concept");

	}

}
/*
The Item Object is: 500
The Item Object is: Java Collections Concept
*/