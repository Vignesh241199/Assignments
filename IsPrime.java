package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int a = 9;
		int n = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				n++;
			}
		}
		if (n == 2) {
			System.out.println(a + " " + " Number is prime");
		} else {
			System.out.println(a + " " + " Number is Non prime");
		}

	}

}
