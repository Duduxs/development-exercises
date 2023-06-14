package eight_kyu;

public class Isograms {
	public static boolean isIsogram(String str) {
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) 
				if (str.charAt(i) == str.charAt(j)) return false;	
			
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(isIsogram("ebe"));
	}
}
