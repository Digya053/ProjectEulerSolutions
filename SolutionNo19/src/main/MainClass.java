package main;

import java.util.Map;

import calculation.Days;

public class MainClass {

	public static void main(String[] args){
		Days days = new Days();
		int counter = 0;
		int count = 0;

		for(int year = 1901; year <=2000; year++){
			for(int month = 1; month <=12; month++){
				int y = days.totalDays(month, year);
				for (int month_days = 1; month_days <= y; month_days ++) // Number of month days
				{
					// Start at Monday, 1st, 1900
					counter += 1;
					Map<Integer, String> L = days.weekDays();
					if ((month_days == 1) && (L.get(counter) == "Sunday"))
					{
						count += 1;
					}
					// Days of the week
					if (counter >= 7)
					{
						counter = 0;
					}
				}

			}
		}
		System.out.println("The no of sundays is "+count);
	}

}
