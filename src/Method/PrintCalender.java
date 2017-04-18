package Method;

import java.util.Scanner;

public class PrintCalender {

	private static int startYear;
	private static int startDay;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter full year(e.g 2001): ");
		int year = input.nextInt();
		System.out.print("Enter month in number between 1 to 12:");
		int month = input.nextInt();

		System.out.print("Enter start year(e.g 2001): ");
		startYear = input.nextInt();
		System.out.print("Enter day in number between 1 to 7:");
		startDay = input.nextInt();

		printMonth(year, month);
		
		input.close();
	}

	private static void printMonth(int year, int month) {
		// TODO Auto-generated method stub

		printMonthTitle(year, month);

		printMonthBody(year, month);
	}

	/**
	 * 打印月份表头
	 * 
	 * @param year
	 * @param month
	 */
	private static void printMonthTitle(int year, int month) {
		// TODO Auto-generated method stub

		System.out.println("            " + getMonthName(month) + "　     "
				+ year);
		System.out.println("---------------------------------------");
		System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

	}

	/**
	 * 获取指定月的名称
	 * 
	 * @param month
	 * @return
	 */
	private static String getMonthName(int month) {
		String monthName = null;
		switch (month) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "Deccember";
			break;
		}
		return monthName;
	}

	/**
	 * 绘制月份表格
	 * 
	 * @param year
	 * @param month
	 */
	private static void printMonthBody(int year, int month) {
		// TODO Auto-generated method stub
		int startDay = getStartDay(year, month);

		int numOfDaysInMonth = getNumOfDaysInMonth(year, month);

		for (int i = 0; i < startDay; i++) {
			System.out.print("     ");
		}

		for (int i = 1; i <= numOfDaysInMonth; i++) {
			System.out.printf("%5d", i);

			if ((i + startDay) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	/**
	 * 计算
	 * 
	 * @param year
	 * @param month
	 * @return
	 */
	private static int getStartDay(int year, int month) {

		int totalNumOfDays = getTotalNumOfDays(year, month);

		return (totalNumOfDays + startDay) % 7;
	}

	private static int getTotalNumOfDays(int year, int month) {
		int total = 0;

		for (int i = startYear; i < year; i++) {
			if (isLeap(year)) {
				total += 366;
			} else {
				total += 365;
			}
		}
		for (int i = 1; i < month; i++) {
			total += getNumOfDaysInMonth(year, i);
		}
		return total;
	}

	private static int getNumOfDaysInMonth(int year, int month) {

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
				|| month == 10 || month == 12)
			return 31;
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		if (month == 2)
			return isLeap(year) ? 29 : 28;
		return 0;
	}

	private static boolean isLeap(int year) {

		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}
