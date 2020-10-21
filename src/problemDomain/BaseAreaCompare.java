package problemDomain;

import java.util.Comparator;

public class BaseAreaCompare implements Comparator<Sharp> {
	@Override
	public int compare(Sharp s1, Sharp s2) {
		if ( s1.getBaseArea() > s2.getBaseArea() ) return -1;
		else if ( s1.getBaseArea() < s2.getBaseArea() ) return 1;
		else return 0;
	}
}
