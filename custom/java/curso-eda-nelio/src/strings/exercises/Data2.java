package src.strings.exercises;


public class Data2 {

    public static void main(String[] args) {
        System.out.println(formatDate(21, 7, 2010));
    }

    public static String formatDate(int day, int month, int year) {
        var formattedDay = String.valueOf(day).length() == 1 ? "0" + day : day;
        var formattedMonth = String.valueOf(month).length() == 1 ? "0" + month : month;
        return String.format("%s/%s/%s", formattedDay, formattedMonth, year);
    }
}
