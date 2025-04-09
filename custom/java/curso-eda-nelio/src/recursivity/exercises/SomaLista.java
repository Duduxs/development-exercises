package src.recursivity.exercises;

import java.util.ArrayList;
import java.util.List;

public class SomaLista {

    public static void main(String[] args) {
        List<Double> lista = new ArrayList<>();
        lista.addAll(List.of(4.0, 5.0, 3.0));
        System.out.println(sumList(List.of()));
        System.out.println(sumList(lista));
    }

    public static double sumList(List<Double> list) {
        if (list.isEmpty()) {
            return 0.0;
        }

        return list.getFirst() + sumList(list.subList(1, list.size()));
    }
}
