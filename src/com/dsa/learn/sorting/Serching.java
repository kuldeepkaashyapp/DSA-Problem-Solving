package com.dsa.learn.sorting;

import java.util.Arrays;

public class Serching {

	// find the element index , serch by index kon se

	// binarry , brutforce ,

	// exmaple

	// ? ? ARRY KUCH BHI HOGI , ELEM ? KHALI DIBBE HAI DIBBER KISS TYPE KE 1st found
	public static int serchElement(int arr[], int elem) {

		for (int i = 0; i < arr.length; i++) {
			// condition
			if (arr[i] == elem) {

				System.out.println("found at " + i);
				return i;

			}

		}

		// alway array me hota ye index to outyee mille to nhi milaa ye ans iska
		return -1;
	}

	public static int serchFrequency(int arr[], int elem) {

		int freq = 0;
		for (int i = 0; i < arr.length; i++) {
			// condition
			if (arr[i] == elem) {

				System.out.println("found at " + i);
				freq++;

			}

		}

		// alway array me hota ye index to outyee mille to nhi milaa ye ans iska
		return freq;
	}

//[1,2,6,7,9]=1-->4

	public static int[] insertionArry(int arr[], int elmp, int poss) {

		int[] newArry = new int[arr.length + 1];
		// copy
		for (int i = 0; i < newArry.length; i++) {

			for (int j = 0; j < arr.length - 1; j++) {

				if (i == poss) {

					newArry[i] = elmp;
					break;
				}

				if (i < poss) {
					newArry[i] = arr[i];
					break;
				} else {
					newArry[i] = arr[i - 1];
					break;

				}

			}

		}

		return newArry;

	}

//binary serch

	int binarySerch(int[] arry, int ele) {
		boolean found = false;

		int low = 0;
		int high = arry.length - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (arry[mid] == ele) {
				
				
				return mid;
			} else if (ele < arry[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return -1;
	}

	public static void bubbleSort(int arr[], int elem) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {

				int temp = arr[j];

				arr[j] = arr[j + 1];
				arr[j + 1] = temp;

			}
		}
	}
	
	
	
	

}
