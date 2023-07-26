package leetcode.java.easy;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        var str = Arrays.stream(digits).mapToObj(String::valueOf).collect(Collectors.joining());
        BigInteger bigInt = new BigInteger(str).add(BigInteger.ONE);

        var list = Arrays.stream(bigInt.toString().split("")).toList();

        var result = new int[list.size()];

        for (var i = 0; i < list.size(); i++) {
            result[i] = Integer.parseInt(list.get(i));
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{4,3,2,1})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
    }
}
