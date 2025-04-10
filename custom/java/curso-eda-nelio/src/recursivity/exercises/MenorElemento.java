package src.recursivity.exercises;

import java.util.List;

public class MenorElemento {

    public static void main(String[] args) {
        System.out.println(minor(List.of(10.0, 15.0, 20.0, 8.0, 30.0, 17.0)));
        System.out.println(minor(List.of(1.0, 2.0, 3.0)));
        System.out.println(minor(List.of(3.0, 2.0, 1.0)));
    }

    public static double minor(List<Double> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        var head = list.getFirst();
        var tail = list.subList(1, list.size());
        var number = minor(tail);

        return head < number ? head : number;

    }
}
