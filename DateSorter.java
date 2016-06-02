package set1;

import java.util.Date;
import java.util.Set;
import java.util.SortedSet;

public interface DateSorter {
/**
* The implementation of this method should sort dates.
* The output should be in the following order:
* Dates with an 'r' in the month,
* sorted ascending(first to last),
* then dates without an 'r' in the month,
* sorted descending (last to first).
* For example, October dates would come before May dates,
* because October has an 'r' in it.
* thus: (01/07/05, 02/01/05, 01/01/05, 03/05/05) would sort
* to (01/01/05, 02/01/05, 01/07/05, 03/05/05)
* @param unsortedDates - an unsorted list of dates
* @return The list of dates now sorted as per the spec
*/

public SortedSet<Date> sortDates(Set<Date> unsortedDates);

}