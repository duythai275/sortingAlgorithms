package utilities;

import java.util.Comparator;

import problemDomain.Sharp;

public class MergeSort {
	public static <T> void Sort( T[] array )
	{
		mergeSort( array, 0, array.length - 1 );
	}
	
	public static <T> void mergeSort( T[] array, int left, int right )
	{
		if ( left < right ) {
			int mid = ( left + right ) / 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			merge(array, left, mid, right);
		}
	}
	
	public static <T> void merge( T[] array, int left, int mid, int right )
	{
		int i1, i2, i; // index of subarray1, subarray2 and array
		Sharp[] temp = new Sharp[array.length];
		
		for ( i1 = left, i2 = mid + 1, i = left; i1 <= mid && i2 <= right; i++  ) {
			System.out.println(array[i1]);
			System.out.println(array[i2]);
			if ( ( (Sharp) array[i1]).compareTo((Sharp) array[i2]) > 0 ) 
				temp[i] = (Sharp) array[i2++];
			else
				temp[i] = (Sharp) array[i1++];
		}
		
		while ( i1 < mid ) temp[i++] = (Sharp) array[i1++];
		
		while ( i2 <= right ) temp[i++] = (Sharp) array[i2++];
		
		for(i = left; i <= right; i++)
		      array[i] = (T) temp[i];
		
	}
}
