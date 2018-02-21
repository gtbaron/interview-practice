package strings;

public class JavaStrings {

    private String text = "The quick brown fox jumps over the lazy dog";
    private String palindrome = "A nut for a jar of tuna";
    private String notPalindrome = text;

    public void execute() {

        System.out.println("Reverse the string:");
        // print out the text in reverse order without using a loop

        System.out.println("Substrings:");
        // print out a substring of text starting from the word "brown" to the end of the string

        // print out a substring of text that contains "brown fox jumps"

        System.out.println("Palindromes:");
        // write the code in the isPalindrome method that results in following print statements being correct
        System.out.println("The phrase \"" + palindrome + "\" is a palindrome: " + isPalindrome(palindrome));
        System.out.println("The phrase \"" + notPalindrome + "\" is a palindrome: " + isPalindrome(notPalindrome));

    }

    private boolean isPalindrome(String word) {
        // a word, phrase, or sequence that reads the same backward as forward
        return false;
    }

    public static void main(String[] args) {
        new JavaStrings().execute();
    }
}
