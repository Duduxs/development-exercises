package leetcode.java.medium;

public class GasStation {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int position = 0;
        int sum = 0;
        int total = 0;

        for (var i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];

            if (sum < 0) {
                total += sum;
                sum = 0;
                position = i + 1;
            }

        }

        total += sum;

        return total >= 0 ? position : -1;

    }

    public static void main(String[] args) {
        canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2});
    }

}
