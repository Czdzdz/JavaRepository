package pack;

public class Operate {
	public static void main(String[] args) {
		int a = 'a';
		System.out.println(a);
		System.out.println("---------------------------------");
		char b = 97;
		System.out.println(b);
		System.out.println("---------------------------------");
		System.out.println(1 + " Welcome to java " + 1 + 1);
		System.out.println(1 + " Welcome to java " + (1 + 1));
		System.out.println(1 + " Welcome to java " + ('\u0001' + 1));
		System.out.println(1 + " Welcome to java " + 'a' + 1);
		System.out.println("---------------------------------");
		System.out.println('a' + 1 + " Welcome to java ");

		System.out.println("---------------------------------");

		System.out.println("56 % 6 = " + 56 % 6);
		System.out.println("56 % -6 = " + 56 % -6);
		System.out.println("-56 % 6 = " + -56 % 6);
		System.out.println("-56 % -6 = " + -56 % -6);
		System.out.println("5 % 1 = " + 5 % 1);
		System.out.println("1 % 5 = " + 1 % 5);

		System.out.println("---------------------------------");

		double x = 2.0 / 3;

		System.out.printf("x is %f\n", x);
		System.out.printf("x is %4.2f\n\n", x);

		System.out.println("---------------------------------");
		System.out.printf("%8d%8s%8.1f\n", 1234, "asdf", 2.3);
		System.out.printf("%-8d%-8s%-8.1f\n", 1234, "asdf", 2.3);
		System.out.printf("%8d%8s%8.1f\n", 1234, "asdfasdfasdasfasda", 2.3);
		System.out.printf("%-8d                    %-8s%-8.1f\n", 1234,
				"asdf", 2.3);
		System.out.println("---------------------------------");
		System.out.printf("%6b\n", (1 > 2));
		System.out.printf("%6b\n\n", (1 < 2));
		System.out.printf("%d%%\n\n", 21);

	}
}
