package leetcode.java.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Integer> list = Arrays.stream(candies).sorted().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        var greatestElement = list.get(list.size() - 1);

        return Arrays.stream(candies).mapToObj(candy -> candy + extraCandies >= greatestElement).toList();
    }


    public static void main(String[] args) {
        kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
    }
}
