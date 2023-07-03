package leetcode.java.medium;

import java.util.Arrays;
import java.util.Comparator;

public class HIndex {

    public static int hIndex(int[] citations) {

        var sortedData = Arrays.stream(citations).boxed().sorted(Comparator.comparingInt(x -> -x)).toList();
        for (var i = 0; i < sortedData.size(); i++) {

            if (i >= sortedData.get(i)) {
                return i;
            }
        }

        return sortedData.size();
    }

    public static void main(String[] args) {
        hIndex(new int[]{3, 0, 6, 1, 5});
    }
}
