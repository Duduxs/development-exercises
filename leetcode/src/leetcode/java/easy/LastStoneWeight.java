package leetcode.java.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LastStoneWeight {

    public static int lastStoneWeight(int[] stones) {

        List<Integer> stonesAsList = Arrays.stream(stones).boxed().sorted(Comparator.comparingInt(x -> -x)).collect(Collectors.toList());

        while (stonesAsList.size() > 1) {
            stonesAsList.sort(Comparator.comparingInt(x -> -x));
            var firstHeaviestStone = stonesAsList.get(0);
            var secondHeaviestStone = stonesAsList.get(1);

            if (!firstHeaviestStone.equals(secondHeaviestStone)) {
                int difference = firstHeaviestStone > secondHeaviestStone ? firstHeaviestStone - secondHeaviestStone : secondHeaviestStone - firstHeaviestStone;
                stonesAsList.remove(firstHeaviestStone);
                stonesAsList.remove(secondHeaviestStone);

                if (difference != 0) {
                    stonesAsList.add(difference);
                }
            }

            if (firstHeaviestStone.equals(secondHeaviestStone)) {
                stonesAsList.remove(firstHeaviestStone);
                stonesAsList.remove(secondHeaviestStone);
            }

        }

        return stonesAsList.stream().findFirst().isPresent() ? stonesAsList.stream().findFirst().get() : 0;

    }

    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{9, 10, 1, 7, 3}));
    }

    // {9,10,1,7,3}
    //10 9 -> 1
    // {1,1,7,3}
    //7 3 -> 4
    // {1,1,4}
    // 4 1 -> 3
    // {1,3}
    // 3 1 -> 2
    // {2}



}
