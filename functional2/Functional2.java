package functional2;

import java.util.ArrayList;
import java.util.List;

public class Functional2 {
	/*
	 * Given a list of integers, return a list of the integers, omitting any that
	 * are less than 0.
	 * 
	 * 
	 * noNeg([1, -2]) → [1] noNeg([-3, -3, 3, 3]) → [3, 3] noNeg([-1, -1, -1]) → []
	 */
	public List<Integer> noNeg(List<Integer> nums) {

		List<Integer> noNegative = new ArrayList<>();
		for (Integer number : nums) {
			if (number >= 0) {
				noNegative.add(number);
			}
		}
		return noNegative;
	}

	/*
	 * Given a list of non-negative integers, return a list of those numbers except
	 * omitting any that end with 9. (Note: % by 10)
	 * 
	 * 
	 * no9([1, 2, 19]) → [1, 2] no9([9, 19, 29, 3]) → [3] no9([1, 2, 3]) → [1, 2, 3]
	 */
	public List<Integer> no9(List<Integer> nums) {
		List<Integer> nums9 = new ArrayList<>();
		for (Integer number : nums) {
			if (number % 10 == 9) {

			} else {
				nums9.add(number);
			}
		}
		return nums9;
	}

	/*
	 * Given a list of integers, return a list of those numbers, omitting any that
	 * are between 13 and 19 inclusive.
	 * 
	 * 
	 * noTeen([12, 13, 19, 20]) → [12, 20] noTeen([1, 14, 1]) → [1, 1] noTeen([15])
	 * → []
	 */
	public List<Integer> noTeen(List<Integer> nums) {
		List<Integer> noTeenList = new ArrayList<>();
		for (Integer num : nums) {
			if (num >= 13 && num <= 19) {

			} else {
				noTeenList.add(num);
			}
		}
		return noTeenList;
	}

	/*
	 * Given a list of strings, return a list of the strings, omitting any string
	 * that contains a "z". (Note: the str.contains(x) method returns a boolean)
	 * 
	 * 
	 * noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"] noZ(["hziz", "hzello", "hi"]) →
	 * ["hi"] noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
	 */
	public List<String> noZ(List<String> strings) {
		List<String> noZList = new ArrayList<>();
		for (String stringLister : strings) {
			if (stringLister.contains("z")) {
				continue;
			} else {
				noZList.add(stringLister);
			}
		}
		return noZList;

	}

	/*
	 * Given a list of strings, return a list of the strings, omitting any string
	 * length 4 or more.
	 * 
	 * 
	 * noLong(["this", "not", "too", "long"]) → ["not", "too"] noLong(["a", "bbb",
	 * "cccc"]) → ["a", "bbb"] noLong(["cccc", "cccc", "cccc"]) → []
	 */
	public List<String> noLong(List<String> strings) {
		List<String> noLongList = new ArrayList<>();
		for (String stringLister : strings) {
			if (stringLister.length() >= 4) {
				// shef
			} else {
				noLongList.add(stringLister);
			}
		}
		return noLongList;
	}

	/*
	 * no34(["a", "bb", "ccc"]) → ["a", "bb"] no34(["a", "bb", "ccc", "dddd"]) →
	 * ["a", "bb"] no34(["ccc", "dddd", "apple"]) → ["apple"]
	 */
	public List<String> no34(List<String> strings) {
		strings.removeIf(s -> s.length() == 3 || s.length() == 4);
		return strings;
	}

	/*
	 * 
	 * Given a list of strings, return a list where each string has "y" added at its
	 * end, omitting any resulting strings that contain "yy" as a substring
	 * anywhere.
	 * 
	 * 
	 * noYY(["a", "b", "c"]) → ["ay", "by", "cy"] noYY(["a", "b", "cy"]) → ["ay",
	 * "by"] noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
	 */
	public List<String> noYY(List<String> strings) {
		List<String> List = new ArrayList<>();
		List<String> noYYList = new ArrayList<>();
		for (int i = 0; i < strings.size(); i++) {
			List.add(strings.get(i).concat("y"));
		}
		for (int i = 0; i < List.size(); i++) {
			if (List.get(i).contains("yy")) {
				continue;
			}

			else {
				noYYList.add(List.get(i));
			}
		}
		return noYYList;
	}

	/*
	 * Given a list of non-negative integers, return a list of those numbers
	 * multiplied by 2, omitting any of the resulting numbers that end in 2.
	 * 
	 * 
	 * two2([1, 2, 3]) → [4, 6] two2([2, 6, 11]) → [4] two2([0]) → [0]
	 */
	public List<Integer> two2(List<Integer> nums) {
		List<Integer> doubleNums = new ArrayList<>();
		for (int i = 0; i < nums.size(); i++) {
			if ((nums.get(i) * 2) % 10 == 2) {
				continue;
			} else {
				doubleNums.add(nums.get(i) * 2);
			}

		}
		return doubleNums;
	}

	/*
	 * Given a list of integers, return a list of those numbers squared and the
	 * product added to 10, omitting any of the resulting numbers that end in 5 or
	 * 6.
	 * 
	 * 
	 * square56([3, 1, 4]) → [19, 11] square56([1]) → [11] square56([2]) → [14]
	 */
	public List<Integer> square56(List<Integer> nums) {
		// x^2 + 10 = y.samo ako y != y % 10 == 5 || 6

		List<Integer> majcin = new ArrayList<>();
		int y = 0;
		for (int i = 0; i < nums.size(); i++) {
			y = 0;
			y = (int) Math.pow(nums.get(i), 2) + 10;
			if (y % 10 == 5 || y % 10 == 6) {

			} else {
				majcin.add(y);
			}
		}
		return majcin;
	}
}
