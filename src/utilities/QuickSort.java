package utilities;

import java.util.Comparator;
import problemDomain.*;

/**
 * This is algorythm of Quick Sort
 * 
 * @author Thai Nguyen
 * @version Oct 21, 2020
 */
public class QuickSort {
	/**
	 * Main method to invoke Quick Sort
	 * 
	 * @param <T>
	 * @param array Array of T for sorting
	 * @return run-time of sorting
	 */
	public static <T> long Sort( T[] array )
	{
		long start = System.currentTimeMillis();
		quickSort(array,0,array.length - 1, null);
		long end = System.currentTimeMillis();
		return ( end - start );
	}
	
	/**
	 * Main method to invoke Quick Sort
	 * 
	 * @param <T>
	 * @param array Array of T for sorting
	 * @param comp Comparator use for sorting
	 * @return run-time of sorting
	 */
	public static <T> long Sort( T[] array, Comparator<? super T> comp )
	{
		long start = System.currentTimeMillis();
		quickSort(array,0,array.length - 1,comp);
		long end = System.currentTimeMillis();
		return ( end - start );
	}
	
	/**
	 * Divide array
	 * 
	 * @param <T>
	 * @param array Array of T for sorting
	 * @param left Left index
	 * @param right Right index
	 * @param comp Comparator use for sorting
	 */
	public static <T> void quickSort( T[] array, int left, int right, Comparator<? super T> comp ) {
		if ( left < right ) {
			int middle = getMiddle(array, left, right, comp);
			quickSort( array, left, middle - 1, comp );
			quickSort( array, middle + 1, right, comp );
		}
	}
	
	/**
	 * Get pivot node
	 * 
	 * @param <T>
	 * @param array Array of T for sorting
	 * @param left Left index
	 * @param right Right index
	 * @param comp Comparator use for sorting
	 * @return index of pivot node
	 */
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
