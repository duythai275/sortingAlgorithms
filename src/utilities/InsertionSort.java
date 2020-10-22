package utilities;

import java.util.Comparator;
import problemDomain.*;

/**
 * This is algorythm of Insertion Sort
 * 
 * @author Thai Nguyen
 * @version Oct 21, 2020
 */
public class InsertionSort {
	/**
	 * Main method to invoke Insertion Sort
	 * 
	 * @param <T>
	 * @param array Array of T for sorting
	 * @param comp Comparator use for sorting
	 * @return run-time of sorting
	 */
	public static <T> long Sort( T[] array, Comparator<? super T> comp )
	{
		long start = System.currentTimeMillis();
		for ( int i = 1; i < array.length; i++ ) {
			T key = array[i];
			int j = i - 1;
			for ( ; j >= 0 && comp.compare(array[j], key) > 0 ; j-- ) {
				array[j + 1] = array[j];
			}
			array[j + 1] = key;
		}
		long end = System.currentTimeMillis();
		return ( end - start );
	}
	
	/**
	 * Main method to invoke Insertion Sort
	 * 
	 * @param <T>
	 * @param array Array of T for sorting
	 * @return run-time of sorting
	 */
	public static <T> long Sort( T[] array )
	{
		long start = System.currentTimeMillis();
		for ( int i = 1; i < array.length; i++ ) {
			T key = array[i];
			int j = i - 1;
			for ( ; j >= 0 && ((Sharp) array[j]).compareTo((Sharp) key) > 0 ; j-- ) {
				array[j + 1] = array[j];
			}
			array[j + 1] = key;
		}
		long end = System.currentTimeMillis();
		return ( end - start );
	}

}
