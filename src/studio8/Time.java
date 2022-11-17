package studio8;

import java.util.List;
import java.util.LinkedList;

public class Time {
	private int minutes;
	private int hour;
	private boolean format;

	public Time(int theMinutes, int theHours, boolean theFormat)
	{
		this.minutes = theMinutes;
		this.hour = theHours;
		this.format = theFormat;


		//List<Integer> min = new LinkedList<Integer>();

	}

	public int hashCode()
	{
		return 0;
	}

	public String toString() {

		if(format == true) {
			//24 hour vers
			return "The time is:" + hour + ":" + minutes;

		}else {
			//12 hr ver

			if(hour > 12 ) {
				return "The time is:" + (hour-12) + ":" + minutes;
	
			} else {

				return "The time is:" + hour + ":" + minutes;
				
			}
		}

	}
	public static void main(String[] args) {


	}

}