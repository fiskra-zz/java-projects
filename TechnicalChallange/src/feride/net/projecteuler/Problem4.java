package feride.net.projecteuler;

public class Problem4 {
	
	public static void main(String[] args) {
		System.out.println(findLargestPalindrome());     	
	}
	
	public static int findLargestPalindrome(){
		int product = 0;
		for (int i = 999; i > 99; i--) {
			for (int j = 999; j > 99; j--) {
				product = i * j;
				if(isPalindrome(Integer.toString(product))){
					return product;
				}
			}
		}
		return product;
	}
	
	public static boolean isPalindrome(String s){
		String reversal = new StringBuffer(s).reverse().toString();
		return s.equals(reversal) ? true : false;
	} 
	
	 
}
