import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WordCounter {

    public static void main(String[] args) {
        String filePath = "Profiling/ProfilingTest/src/dummy.txt";
        try {
            HashMap<String, Integer> wordCounts = countWords(filePath);
            System.out.println("Word count completed. Unique words: " + wordCounts.size());
            wordCounts.forEach((word, count) -> System.out.println(word + ": " + count));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static HashMap<String, Integer> countWords(String filePath) throws IOException {
        HashMap<String, Integer> wordCounts = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            try {
                // to sleep 10 seconds
                Thread.sleep(10);
            } catch (InterruptedException e) {
                continue;
            }
            for (String word : words) {
                word = word.toLowerCase();
                wordCounts.merge(word, 1, Integer::sum);
            }
        }

        reader.close();
        return wordCounts;
    }
}
