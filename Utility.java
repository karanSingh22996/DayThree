package org.bridgelabz.utility;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	/* Functional_Programs */
	public static void greetings() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your naame");
		String name = sc.next();
		System.out.println("Hello " + name + " How are you");

	}

	// -----------------------------------------------------------------------------//
	public static void flipflip() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Toss coin");
		sc.nextLine();
		int t = r.nextInt(2) + 1;
		System.out.println("Random no is " + t);
		int head = 0;
		int tail = 0;
		if (t == 2) {
			head++;
		} else {
			tail++;
		}
		int perOfHead = (head / t) * 100;
		int perOfTail = (tail / t) * 100;
		System.out.println("Percentage of head= " + perOfHead);
		System.out.println("Percentage of tail= " + perOfTail);

	}

	// ----------------------------------------------------------------------------------//
	public static boolean isLeap(int year) {
		boolean res = true;
		if (year % 400 == 0 || year % 4 == 0 & year % 100 != 0) {
			return res;
		}
		return false;
	}

	public static void printLeapResults() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year to check if leap or not");
		int year = sc.nextInt();
		boolean res = isLeap(year);
		if (res) {
			System.out.println(year + " is leap year");
		} else {
			System.out.println(year + " is not leap year");
		}
	}

	// -----------------------------------------------------------------------------------//
	public static int power(int n, int p) {
		int pow = 1;
		while (p > 0) {
			pow = pow * n;
			p--;
		}
		return pow;
	}

	public static void printPower() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number and power");
		int n = sc.nextInt();
		int p = sc.nextInt();
		int pow = power(n, p);
		System.out.println("Table of two");
		for (int i = 1; i < pow; i++) {
			System.out.println(2 + " * " + i + " = " + 2 * i);

		}
	}

	// -------------------------------------------------------------------------------------------//
	public static double harmonic(int n) {
		double sum = 0.0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (1.0 / i);
		}
		return sum;

	}

	public static void printHarmonic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		double sum = harmonic(n);
		System.out.println("Harmonic " + n + " number is " + sum);

	}

	// ------------------------------------------------------------------------------------------------//
	public static void factor(int n) {

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				System.out.println(i);
		}

	}

	public static void printPrimeFactors() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int n = sc.nextInt();
		System.out.println("prime factors of " + n + " is ");
		factor(n);
	}

