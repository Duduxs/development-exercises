package src.recursivity.exercises;

public class Potencial {

    public static void main(String[] args) {
        System.out.println(multiplicaPotencia(3, 3));
    }

    public static int multiplicaPotencia(int x, int y) {

        if(y == 0) {
            return 1;
        }

        return x * multiplicaPotencia(x, y - 1);
    }

}
