package src.recursivity.exercises;

public class SomaNatural {

    public static void main(String[] args) {
       // System.out.println(xpto(0));
        System.out.println(somaNatural(2));
     //   System.out.println(xpto(4));
    }

    public static int somaNatural(int number) {

        if(number == 0) {
            return 0;
        }

        return number + somaNatural(--number);
    }
}
