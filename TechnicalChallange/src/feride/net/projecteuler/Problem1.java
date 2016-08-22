package feride.net.projecteuler;

public class Problem1 {

	public static void main(String[] args) {
		
		int limit = 1000;
		int sum = sumOfSequence(3, limit) + sumOfSequence(5, limit) - sumOfSequence(15, limit);
		System.out.println(sum);

	}
	
	/**
	 * Arithmetic progression formula
	 * kn(n+1)/2
	 * 
	 * @param value
	 * @param limit
	 * @return
	 */
	public static int sumOfSequence(int value, int limit) {
	    int count = (limit - 1) / value;
	    return value * count * ( count + 1) / 2;
	}

}
