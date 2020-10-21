package utilities;

import java.util.Comparator;
import problemDomain.*;

public class InsertionSort {
	public static <T> long Sort( T[] array, Comparator<? super T> comp )
	{
		for ( int i = 1; i < array.length; i++ ) {
			for ( int j = i - 1; j >= 0 && comp.compare(array[i], array[j]) > 0 ; j-- ) {
				
			}
		}
	}
	
	public static <T> long Sort( T[] array )
	{
		for ( int i = 1; i < array.length; i++ ) {
			for ( int j = i - 1; j >= 0 && ((Sharp) array[i]).compareTo((Sharp) array(j)) > 0 ; j-- ) {
				
			}
		}
	}

}
