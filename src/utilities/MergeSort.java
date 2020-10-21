package utilities;

import java.util.Comparator;

import problemDomain.Sharp;

public class MergeSort {
	public static <T> long Sort( T[] array )
	{
		long start = System.currentTimeMillis();
		mergeSort( array, 0, array.length - 1, null );
		long end = System.currentTimeMillis();
		return ( end - start );
	}

	public static <T> long Sort( T[] array, Comparator<? super T> comp )
	{
		long start = System.currentTimeMillis();
		mergeSort( array, 0, array.length - 1, comp );
		long end = System.currentTimeMillis();
		return ( end - start );
	}
	
	public static <T> void mergeSort( T[] array, int left, int right, Comparator<? super T> comp )
	{
		if ( left < right ) {
			int mid = ( left + right ) / 2;
			mergeSort(array, left, mid, comp);
			mergeSort(array, mid + 1, right, comp);
			merge(array, left, mid, right, comp);
		}
	}
	
	public static <T> void merge( T[] array, int left, int mid, int right, Comparator<? super T> comp )
	{
		int i1, i2, i; // index of subarray1, subarray2 and array
		Sharp[] temp = new Sharp[array.length];
		
		for ( i1 = left, i2 = mid + 1, i = left; i1 <= mid && i2 <= right; i++  ) {
			if ( comp == null ) {
				if ( ( (Sharp) array[i1]).compareTo((Sharp) array[i2]) >= 0 ) 
					temp[i] = (Sharp) array[i2++];
				else
					temp[i] = (Sharp) array[i1++];
			} else {
				if ( comp.compare(array[i1], array[i2]) >= 0 ) 
					temp[i] = (Sharp) array[i2++];
				else
					temp[i] = (Sharp) array[i1++];
			}
			
		}
		
		while ( i1 <= mid ) temp[i++] = (Sharp) array[i1++];
		
		while ( i2 <= right ) temp[i++] = (Sharp) array[i2++];
		
		for(i = left; i <= right; i++)
		      array[i] = (T) temp[i];
		
	}
}
