package feride.net.projecteuler;

public class Problem3 {

	public static void main(String[] args) {
		System.out.println(largestPrimeFactor(600851475143L));

	}

	public static long largestPrimeFactor(long limit) {
		long factor = 0L;
		for (int i = 2; i * i <= limit; i++) {
			if (limit == 1) {
				break;
			}
			if (limit % i != 0) {
				continue;
			}
			factor = i;
			while (limit % i == 0) {
				limit /= i;
			}
		}
		return limit == 1 ? factor : limit;
	}

}
