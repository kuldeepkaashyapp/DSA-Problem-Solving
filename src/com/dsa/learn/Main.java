package com.dsa.learn;

import com.dsa.learn.sorting.sorting;

public class Main {

	public static void main(String[] neha) {
		
		int[] ar= {7,1,5,3,6,4};
	
	
		
		sorting sort = new sorting();

		int[] sortedArry=sort.insertionSort(ar);
		
		
		for (int i : sortedArry) {
			System.out.print(i+",");
		}
		

	
	
	}
	
}
