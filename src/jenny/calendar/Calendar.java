package jenny.calendar;

import java.util.Scanner;

public class Calendar {

	// 함수 이용
			int maxdays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
			public int getMaxdays(int mth) {
				return maxdays[mth -1];
			}
			
	public static void main(String[] args) {
		
		
		// 입력 받은 달의 최대 일수 출력
		
		Scanner scanner = new Scanner(System.in);
		Calendar calendar = new Calendar();
		
		System.out.println("원하는 달을 입력하세요.");
		int mth = scanner.nextInt();
		
		System.out.printf("%d 월은 %d일까지 있습니다.", mth, calendar.getMaxdays(mth));
		
		// 배열 이용
//		int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		System.out.printf("%d 월은 %d일까지 있습니다.", mth, month[mth-1]);
		
		// if문 이용
//		if(mth%2 == 1) {
//			System.out.println("31일");
//		} else if (mth == 2) {
//			System.out.println("28일");
//		} else {
//			System.out.println("30일");
//		}
		
		scanner.close();
	}

}
