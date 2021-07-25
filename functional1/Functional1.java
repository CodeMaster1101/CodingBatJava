package functional1;

import java.util.ArrayList;
import java.util.List;

public class Functional1 {
	/*
	 * Given a list of integers, return a list where each integer is multiplied by
	 * 2.
	 */

	public List<Integer> doubling(List<Integer> nums) {
		List<Integer> doubleNums = new ArrayList<Integer>();
		for (int i = 0; i < nums.size(); i++) {
			doubleNums.add(nums.get(i) * 2);
		}

		return doubleNums;

	}

	/*
	 * Given a list of integers, return a list where each integer is multiplied with
	 * itself.
	 * 
	 * 
	 * square([1, 2, 3]) → [1, 4, 9] square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
	 * square([]) → []
	 */
	public List<Integer> square(List<Integer> nums) {
		List<Integer> doubleNums = new ArrayList<>();
		for (Integer integer : nums) {
			doubleNums.add(integer * integer);
		}
		return doubleNums;

	}

	/*
	 * Given a list of strings, return a list where each string has "*" added at its
	 * end.
	 * 
	 * 
	 * addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"] addStar(["hello",
	 * "there"]) → ["hello*", "there*"] addStar(["*"]) → ["**"]
	 */
	public List<String> addStar(List<String> strings) {
		List<String> starStringContainer = new ArrayList<>();
		for (String wordLister : strings) {
			starStringContainer.add(wordLister.concat("*"));
		}
		return starStringContainer;
	}

	/*
	 * 
	 * Given a list of strings, return a list where each string is replaced by 3
	 * copies of the string concatenated together.
	 * 
	 * 
	 * copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"] copies3(["24",
	 * "a", ""]) → ["242424", "aaa", ""] copies3(["hello", "there"]) →
	 * ["hellohellohello", "theretherethere"]
	 */
	public List<String> copies3(List<String> strings) {
		List<String> copyOfThree = new ArrayList<>();
		for (int i = 0; i < strings.size(); i++) {
			copyOfThree.add(strings.get(i).concat(strings.get(i)).concat(strings.get(i)));

		}
		return copyOfThree;
	}

	/*
	 * Given a list of strings, return a list where each string has "y" added at its
	 * start and end.
	 * 
	 * 
	 * moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"] moreY(["hello", "there"]) →
	 * ["yhelloy", "ytherey"] moreY(["yay"]) → ["yyayy"]
	 */
	public List<String> moreY(List<String> strings) {
		List<String> yAdder = new ArrayList<>();
		List<String> yBegginng = new ArrayList<>();
		for (int i = 0; i < strings.size(); i++) {
			yBegginng.add(String.join("", "y", strings.get(i)));
		}
		for (String wordLister : yBegginng) {
			yAdder.add(wordLister.concat("y"));
		}
		return yAdder;
	}

	/*
	 * Given a list of integers, return a list where each integer is added to 1 and
	 * the result is multiplied by 10.
	 * 
	 * 
	 * math1([1, 2, 3]) → [20, 30, 40] math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
	 * math1([10]) → [110]
	 */
	public List<Integer> math1(List<Integer> nums) {
		List<Integer> numContainer = new ArrayList<>();
		for (Integer number : nums) {
			number += 1;
			numContainer.add(number * 10);
		}
		return numContainer;
	}

	/*
	 * Given a list of non-negative integers, return an integer list of the
	 * rightmost digits. (Note: use %)
	 * 
	 * 
	 * rightDigit([1, 22, 93]) → [1, 2, 3] rightDigit([16, 8, 886, 8, 1]) → [6, 8,
	 * 6, 8, 1] rightDigit([10, 0]) → [0, 0]
	 */
	public List<Integer> rightDigit(List<Integer> nums) {
		List<Integer> rightOnly = new ArrayList<>();
		for (Integer rightInteger : nums) {
			rightOnly.add(rightInteger % 10);
		}
		return rightOnly;
	}

	/*
	 * 
	 * Given a list of strings, return a list where each string is converted to
	 * lower case (Note: String toLowerCase() method).
	 * 
	 * 
	 * lower(["Hello", "Hi"]) → ["hello", "hi"] lower(["AAA", "BBB", "ccc"]) →
	 * ["aaa", "bbb", "ccc"] lower(["KitteN", "ChocolaTE"]) → ["kitten",
	 * "chocolate"]
	 */
	public List<String> lower(List<String> strings) {
		List<String> toLower = new ArrayList<>();
		for (String wordLister : strings) {
			toLower.add(wordLister.toLowerCase());
		}
		return toLower;
	}

	/*
	 * Given a list of strings, return a list where each string has all its "x"
	 * removed.
	 * 
	 * 
	 * noX(["ax", "bb", "cx"]) → ["a", "bb", "c"] noX(["xxax", "xbxbx", "xxcx"]) →
	 * ["a", "bb", "c"] noX(["x"]) → [""]
	 */
	public List<String> noX(List<String> strings) {
		strings.replaceAll(x -> x.replace("x", ""));
		return strings;
	}
}
