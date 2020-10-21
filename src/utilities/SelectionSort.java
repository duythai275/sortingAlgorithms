package utilities;

import java.util.Comparator;

import problemDomain.Sharp;

public class SelectionSort {
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
	
	private static <T> void swapElements( T[] array, int i, int j ) {
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
