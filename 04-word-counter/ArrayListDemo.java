// https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<String> todoList = new ArrayList<String>();

    todoList.add("Learn Java");
    todoList.add("Learn Spring");
    todoList.add("Learn Android");

    System.out.println("todoList " + (todoList.isEmpty() ? "is" : "is not") + " empty");
    System.out.println("todoList length: " + todoList.size());
    for(String todoItem : todoList) {
      System.out.println(todoItem);
    }

    todoList.remove("Learn Java");
    todoList.remove("Learn Spring");
    todoList.add(todoList.size() - 1, "Learn Hibernate");

    System.out.println("------------");
    for(String todoItem : todoList) {
      System.out.println(todoItem);
    }
  }
}
