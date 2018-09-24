import java.util.Scanner;

class ShoppingCart {
  public String[] items;

  ShoppingCart() {
    this.items = new String[256];
  }

  public void add(String item) {
    this.items.push(item);
  }

  @Override
  public String toString() {
    String result = "ShoppingCart Contents: ";

    for(String item : items) {
      result.concat(item)
        .concat(" ");
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
        System.out.println("Added '" + input + "' to the Shopping Cart.");
        shoppingCart.add(input);
      }
    } while(input.length() > 0);

    System.out.println(shoppingCart);
  }
}
