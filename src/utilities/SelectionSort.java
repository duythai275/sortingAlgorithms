package utilities;

import java.util.Comparator;

import problemDomain.Sharp;

/**
 * This is algorythm of Selection Sort
 * 
 * @author Thai Nguyen
 * @version Oct 21, 2020
 */
public class SelectionSort {
	/**
	 * Main method to invoke Selection Sort
	 * 
	 * @param <T>
	 * @param array Array of T for sorting
	 * @return run-time of sorting
	 */
	public static <T> long Sort( T[] array ) {
		long start = System.currentTimeMillis();
		for ( int i = 0; i < array.length; i++ ) {
			for ( int j = i + 1 ; j < array.length; j++ ) {
				if ( ((Sharp) array[i]).compareTo((Sharp) array[j]) > 0 ) {
					swapElements( array, i, j );
				}
			}
		}
		long end = System.currentTimeMillis();
		return ( end - start );
	}
	
	/**
	 * Main method to invoke Selection Sort
	 * 
	 * @param <T>
	 * @param array Array of T for sorting
	 * @param comp Comparator use for sorting
	 * @return run-time of sorting
	 */
	public static <T> long Sort( T[] array, Comparator<? super T> comp ) {
		long start = System.currentTimeMillis();
		for ( int i = 0; i < array.length; i++ ) {
			for ( int j = i + 1 ; j < array.length; j++ ) {
				if ( comp.compare(array[i], array[j]) > 0 ) {
					swapElements( array, i, j );
				}
			}
		}
		long end = System.currentTimeMillis();
		return ( end - start );
	}
	
	/**
	 * Swap two elements
	 * 
	 * @param <T>
	 * @param array Array of two elements need a swap
	 * @param i index of position 1
	 * @param j index of position 2
	 */
	private static <T> void swapElements( T[] array, int i, int j ) {
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
