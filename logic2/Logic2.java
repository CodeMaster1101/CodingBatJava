package logic2;

public class Logic2 {
	/*
	 * We want to make a row of bricks that is goal inches long. We have a number of
	 * small bricks (1 inch each) and big bricks (5 inches each). Return true if it
	 * is possible to make the goal by choosing from the given bricks. This is a
	 * little harder than it looks and can be done without any loops. See also:
	 * Introduction to MakeBricks
	 */
	public boolean makeBricks(int small, int big, int goal) {
		int oneBigBrick = big * 5;
		boolean x = true;
		if (goal > oneBigBrick + small) {
			x = false;
		} else if (goal % 5 > small) {
			x = false;
		} else {
			x = true;
		}
		return x;
	}

	/*
	 * Given 3 int values, a b c, return their sum. However, if one of the values is
	 * the same as another of the values, it does not count towards the sum.
	 * 
	 * 
	 * loneSum(1, 2, 3) → 6 loneSum(3, 2, 3) → 2 loneSum(3, 3, 3) → 0
	 */
	public int loneSum(int a, int b, int c) {
		int sum = 0;

		if (a != b && a != c) {
			sum += a;
		}

		if (b != a && b != c) {
			sum += b;
		}

		if (c != a && c != b) {
			sum += c;
		}

		return sum;
	}

	/*
	 * 
	 * Given 3 int values, a b c, return their sum. However, if one of the values is
	 * 13 then it does not count towards the sum and values to its right do not
	 * count. So for example, if b is 13, then both b and c do not count.
	 * 
	 * 
	 * luckySum(1, 2, 3) → 6 luckySum(1, 2, 13) → 3 luckySum(1, 13, 3) → 1
	 */
	public int luckySum(int a, int b, int c) {
		if (a == 13)
			return 0;
		if (b == 13)
			return a;
		if (c == 13)
			return a + b;
		else
			return a + b + c;

	}

	/*
	 * 
	 * Given 3 int values, a b c, return their sum. However, if any of the values is
	 * a teen -- in the range 13..19 inclusive -- then that value counts as 0,
	 * except 15 and 16 do not count as a teens. Write a separate helper
	 * "public int fixTeen(int n) {"that takes in an int value and returns that
	 * value fixed for the teen rule. In this way, you avoid repeating the teen code
	 * 3 times (i.e. "decomposition"). Define the helper below and at the same
	 * indent level as the main noTeenSum().
	 * 
	 * 
	 * noTeenSum(1, 2, 3) → 6 noTeenSum(2, 13, 1) → 3 noTeenSum(2, 1, 14) → 3
	 */
	public int noTeenSum(int a, int b, int c) {

		int sum = fixTeen(a) + fixTeen(b) + fixTeen(c);

		return sum;
	}

	private int fixTeen(int n) {
		int sum = 0;
		if (n >= 13 && n <= 19) {
			if (n == 15 || n == 16) {
				sum = n;
			} else {
				sum = 0;
			}
		} else {
			sum = n;
		}
		return sum;
	}

	/*
	 * For this problem, we'll round an int value up to the next multiple of 10 if
	 * its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round
	 * down to the previous multiple of 10 if its rightmost digit is less than 5, so
	 * 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded
	 * values. To avoid code repetition, write a separate helper
	 * "public int round10(int num) {" and call it 3 times. Write the helper
	 * entirely below and at the same indent level as roundSum().
	 * 
	 * 
	 * roundSum(16, 17, 18) → 60 roundSum(12, 13, 14) → 30 roundSum(6, 4, 4) → 10
	 */
	public int roundSum(int a, int b, int c) {
		return round10(a) + round10(b) + round10(c);
	}

	public int round10(int num) {
		int rd = num % 10;

		if (rd >= 5)
			return num + 10 - rd;

		return num - rd;
	}

	/*
	 * Given three ints, a b c, return true if one of b or c is "close" (differing
	 * from a by at most 1), while the other is "far", differing from both other
	 * values by 2 or more. Note: Math.abs(num) computes the absolute value of a
	 * number.
	 * 
	 * 
	 * closeFar(1, 2, 10) → true closeFar(1, 2, 3) → false closeFar(4, 1, 3) → true
	 */
	public boolean closeFar(int a, int b, int c) {
		if (b - a == 0)
			return true;
		if (Math.abs(a - c) == 1) {
			if ((b > a + 2 || b > c + 2) || (b < a - 2 || b < c - 2))
				return true;

		}
		if (Math.abs(b - c) == 1) {
			if (a > b + 2 || a > c + 2 || (a < b - 2 || a < c - 2))
				return true;
		}
		if (Math.abs(a - b) == 1) {
			if (c > a + 2 || c > b + 2 || (c < b - 2 || c < a - 2))
				return true;
		}
		return false;
	}

	/*
	 * Given 2 int values greater than 0, return whichever value is nearest to 21
	 * without going over. Return 0 if they both go over.
	 * 
	 * 
	 * blackjack(19, 21) → 21 blackjack(21, 19) → 21 blackjack(19, 22) → 19
	 */
	public int blackjack(int a, int b) {
		int sum = 0;
		if (a > 0 && b > 0) {
			if (a > b && a <= 21) {
				sum = a;
			} else if (a > 21 && b > 21) {
				sum = 0;
			} else if (b > a && b <= 21) {
				sum = b;
			} else if (a > 21 && b <= 21) {
				sum = b;
			} else if (b > 21 && a <= 21) {
				sum = a;
			} else {
				sum = 0;
			}
		}
		return sum;

	}

	/*
	 * Given three ints, a b c, one of them is small, one is medium and one is
	 * large. Return true if the three values are evenly spaced, so the difference
	 * between small and medium is the same as the difference between medium and
	 * large.
	 * 
	 * 
	 * evenlySpaced(2, 4, 6) → true evenlySpaced(4, 6, 2) → true evenlySpaced(4, 6,
	 * 3) → false
	 */
	public boolean evenlySpaced(int a, int b, int c) {
		int oneDiff = 1;
		if (((a == b) && b == c) || ((a - oneDiff == b) && c - oneDiff == a))
			return true;
		if (a > b) {
			if (a > c) {
				if (b >= c) {
					if (a - b == b - c)
						return true;
				} else {
					if (a - c == c - b)
						return true;
				}
			}
		}
		if (b > a) {
			if (b > c) {
				if (a >= c) {
					if (b - a == a - c)
						return true;
				} else {
					if (b - c == c - a)
						return true;
				}
			}
		}
		if (c > b) {
			if (c > a) {
				if (a >= c) {
					if (c - a == a - b)
						return true;
				} else {
					if (c - b == b - a)
						return true;
				}
			}
		}

		return false;
	}

	/*
	 * We want make a package of goal kilos of chocolate. We have small bars (1 kilo
	 * each) and big bars (5 kilos each). Return the number of small bars to use,
	 * assuming we always use big bars before small bars. Return -1 if it can't be
	 * done.
	 * 
	 * 
	 * makeChocolate(4, 1, 9) → 4 makeChocolate(4, 1, 10) → -1 makeChocolate(4, 1,
	 * 7) → 2
	 */
	public int makeChocolate(int small, int big, int goal) {
		int bigVal = big * 5;
		if (goal > bigVal + small)
			return -1;
		if (goal > bigVal) {
			int result = goal - bigVal;
			if (small >= result) {
				return result;
			}
			return -1;
		}
		int ost = goal % 5;
		if (ost <= small) {
			return ost;
		}
		return -1;
	}
}
