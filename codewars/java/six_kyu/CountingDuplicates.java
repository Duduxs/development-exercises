package six_kyu;

import java.util.ArrayList;

/**
 * Count the number of Duplicates
 * <p>
 * Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
 * Example
 * <p>
 * "abcde" -> 0 # no characters repeats more than once
 * "aabbcde" -> 2 # 'a' and 'b'
 * "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
 * "indivisibility" -> 1 # 'i' occurs six times
 * "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
 * "aA11" -> 2 # 'a' and '1'
 * "ABBA" -> 2 # 'A' and 'B' each occur twice
 */

public class CountingDuplicates {
    public static int duplicateCount(String text) {

        var lowercaseString = text.toLowerCase();
        var repeatedCount = 0;
        var alreadyCheckedCharacters = new ArrayList<Character>();

        for (int i = 0; i < lowercaseString.length(); i++) {
            var character = lowercaseString.charAt(i);

            if (lowercaseString.lastIndexOf(character) != i && !alreadyCheckedCharacters.contains(character)) {
                alreadyCheckedCharacters.add(character);
                ++repeatedCount;
            }
        }

        return repeatedCount;
    }

    public static void main(String[] args) {
        duplicateCount("abcdea");
    }


}
