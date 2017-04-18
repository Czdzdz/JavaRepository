package loop;

public class NineTable {
	public static void main(String[] args) {

		System.out.println("-----------Multiplication Table--------------");
		System.out.print("      ");
		for (int i = 1; i <= 9; i++)
			System.out.printf("%4d", i);

		System.out.println("\n---------------------------------------------");

		for (int j = 1; j <= 9; j++) {
			System.out.print(j + "  |  ");
			for (int k = 1; k <= 9; k++) {
				System.out.printf("%4d", j * k);
			}
			System.out.println();
		}

	}
}
