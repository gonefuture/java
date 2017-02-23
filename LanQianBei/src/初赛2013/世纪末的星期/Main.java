package 初赛2013.世纪末的星期;

import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args){
		for(int i =1999;;i+=100){
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(new Date(i-1900,12,31));
			if(calendar.get(calendar.DAY_OF_WEEK) == 1){
				System.out.println(i);
				return;
			}
			
		}
	}

}
