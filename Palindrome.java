package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String name = "madam";
		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);

		}
		System.out.println(rev);
		if (name.equals(rev)) {
			System.out.println("Name is Palindrome");
		} else {
			System.out.println("Name is Not Palindrome");

		}

	}

}