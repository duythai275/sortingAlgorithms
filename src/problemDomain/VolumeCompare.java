package problemDomain;

import java.util.Comparator;

public class VolumeCompare implements Comparator<Sharp> {
	@Override
	public int compare(Sharp s1, Sharp s2) {
		if ( s1.getVolume() > s2.getVolume() ) return -1;
		else if ( s1.getVolume() < s2.getVolume() ) return 1;
		else return 0;
	}
}
