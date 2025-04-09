package src.recursivity.exercises;

public class FatorialComCauda {

    public static void main(String[] args) {
        System.out.println(fatorial(0));
        System.out.println(fatorial(3));
        System.out.println(fatorial(4));
    }

    public static int fatorial(int number) {
        return fatorialTailRecursive(number, 1);
    }

    public static int fatorialTailRecursive(int number, int valorAcumulado) {
        if (number == 0) {
            return valorAcumulado;
        }

        return fatorialTailRecursive(number - 1, valorAcumulado * number);
    }
}
