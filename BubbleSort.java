package practice;
import java.util.*;
public class BubbleSort{
	public static void main(String args[]) {
		System.out.print("Enter length of an array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] array = new int[n];
		System.out.println("Enter numbers: ");
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		int temp = 0;
		for(int j = 0; j < n; j++) {
			for(int k = 1; k < n-j; k++) {
				if(array[k-1] > array[k]) {
					temp = array[k];
					array[k] = array[k-1];
					array[k-1] = temp;
				}
			}
		}
		
		for(int x=0; x<n;x++) {
			System.out.print(array[x]+" ");
		}
		
	}
}
