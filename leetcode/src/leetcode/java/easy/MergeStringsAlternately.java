package leetcode.java.easy;

public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        var longestWord = word1.length() > word2.length() ? word1 : word2;
        var sb = new StringBuilder();

        for (var i = 0; i < longestWord.length(); i++) {
            if (word1.length() > i) sb.append(word1.charAt(i));
            if (word2.length() > i) sb.append(word2.charAt(i));
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        var mergeStringsAlternately = new MergeStringsAlternately();
        System.out.println(mergeStringsAlternately.mergeAlternately("ab", "pqrs"));
    }
    
}
