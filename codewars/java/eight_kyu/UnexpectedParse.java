package eight_kyu;

import java.util.HashMap;

/**
 * Function should return a dictionary/Object/Hash with "status" as a key, whose value can : "busy" or "available"
 * depending on the truth value of the argument is_busy.
 *
 * But as you will see after clicking RUN or ATTEMPT this code has several bugs, please fix them.
 */


public class UnexpectedParse {
	public static HashMap <String, String> getStatus(boolean isBusy) {
		HashMap<String, String> status = new HashMap<>();

		if (isBusy) {
			status.put("status", "busy");
		} else {
			status.put("status", "available");
		}

		return status;
	}
	public static void main(String[] args) {

		System.out.println(getStatus(true));
	}
}
