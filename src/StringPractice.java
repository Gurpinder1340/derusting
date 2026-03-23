import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String word = "hello";
    System.out.println(word);

    // Find the length of the string
    System.out.println(word.length());

    // Concatenate (add) two strings together and reassign the result
      String extra = " world";
      word = word + extra;
      System.out.println("word");

    // Find the value of the character at index 3
    char ch = word.charAt(3);
    System.out.println("Character at index 3: " + ch);


    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    boolean hasABC = word.contains("abc");
    System.out.println("Contains 'abc'? " + hasABC);



    // Iterate over the characters of the string, printing each one on a separate line
    System.out.println("Characters:");
      for (int i = 0; i < word.length(); i++) {
          System.out.println(word.charAt(i));
      }

    // Create an ArrayList of Strings and assign it to a variable
    List<String> stringList = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
  stringList.add("Apple");
  stringList.add("Banana");
  stringList.add("Cherry");

    // Join all of the strings in the list together into a single string separated by commas
  String joined = String.join(", ", stringList);
  System.out.println("Joined string: " + joined);     

    // Use a built-in method to achieve this instead of using a loop

    // Check whether two strings are equal
    String str1 = "hello";
    String str2 = "world";

    if (str1.equals(str2)) {
    System.out.println("str1 and str2 are equal");
} else {
    System.out.println("str1 and str2 are not equal");
}

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
