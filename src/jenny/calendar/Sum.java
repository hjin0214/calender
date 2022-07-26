package jenny.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// 입력 : 키보드로 두 수의 입력을 받음
		// 출력 : 화면의 두 수의 합을 출력
		int a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력해주세요");
		String s1 = scanner.next();
		String s2 = scanner.next();
		
//		System.out.println(s1 + "," + s2);
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
//		System.out.println(a + ", " + b);
//		System.out.println(a + "+" + b + "=" + (a+b));
		System.out.printf("두 수의 합은 %d 입니다", a+b);
//		System.out.printf("%d와 %d의 합은 %d 입니다", a, b, a+b);
		
		scanner.close(); // 닫아줘야됨
	}

}
