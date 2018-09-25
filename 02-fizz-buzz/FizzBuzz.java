public class FizzBuzz {
  private int number;

  public FizzBuzz(int number) {
    this.number = number;
  }

  public String evaluate() {
    String result = "";
    if (divisibleByThree()) {
      result += "Fizz";
    }

    if (divisibleByFive()) {
      result += "Buzz";
    }

    if (result.length() == 0) {
      result = Integer.toString(this.number);
    }

    return result;
  }

  private boolean divisibleByThree() {
    return this.number % 3 == 0;
  }

  private boolean divisibleByFive() {
    return this.number % 5 == 0;
  }

  // [public|private] [int|double|boolean|String|...] methodName(double varName,
  //   int anotherVarName,
  //   double aNumber,
  //   double anotherNumber) {
  //
  //   // calculate and return
  // }

  public static void main(String[] args) {
    // System.out.println("FizzBuzz App.");

    for(int i = 1; i <= 100; i++) {
      FizzBuzz fizzBuzz = new FizzBuzz(i);
      String result = fizzBuzz.evaluate();
      String output = String.format("%d: %s", i, result);
      System.out.println(output);
    }
  }
}
