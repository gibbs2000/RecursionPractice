
public class RecursionPractice {

	// First example - factorial
	public long factorial(long n) {
		if (n == 1 || n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}

	public long fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 2) + fibonacci(n - 1);
		}
	}

	public long digitSum(int n) {
		if (n < 10)
			return n;
		else
			return n % 10 + digitSum(n / 10);
	}

	public int count5(int n) {
		if (n < 10) {
			if (n == 5)
				return 1;
			else
				return 0;
		} else if (n % 10 == 5)
			return 1 + count5(n / 10);
		else
			return count5(n / 10);
	}

	public static void main(String[] args) {
		RecursionPractice rp = new RecursionPractice();

		// for (int n = 1; n <= 20; n++) {
		// System.out.printf("Factorial %d is %,d\n", n, rp.factorial(n));
		// }

		// for (int n = 1; n <= 10; n++) {
		// System.out.printf("The first %d terms of fibonacci sum to %,d\n", n,
		// rp.fibonacci(n));
		//
		// }

		// for (int n = 1; n <= 10; n++) {
		// int x = (int) (Math.random() * 50000);
		// System.out.println("The digit sum of " + x + " is " + rp.digitSum(x));
		// }

		int n = 2525252;
		System.out.println("There are " + rp.count5(n) + " fives in " + n);
	}

}
