1. PRINT TO THE CONSOLE

System.out.println("Hello World!");

2. DEFINE A CLASS

public class MyClass{

}

3. CREATE A METHOD

public void myMethod(){
    System.out.println("This is a method.");
}

4. CREATE A CONSTRUCTOR

public class MyClass {
    public MyClass(){
        System.out.println("This is my constructor.");
    }
}

5. CREATE AN OBJECT (INSTANCE OF A CLASS)

public class MyClass{
    public MyClass(){
        System.out.println("This is my constructor.");
    }
}
public class Main{
    public static void main(String[] args){
        MyClass obj = new MyClass();
    }
}

6. DEFINE AN ARRAY

public int[] myArray = new int[5];

7. ACCESS AN ARRAY ELEMENT

public int[] myArray = new int[5];

public void accessElement(){
    myArray[0] =10;
    System.out.println(myArray[0]); // prints : 10
}

8. LOOP THROUGH AN ARRAY

public int[] myArray = new int[5];

public void loopThroughArray(){
    for(int i=0 ; i < myArray.length; i++){
        myArray[i] = i * 2 ;
        System.out.println(myArray[i]);
    }
}

9. CREATE A METHOD WITH PARAMETERS

public void printSum(int num1, int num2){
    int sum = num1 + num2;
    System.out.println("The sum is: " + sum);
}

10. CALL A METHOD WITH PARAMETERS 

public static void main(String[] args){
    printSum(3,4);
}

11. DEFINE AN INTERFACE

public interfaace MyInterface{
    void myMethod();
}

12. IMPLEMENT AN INTERFACE

public class MyClass implements MyInterface{
    public void myMethod(){
        System.out.println("This is my method.");
    }
}

13. DEFINE A STATIC VARIABLE

public class MyClass{
    public static int myStaticVar = 10;
}

14. ACCESS A STATIC VARIABLE

public class MyClass{
    public static int myStaticVar = 10;
}

public class Main{
    public static void main(String[] args){
        System.out.println(MyClass.myStaticVar);
    }
}

15. DEFINE A STATIC METHOD

public class MyClass {
    public static void myStaticMethod(){
        System.out.println("This is my static method.");
    }
}

16. CALL A STATIC METHOD

public class Main{
    public static void main(String[] args){
        MyClass.myStaticMethod();
    }
}

17. USE A SWITCH METHOD

public void useSwitch(int day){
    switch(day){
        case 1: 
        System.out.println("Monday");
        break;

        case 2:
        System.out.println("Tuesday");
        break;

        case 3:
        System.out.println("Wednesday");
        break;

        case 4:
        System.out.println("Thursday");
        break;

        case 5:
        System.out.println("Friday");
        break;

        case 6:
        System.out.println("Saturday");
        break;

        case 7:
        System.out.println("Sunday");
        break;

        Default:
        System.out.println("Invalid Day!");
        break;

    }
}

18. CREATE A PACKAGE

package my.package;

19. IMPORT A CLASS FROM A PACKAGE

import my.package.MyClass;

20. DEFINE AN ABSTRACT CLASS

public abstract class MyAbstractClass{
    public abstract void myMethod();
}

21. CREATE A SUBCLASS OF AN ABSTRACT CLASS

public class MyClass extends MyAbstractClass(){
    public void myMethod(){
        System.out.println("This is my method.");
    }
}

22. USE TRY-CATCH BLOCKS

public void useTryCatch(){
    try {
        int result = 10/0;
        System.out.println("Result: " + result);
    }catch(ArithmeticException e){
        System.out.println("Error: " + e.getMessage());
    }
}

23. DEFINE AN ENUMERATION

public enum Color{
    RED, GREEN, BLUE;
}

