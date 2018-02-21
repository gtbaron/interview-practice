package overriding;

public class JavaOverriding extends Parent {

    public void execute() {
        // override the printMessage method from the parent class to print a different message
        this.printMessage();

        // updated this class to implement the Teapot interface, add the required method, and call it on the next line
    }

    public static void main(String[] args) {
        new JavaOverriding().execute();
    }
}
