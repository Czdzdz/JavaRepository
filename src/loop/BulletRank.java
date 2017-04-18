package loop;

import java.util.Arrays;

public class BulletRank {

	public static void main(String[] args) {
		int[] arr = { 1, 223, 5, 4, 12, 1423 };
		Arrays.sort(arr);

//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = 0; j < arr.length - i - 1; j++) {
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j + 1];
//					arr[j + 1] = arr[j];
//					arr[j] = temp;
//				}
//			}   
//		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
