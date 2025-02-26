package leetcode.java.easy;

public class AddDigits {

    public static void main(String[] args) {
        System.out.println(addDigits(38));;
    }

    public static int addDigits(int num) {
        var numAsStr = String.valueOf(num);

        if (numAsStr.length() == 1) return num;

        int sum = 0;
        int i = 0 ;

        while (numAsStr.length() > 1) {
            if(numAsStr.length() > i) {
                sum += Integer.valueOf(String.valueOf(numAsStr.charAt(i)));
                i++;
            } else {
                numAsStr = String.valueOf(sum);
                if(numAsStr.length() == 1) return sum;
                i = 0;
                sum = 0;
            }
        }

        return sum;

    }

}
