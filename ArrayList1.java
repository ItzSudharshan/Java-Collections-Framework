import java.util.*;
class ArrayList1 {
    public static void main(String[] args) {
        // Creating an ArrayList for vegetables
        ArrayList<String> veg = new ArrayList<>();
        veg.add("Potato");
        veg.add("Tomato");
        veg.add("Ginger");
        veg.add("Brinjal"); // Capitalized for consistency
        System.out.println("Vegetables: " + veg);

        // Creating an ArrayList for fruits
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Apple");
        System.out.println("Fruits: " + fruits);

        // Merging vegetables and fruits into a new ArrayList
        ArrayList<String> veg_fruits = new ArrayList<>();
        veg_fruits.addAll(veg);
        veg_fruits.addAll(fruits);
        System.out.println("Combined List: " + veg_fruits);

        // Accessing elements using get() method
        System.out.println("First item: " + veg_fruits.get(0));
        System.out.println("Second item: " + veg_fruits.get(1));
        
        System.out.println("Removed item at index 1: " + veg_fruits.remove(1));
        System.out.println("List after removal: " + veg_fruits);

        // Removing all vegetables from the list
        veg_fruits.removeAll(veg);
        System.out.println("List after removing vegetables: " + veg_fruits);
    }
}

/*
Vegetables: [Potato, Tomato, Ginger, Brinjal]
Fruits: [Mango, Guava, Apple]
Combined List: [Potato, Tomato, Ginger, Brinjal, Mango, Guava, Apple]
First item: Potato
Second item: Tomato
Removed item at index 1: Tomato
List after removal: [Potato, Ginger, Brinjal, Mango, Guava, Apple]
List after removing vegetables: [Mango, Guava, Apple]

*/