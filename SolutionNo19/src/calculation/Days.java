package calculation;

import java.util.HashMap;
import java.util.Map;

public class Days {

	public Map<Integer, String> weekDays(){
		Map<Integer, String> l = new HashMap<Integer, String>();
		l.put(1, "Sunday");
		l.put(2, "Monday");
		l.put(3, "Tuesday");
		l.put(4, "Wednesday");
		l.put(5, "Thursday");
		l.put(6, "Friday");
		l.put(7, "Saturday");

		return l;
	}

	public int totalDays(int month, int yr){
		int d = 0;
		if ((month == 1) || (month == 3) || (month == 5) || (month == 7) ||
				(month == 8) || (month == 10) || (month == 12))
		{
			d = 31;
		}
		else if ((month == 4) || (month == 6) || (month == 9) || (month == 11))
		{
			d = 30;
		}
		else if ((month == 2))
		{
			if (yr % 4 == 0)
			{
				if (yr % 100 == 0)
				{
					if (yr % 400 == 0)
					{
						d = 29;
					}
					else
					{
						d = 28;
					}
				} 
				else
				{
					d = 29;
				}
			}
			else
			{
				d = 28;
			}
		}
		return d;
	}
}


