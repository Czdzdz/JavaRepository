package loop;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		int count = 0;
		while (count < 100) {
			System.out.println(count++);
		}
		System.out.println("---------------------");

		int sum = 0, num = 0;
		while (num < 100) {
			num++;
			System.out.println(sum += num);
		}

		System.out.println("---------------------");
		int number = (int) (Math.random() * 101);
		System.out.println("Ëæ»úÊý£º  " + number);
		System.out.println("Enter your guess num(0,100): ");
		Scanner input = new Scanner(System.in);

		int guessNum = -1;
		while (guessNum != number) {
			System.out.println("Enter your guess num : ");
			guessNum = input.nextInt();
			if (guessNum < number) {
				System.out.println("Your guess is to low");
			} else if (guessNum > number) {
				System.out.println("Your guess is to high");
			} else if (guessNum == number) {
				System.out.println("Good,you guess");
				input.close();
				break;
			}
		}
	}
}
