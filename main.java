package set1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateSort dateSort = new DateSort();
		
		Set<Date> dateSet1 = new TreeSet<Date>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		try{
			dateSet1.add(sdf.parse("01/07/05"));  // july
			dateSet1.add(sdf.parse("02/01/05"));  // january
			dateSet1.add(sdf.parse("01/01/05"));  // january
			dateSet1.add(sdf.parse("03/07/05"));  // may
			// output: march,september,december,june
		}
		catch(Exception e){
			
		}
		
		
		for(Date date : dateSort.sortDates(dateSet1)){
			System.out.println(String.format("%s",sdf.format(date)));
		}

		/*
		dateSet1.clear();
		
		dateSet1.add(new SimpleDateFormat("dd/MM/yyyy").parse("12/09/16"));  // september
		dateSet1.add(new SimpleDateFormat("dd/MM/yyyy").parse("22/12/16"));  // december
		dateSet1.add(new SimpleDateFormat("dd/MM/yyyy").parse("15/06/16"));  // june
		dateSet1.add(new SimpleDateFormat("dd/MM/yyyy").parse("26/03/16"));  // march
		// output: march,september,december,june
		*/
		//System.out.println(t1.sortDates(dateSet1));
		 

	}

}
