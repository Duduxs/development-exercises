package src.algorithms_complexity.exercises;

import java.util.Arrays;

public class OrdemQuadratica {

    public static void main(String[] args) {
        Arrays.stream(calculate(new int[]{7, 3, 8, 7, 5})).forEach(System.out::println);
    }

    public static int[] calculate(final int[] elements) {
        var result = new int[elements.length];
        for (var i = 0; i < elements.length; i++) {
            for (var j = 0; j < elements.length; j++) {
                if (elements[j] > elements[i]) {
                    result[i] += 1;
                }
            }
        }
        return result;

    }
}
