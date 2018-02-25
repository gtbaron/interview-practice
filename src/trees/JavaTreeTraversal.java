package trees;

public class JavaTreeTraversal {

    private Node tree;

    public JavaTreeTraversal() {
        this.initTree();
    }

    public void execute() {
        // should print: 1 2 4 8 5 9 10 3 6 7
        System.out.println("recursiveDepthFirstTraversal(): " + this.recursiveDepthFirstTraversal(tree));
        System.out.println("Expected output:\t\t\t\t1 2 4 8 5 9 10 3 6 7\n");
        System.out.println("iterativeDepthFirstTraversal(): " + this.iterativeDepthFirstTraversal(tree));
        System.out.println("Expected output:\t\t\t\t1 2 4 8 5 9 10 3 6 7\n");

        // should print: 1 2 3 4 5 6 7 8 9 10
        System.out.println("breadthFirstTraversal(): " + this.breadthFirstTraversal(tree));
        System.out.println("Expected output:\t\t 1 2 3 4 5 6 7 8 9 10\n");
    }

    private String recursiveDepthFirstTraversal(Node root) {
        // evaluation order: data, left, right
        return "not implemented";
    }

    private String iterativeDepthFirstTraversal(Node tree) {
        // evaluation order: data, left right
        return "not implemented";
    }

    private String breadthFirstTraversal(Node tree) {
        // implement a breadth first traversal, using either recursion or iteration,
        // that returns the node data in ascending order
        return "not implemented";
    }

    /**
     *                   1
     *                  / \
     *                 /   \
     *                2     3
     *               / \   / \
     *              4  5  6   7
     *             /  / \
     *            8  9  10
     */
    private void initTree() {
        Node four = new Node(4);
        four.setLeft(new Node(8));

        Node five = new Node(5);
        five.setLeft(new Node(9));
        five.setRight(new Node(10));

        Node two = new Node(2);
        two.setLeft(four);
        two.setRight(five);

        Node three = new Node(3);
        three.setLeft(new Node(6));
        three.setRight(new Node(7));

        tree = new Node(1);
        tree.setLeft(two);
        tree.setRight(three);
    }

    public static void main(String[] args) {
        new JavaTreeTraversal().execute();
    }
}
