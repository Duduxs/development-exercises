package src.algorithms_complexity.exercises;

public class OrdemExponencial {

    public static void main(String[] args) {
        System.out.println(fibbonaci(6));
    }

    public static int fibbonaci(int value) {
        if (value == 0 || value == 1) {
            return value;
        }

        return fibbonaci(value - 1) + fibbonaci(value - 2);
    }

}
