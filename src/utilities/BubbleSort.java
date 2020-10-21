package utilities;

import java.util.Comparator;

import problemDomain.Sharp;

public class BubbleSort {
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
	
	private static <T> void swapElements( T[] array, int i, int j ) {
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
