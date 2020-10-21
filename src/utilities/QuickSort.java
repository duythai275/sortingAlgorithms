package utilities;

import java.util.Comparator;
import problemDomain.*;

public class QuickSort {
	
	public static <T> long Sort( T[] array )
	{
		long start = System.currentTimeMillis();
		quickSort(array,0,array.length - 1, null);
		long end = System.currentTimeMillis();
		return ( end - start );
	}
	
	public static <T> long Sort( T[] array, Comparator<? super T> comp )
	{
		long start = System.currentTimeMillis();
		quickSort(array,0,array.length - 1,comp);
		long end = System.currentTimeMillis();
		return ( end - start );
	}
	
	public static <T> void quickSort( T[] array, int left, int right, Comparator<? super T> comp ) {
		if ( left < right ) {
			int middle = getMiddle(array, left, right, comp);
			quickSort( array, left, middle - 1, comp );
			quickSort( array, middle + 1, right, comp );
		}
	}
	
	public static <T> int getMiddle( T[] array, int left, int right, Comparator<? super T> comp ) {
		T temp = array[left];
		while ( left < right ) {
			if ( comp == null ) {
				while ( left < right && ((Sharp) array[right]).compareTo((Sharp) temp) >= 0 ) {
					right--;
				}
				array[left] = array[right];
				
				while ( left < right && ((Sharp) array[left]).compareTo((Sharp) temp) <= 0 ) {
					left++;
				}
				array[right] = array[left];
			} else {
				while ( left < right && comp.compare(array[right], temp) >= 0 ) {
					right--;
				}
				array[left] = array[right];
				
				while ( left < right && comp.compare(array[left], temp) <= 0 ) {
					left++;
				}
				array[right] = array[left];
			}
		}
		array[left] = temp;
		return left;
	}
}
