package jenny.calendar;

import java.util.Scanner;

public class RepeatInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Calendar calendar = new Calendar();
		
		System.out.println("원하는 숫자를 입력하세요.");
		int repeatNum = scanner.nextInt();
		
		for(int i = 0; i<repeatNum; i++) {
			
		System.out.println("원하는 달을 입력하세요.");
		int mth = scanner.nextInt();
		
		System.out.printf("%d 월은 %d일까지 있습니다. ", mth, calendar.getMaxdays(mth));
		}
	}

}
