package leetcode.java.easy;

public class IsHappy {

    public static boolean isHappy(int n) {
        if (n < 0) return false;

        var times = 0;

        while (n != 1) {
            times++;

            var numbers = String.valueOf(n).split("");
            n = 0;
            for (var number : numbers) {
                var parsedNumber = Integer.valueOf(number);
                n += parsedNumber * parsedNumber;
            }


            if (times == 10) {
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(78));
        System.out.println(isHappy(7));

    }

}
