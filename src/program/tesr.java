package program;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class tesr {

	static int arr[] = { 2, 2, 0, 9, 1, 4, 1, 5, 6, 7, 8, 10 };
	static int inp[] = { 1, 2, 4, 9, 1, 3, 5, 7, 7, 0, 10, 12 };

	public static void main(String[] args) {
		System.out.println("hello saurabh");
		// System.out.println(findSecondLargestNo(arr));
		// System.out.println(isPrimeNo(17));
		//binary Search
		// checkNoPresentAtNindex(inp, 9);
		System.out.println(checkPalindrome("moms"));

		// fibonaSeries();
		// System.out.println("factorielNo-> "+factorielNo(5));
		 System.out.println(checkAnagram("race", "care"));

	}
	
	static boolean checkAnagram(String s, String s1) {
	char[] ch1 = s.toCharArray();
	char[] ch2 = s1.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(s.length() == s1.length()) {
		  return  Arrays.equals(ch1, ch2);
	}
		return false;
	}

	static boolean checkPalindrome(String s) {

		String reveseString = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reveseString = reveseString + s.charAt(i);
		}
		if (s.equals(reveseString)) {
			return true;
		}
		return false;

	}

	static int factorielNo(int n) {

		if (n <= 1) {
			return 1;
		}

		return n * factorielNo(n - 1);
	}

	static int findSecondLargestNo(int arr[]) {

		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];

			}

		}
		return secondLargest;

	}

	static boolean isPrimeNo(int num) {

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	static int binarrySearch(int arr[], int low, int high, int target) {

		Arrays.sort(arr);
		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (arr[mid] == target) {
				return mid;
			}

			if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;

	}

	static void checkNoPresentAtNindex(int arr[], int target) {

		int result = binarrySearch(arr, 0, arr.length - 1, target);

		if (result == -1) {
			System.out.println("element not present at any index...");
		} else {
			System.out.println("element present at " + result);
		}

	}

	static void fibonaSeries() {

		int a = 0;
		int b = 1;
		int c;

		for (int i = 0; i < 10; i++) {

			c = a + b;
			System.out.println(c + " ");

			a = b;
			b = c;

		}
	}

}
