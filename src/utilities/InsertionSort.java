package utilities;

import java.util.Comparator;
import problemDomain.*;

public class InsertionSort {
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
