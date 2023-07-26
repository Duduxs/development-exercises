package leetcode.java.easy;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        var str = Arrays.stream(digits).mapToObj(String::valueOf).collect(Collectors.joining());

        var bigInt = new BigInteger(str).add(BigInteger.ONE);

        return Arrays.stream(bigInt.toString().split("")).mapToInt(Integer::parseInt).toArray();

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
    }
}
