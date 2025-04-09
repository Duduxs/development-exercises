package src.recursivity.exercises;

public class ContagemRegressiva {

    public static void main(String[] args) {
        imprimeContagem(5);
    }

    public static void imprimeContagem(int number) {
        System.out.println(number);

        if (number != 0) {
            imprimeContagem(--number);
        }
    }
}
