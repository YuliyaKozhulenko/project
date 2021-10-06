package stepit.hw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WordLength {
    public static void main(String[] args) {

        String sentence = "I want to become a Quality Assurance Engineer";
        List<String> words = Arrays.asList(sentence.split(" "));

        String longestWord = words.stream().max(
                        Comparator.comparing(
                                word -> word.length()))
                .get();

        System.out.println(longestWord);
    }
}