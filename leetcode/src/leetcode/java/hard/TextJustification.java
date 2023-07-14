package leetcode.java.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextJustification {

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();

        List<StringBuilder> currentWords = new ArrayList<>();
        var sumOfLengthsOfCurrentWords = 0;

        for (var word : words) {
            int newLineLength = sumOfLengthsOfCurrentWords + word.length() + currentWords.size();

            if (newLineLength > maxWidth) {
                int extraPadding = maxWidth - (sumOfLengthsOfCurrentWords + currentWords.size() - 1);
                int wordsToRoundRobinSpaces = Math.max(currentWords.size() - 1, 1);

                for (var i = 0; i < extraPadding; i++) {
                    int indexForSpace = i % wordsToRoundRobinSpaces;
                    currentWords.get(indexForSpace).append(" ");
                }
                result.add(
                        currentWords
                                .stream()
                                .map(StringBuilder::toString)
                                .collect(Collectors.joining(" "))
                );

                currentWords = new ArrayList<>();
                sumOfLengthsOfCurrentWords = 0;

            }

            currentWords.add(new StringBuilder(word));
            sumOfLengthsOfCurrentWords += word.length();

        }

        int extraSpaces = maxWidth - (sumOfLengthsOfCurrentWords + currentWords.size() - 1);
        String spaces = Stream.generate(() -> " ").limit(extraSpaces).collect(Collectors.joining(""));

        result.add(
                currentWords
                        .stream()
                        .map(StringBuilder::toString)
                        .collect(Collectors.joining(" ")) + spaces
        );

        return result;

    }

    public static void main(String[] args) {

    }
}
