package leetcode.java.easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueMorseCodeWords {

    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }

    public static int uniqueMorseRepresentations(String[] words) {

        List<Character> alphabet = "abcdefghijklmnopqrstuvwxyz".chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.toList());

        List<String> morse = List.of(
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        );

        Set<String> uniqueMorseCombinations = new HashSet<>();

        for (String word : words) {
            var sb = new StringBuilder();
            for (Character character : word.toLowerCase().toCharArray()) {
                var morseData = morse.get(alphabet.indexOf(character));
                sb.append(morseData);
            }
            uniqueMorseCombinations.add(sb.toString());
        }

        return (int) uniqueMorseCombinations.stream().count();

    }
}
