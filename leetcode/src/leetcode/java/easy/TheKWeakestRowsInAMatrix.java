package leetcode.java.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TheKWeakestRowsInAMatrix {

    public static int[] kWeakestRows(int[][] mat, int k) {

        Map<Integer, Integer> weakestRowsByNumberOfSoldiers = new HashMap<>();

        for (var i = 0; i < mat.length; i++) {

            if (Arrays.stream(mat[i]).noneMatch(c -> c == 1)) {
                weakestRowsByNumberOfSoldiers.put(i, 0);
            }

            for (var j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    weakestRowsByNumberOfSoldiers.merge(i, 1, Integer::sum);
                }
            }
        }

        return weakestRowsByNumberOfSoldiers.entrySet()
                .stream()
                .sorted(Comparator.comparingInt(Map.Entry::getValue))
                .limit(k)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .toArray();
    }


    public static void main(String[] args) {
//        var data = kWeakestRows(
//                new int[][]{
//                        {1, 1, 0, 0, 0},
//                        {1, 1, 1, 1, 0},
//                        {1, 0, 0, 0, 0},
//                        {1, 1, 0, 0, 0},
//                        {1, 1, 1, 1, 1}
//                },
//                3
//        );
//
//        Arrays.stream(data).forEach(System.out::println);

        var data = kWeakestRows(
                new int[][]{
                        {1, 0},
                        {0, 0},
                        {1, 0},
                },
                2
        );

        Arrays.stream(data).forEach(System.out::println);

    }

}
