package src.recursivity.exercises;

public class Potencial {

    public static void main(String[] args) {
        System.out.println(multiplicaPotencia(3, 3));
    }

    /**
     * pow(3,2) ( 3 * 3 )             -> 3 * pow(3,1)
     * pow(3,3) ( 3 * 3 * 3 )         -> 3 * pow(3,2)
     * pow(3,4) ( 3 * 3 * 3 * 3 )     -> 3 * pow(3,3)
     * pow(3,5) ( 3 * 3 * 3 * 3 * 3 ) -> 3 * pow(3,4)
     */
    public static int multiplicaPotencia(int x, int y) {

        if(y == 0) {
            return 1;
        }

        return x * multiplicaPotencia(x, y - 1);
    }

}
