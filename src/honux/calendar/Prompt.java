package honux.calendar;

import java.util.Scanner;

public class Prompt {
	
	public int parseDay(String week){
		if(week.equals("su")){
			return 0;
		} else if(week.equals("mo")){
			return 1;
		} else if(week.equals("tu")){
			return 2;
		} else if(week.equals("wd")){
			return 3;
		} else if(week.equals("th")){
			return 4;
		} else if(week.equals("fr")){
			return 5;
		}else {
			return 6;
		}
	}
	
	public void runPrompt(){
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = 1;
		int year = 2017;

		while(true){
			System.out.println("년도를 입력하세요.(exit : -1)");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			if(year == -1){
				break;
			}
			System.out.println("달을 입력하세요");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
//			System.out.println("첫쨌날의 요일을 입력 해 주세요(su, mo, tu, wd, th,fr,sa).");
			
			if(month > 12 || month < 1){
				System.out.println("잘못된 입력입니다.");
				continue;
			}
//			System.out.println(month+"달은"+cal.getMaxDaysOfMonth(month)+"일까지 있습니다.");
			cal.printCalendar(year, month);
		}
		System.out.println("Bye~~");
//		cal.printSampleCalendar();
		scanner.close();
	}
	public static void main(String[] args){
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
