package Method;

public class RandomChar {

	/**
	 * �������������ַ�ch1��ch2֮�������ַ�
	 * 
	 * @param ch1
	 * @param ch2
	 * @return
	 */
	public static char getRandomChar(char ch1, char ch2) {
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	/**
	 * ����һ�������Сд�ַ���
	 * 
	 * @return
	 */
	public static char getRandomLowerCaseLetter() {
		return getRandomChar('a', 'z');
	}

	/**
	 * ����һ������Ĵ�д�ַ���
	 * 
	 * @return
	 */
	public static char getRandomUpperCaseLetter() {
		return getRandomChar('A', 'Z');
	}

	/**
	 * ����һ��������ַ���
	 * 
	 * @return
	 */
	public static char getRandomDigitChar() {
		return getRandomChar('0', '9');
	}

	/**
	 * ����һ��������ַ���
	 * 
	 * @return
	 */
	public static char getRandomChar() {
		return getRandomChar('\u0000', '\uFFFF');
	}
}
