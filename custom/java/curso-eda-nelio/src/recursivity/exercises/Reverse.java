package src.recursivity.exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Reverse {

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.addAll(List.of("azul", "verde", "preto", "rosa"));
        reverse(data).forEach(System.out::println);
    }

    public static Collection<String> reverse(List<String> data) {
        if (data.size() <= 1) {
            return data;
        }

        var head = data.get(0);
        var tail = data.subList(1, data.size());
        var newList = reverse(tail);
        newList.add(head);
        return newList;

    }

}
