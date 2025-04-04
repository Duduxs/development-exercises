package src.recursivity.exercises;

public class Fatorial {

    public static void main(String[] args) {
        System.out.println(fatorial(0));
        System.out.println(fatorial(3));
        System.out.println(fatorial(4));
    }

    public static int fatorial(int number) {
        if(number == 0) {
            return 1;
        }

        return number * fatorial(--number);
    }


}
