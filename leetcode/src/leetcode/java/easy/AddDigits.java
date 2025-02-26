package leetcode.java.easy;

public class AddDigits {

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {
        var numAsStr = String.valueOf(num);
        int sum = 0;
        int i = 0;

        while (true) {
            if (numAsStr.length() > i) {
                sum += Integer.parseInt(String.valueOf(numAsStr.charAt(i)));
                i++;
            } else if (numAsStr.length() == 1) {
                break;
            } else {
                numAsStr = String.valueOf(sum);
                i = 0;
                sum = 0;
            }
        }

        return sum;
    }
}
