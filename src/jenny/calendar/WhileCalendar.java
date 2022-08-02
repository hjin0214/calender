package jenny.calendar;

import java.util.Scanner;

public class WhileCalendar {

	public static void main(String[] args) {
		// 횟수가 정해지지 않으면서 -1은 뱉어내는 반복문
		
		Scanner scanner = new Scanner(System.in);
		Calendar calendar = new Calendar();
		
		int repeatNum = 1;
		while(true) {
		System.out.println("원하는 달을 입력하세요.");
		repeatNum = scanner.nextInt();
		if (repeatNum == -1) {
			break;
			}
			System.out.printf("%d 월은 %d일까지 있습니다. ", repeatNum, calendar.getMaxdays(repeatNum));
		}
			System.out.println("끝");
			scanner.close();
	}	

}
