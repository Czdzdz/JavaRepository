package Method;

public class TestRandomChar {
	public static void main(String[] args) {
		final int NUM_OF_CHARS = 125;
		final int CHARS_PER_LINE = 25;

		// ѭ����ӡ125��Сд��ĸ��ÿ��25��
		for (int i = 0; i < NUM_OF_CHARS; i++) {
			char ch = RandomChar.getRandomLowerCaseLetter();
			if ((i + 1) % CHARS_PER_LINE == 0)// �жϻ���
				System.out.println(ch);
			else
				System.out.print(ch);
		}
	}
}
