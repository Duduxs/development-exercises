package src.recursivity.exercises;

import java.util.ArrayList;
import java.util.List;

public class MesclarListar {

    public static void main(String[] args) {
        System.out.println(mergeLists(
                new ArrayList<>(List.of(10, 20, 30)),
                List.of(5,8,7))
        );
        System.out.println(mergeLists(
                new ArrayList<>(List.of("ana", "maria")),
                List.of("joao", "bob", "alex", "leo"))
        );

    }

    public static <T> List<T> mergeLists(List<T> a, List<T> b) {
        if (b.isEmpty()) {
            return List.of();
        }

        var head = b.getFirst();
        a.add(head);
        var tail = b.subList(1, b.size());
        mergeLists(a, tail);

        return a;

    }
}
