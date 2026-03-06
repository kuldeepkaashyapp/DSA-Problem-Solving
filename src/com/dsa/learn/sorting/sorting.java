package com.dsa.learn.sorting;

import java.util.Iterator;

public class sorting {

	public int[] insertionSort(int arr[]) {

	
		// it is running for the making
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;

			
		
			// now checking in the non sorted value
			while (j >= 0 && arr[j] < temp) {

				arr[j + 1] = arr[j];
				j--;
				
			}

			arr[j + 1] = temp;
		}
		return arr;
	}
	
	
	
	
	
	public static long factorial(int n) {
		
		long fact=1;
		
		for (int i = 0; i<=n ; i++) {
			fact*=i;
		}
		
		return fact;
	}
	
	
	public static long factorial1(int n) {
		
		if(n==0 || n==1) {
			return 1;
			
		}
		
		return n*factorial(n-1);
	}
	
	
	public static boolean checkVobel(String  a) {
		
		boolean flag=false;
		char[] tempA=a.toCharArray();
		
		char[] vobel= {'a','e','i','o','u'};
		
		
		for (int i = 0; i < tempA.length; i++) {
			
			
		for (char c : vobel) {
			
		
			if(tempA[i] == c) {
				
				
				
				continue;
				
			}else {
				flag=true;
				System.out.println(tempA[i]);
				
			
			}
			
		} 
		
		}
		return flag;
		
		
		
		
		
	}
	
	
	

}
