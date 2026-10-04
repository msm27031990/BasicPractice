package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Date> dateList = new ArrayList<Date>();
		Date date = new Date();
		dateList.add(date);
		int i = 6;
		while(i > 3) {
			date.setDate(i);
			dateList.add(date);
			i--;
		}
		System.out.println(dateList);
	}

}
