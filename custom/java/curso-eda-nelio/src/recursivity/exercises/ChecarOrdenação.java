package src.recursivity.exercises;

import java.util.ArrayList;
import java.util.List;

public class ChecarOrdenação {

    public static void main(String[] args) {
        System.out.println(isSorted(new ArrayList<>(List.of(15.0, 20.0, 22.0, 31.0, 40.0))));
        System.out.println(isSorted(new ArrayList<>(List.of(15.0, 20.0, 22.0, 31.0, 9.0))));
        System.out.println(isSorted(new ArrayList<>(List.of(15.0, 20.0, 22.0, 21.0, 40.0))));
    }

    public static boolean isSorted(List<Double> test) {
        if (test.size() <= 1) {
            return true;
        }

        var head = test.getFirst();
        var second = test.get(1);

        if(head > second) {
            return false;
        }

        var tail = test.subList(1, test.size());

        return isSorted(tail);
    }
}
