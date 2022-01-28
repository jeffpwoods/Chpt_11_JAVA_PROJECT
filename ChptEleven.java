import edu.iue.jwoods.*; 
import java.util.ArrayList; 
import java.util.Scanner;
import java.util.Collections;

public class ChptEleven {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        // Test 11.4 max method

        ArrayList<Integer> list = new ArrayList<>();
        Integer track;

        do {
            System.out.print("Enter an integer to add to the array "
                    + "(enter 0 to exit): ");
            track = in.nextInt();
            list.add(track);
        } while (track != 0);

        System.out.print("The max integer in the list is: " + max(list));

        // Test 11.7 shuffle method

        System.out.println("\nWe can randomly shuffle the list..");
        shuffle(list); 

        // Test 11.10 MyStack Class and Methods

        MyStack m = new MyStack();

        System.out.println("Enter five strings to add to the stack."); 

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter String " + (i+1) + ": "); 
            m.push(in.nextLine()); 
        }

        System.out.println(m.toString()); 
        System.out.println("The stack in reverse: "); 
        int msize = m.getSize(); 

        for (int i = 0; i < msize; i++) {
            System.out.print(m.pop() + " "); 
        }

        // Test sort Method

        System.out.println("Enter 5 integers into an array."); 

        ArrayList<Integer> intList = new ArrayList<Integer>(); 

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer " + (i+1) + ": "); 
            intList.add(in.nextInt()); 
        }

        sort(intList); 

    }

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        } else {
            return Collections.max(list);
        }
    }

    public static void shuffle(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            System.out.print("The list is empty");
        } else {
            Collections.shuffle(list);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list); 
        list.toString(); 
        System.out.println("The integers in order are: " + list);  
    }

}
