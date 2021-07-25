package string1;

public class String1 {
	public String helloName(String name) {
		return "Hello " + name + "!";
	}

	public String makeAbba(String a, String b) {
		String result = "";
		result = a.concat(b).concat(b).concat(a);
		return result;
	}

	public String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}

	public String makeOutWord(String out, String word) {
		return out.substring(0, out.length() / 2).concat(word).concat(out.substring(out.length() / 2, out.length()));
	}

	public String extraEnd(String str) {

		String s = str.substring(str.length() - 2, str.length());
		return s + s + s;
	}

	public String firstTwo(String str) {

		String result = "";
		if (str.length() == 0) {
			result = "";
		} else if (str.length() < 2) {
			result = str.substring(0, 1);
		} else {
			result = str.substring(0, 2);
		}

		return result;
	}

	public String firstHalf(String str) {
		return str.substring(0, str.length() / 2);
	}

	public String withoutEnd(String str) {
		return str.substring(1, str.length() - 1);
	}

	public String comboString(String a, String b) {
		String s = "";
		if (a.length() > b.length()) {
			s = b.concat(a).concat(b);
		} else if (a.length() < b.length()) {
			s = a.concat(b).concat(a);
		} else {

		}
		return s;
	}

	public String nonStart(String a, String b) {
		return a.substring(1, a.length()).concat(b.substring(1, b.length()));
	}

	public String left2(String str) {
		return str.substring(2, str.length()).concat(str.substring(0, 2));
	}

	public String right2(String str) {
		return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
	}

	public String theEnd(String str, boolean front) {
		String s = "";
		if (front == false) {
			s = str.substring(str.length() - 1, str.length());
		} else {
			s = str.substring(0, 1);
		}
		return s;
	}

	public String withouEnd2(String str) {
		String s = "";
		if (str.length() < 2) {
			s = "";
		}

		else {
			s = str.substring(1, str.length() - 1);
		}
		return s;

	}

	public String middleTwo(String str) {
		return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
	}

	public boolean endsLy(String str) {
		Boolean x = true;
		String msg = str.replace(str, str.concat("ly"));
		if (msg.trim().contains("lyly")) {
			x = true;
		} else {
			x = false;
		}
		return x;
	}

	public String nTwice(String str, int n) {
		return str.substring(0, n) + str.substring(str.length() - n);
	}

	public String twoChar(String str, int index) {
		if (str.length() <= index + 1 || index < 0)
			return str.substring(0, 2);
		else
			return str.substring(index, index + 2);
	}

	public String middleThree(String str) {
		return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
	}

	public boolean hasBad(String str) {
		boolean x = false;
		if (str.length() == 3 && str.contains("bad")) {
			x = true;
		} else if (str.length() <= 3) {
			x = false;
		} else if ((str.charAt(0) == 'b' && str.charAt(1) == 'a' && str.charAt(2) == 'd')
				|| (str.charAt(1) == 'b' && str.charAt(2) == 'a' && str.charAt(3) == 'd')) {
			x = true;
		} else {
			x = false;
		}

		return x;
	}

	public String atFirst(String str) {
		String finalMsg = "";
		if (str.length() == 0) {
			finalMsg = "@@";
		} else if (str.length() < 2) {
			finalMsg = str.concat("@");
		} else {
			finalMsg = str.substring(0, 2);
		}
		return finalMsg;
	}

	public String lastChars(String a, String b) {
		String result = "";

		if (a.length() == 0 || b.length() == 0) {
			if (a.length() == 0 && b.length() == 0) {
				result = "@@";
			} else {
				if (a.length() > b.length()) {
					result = a.substring(0, 1) + "@";
				} else {
					result = "@" + b.substring(b.length() - 1);
				}
			}

		} else {
			result = a.substring(0, 1).concat(b.substring(b.length() - 1));
		}
		return result;
	}

	public String conCat(String a, String b) {
		if (a.length() == 0 || b.length() == 0)
			return a + b;

		if (a.charAt(a.length() - 1) == b.charAt(0))
			return a + b.substring(1);

		return a + b;
	}

	public String lastTwo(String str) {
		if (str.length() < 2)
			return str;

		char x = str.charAt(str.length() - 1);
		char y = str.charAt(str.length() - 2);
		return str.substring(0, str.length() - 2) + x + y;
	}

	public String seeColor(String str) {
		if (str.length() == 0)
			return "";
		if (str.charAt(0) == 'r' || str.charAt(0) == 'b') {
			if (str.contains("red"))
				return "red";

			if (str.contains("blue"))
				return "blue";
		}

		return "";
	}

	public boolean frontAgain(String str) {
		if (str.length() < 2)
			return false;
		if (str.substring(0, 2).contentEquals(str.substring(str.length() - 2, str.length())))
			return true;
		return false;
	}

	public String minCat(String a, String b) {
		String result = "";
		if (a.length() > b.length()) {
			result = a.substring(a.length() - b.length(), a.length()).concat(b);
		} else if (b.length() > a.length()) {
			result = a.concat(b.substring(b.length() - a.length(), b.length()));
		} else {

		}
		return result;
	}

	public String extraFront(String str) {
		if (str.length() < 2)
			return str + str + str;

		return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
	}

	public String without2(String str) {
		if (str.length() < 2)
			return str;

		if (str.substring(0, 2).equalsIgnoreCase(str.substring(str.length() - 2, str.length())))
			return str.substring(2, str.length());

		return str;
	}

	public String deFront(String str) {
		String result = "";
		if (str.charAt(0) == 'a' || str.charAt(1) == 'b') {
			if (str.substring(0, 2).equalsIgnoreCase("ab")) {
				result = str;
			} else if (str.charAt(0) == 'a') {
				result = "a" + str.substring(2, str.length());
			} else if (str.charAt(1) == 'b') {
				result = str.substring(1, str.length());
			}
		} else {
			result = str.substring(2, str.length());
		}

		return result;
	}

	public String startWord(String str, String word) {
		String newWord = "";
		if (str.length() == 0)
			return "";
		newWord = word.substring(1, word.length());
		if (str.contains(newWord))
			return str.substring(0, 1) + newWord;

		return "";
	}

	public String withoutX(String str) {
		String result = "";
		if (str.length() < 2 || (str.length() < 2 && str.contains("x")))
			return "";

		if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
			result = str.substring(1, str.length() - 1);
		} else if (str.charAt(0) == 'x') {
			result = str.substring(1);
		} else if (str.charAt(str.length() - 1) == 'x') {
			result = str.substring(0, str.length() - 1);
		} else {
			result = str;
		}
		return result;
	}

	public String withoutX2(String str) {
		if (str.length() < 2)
			return "";
		if (str.charAt(0) == 'x' && str.charAt(1) == 'x')
			return str.substring(2);
		if (str.charAt(0) == 'x')
			return str.substring(1);
		if (str.charAt(1) == 'x')
			return str.substring(0, 1).concat(str.substring(2));

		return str;
	}

}
