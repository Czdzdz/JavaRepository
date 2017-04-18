package loop;

import java.util.Scanner;

/**
 * 输入两个正整数，求出他们的最大公约数
 * 
 * @author Administrator
 * 
 */
public class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first Integer:");
		int first = input.nextInt();
		System.out.println("Enter your second Integer:");
		int second = input.nextInt();

		int gcd = 1;
//		int k = 2;
//		while (k <= first && k <= second) {
//			if (first % k == 0 && second % k == 0)
//				gcd = k;
//			k++;
//
//		}

		
		for(int k=2;k<=first&&k<=second;k++){
			if (first % k == 0 && second % k == 0)
				gcd = k;
		}
		
		System.out.println("The greatest common divisor for " + first + " and "
				+ second + " is " + gcd);
		input.close();
	}
}
