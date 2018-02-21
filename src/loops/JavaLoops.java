package loops;

import java.util.*;

public class JavaLoops {

    private int[] intArray;
    private List<Double> doubleList;
    private List<String> nameList;

    public JavaLoops() {
        this.intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        this.doubleList = Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5);
        this.nameList = List.of("mike", "delia", "emily", "max", "ginger");
    }

    public void execute() {

        System.out.println("Basic for loop:");
        // write a basic for loop that iterates over the intArray and sums the values and prints the total

        System.out.println("For/Each loop:");
        // write a for each loop that multiplies each element of the doubleList by 2 and prints each result

        System.out.println("Iterator while loop:");
        // write a while loop that uses an iterator and prints out each name in the nameList

        System.out.println("Indexed do/while loop:");
        // write a do/while loop that uses an index to iterate over the nameList and prints out each name

        System.out.println("BONUS: printing with streams:");
        // use a stream to print only the names in nameList that start with the letter "m"

    }

    public static void main(String[] args) {
        new JavaLoops().execute();
    }
}
