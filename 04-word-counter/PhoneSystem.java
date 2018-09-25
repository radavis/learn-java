// Exapmle of using a HashMap
import java.util.*;

public class PhoneSystem {
  public static void main(String[] args) {
    Map<Integer, String> phoneBook = new HashMap<Integer, String>();

    phoneBook.put(8675309, "Jenny");
    phoneBook.put(3215555, "NASA");
    phoneBook.put(1235813, "Fibonacci");

    for (Map.Entry<Integer, String> item : phoneBook.entrySet()) {
      Integer phoneNumber = item.getKey();
      String name = item.getValue();

      String output = String.format("%d: %s", phoneNumber, name);
      System.out.println(output);
    }
  }
}
