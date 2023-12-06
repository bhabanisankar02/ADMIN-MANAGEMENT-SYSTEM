import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;;

public class Main {
    public static void main(String[] args) {
        try {
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            // Creating object of Box class
            Box<Integer> integerBox = new Box<>();

            // Adding Integer objects to Box class
            integerBox.setItem(10);
            integerBox.setItem(20);

            // Getting Integer objects from Box class
            System.out.println("Integer Value stored in Box is : " + integerBox.getItem());

            // Creating object of Box class
            Box<String> stringBox = new Box<>();

            // Adding String objects to Box class
            stringBox.setItem("Hello");
            stringBox.setItem("World");

            // Getting String objects from Box class
            System.out.println("String Value stored in Box is : " + stringBox.getItem());

           //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            //Creating an object of HashMap class
           Map<Integer,String> map = new HashMap<>();

           //Adding key-value pairs to the map
           map.put(1, "One");
           map.put(2, "Two");
           map.put(3, "Three");

           //Printing the key-value pairs in the map
           System.out.println("Map : " + map);

           //Retrieving a value based on a key
           String value = map.get(2);
           System.out.println("Value for Key 2 : "+ value);

           //Removing a key-value pair from the map
           boolean isKeyPresent = map.containsKey(3);
           System.out.println("Is key 3 present in the map? " + isKeyPresent);

               //Removing a key-value pair from the map
           boolean isValuePresent = map.containsValue("Three");
           System.out.println("Is value 'Three' present in the map? " + isValuePresent);
 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            ArrayList<String> List = new ArrayList<>();
            List.add("Apple");
            List.add("Banana");
            List.add("Orange");

            boolean isValuePresentTwo = List.contains("Banana");
            System.out.println("Is value 'Banana' present in the list? " + isValuePresentTwo);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("Gun","Bullet","Sword"));
            int indexOfElementTwo = listTwo.indexOf("Bullet");
            boolean isValuePresentThree = indexOfElementTwo != -1;
            System.out.println("Is value 'Bullet' present in the list?" + isValuePresentThree);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        } catch (Exception e) {
            System.err.println("Error: " + e);
        } finally {
            System.out.println("Block Executed Successfully!!");
        }
    }
}