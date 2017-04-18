package Method;

public class TestRandomChar {
	public static void main(String[] args) {
		final int NUM_OF_CHARS = 125;
		final int CHARS_PER_LINE = 25;

		// 循环打印125个小写字母，每行25个
		for (int i = 0; i < NUM_OF_CHARS; i++) {
			char ch = RandomChar.getRandomLowerCaseLetter();
			if ((i + 1) % CHARS_PER_LINE == 0)// 判断换行
				System.out.println(ch);
			else
				System.out.print(ch);
		}
	}
}
