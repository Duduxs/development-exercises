package src.strings.exercises;


public class Data2 {

    public static void main(String[] args) {
        System.out.println(formatDate(21, 7, 2010));
        System.out.println(formatDate2(21, 7, 2010));
        System.out.println(formatDate3(21, 7, 2010));
    }

    public static String formatDate(int day, int month, int year) {
        var formattedDay = String.valueOf(day).length() == 1 ? "0" + day : day;
        var formattedMonth = String.valueOf(month).length() == 1 ? "0" + month : month;
        return String.format("%s/%s/%s", formattedDay, formattedMonth, year);
    }
    public static String formatDate2(int day, int month, int year) {
        return String.format("%02d/%02d/%d", day, month, year);
    }
    public static String formatDate3(int day, int month, int year) {
        return String.format("%s/%s/%s", addZero(day), addZero(month), year);
    }

    public static String addZero(int n) {
        if (n < 10) {
            return "0" + n;
        }
        return String.valueOf(n);
    }
}
