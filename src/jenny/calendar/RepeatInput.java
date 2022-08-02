package jenny.calendar;

import java.util.Scanner;

public class RepeatInput {

	public static void main(String[] args) {
		
		String PROMPT="Num>";
		String PROMPT2="Cal>";
		Scanner scanner = new Scanner(System.in);
		Calendar calendar = new Calendar();
		
		System.out.println("원하는 숫자를 입력하세요.");
		System.out.print(PROMPT);
		int repeatNum = scanner.nextInt();
		
		for(int i = 0; i<repeatNum; i++) {
			
		System.out.println("원하는 달을 입력하세요.");
		System.out.print(PROMPT2);
		int mth = scanner.nextInt();
		
		System.out.printf("%d 월은 %d일까지 있습니다. ", mth, calendar.getMaxdays(mth));
		}
		scanner.close();
	}
	
	

}
