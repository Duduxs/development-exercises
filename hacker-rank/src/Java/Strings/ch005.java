package Java.Strings;

import java.util.Arrays;

public class ch005 {

	  static boolean isAnagram(String a, String b) {	        

		  char c1[] = a.replace(" ", "").toLowerCase().toCharArray();
		  char c2[] = b.replace(" ", "").toLowerCase().toCharArray();

	        Arrays.sort(c1);
	        Arrays.sort(c2);
	        
		  return Arrays.equals(c1,c2) ? true : false;
	    }
	
	public static void main(String[] args) {
		
		System.out.println(isAnagram("madam","amadm"));
	}
}
