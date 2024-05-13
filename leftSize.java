package Question5;

import string.string;

public class leftSize {
	private static leftSize[] next;
	private static void merge(int[] inputArray, int[]  leftH, int[] rightH) { 
		int leftSize = leftH.length; 
		int rightSize = rightH.length; 
		int i = 0; 
		int j = 0; 
		int k = 0; 
		while(i < leftSize && j < rightSize) { 
		if(leftH[i] <= rightH[j]) { 
		inputArray[k] = leftH[i]; 
		i++; 
		} 
		else { 
		inputArray[k] = rightH[j];
		} 
		k++; 
		} 
		while(i < leftSize) { 
		inputArray[k] = leftH[i]; 
		i++; 
		k++; 
		} 
		while(j < rightSize) { 
		inputArray[k] = rightH[j]; 
		j++; 
		k++; 
		} 
		} 
	    public static void main (string[] args) {
	    	leftSize A = new leftSize(4);
	    	A.next= new leftSize(1);
	    	A.next= new leftSize(2);
	    	A.next= new leftSize(3);
	    	A.next= new leftSize(4);
	    }

}
