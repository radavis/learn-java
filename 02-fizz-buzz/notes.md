# Notes

## jshell - The Java REPL

```
$ jshell
jshell> /help
jshell> /exit

```

## String Concatenation Options

```java
String name = "Ash";
String plusConcat = "Hodwy, " + name + "!";

// or new StringBuffer()
StringBuilder stringBuilderConcat = new StringBuilder()
  .append("Hodwy, ")
  .append(name)
  .append("!");

String stringConcatConcat = greeting.concat("Hodwy, ")
  .concat(name)
  .concat("!");

String stringFormatConcat = String.format("Hodwy, %s!", name);

String stringJoinConcat = String.join("", "Howdy, ", name, "!");

String streamsConcat = Arrays.asList("Howdy, ", name, "!")
  .stream()
  .collect(Collectors.joining());
```

## Java Primitives

* boolean
* byte
* char
* short
* int
* long
* float
* double

[source](https://cs.fit.edu/~ryan/java/language/java-data.html)

## Resources

* [Google Java Style Guide](http://google.github.io/styleguide/javaguide.html)
* [If...Else Statements](https://sites.google.com/site/learnjav/java/if-statement)
* [String Concatenation](https://redfin.engineering/java-string-concatenation-which-way-is-best-8f590a7d22a8)
