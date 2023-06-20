package leetcode.java.easy;

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (!magazine.contains(Character.toString(ch))) {
                return false;
            }
            magazine = magazine.replaceFirst(Character.toString(ch), "");
        }
        return true;
    }


    public static void main(String[] args) {
//        System.out.println(canConstruct("a", "b"));
//        System.out.println(canConstruct("aa", "ab"));
//        System.out.println(canConstruct("aa", "aab"));
//        System.out.println(canConstruct("aab", "baa"));
//        System.out.println(canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
        System.out.println(canConstruct("fffbfg", "effjfggbffjdgbjjhhdegh"));
//        System.out.println(canConstruct("ihgg", "ch"));
//        System.out.println(canConstruct("az", "ab"));
    }

}
