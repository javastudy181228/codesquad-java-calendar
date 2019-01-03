package honux.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args){
		//입력 : 키보드로 두 수의 입력을 받는다
		//출력 :  화면에 두 수의 합을 구한다
		int a,b;
		Scanner scanner = new Scanner(System.in);
		String s1,s2;
		System.out.println("두 수를 입력해 주세요");
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);

		System.out.println(a+"와"+ b +"의 합은 " + (a+b) + "입니다.");
		scanner.close();
	}
}
