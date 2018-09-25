import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordCounter {
  private static final String STOP_WORDS_FILENAME = "stop-word-list.csv";
  private String filename;
  private ArrayList<String> stopWords;
  private HashMap<String, Integer> wordCount;

  WordCounter(String filename) throws Exception {
    this.filename = filename;
    this.stopWords = new ArrayList<String>();
    this.wordCount = new HashMap<String, Integer>();

    setStopWords();
    setWordCount();
  }

  private void setStopWords() throws Exception {
    File stopWordsCsv = new File(STOP_WORDS_FILENAME);
    Scanner scanner = new Scanner(stopWordsCsv).useDelimiter(", ");

    while(scanner.hasNext()) {
      stopWords.add(scanner.next());
    }

    scanner.close();
  }

  private void setWordCount() throws Exception {
    File sourceDocument = new File(this.filename);
    Scanner scanner = new Scanner(sourceDocument).useDelimiter("\\s+");

    while(scanner.hasNext()) {
      // source: https://stackoverflow.com/a/37419929/2675670
      // str.replaceAll("\\p{Punct}", "");
      String word = scanner.next().toLowerCase();
      Integer count = wordCount.get(word);

      if(count == null)
        count = 0;

      count += 1;
      wordCount.put(word, count);
    }

    scanner.close();
  }

  public void print() {
    for (Map.Entry<String, Integer> wordCountEntry : this.wordCount.entrySet()) {
      String word = wordCountEntry.getKey();
      Integer count = wordCountEntry.getValue();

      String output = String.format("%s: %d", word, count);
      System.out.println(output);
    }
  }

  public static void main(String[] args) throws Exception {
    WordCounter wordCounter = new WordCounter("moby-dick.txt");
    wordCounter.print();
  }
}

// todo:
//   - remove extra punctuation
//   - print the top 10 used words
//   - exclude stop words
