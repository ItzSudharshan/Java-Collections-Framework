import java.util.*;

class Box<T>{
	private T item;
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}
}
public class GenericClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> strbox = new  Box<>();
		strbox.setItem("textBook");
		System.out.println("The String Item is :"+strbox.getItem());
		
		Box<Integer> intbox = new Box<>();
		intbox.setItem(540);
		System.out.println("The Integer item is :"+intbox.getItem());
	}
	

}
/*
The String Item is :textBook
The Integer item is :540
*/