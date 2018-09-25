# Notes

## Support Files

```
$ wget https://www.gutenberg.org/files/2701/2701-0.txt -O moby-dick.txt
$ wget http://xpo6.com/wp-content/uploads/2015/01/stop-word-list.csv
```

## Classes that implement the Collection Interface

* HashSet
* LinkedHashSet
* TreeSet
* ArrayList
* Vector
* LinkedList
* PriorityQueue

## Classes that implements the Map Interface

* Hashtable
* LinkedHashMap
* HashMap
* TreeMap

## ArrayList

Arrays with dynamic length.

```java
import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<String> todoList = new ArrayList<String>();
    todoList.add("Learn Java");
    // ...
  }
}
```

## HashMap

Called a "hash" in Ruby, "dictionary" in Python. A collection of key, value pairs.

```java
import java.util.*;

public class PhoneSystem {
  public static void main(String[] args) {
    Map<Integer, String> phoneBook = new HashMap<Integer, String>;

    phoneBook.put(8675309, "Jenny");
    phoneBook.put(3215555, "NASA");
    phoneBook.put(1235813, "Fibonacci")

    for (Map.Entry<String, String> item : phoneBook.entrySet()) {
      Integer phoneNumber = item.getKey();
      String name = item.getValue();

      String output = String.format("%d: %s", phoneNumber, name);
      System.out.println(output);
    }
  }
}
```

## Resources

* [w3resource: Java Collections, ArrayLists, and Vectors](https://www.w3resource.com/java-tutorial/java-arraylist-and-vector.php)
* [gutenberg.org: Moby Dick, plain text](https://www.gutenberg.org/files/2701/2701-0.txt)
* [English 'Stop' Words](http://xpo6.com/list-of-english-stop-words/)
* [JavaSE 8 Docs: Class Scanner](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)
