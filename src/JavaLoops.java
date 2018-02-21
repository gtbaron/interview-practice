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

        // write a basic for loop that iterates over the intArray and sums the values
        System.out.println("Basic for loop:");

        // write a for each loop that multiplies each element of the doubleList by 2
        System.out.println("For/Each loop:");

        // write a while loop that uses an iterator and prints out each name in the nameList
        System.out.println("Iterator while loop:");

        // write a do/while loop that uses an index to iterate over the nameList and prints out each name
        System.out.println("Indexed do/while loop:");

    }

    public static void main(String[] args) {
        new JavaLoops().execute();
    }
}
