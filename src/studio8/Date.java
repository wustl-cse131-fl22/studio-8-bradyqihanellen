package studio8;

import java.util.List;
import java.util.Objects;
import java.util.LinkedList;
import java.util.HashSet;

public class Date {
	private String month;
	private int day;
	private int year;
	private boolean holiday;
	
	/**
	 * Initialize variables
	 * @param theMonth
	 * @param theDay
	 * @param theYear
	 * @param theHoliday
	 */
	public Date(String theMonth, int theDay, int theYear, boolean theHoliday)
	{
		this.month = theMonth;
		this.day = theDay;
		this.year = theYear;
		this.holiday = theHoliday;
		//LinkedList<Date> list = new LinkedList<Date>();
	}
	
	public String toString()
	{
		if (holiday == true)
		{
			return "The year is " + year + ", the month is "+ month + ", the day is " + day + ", and it is a holiday.";
		}
		else
		{
			return "The year is " + year + ", the month is "+ month + ", the day is " + day + ", and it is not a holiday.";
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	
	

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && Objects.equals(month, other.month) && year == other.year;
	}

	public static void main(String[] args) {
    	Date newDate1 = new Date("December", 12, 1999, false);
    	Date newDate2 = new Date("December", 13, 1999, false);
    	Date newDate3 = new Date("December", 14, 1999, false);
    	Date newDate4 = new Date("December", 15, 1999, false);
    	Date newDate5 = new Date("December", 16, 1999, false);
    	
    	
    	//List
    	LinkedList<Date> list = new LinkedList<Date>();
    	System.out.println(list);
    	
    	list.add(newDate1);
    	list.add(newDate1);
    	list.add(newDate2);
    	list.add(newDate3);
    	list.add(newDate4);
    	list.add(newDate5);
    	System.out.println(list);
    	
    	
    	System.out.println(newDate1.toString());
    	int hi = newDate1.hashCode();
    	System.out.println(hi);
    	
    	
    	
    	//Set
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(newDate1);
    	set.add(newDate1);
    	set.add(newDate2);
    	set.add(newDate3);
    	set.add(newDate4);
    	set.add(newDate5);
    	System.out.print(set);
    }

}
