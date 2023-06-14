package eight_kyu;

public class WhoLikesIt {

	public static String whoLikesIt(String... names) {
	      String tempValue = "";

	      if(names.length == 0) tempValue = "no one likes this";
	      else if(names.length == 1) tempValue = names[0] + " likes this";
	      else if(names.length == 2) tempValue = names[0] + " and " + names[1] + " like this";
	      else if(names.length == 3) tempValue = names[0] + ", " + names[1] + " and " + names[2] + " like this";
	      else tempValue = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
	      
	        return tempValue;
	    }

	public static void main(String[] args) {
		
		System.out.println(whoLikesIt());
		System.out.println(whoLikesIt("Peter"));
		System.out.println(whoLikesIt("Jacob", "Alex"));
		System.out.println(whoLikesIt("Max", "John", "Mark"));
		System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
		
	}
}
