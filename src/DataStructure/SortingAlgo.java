package DataStructure;

import java.util.Arrays;

public class SortingAlgo {

	static int arr[] = { 7, 4, 8, 3, 6, 4, 0, 2, 3, 5, 9 };
	static int inp[] = { 3, 4, 5, 6, 7, 8, 9 };

	public static void main(String[] args) throws Exception {

		// Arrays.sort(arr);
		int result = binarySearch(inp, 6, 0, inp.length - 1);
		if (result == -1) {
			System.out.println("not found");
		} else {
			System.out.println("found at index: " + result);
		}
		int[] sorted = merge(arr, 0, arr.length - 1);

		for (int s : sorted) {
			System.out.print(s + " ");
		}

	}

	static int binarySearch(int arr[], int x, int low, int high) {
		while (low < high) {
			int mid = low + (high - low) / 2;

			if (x == arr[mid]) {
				return mid;
			}
			if (x > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	static int[] mergeSort(int arr[], int left, int right, int midle) {

		int low = midle - left + 1; // size of left subarray
		int high = right - midle; // size if right subarray

		int l[] = new int[low]; // creat left subarray
		int r[] = new int[high]; // create right subarray

		int i, j;
		for (i = 0; i < low; i++) {
			l[i] = arr[left + i]; // copy array into leftSubarray
		}
		for (j = 0; j < high; j++) {
			r[j] = arr[midle + 1 + j];
		}

		int k = left;
		int m = 0;
		int n = 0;
		while (m < low && n < high) { // merger the left and right subarray

			if (l[m] <= r[n]) {
				arr[k] = l[m];
				m++;
			} else {
				arr[k] = r[n];
				n++;
			}
			k++;
		}
		while (m < low) {
			arr[k] = l[m]; // merger remaining from leftsubarray
			m++;
			k++;
		}
		while (n < high) {
			arr[k] = r[n]; // merger remaing element from rigtsubarray
			n++;
			k++;
		}
		return arr;
	}

	static int[] merge(int arr[], int left, int right) throws Exception {
		int midle;
		if (left < right) {
			midle = (left + right) / 2;

			merge(arr, left, midle);
			merge(arr, midle + 1, right);
			// return
			mergeSort(arr, left, right, midle);

		}

		return arr;
	}
}
