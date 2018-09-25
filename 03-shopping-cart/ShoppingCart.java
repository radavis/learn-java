import java.util.Scanner;

class ShoppingCart {
  private String[] items;
  private int length;

  public ShoppingCart() {
    this.items = new String[256];
    this.length = 0;
  }

  public void add(String item) {
    this.items[this.length++] = item;
  }

  public int length() {
    return this.length;
  }

  @Override
  public String toString() {
    String result = "ShoppingCart Contents: ";

    for(int i = 0; i < this.length; i++) {
      result += this.items[i];

      if (i == this.length - 1) {
        result += ".";
      } else {
        result += ", ";
      }
    }

    return result;
  }

  public static void main(String[] args) {
    System.out.println("ShoppingCart App.");

    ShoppingCart shoppingCart = new ShoppingCart();
    Scanner scanner = new Scanner(System.in);
    String input = "";

    do {
      System.out.print("Add an item: ");
      input = scanner.nextLine();

      if (input.length() > 0) {
        shoppingCart.add(input);
      }
    } while(input.length() > 0);

    scanner.close();
    System.out.println(shoppingCart);
  }
}
