package array1;

public class Array1 {

	public boolean firstLast6(int[] nums) {
		boolean x = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[0] == 6) {
				x = true;
				break;
			} else if ((nums[nums.length - 1]) == 6) {
				x = true;
				break;
			} else {
				x = false;
			}
		}
		return x;
	}

	public boolean sameFirstLast(int[] nums) {
		boolean x = true;
		if (nums.length >= 1) {
			if (nums[0] == nums[nums.length - 1]) {
				x = true;
			} else {
				x = false;
			}
		} else {
			x = false;
		}
		return x;
	}

	public int[] makePi() {
		return new int[] { 3, 1, 4 };
	}

	public boolean commonEnd(int[] a, int[] b) {
		boolean x = true;

		if (a[0] == b[0] || (a[a.length - 1] == b[b.length - 1])) {
			x = true;
		} else {
			x = false;
		}
		return x;
	}

	public int sum3(int[] nums) {
		return nums[0] + nums[1] + nums[2];
	}

	public int[] rotateLeft3(int[] nums) {
		return new int[] { nums[1], nums[2], nums[0] };
	}

	public int[] reverse3(int[] nums) {
		int x[] = { nums[0] };
		nums[0] = nums[2];
		nums[2] = x[0];

		return nums;
	}

	public int[] maxEnd3(int[] nums) {
		int[] newArray = new int[nums.length];
		if (nums[0] > nums[2]) {
			newArray[0] = nums[0];
			newArray[1] = nums[0];
			newArray[2] = nums[0];

		} else if (nums[0] < nums[2]) {
			newArray[0] = nums[2];
			newArray[1] = nums[2];
			newArray[2] = nums[2];
		} else if (nums[0] == nums[2]) {
			newArray[0] = nums[0];
			newArray[1] = nums[0];
			newArray[2] = nums[0];
		}
		return newArray;
	}

	public int sum2(int[] nums) {
		if (nums.length < 1) {
			return 0;
		} else if (nums.length < 2) {
			return nums[0];
		} else {
			return nums[0] + nums[1];
		}
	}

	public int[] middleWay(int[] a, int[] b) {
		int[] x = { a[1], b[1] };
		return x;
	}

	public int[] makeEnds(int[] nums) {
		return new int[] { nums[0], nums[nums.length - 1] };
	}

	public boolean has23(int[] nums) {

		if ((nums[0] == 2 || nums[0] == 3) || (nums[1] == 2 || nums[1] == 3)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean no23(int[] nums) {
		boolean x = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2 || nums[i] == 3) {
				x = false;
				break;
			} else {
				x = true;
				continue;
			}
		}
		return x;
	}

	public int[] makeLast(int[] nums) {
		int[] newArray = new int[nums.length * 2];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = 0;
			newArray[newArray.length - 1] = nums[nums.length - 1];
		}
		return newArray;
	}

	public boolean double23(int[] nums) {
		if (nums.length >= 2) {
			if ((nums[0] == 2 && nums[1] == 2) || nums[0] == 3 && nums[1] == 3) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public int[] fix23(int[] nums) {
		int[] x = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2 && nums[i + 1] == 3) {
				x = nums;
				x[i + 1] = 0;
			} else {
				x = nums;

			}
		}
		return x;
	}

	public int start1(int[] a, int[] b) {
		int aCounter = 0;
		int bCounter = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				aCounter++;

			} else {
				continue;
			}
		}
		for (int j = 0; j < b.length; j++) {
			if (b[j] == 1) {
				bCounter++;
			} else {
				continue;
			}
		}

		int sum = bCounter + aCounter;
		return sum;
	}

	public int[] biggerTwo(int[] a, int[] b) {
		if (a[0] + a[1] >= b[0] + b[1]) {
			return a;
		} else {
			return b;
		}
	}

	public int[] makeMiddle(int[] nums) {
		int[] newArray = new int[] { nums[nums.length / 2 - 1], nums[nums.length / 2] };
		return newArray;
	}

	public int[] plusTwo(int[] a, int[] b) {
		int[] newArray = new int[] { a[0], a[1], b[0], b[1] };
		return newArray;
	}

	public int[] swapEnds(int[] nums) {
		int x = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = x;
		return nums;
	}

	public int[] midThree(int[] nums) {
		return new int[] { nums[nums.length / 2 - 1], nums[nums.length / 2], nums[nums.length / 2 + 1] };
	}

	public int maxTriple(int[] nums) {
		int x = 0;
		if (nums[0] > nums[nums.length / 2] && nums[0] > nums[nums.length - 1]) {
			x = nums[0];
		} else if (nums[0] < nums[nums.length / 2] && nums[nums.length / 2] > nums[nums.length - 1]) {
			x = nums[nums.length / 2];
		} else if (nums[0] < nums[nums.length - 1] && nums[nums.length / 2] < nums[nums.length - 1]) {
			x = nums[nums.length - 1];
		} else {
			x = nums[0];
		}
		return x;
	}

	public int[] frontPiece(int[] nums) {
		if (nums.length <= 0) {
			return new int[] {};
		} else if (nums.length < 2) {
			return new int[] { nums[0] };
		} else {
			return new int[] { nums[0], nums[1] };
		}
	}

	public boolean unlucky1(int[] nums) {
		boolean x = true;
		int[] firstToLastIndex = new int[] { 1, 3 };
		if (nums.length < 2) {
			x = false;
		} else if ((nums[0] == firstToLastIndex[0]) && (nums[1] == firstToLastIndex[1])
				|| (nums[1] == firstToLastIndex[0]) && (nums[2] == firstToLastIndex[1])) {
			x = true;
		} else if ((nums[nums.length - 1] == firstToLastIndex[1]) && (nums[nums.length - 2] == firstToLastIndex[0])) {
			x = true;
		} else {
			x = false;
		}
		return x;

	}

	public int[] make2(int[] a, int[] b) {
		int x = 0, y = 0;
		if (a.length >= 2) {
			for (int i = 0; i < a.length; i++) {
				x = a[i];
				y = a[i + 1];
				break;
			}

		} else if (a.length == 1 && b.length >= 1) {
			for (int i = 0; i < 2; i++) {
				x = a[i];
				y = b[i];
				break;
			}

		} else if (a.length < 1 && b.length >= 2) {
			for (int i = 0; i < 2; i++) {
				x = b[i];
				y = b[i + 1];
				break;
			}
		}
		int[] newArray = new int[] { x, y };
		return newArray;
	}

	public int[] front11(int[] a, int[] b) {
		if (a.length > 0 && b.length > 0) {
			return new int[] { a[0], b[0] };
		} else if (a.length <= 0 && b.length <= 0) {
			return new int[] {};
		} else if (b.length <= 0) {
			return new int[] { a[0] };
		} else if (a.length <= 0) {
			return new int[] { b[0] };
		}

		else {
			return new int[] {};
		}
	}
}
