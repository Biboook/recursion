import java.util.Scanner;

public class Problem9 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		int k = in.nextInt();
		int result = n - k;
		
		System.out.println(Binomial1(n) / (Binomial2(k) * Binomial3(result)));
		
	}
	
	private static int Binomial3(int result) {
		if(result == 1) return 1;
		return result * Binomial3(result - 1);	
	}

	private static int Binomial2(int k) {
		if(k == 1) return 1;
		return k * Binomial2(k - 1);
	}

	public static int Binomial1(int n) {
		if(n == 1) return 1;
		return n * Binomial1(n - 1);
	}
	
}

