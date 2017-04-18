package Method;

public class RandomChar {

	/**
	 * 生成任意两个字符ch1，ch2之间的随机字符
	 * 
	 * @param ch1
	 * @param ch2
	 * @return
	 */
	public static char getRandomChar(char ch1, char ch2) {
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	/**
	 * 生成一个随机的小写字符串
	 * 
	 * @return
	 */
	public static char getRandomLowerCaseLetter() {
		return getRandomChar('a', 'z');
	}

	/**
	 * 生成一个随机的大写字符串
	 * 
	 * @return
	 */
	public static char getRandomUpperCaseLetter() {
		return getRandomChar('A', 'Z');
	}

	/**
	 * 生成一个随机的字符串
	 * 
	 * @return
	 */
	public static char getRandomDigitChar() {
		return getRandomChar('0', '9');
	}

	/**
	 * 生成一个随机的字符串
	 * 
	 * @return
	 */
	public static char getRandomChar() {
		return getRandomChar('\u0000', '\uFFFF');
	}
}