//--------------------------------------------------------------------------------------------------//
	public static void printGamblerResults() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int goal = 100;
		int win = 0;
		int loss = 0;
		int trials = 0;
		int sum = 0;

		while (true) {
			trials++;
			System.out.println("enter the number between 1 and 6 ");
			System.out.println("what is your stake");
			int stake = sc.nextInt();

			int res = r.nextInt(6) + 1;
			if (stake == res) {
				win++;
			} else {
				loss++;
			}
			if (sum + res <= goal) {

				sum = sum + res;
			}
			if (sum == goal)
				break;
		}
		System.out.println("Total number of trials " + trials);
		System.out.println("Total win = " + win);
		System.out.println("Total lose = " + loss);
		double winPercent = win * 100 / trials;
		System.out.println("Winning percentage = " + winPercent);
		double lossPercent = loss * 100 / trials;
		System.out.println("Losing percentage = " + lossPercent);
	}

	// -------------------------------------------------------------------------------------------------//
	public static void couponResults() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("enter the number");
		int n = sc.nextInt();
		int distinct[] = new int[n];
		for (int i = 0; i < distinct.length; i++) {
			distinct[i] = r.nextInt(n);
			for (int j = 0; j < i; j++) {
				if (distinct[i] == distinct[j])
					i--;
			}

		}
		System.out.println("Total generated distinct coupons are ");
		for (int i = 0; i < distinct.length; i++) {
			System.out.print(distinct[i] + " ");
		}
	}

	// ------------------------------------------------------------------------------------------------//
	public static void twoDResults() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row size");
		int r = sc.nextInt();
		System.out.println("enter the column size");
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		System.out.println("enter " + r * c + " numbers");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}

		}
		System.out.println("entered elements are ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	// -------------------------------------------------------------------------------------------------//
	public static void sumZero(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				for (int k = j + 1; k < ar.length; k++) {
					if (ar[i] + ar[j] + ar[k] == 0) {
						System.out.print(ar[i] + " " + ar[j] + " " + ar[k]);
					}

				}
			}
		}
	}

	public static void printSumZeroResults() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter " + n + " integers");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sumZero(arr);

	}

	// ----------------------------------------------------------------------------------------------------//
	public static void printDistanceResults() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x-distace");
		int x = sc.nextInt();
		System.out.println("enter y-distance");
		int y = sc.nextInt();
		double distance = Math.sqrt(x * x + y * y);
		System.out.println("Euclidean's distance= " + distance);
	}

	// -----------------------------------------------------------------------------------------------//
	static void swap(char[] ch, int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	static void permutations(char[] ch, int currentIndex) {
		if (currentIndex == ch.length - 1) {
			System.out.println(String.valueOf(ch));
		}

		for (int i = currentIndex; i < ch.length; i++) {
			swap(ch, currentIndex, i);
			permutations(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		}
	}

	public static void permutationsResults() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentences");
		String s = sc.nextLine();
		char ch[] = s.toCharArray();
		permutations(ch, 0);
	}

	// -------------------------------------------------------------------------------//
	public static void printTimeElapsedResults() throws InterruptedException {
		long start = System.currentTimeMillis();
		System.out.println(new Date() + " ");
		Thread.sleep(1500);
		System.out.println(new Date() + " ");
		long end = System.currentTimeMillis();

		long elapsed = end - start;
		System.out.println("total elapsed time = " + elapsed);
	}

	// ---------------------------------------------------------------------------------------------------//
	static boolean tictac(int arr[][]) {
		for (int i = 1; i <= arr.length; i++) {
			for (int j = 1; j <= arr[i].length; j++) {
				if (j == 1 && j == 2 && j == 3) {
					return true;
				} else if (i == 1 && i == 2 && i == 3) {
					return true;
				} else if (i == j) {
					return true;
				} else if (i + j == arr.length + 1) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

	public static void printTicTacResults() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row size");
		int r = sc.nextInt();
		System.out.println("enter the column size");
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		System.out.println("enter " + r * c + " elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		boolean res = tictac(arr);
		if (res) {
			System.out.println("some blocks matched");
		} else {
			System.err.println("no match found");
		}
	}

	// -------------------------------------------------------------------------------------------//
	public static void quadraticResults() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter quadratic equation as (a*x^2+b*x+c");
		System.out.println("enter a");
		int a = sc.nextInt();
		System.out.println("enter b");
		int b = sc.nextInt();
		System.out.println("enter c");
		int c = sc.nextInt();
		System.out.println("Quadratic equations is " + a + "x^2+ " + b + "x+ " + c);
		double disc = (b * b - 4 * a * c) / 2 * a, root1, root2;
		double d = Math.sqrt(disc);
		if (disc > 0) {
			System.out.println("Roots are real and unequal");

			root1 = (-b + d) / 2 * a;
			System.out.println("Root one = " + root1);
		} else if (disc == 0) {
			System.out.println("roots are real and equal");
			root2 = (-b - d) / 2 * a;
			System.out.println("Root one = " + root2);
		} else {
			System.out.println("Roots are imaginary");
		}
	}

	// --------------------------------------------------------------------------------------------------//
	public static void printWindmillsResults() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temperature");
		double temp = sc.nextDouble();
		System.out.println("enter the speed of wind");
		double vel = sc.nextDouble();
		double v = Math.pow(vel, 0.16);
		double w = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * v;
		System.out.println("Effective temprature = " + w);
	}

	// ----------------------------------------------------------------------------------------------//
	/* Algoriths_Progrmas */
	public static int[] countOccurence(String s) {
		int c[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 65 && ch <= 90)
				c[ch - 65]++;
			else if (ch >= 97 && ch <= 122)
				c[ch - 97]++;
		}
		return c;
	}

	public static boolean isAnagram(String s1, String s2) {
		int c1[] = countOccurence(s1);
		int c2[] = countOccurence(s2);
		for (int i = 0; i < c2.length; i++) {
			if (c1[i] != c2[i])
				return false;
		}
		return true;
	}

	public static void printAnagrams() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First string value");
		String st1 = sc.nextLine();
		System.out.println("Enter the Second string value");
		String st2 = sc.nextLine();
		boolean anagram = isAnagram(st1, st2);
		if (anagram) {
			System.out.println("Sentences are anagram");
		} else {
			System.out.println("Sentences are not anagram");
		}
	}

	// ---------------------------------------------------------------------------------------------------//
	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void printPrimeResults() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range to prime between numbers");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				System.out.println(i + " ");

			}
		}

	}

	// ----------------------------------------------------------------------------------------------//
	public static boolean isPrime2(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static int[] primePrint(int n) {
		int arr[] = new int[n];

		for (int i = 1; i <= n; i++) {
			if (isPrime2(i)) {
				arr[i] = i;
			}
		}
		return arr;
	}

	public static boolean isPalindrome(int n) {
		int p = 0, t = n;
		do {
			int r = n % 10;
			p = p * 10 + r;
			n = n / 10;
		} while (n != 0);
		return p == t;
	}

	public static int[] printPalindrome(int n[]) {
		int ar[] = new int[n.length];
		for (int i = 0; i < n.length; i++) {
			if (isPalindrome(i)) {
				System.out.print(i + " ");
				ar[i] = i;
			}
		}
		return ar;

	}

	public static void printPrimeAndPalindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range to prime between numbers");
		int n = sc.nextInt();
		int a[] = primePrint(n);
		System.out.println("Total Palindrome in given Primes are");
		int angrm[] = printPalindrome(a);

	}

	// ------------------------------------------------------------------------------------//\
	public static int[] readArr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter the number of items");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter " + n + " elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void dispArr(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static int[] sortArr(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.print(arr[i] + " "); }
		 */
		return arr;
	}

	public static void binarySearch(int a[], int item) {
		int li = 0;
		int hi = a.length - 1;
		int mi = (li + hi) / 2;
		while (li <= hi) {
			if (a[mi] == item) {
				System.out.println("item found at index " + mi + " position");
				break;
			} else if (item > a[mi]) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println("Item not found!!!");
		}

	}

	public static void printBinaryInt() {
		int a[] = readArr();
		System.out.println("entered arrays are ");
		dispArr(a);
		// System.out.println("Sorted Arrays");
		int sort[] = sortArr(a);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to search");
		int search = sc.nextInt();
		System.out.println("Binary search ");
		binarySearch(sort, search);

	}

	// ----------------------------------------------------------------------------------------------------//
	public static int binarySearch(String st[], String item) {
		int low = 0;
		int high = st.length;
		int middle = (low + high) / 2;
		while (low <= high) {
			if (st[middle].compareTo(item) < 0) {
				low = middle + 1;

			} else if (item.compareTo(st[middle]) > 0) {
				high = middle - 1;
			} else {
				return middle;
			}
			middle = (low + high) / 2;

		}
		return -1;

	}

	public static void printBinaryString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		String st[] = new String[n];
		System.out.println("Enter " + n + " String items");
		for (int i = 0; i < st.length; i++) {
			st[i] = sc.next();
		}
		Arrays.sort(st);
		System.out.println("enter the string to search");
		String st1 = sc.next();
		System.out.println("Binary search");
		int pos = binarySearch(st, st1);
		System.out.println("Item found at position " + pos);
	}

	// ------------------------------------------------------------------------------------------//
	public static int[] readArr1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter " + n + " elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void display(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}

	public static void insertionInt(int ar[]) {
		int temp, j;
		for (int i = 1; i < ar.length; i++) {
			temp = ar[i];
			j = i;
			while (j > 0 && ar[j - 1] > temp) {
				ar[j] = ar[j - 1];
				j = j - 1;
			}
			ar[j] = temp;
		}
		System.out.println("Sorted Array is");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");

		}
	}

	public static void printInsertedResults() {
		int a[] = readArr1();
		System.out.println("entered Array");
		display(a);
		insertionInt(a);
	}

	// ----------------------------------------------------------------------------------------------//
	public static void insertionSortStr(String s[]) {
		String temp;
		int j;
		for (int i = 1; i < s.length; i++) {
			temp = s[i];
			j = i;
			while (j > 0 && temp.compareTo(s[j - 1]) > 0) {
				String s1 = s[j - 1];
				s[j - 1] = s[j];
				s[j] = s1;
				j = j - 1;
			}
			s[j] = temp;
		}
		System.out.println("Sorted string array is::");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}

	public static void insertionSortStr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		String st[] = new String[size];
		System.out.println("enter " + size + " String ");
		for (int i = 0; i < st.length; i++) {
			st[i] = sc.next();
		}
		System.out.println("entered strings are::");
		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i] + " ");
		}
		System.out.println();
		insertionSortStr(st);
	}

	// ------------------------------------------------------------------------------------------------//
	public static void bubbleSortInt(int ar[]) {
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = 1; j < ar.length - i; j++) {
				if (ar[j - 1] > ar[j]) {
					int temp = ar[j - 1];
					ar[j - 1] = ar[j];
					ar[j] = temp;
				}

			}
		}
		System.out.println("Sorted Array::");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}

	public static void printBubbleInt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter " + size + " elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("entered elements are ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		bubbleSortInt(arr);
	}

	// --------------------------------------------------------------------------------------------//
	public static void bubbleSortStr(String st[]) {
		for (int i = 0; i < st.length - 1; i++) {
			for (int j = 1; j < st.length - i; j++) {
				if (st[j - 1].compareTo(st[j]) > 0) {
					String temp = st[j - 1];
					st[j - 1] = st[j];
					st[j] = temp;
				}
			}

		}
		System.out.println("Sorted Array is:");
		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i] + " ");
		}
	}

	public static void printBubbleStr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of string");
		int size = sc.nextInt();
		String st[] = new String[size];
		System.out.println("enter " + size + " string values");
		for (int i = 0; i < st.length; i++) {
			st[i] = sc.next();
		}
		System.out.println("entered strings are: ");
		for (int j = 0; j < st.length; j++) {
			System.out.println(st[j] + " ");
		}
		bubbleSortStr(st);
	}

	// -------------------------------------------------------------------//
	public static int binarySearchString(String st[], String item) {
		int low = 0;
		int high = st.length - 1;
		int middle = (low + high) / 2;

		while (low <= high) {
			middle = (low + high) / 2;
			if (st[middle].compareTo(item) < 0) {
				low = middle + 1;
			} else if (st[middle].compareTo(item) > 0) {
				high = middle - 1;
			} else {
				return middle;
			}

		}
		return -1;
	}

	public static void binarySearchResults() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		String st[] = new String[size];
		System.out.println("enter " + size + " string elements");
		for (int i = 0; i < st.length; i++) {
			st[i] = sc.next();
		}
		System.out.println("entred string elements are:");
		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i] + " ");
		}
		Arrays.sort(st);
		System.out.println();
		System.out.println("enter item to search");
		String search = sc.next();
		int item = binarySearchString(st, search);
		System.out.println("item found at location " + item);
	}

	// -------------------------------------------------------------------//
	public static void insertionSortString(String st[]) {
		String temp;
		int j;
		for (int i = 1; i < st.length; i++) {
			temp = st[i];
			j = i;
			while (j > 0 && st[j - 1].compareTo(st[j]) > 0) {
				String s = st[j - 1];
				st[j - 1] = st[j];
				st[j] = s;
				j = j - 1;

			}
			st[j] = temp;

		}
		System.out.println("Sorted arrays:");
		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i] + " ");
		}
	}

	public static void printInsertion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("entter the size of array");
		int n = sc.nextInt();
		String st[] = new String[n];
		System.out.println("enter " + n + " string elements");
		for (int i = 0; i < st.length; i++) {
			st[i] = sc.next();
		}
		System.out.println("entered string elements are:");
		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i] + " ");
		}
		System.out.println();
		insertionSortString(st);
	}

	// -------------------------------------------------------------------//
	public static void bubbleSortString(String st[]) {
		for (int i = 0; i < st.length - 1; i++) {
			for (int j = 1; j < st.length - i; j++) {
				if (st[j - 1].compareTo(st[j]) > 0) {
					String s = st[j - 1];
					st[j - 1] = st[j];
					st[j] = s;
				}

			}

		}
		System.out.println("Sorted Arrays are:");
		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i] + " ");
		}
	}

	public static void printBubble() {
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
		bubbleSortString(st);
	}

	// ------------------------------------------------------------------//
	public static void change(int amount) {
		int notes[] = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
		int count = 0;
		for (int i = 0; i < notes.length; i++) {
			if (amount / notes[i] > 0) {
				System.out.println("Number of notes of " + notes[i] + " is " + (amount / notes[i]));
				count = count + (amount / notes[i]);
				amount = amount % notes[i];
				change(1000);
			}
		}
		System.out.println("Minimum number of notes = " + count);
	}

	public static void vendingResults() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount you want to get change");
		int amount = sc.nextInt();
		change(amount);
	}

	// ----------------------------------------------------------------------//
	public static void tempConversionResult() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the degree in celcius");
		double cen = sc.nextDouble();
		System.out.println("Enter the degree in fahrenheit");
		double fah = sc.nextDouble();
		double fahrenheit = (cen * (9 / 5)) + 32;
		double celcius = (fah - 32) * 5 / 9;
		System.out.println("Fahrenheit conversion of celcius is " + fahrenheit);
		System.out.println("Celcius conversion of Fahrenheit is " + celcius);

	}

	// ------------------------------------------------------------------------//
	public static void mothlyInterests() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter prinicial amount");
		double p = sc.nextDouble();
		System.out.println("enter number of year");
		double y = sc.nextDouble();
		System.out.println("enter rate % ");
		double R = sc.nextDouble();
		double n = 12 * y;
		double r = R / (12 * 100);
		double q = Math.pow(1 + r, -n);
		double payment = (p * r) / 1 - q;
		System.out.println("Total compound intrest " + payment);
	}

	// ---------------------------------------------------------------------//
	public static String toBinary(int n) {
		String bin = "";
		do {
			int r = n % 2;
			bin = r + bin;
			n = n / 2;
		} while (n != 0);
		return bin;
	}

	public static void decToBinResults() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to convert");
		int n = sc.nextInt();
		String binary = toBinary(n);
		System.out.println("Binary conversion of " + n + " is " + binary);
	}

}
