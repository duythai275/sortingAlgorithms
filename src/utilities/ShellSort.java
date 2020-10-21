package utilities;

import java.util.Comparator;

import problemDomain.Sharp;

public class ShellSort {
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
