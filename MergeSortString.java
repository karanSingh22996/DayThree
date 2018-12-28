package org.bridgelaz.DayThree;

import java.util.Scanner;

public class MergeSortString {
	String array[];
	String tempMergeArray[];
	int length;

	public void sort(String inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergeArray = new String[length];
		divideArray(0, length - 1);
	}

	public void divideArray(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			divideArray(lowerIndex, middle);
			divideArray(middle + 1, higherIndex);
			mergeArray(lowerIndex, middle, higherIndex);
		}
	}

	public void mergeArray(int lowerIndex, int middle, int higherIndex) {
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergeArray[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempMergeArray[i].compareTo(tempMergeArray[j]) <= 0) {
				array[k] = tempMergeArray[i];
				i++;
			} else {
				array[k] = tempMergeArray[j];
				j++;
			}
			k++;

		}
		while (i <= middle) {
			array[k] = tempMergeArray[i];
			k++;
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		String st[] = new String[n];
		System.out.println("enter " + n + " string elements");
		for (int i = 0; i < st.length; i++) {
			st[i] = sc.next();

		}
		System.out.println("entred string elements are:");
		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i] + " ");
		}
		System.out.println();
		MergeSortString ms = new MergeSortString();
		ms.sort(st);
		System.out.println("Sorted arrays are:");
		for (String string : st) {
			System.out.print(string + " ");

		}

	}

}
