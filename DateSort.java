package set1;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class DateSort implements DateSorter {
	
	Calendar cal = Calendar.getInstance();

	@Override
	public SortedSet<Date> sortDates(Set<Date> unsortedDates) {
		
		SortedSet<Date> sortedDatesSet = new TreeSet<Date>(new Comparator<Date>() {
			
			@Override
			public int compare(Date date_1, Date date_2) {
				cal.setTime(date_2);
				int date = cal.get(Calendar.MONTH);
				 if(theMonth(date).matches("(?i).*r.*")){
					 return date_1.compareTo(date_2);
				}
				 else{
					 return date_2.compareTo(date_1);
				}
			}
		});
		sortedDatesSet.addAll(unsortedDates);

		return sortedDatesSet;

	}
	
	public static String theMonth(int month){
	    String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	    return monthNames[month];
	}

}
