import java.util.ArrayList;
public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String text = "Hello";
    // Find the length of the string
    System.out.println(text.length());

    // Concatenate (add) two strings together and reassign the result
    String together = text + "hello";
    System.out.println(together);

    // Find the value of the character at index 3
    System.out.println(text.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(text.contains("all"));

    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < text.length(); i++) {
      System.out.println(text.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
      ArrayList<String> list = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    list.add("Apple");
    list.add("Banana");
    list.add("Orange");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    System.out.println(String.join(",", list));

    // Check whether two strings are equal
    String a = "hello";
    String b = "hello";
    System.out.println(a.equals(b));


    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
