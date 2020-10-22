package utilities;

import java.util.Comparator;

import problemDomain.Sharp;

/**
 * This is algorythm of Shell Sort
 * 
 * @author Thai Nguyen
 * @version Oct 21, 2020
 */
public class ShellSort {
	/**
	 * Main method to invoke Shell Sort
	 * 
	 * @param <T>
	 * @param array Array of T for sorting
	 * @param comp Comparator use for sorting
	 * @return run-time of sorting
	 */
	public static <T> long Sort( T[] array, Comparator<? super T> comp ) {
		long start = System.currentTimeMillis();
		
		for ( int gap = array.length / 2; gap > 0; gap /= 2 ) {
			for ( int i = gap; i < array.length; i++ ) {
				T key = array[i];
				int j = i;
				for ( ; j >= gap && comp.compare(array[j - gap], key) > 0 ; j -= gap ) {
					array[j] = array[j - gap];
				}
				array[j] = key;
			}
		}
		
		long end = System.currentTimeMillis();
		return ( end - start );
	}
	
	/**
	 * Main method to invoke Shell Sort
	 * 
	 * @param <T>
	 * @param array Array of T for sorting
	 * @return run-time of sorting
	 */
	public static <T> long Sort( T[] array ) {
		long start = System.currentTimeMillis();
		
		for ( int gap = array.length / 2; gap > 0; gap /= 2 ) {
			for ( int i = gap; i < array.length; i++ ) {
				T key = array[i];
				int j = i;
				for ( ; j >= gap && ((Sharp) array[j - gap]).compareTo((Sharp) key) > 0 ; j -= gap ) {
					array[j] = array[j - gap];
				}
				array[j] = key;
			}
		}
		
		long end = System.currentTimeMillis();
		return ( end - start );
	}
}
