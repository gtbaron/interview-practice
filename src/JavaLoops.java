import java.util.*;

public class JavaLoops {

    private int[] intArray;
    private List<Double> doubleList;
    private Set<String> nameSet;

    public JavaLoops() {
        this.intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        this.doubleList = Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5);
        this.nameSet = new LinkedHashSet<>(Arrays.asList("mike", "delia", "emily", "max", "ginger"));
    }

    public void execute() {

        // write a basic for loop that iterates over the intArray and sums the values

        // write a for each loop that multiplies each element of the doubleList by 2

        // write a while loop that uses an iterator and prints out each name in the nameSet

    }

    public static void main(String[] args) {
        new JavaLoops().execute();
    }
}
