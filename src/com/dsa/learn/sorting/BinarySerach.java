package com.dsa.learn.sorting;

public class BinarySerach {

	public int  binarySerch(int [] arr,int key) {
		int low=0;
		
		int high=arr.length-1;
		
		//Finding the median and divined it by half for this which one have my key 
		
		
		while(low<=high) {
			
			int mid=low + (high-low)/2;
			
			/* conditions are 
			 * if i find my value at mid it return the index of the mid 
			 * if i  found my key less than mid  sow me have to jump or low 
			 * 1 step 
			 * 
			 * if we found high */
			if(arr[mid]==key) {
				
				return mid;
				
				
			}else if(arr[mid]<key){
				
				low=mid+1;
				
				
				
			}else {
				
				
				high=mid-1;
			}
			
			
			
		}
		
		
		return -1;
		
		
		
	}
	
	
	
	
	//alternative way of 
	int max;
	public int maxProfit(int[] prices) {
	      //leting this is maximum number
	        max=prices[0];

	        for(int i=0;i<prices.length;i++){
	            if(prices[i]>max){

	                max=prices[i];
	            }

	        }
	        return max;

	    }
	
	
	
	
	
}
