/*
 * Given a sorted array of distinct integers and a target value, 
 * return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 */
package practice;

import java.util.Scanner;

public class SearchInsertPosition{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length of an array: ");
		int length = sc.nextInt();
		
		int[] array = new int[length];
		System.out.println("Enter array elements: ");
		for(int i = 0; i < length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter an element which you want to insert: ");
		int number = sc.nextInt();
		
		int position = searchInsert(array, number);
		System.out.println("Number will be added at index "+position);
		
	}
	public static int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int low = 0;
        int high = len - 1;
        boolean isFound = false;
        int mid = (low + high) / 2;
        while(low <= high && !isFound){
            if(nums[mid] > target){
                high = mid - 1;
            }else if(nums[mid] == target){
                isFound = true;
            }else{
                low = mid + 1;
            }
            mid = (low + high) / 2;
        }
        
        if(isFound){
            return mid;
        }else if(nums[mid] < target){
            return mid+1;
        }else{
            if(mid == 0){
            	return mid;
            }else{
        		return mid-1;
        		}
        }
    }
}
