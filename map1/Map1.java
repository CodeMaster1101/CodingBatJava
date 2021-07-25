package map1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Map1 {

	/*
	 * Modify and return the given map as follows: if the key "a" has a value, set
	 * the key "b" to have that value, and set the key "a" to have the value "".
	 * Basically "b" is a bully, taking the value and replacing it with the empty
	 * string.
	 */
	public Map<String, String> mapBully(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
			map.put("a", "");
		}
		return map;
	}

	/*
	 * Modify and return the given map as follows: if the key "a" has a value, set
	 * the key "b" to have that same value. In all cases remove the key "c", leaving
	 * the rest of the map unchanged.
	 */
	public Map<String, String> mapShare(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.remove("c");
			map.remove("b");
			map.put("b", map.get("a"));
		} else {
			map.remove("c");
		}

		return map;
	}

	/*
	 * Modify and return the given map as follows: for this problem the map may or
	 * may not contain the "a" and "b" keys. If both keys are present, append their
	 * 2 string values together and store the result under the key "ab".
	 * 
	 */ public Map<String, String> mapAB(Map<String, String> map) {
		Collection<String> values = map.values();
		if (map.containsKey("a") && map.containsKey("b")) {
			if (map.get("a").isEmpty() || map.get("b").isEmpty()) {
				map.get(values);
			} else {
				map.put("ab", map.get("a").concat(map.get("b")));
			}
		}
		return map;
	}

	/*
	 * Given a map of food keys and topping values, modify and return the map as
	 * follows: if the key "ice cream" is present, set its value to "cherry". In all
	 * cases, set the key "bread" to have the value "butter".
	 * 
	 */
	public Map<String, String> topping1(Map<String, String> map) {
		if (map.isEmpty()) {
			map.put("bread", "butter");
		} else if (map.containsKey("ice cream") || map.containsKey("bread")) {
			map.put("ice cream", "cherry");
			map.put("bread", "butter");
		} else {
			map.put("bread", "butter");
		}

		return map;

	}
	/*
	 * Given a map of food keys and their topping values, modify and return the map
	 * as follows: if the key "ice cream" has a value, set that as the value for the
	 * key "yogurt" also. If the key "spinach" has a value, change that value to
	 * "nuts". topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream":
	 * "cherry"} topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt":
	 * "cherry", "spinach": "nuts", "ice cream": "cherry"} topping2({"yogurt":
	 * "salt"}) → {"yogurt": "salt"}
	 */

	public Map<String, String> topping2(Map<String, String> map) {
		if (map.containsKey("spinach") && map.containsKey("ice cream")) {
			map.put("spinach", "nuts");
			map.put("yogurt", map.get("ice cream"));
		} else if ((map.containsKey("ice cream") && map.containsKey("yogurt")) || map.containsKey("ice cream")) {
			map.put("yogurt", map.get("ice cream"));
		} else if (map.containsKey("spinach")) {
			map.put("spinach", "nuts");
		} else {

		}
		return map;
	}

	/*
	 * topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
	 * topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
	 * topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad":
	 * "oil", "potato": "ketchup", "fries": "ketchup"}
	 */
	public Map<String, String> topping3(Map<String, String> map) {
		if (map.containsKey("potato") && map.containsKey("fries") && map.containsKey("salad")
				&& map.containsKey("spinach")) {
			map.put("potato", map.get("fries"));
			map.put("salad", map.get("spinach"));

		} else if (map.containsKey("potato") && map.containsKey("fries") && map.containsKey("salad")) {
			map.put("potato", map.get("fries"));
			map.put("spinach", map.get("salad"));
		} else if (map.containsKey("salad") && map.containsKey("potato")) {
			map.put("spinach", map.get("salad"));
			map.put("fries", map.get("potato"));
		} else if (map.containsKey("salad") && map.containsKey("fries")) {
			map.put("spinach", map.get("salad"));
		} else if (map.containsKey("potato") && map.containsKey("fries")) {
			map.put("potato", map.get("fries"));
		} else if (map.containsKey("potato")) {
			map.put("fries", map.get("potato"));
		}
		return map;
	}

	/*
	 * Modify and return the given map as follows: if the keys "a" and "b" are both
	 * in the map and have equal values, remove them both.
	 */
	public Map<String, String> mapAB2(Map<String, String> map) {
		Map<String, String> myMap = new HashMap<>();
		String a = map.get("a");
		String b = map.get("b");
		if (map.containsKey("a") && map.containsKey("b")) {
			if (a.equals(b)) {
				map.remove("a");
				map.remove("b");
			}
		}
		return map;

	}

	/*
	 * Modify and return the given map as follows: if the keys "a" and "b" have
	 * values that have different lengths, then set "c" to have the longer value. If
	 * the values exist and have the same length, change them both to the empty
	 * string in the map.
	 * 
	 * 
	 * mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c":
	 * "aaa"} mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb",
	 * "c": "bbb"} mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c":
	 * "bbb"}
	 * 
	 */
	public Map<String, String> mapAB4(Map<String, String> map) {

		String a = map.get("a");
		String b = map.get("b");
		String c = map.get("c");
		int c_Length = 0;
		if (map.containsKey("a") && map.containsKey("b") && map.containsKey("c")) {
			if (a.length() > b.length()) {
				c_Length = a.length();
			} else if (b.length() > a.length()) {
				c_Length = b.length();
			} else {
				c_Length = c.length();
			}

			if (c_Length == a.length()) {
				map.put("c", map.get("a"));
			} else if (c_Length == b.length()) {
				map.put("c", map.get("b"));
			} else {
				map.put("c", map.get("c"));
				map.put("a", "");
				map.put("b", "");
			}
		} else if (map.containsKey("a") && map.containsKey("b")) {
			if (a.length() > b.length()) {
				map.put("c", map.get("a"));
			} else if (a.length() < b.length()) {
				map.put("c", map.get("b"));
			}
		}

		return map;
	}
}
