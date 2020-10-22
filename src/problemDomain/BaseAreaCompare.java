package problemDomain;

import java.util.Comparator;

/**
 * This is a comparator for base area of sharps
 * 
 * @author Thai Nguyen
 * @version Oct 21, 2020
 */
public class BaseAreaCompare implements Comparator<Sharp> {
	
	/**
	 * Compare the Base Area of two Sharps
	 * 
	 * @return a negative integer if first object is greater than second,
	 * or zero if first object is equal to second,
	 * or a positive integer if first object is less than second.
	 */
	@Override
	public int compare(Sharp s1, Sharp s2) {
		if ( s1.getBaseArea() > s2.getBaseArea() ) return -1;
		else if ( s1.getBaseArea() < s2.getBaseArea() ) return 1;
		else return 0;
	}
}
