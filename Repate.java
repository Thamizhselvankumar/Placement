package day4;

public class Repate {
	public static void main(String[] args) {

		String a = "aabccdde";

		for (int i = 0; i < a.length(); i++) {
			if (a.indexOf(a.charAt(i)) == a.lastIndexOf(a.charAt(i))) {
				System.out.println("First non‑repeated character: " + a.charAt(i));
				break; 
			}
		}

	}

}
