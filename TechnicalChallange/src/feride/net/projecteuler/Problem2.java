package feride.net.projecteuler;

public class Problem2 {

	public static void main(String[] args) {
		System.out.println(sumEvenFibonacciNumbers(4000000));
	}

	public static int sumEvenFibonacciNumbers(int limit) {
		int sum = 0;
		int current = 0;
		int i = 0;
		while (current < limit) {
			current = fibonacci(i);
				if(current % 2 == 0)
					sum+=current;
				i++;
		}
		return sum;
	}

	public static int fibonacci(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
