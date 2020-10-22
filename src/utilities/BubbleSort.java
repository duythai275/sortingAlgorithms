package utilities;

import java.util.Comparator;

import problemDomain.Sharp;

/**
 * This is algorythm of Bubble Sort
 * 
 * @author Thai Nguyen
 * @version Oct 21, 2020
 */
public class BubbleSort {
	/**
	 * Main method to invoke Bubble Sort
	 * 
	 * @param <T>
	 * @param array Array of T for sorting
	 * @param comp Comparator use for sorting
	 * @return run-time of sorting
	 */
	public static <T> long Sort( T[] array, Comparator<? super T> comp ) {
		long start = System.currentTimeMillis();
		for ( int i = 0; i < array.length - 1; i++ ) {
			for ( int j = 0; j < array.length -  1  - i; j++ ) {
				if ( comp.compare(array[j], array[j + 1]) > 0 )
					swapElements( array, j, j + 1 );
			}
		}
		long end = System.currentTimeMillis();
		return ( end - start );
	}
	
	/**
	 * Main method to invoke Bubble Sort
	 * 
	 * @param <T>
	 * @param array Array of T for sorting
	 * @return run-time of sorting
	 */
	public static <T> long Sort( T[] array ) {
		long start = System.currentTimeMillis();
		for ( int i = 0; i < array.length - 1; i++ ) {
			for ( int j = 0; j < array.length -  1  - i; j++ ) {
				if ( ((Sharp) array[j]).compareTo((Sharp) array[j + 1]) > 0 )
					swapElements( array, j, j + 1 );
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
