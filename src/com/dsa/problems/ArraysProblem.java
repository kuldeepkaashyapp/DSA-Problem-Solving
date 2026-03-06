package com.dsa.problems;

public class ArraysProblem {
	/*
	 * 4. Median of Two Sorted Arrays Solved Hard Topics premium lock icon Companies
	 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return
	 * the median of the two sorted arrays.
	 * 
	 * The overall run time complexity should be O(log (m+n)).
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums1 = [1,3], nums2 = [2] Output: 2.00000 Explanation: merged array =
	 * [1,2,3] and median is 2. Example 2:
	 * 
	 * Input: nums1 = [1,2], nums2 = [3,4] Output: 2.50000 Explanation: merged array
	 * = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
	 */
	
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {

	        if (nums1.length > nums2.length) {
	            return findMedianSortedArrays(nums2, nums1);
	        }

	        int x = nums1.length;
	        int y = nums2.length;

	        int low = 0;
	        int high = x;

	        while (low <= high) {

	            int partitionX = (low + high) / 2;
	            int partitionY = (x + y + 1) / 2 - partitionX;

	            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
	            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];

	            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
	            int minRightY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];

	            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {

	                if ((x + y) % 2 == 0) {
	                    return (Math.max(maxLeftX, maxLeftY) +
	                           Math.min(minRightX, minRightY)) / 2.0;
	                } else {
	                    return Math.max(maxLeftX, maxLeftY);
	                }

	            } else if (maxLeftX > minRightY) {
	                high = partitionX - 1;
	            } else {
	                low = partitionX + 1;
	            }
	        }

	        throw new IllegalArgumentException();
	    }
	
	
	

}
