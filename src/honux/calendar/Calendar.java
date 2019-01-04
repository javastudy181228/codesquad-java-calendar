package honux.calendar;

public class Calendar {
	
	private final int[] MAX_DAYS = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	private final int[] LEAP_MAX_DAYS = {0,31,29,31,30,31,30,31,31,30,31,30,31};
	
	public boolean isLeapYear(int year){
		if(year %4 ==0 && (year % 100 != 0 || year % 400 ==0)){
			return true;
		} else {
			return false;
		}
	}
	public int getMaxDaysOfMonth(int year, int month){
		if(isLeapYear(year)){
			return LEAP_MAX_DAYS[month];
		}else {
			return MAX_DAYS[month];
		}
	}
	
	public void printCalendar(int year, int month){
		System.out.printf("      <<%d년%d월>>\n",year,month);
		System.out.println(" SU MO TO WE TH FR SA");
		System.out.println("----------------------");
		
		int maxDay =  getMaxDaysOfMonth(year, month);
		
		//get weekDay automatiqally
		int weekday = getWeekday(year, month, 1);
		for(int j=0; j<weekday; j++){
			System.out.print("   ");
		}
		for(int i = 1; i <= maxDay; i++){
			System.out.printf("%3d", i);
			if((i+weekday)%7==0){
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
//		System.out.println("1  2  3  4  5  6  7");
//		System.out.println("8  9  10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
	}
	private int getWeekday(int year, int month, int day) {
		int syear = 1970;
		final int STANDARD_WEEKDAY = 3; //Thursday
		
		int count = 0;
		for(int i=syear; i < year; i++){
			int delta = isLeapYear(i) ? 366 : 365;
			count +=delta;
		}
		for (int i=1; i< month; i++){
			int delta = getMaxDaysOfMonth(year, i);
			count += day;
		}
		
		count += day;
//		System.out.println(count);
		int weekday = (count+STANDARD_WEEKDAY) %7;
		return weekday;
	}
	
	public static void main(String[] args){
		Calendar c = new Calendar();
		System.out.println(c.getWeekday(1970, 1, 1) == 3);
	}
}
