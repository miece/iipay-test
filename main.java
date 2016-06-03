package set1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		
		DateSort dateSort = new DateSort();
		
		Set<Date> dateSet1 = new TreeSet<Date>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
			
		try{
			// output: (01/01/05, 02/01/05, 03/07/05, 01/07/05)
			dateSet1.add(sdf.parse("01/07/05"));  // july
			dateSet1.add(sdf.parse("02/01/05"));  // january
			dateSet1.add(sdf.parse("01/01/05"));  // january
			dateSet1.add(sdf.parse("03/07/05"));  // may

			// output results
			formatSetDate(dateSort, dateSet1, sdf);
			
			dateSet1.clear();
			
			// output: (26/03/16, 12/09/16, 22/12/16, 15/06/16)
			dateSet1.add(sdf.parse("12/09/16"));  // september
			dateSet1.add(sdf.parse("22/12/16"));  // december
			dateSet1.add(sdf.parse("15/06/16"));  // june
			dateSet1.add(sdf.parse("26/03/16"));  // march
						
			// output results
			formatSetDate(dateSort, dateSet1, sdf);
			
			dateSet1.clear();
			
			// output: (26/02/16, 26/03/16, 15/04/16, 22/11/16, 15/06/16, 12/05/16)
			dateSet1.add(sdf.parse("12/05/16"));  // may
			dateSet1.add(sdf.parse("22/11/16"));  // november
			dateSet1.add(sdf.parse("15/04/16"));  // april
			dateSet1.add(sdf.parse("26/02/16"));  // february
			dateSet1.add(sdf.parse("15/06/16"));  // june
			dateSet1.add(sdf.parse("26/03/16"));  // march
						
			// output results
			formatSetDate(dateSort, dateSet1, sdf);
			
			dateSet1.clear();
			
			/* output: (12/01/16, 26/02/16, 26/03/16, 15/04/16, 15/09/16, 26/10/16, 22/11/16, 12/12/16,
			 * 		    22/08/16, 26/07/16, 15/06/16, 15/05/16)
			 */
			dateSet1.add(sdf.parse("12/12/16"));  // december
			dateSet1.add(sdf.parse("22/11/16"));  // november
			dateSet1.add(sdf.parse("15/04/16"));  // april
			dateSet1.add(sdf.parse("26/02/16"));  // february
			dateSet1.add(sdf.parse("15/09/16"));  // september
			dateSet1.add(sdf.parse("26/10/16"));  // october
			dateSet1.add(sdf.parse("12/01/16"));  // january
			dateSet1.add(sdf.parse("22/08/16"));  // august
			dateSet1.add(sdf.parse("15/05/16"));  // may
			dateSet1.add(sdf.parse("26/07/16"));  // july
			dateSet1.add(sdf.parse("15/06/16"));  // june
			dateSet1.add(sdf.parse("26/03/16"));  // march
						
			// output results
			formatSetDate(dateSort, dateSet1, sdf);
		}
		catch(Exception e){
			System.out.println(e + " error");
		}
	}
	
	private static void formatSetDate(DateSorter dateSort, Set<Date> dateSet1, SimpleDateFormat sdf){
		
		// could turn this into a method
		Iterator<Date> it = dateSort.sortDates(dateSet1).iterator();
		
		if (it.hasNext()) {
		    System.out.print("(" + String.format(sdf.format(it.next())));
		}
		while (it.hasNext()) {
			
		    System.out.print(", " + String.format(sdf.format(it.next())));
		    
		    // check for last element
			if(!it.hasNext()){
				System.out.println(")");
			}
		}
	}

}
