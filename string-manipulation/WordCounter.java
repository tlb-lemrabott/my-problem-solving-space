public class WordCounter {
    public static void main(String[] args) {
        String sentence = "Hello world, this is a Java program!";

        int count = countWords(sentence);
        System.out.println("Word count: " + count);
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }

        // Split by one or more spaces
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
}


//Optional Improvement: Ignore punctuation
public static int countWords(String sentence) {
    if (sentence == null || sentence.trim().isEmpty()) return 0;

    String cleaned = sentence.replaceAll("[^a-zA-Z\\s]", ""); // remove punctuation
    String[] words = cleaned.trim().split("\\s+");
    return words.length;
}
