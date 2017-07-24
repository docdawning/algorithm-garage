// QUICKSORT - an implementation I've cobbled-together based on many online examples
// James T Snell, 2017
// i@jts.me
// jamessnell.com
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] array = new int[n];
	for (int i=0;i<n;i++) array[i] = in.nextInt();

	quicksort(array, 0, array.length-1);
	printArray(array);
    }

    private static void quicksort(int[] array, int left, int right) {
	if (left >= right) return;

	int pivot = array[(left+right)/2];
	
	int i = left;
	int j = right;

	while (i < j) {
		while (array[i] < pivot) i++;
		while (array[j] > pivot) j--;

		if (i<=j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
	}

	quicksort(array, left, j);	//Remmeber we go from left to j
	quicksort(array, i, right);
    }

    private static void printArray(int[] array) {
	for (int i=0;i<array.length;i++) System.out.print(array[i]+" ");
	System.out.println("");
    }

}
