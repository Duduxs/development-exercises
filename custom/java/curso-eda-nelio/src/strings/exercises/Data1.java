package src.strings.exercises;

public class Data1 {

    public static void main(String[] args) {
        System.out.println(extractInformation("21/07/2010"));
    }

    public static DateInfo extractInformation(String date) {
        var dateArray = date.split("/");
        return new DateInfo(
                Integer.valueOf(dateArray[0]),
                Integer.valueOf(dateArray[1]),
                Integer.valueOf(dateArray[2])
        );
    }

    record DateInfo(Integer dia, Integer mes, Integer ano) {}
}
