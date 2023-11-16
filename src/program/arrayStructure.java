package program;

import java.nio.channels.AcceptPendingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class arrayStructure {

	static Integer[] input = { 2, 3, 4, 6, 11, 11, 8, 9, 5, 7, 10, 12, 15, 15, 18, 20, 19 };
	static int inp[] = { 5, 0, 3, 2, 9, 7, 5, 9, 8, 6 };
	static int arr[] = { 10, 13, 15, 12, 19 };
	static String s = "abbammageebbaacchhdfff";
	static String letter = "looking for job in java backened developement role";

	public static void main(String[] args) {
		// findNonRepeatingChar(s);
              findNoSumOF25(arr);
		int[] rev = reverseArray(inp);
		for (int r : rev) {
			System.out.println(r);
		}
		// System.out.println("findSecondLargestNo: " + findSecondLargestNo(inp));
		// System.out.println("removeDuplicateFromString: " +
		// removeDuplicateFromString(s));
		// System.out.println("findDupFromString: " + findDupFromString(s));
		// System.out.println("reverseStringLetter: " + reverseStringLetter(letter));
		// System.out.println("findAccuranceOfWord: " + findAccuranceOfWord(s));
		// printFibonaSeries(10);
		// System.out.println("printFactorielNo" + printFactorielNo(5));

		List<Integer> list = Arrays.asList(input);
		Collections.sort(list);
		// System.out.println(list);
		// printPrimeNo(input);

		int[] s = sortArray(inp);
		for (int i : s) {
			// System.out.println(i);
		}
	}

//by adding in another array
	static int[] reverseArray(int inp[]) {
		int n = inp.length;
		int b[] = new int[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			b[j - 1] = inp[i];

			j = j - 1;
		}
		return b;
	}

//by swapping last in first out
	static int[] reverseArryByswap(int inp[]) {
		int i, j, n;
		n = inp.length;

		for (i = 0; i < n / 2; i++) {
			j = inp[i];
			inp[i] = inp[n - i - 1];
			inp[n - i - 1] = j;
		}
		return inp;

	}

	static int findSecondLargestNo(int inp[]) {
		int firstLargestNo = Integer.MIN_VALUE;
		int secondLargestNO = Integer.MIN_VALUE;

		for (int i = 0; i < inp.length; i++) {
			if (inp[i] > firstLargestNo) {
				secondLargestNO = firstLargestNo;
				firstLargestNo = inp[i];
			} else if (inp[i] > secondLargestNO && firstLargestNo != inp[i]) {
				secondLargestNO = inp[i];
			}

		}
		return secondLargestNO;
	}

	static void findDuplicatesFromArray(Integer input[]) {
		Map<Integer, List<Integer>> dup = Arrays.asList(input).stream()
				.collect(Collectors.groupingBy(Function.identity()));
		dup.forEach((k, v) -> {
			if (v.size() > 1) {
				System.out.println(k);
			}

		});

	}

	static String findNonRepeatingChar(String str) {
		int n = str.length();
		int i, j;

		for (i = 0; i < n; i++) {
			String nonRepeatedChar = "";
			for (j = 0; j < n; j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					break;
				}
			}
			if (j == n)
				nonRepeatedChar = nonRepeatedChar += str.charAt(i);
			System.out.println(nonRepeatedChar);
		}
		return null;
	}

	static String findDupFromString(String s) {

		StringBuilder repeatedChar = new StringBuilder();
		Arrays.asList(s.split("")).stream().collect(Collectors.groupingBy(Function.identity())).forEach((k, v) -> {
			if (v.size() > 1) {
				repeatedChar.append(k);
				System.out.println("Duplicates key: " + k + " count: " + v.size());
			}
		});

		return repeatedChar.toString();
	}

	static String removeDuplicateFromString(String s) {
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		String result = "";
		int n = s.length();

		// using treeset for arrange in ass order
		/*
		 * Set<Character> set = new HashSet<>(); for (char c : ch) { set.add(c); } for
		 * (Character distinctChar : set) { result = result += distinctChar; }
		 */// String noDuplicates =
			// Arrays.asList(s.split("")).stream().distinct().collect(Collectors.joining());

		for (int i = 0; i < n; i++) {
			if (!result.contains(s.valueOf(ch[i])))
				result = result += ch[i];
		}

		return result;
	}

	static void printPrimeNo(Integer[] input) {

		for (int i = 0; i < input.length; i++) {
			boolean isPrime = true;
			for (int j = 2; j < input[i]; j++) {
				if (input[i] % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(input[i] + " ");
			}
		}
	}

	static int[] sortArray(int inp[]) {
		int temp = 0;
		for (int i = 0; i < inp.length - 1; i++) {
			for (int j = i + 1; j < inp.length; j++) {
				if (inp[i] > inp[j]) {
					temp = inp[i];
					inp[i] = inp[j];
					inp[j] = temp;
				}
			}
		}
		return inp;

	}

	static void printFibonaSeries(int n) {
		int a = 0;
		int b = 1;
		System.out.print("fibona series" + a + b);
		for (int i = 0; i < n; i++) {
			int c = a + b;
			System.out.print(c);

			a = b;
			b = c;
		}
	}

	static int printFactorielNo(int n) {

		return n == 0 ? 1 : n * printFactorielNo(n - 1);
	}

	static int findMissingNo(int inp[]) {

		int n = inp.length;
		int sumOfNno = (n * (n + 1) / 2);
		int count = 0;
		for (int i = 0; i < inp.length; i++) {
			count = count + inp[i];
		}
		int missingNo = sumOfNno - count;
		return missingNo;

	}

	static boolean checkAnagram(String inp, String inp1) {

		char[] c1 = inp.toCharArray();
		char[] c2 = inp1.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (c1.length != c2.length) {
			return false;
		}

		for (int i = 0; i < c2.length; i++) {
			if (c1[i] != c2[i]) {
				return false;
			}
		}
		return true;
	}

	static boolean checkPalidrome(String inp) {
		int n = inp.length();
		String reverseString = "";
		for (int i = n - 1; i <= 0; i--) {
			reverseString = reverseString += inp.charAt(i);
		}
		if (inp.equals(reverseString)) {
			return true;
		} else {
			return false;
		}
	}

	static String reverseStringLetter(String letter) {
		String[] word = letter.split(" ");
		String reverseWord = "";

		for (int i = 0; i < word.length; i++) {
			String reverseChar = " ";
			String w = word[i];
			for (int j = w.length() - 1; j >= 0; j--) {
				reverseChar = reverseChar += w.charAt(j);

			}
			reverseWord = reverseWord += reverseChar;
		}
		return reverseWord;
	}

	static void findNoSumOF25(int inp[]) {

		Arrays.sort(inp);
		Map<Integer, Integer> map = new TreeMap<>();

		for (int no : inp) {
			int n = 25 - no;
			if (map.containsKey(n));
			map.put(no, n);
			
			//map.put(no, 0);
			
		}
		System.out.println(map);
	}

	static String findAccuranceOfWord(String value) {

		String[] ch = value.split("");
		Arrays.sort(ch);
		StringBuilder accuranceWord = new StringBuilder();
		Map<String, Integer> map = new HashMap<>();
		// String accuranceWord = "";
		for (String c : ch) {
			// System.out.println(c);
			Integer integer = map.get(c);
			if (map.containsKey(c)) {
				// accuranceWord = accuranceWord += c;
				map.put(c, integer + 1);
			} else {
				map.put(c, 1);
			}
		}

		// String accuranceWord = "";
		map.forEach((k, v) -> {
			// String accuranceWord = "";
			if (v.intValue() > 1) {

				accuranceWord.append(k);
			}
		});
		System.out.println(map);

		return accuranceWord.toString();

	}

}
