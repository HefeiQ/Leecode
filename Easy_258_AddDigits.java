/***
* Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
* For example:
* Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
* Follow up:
* Could you do it without any loop/recursion in O(1) runtime? 
* 0~9   0~9
* 10    1
* 11    2
* 12    3
* ...   ...
* 18    9
* 19    1
* 20    2
* 21    3
* ...   ...
* n     (n-1)%9 + 1
*/

// Intuitive solution
public class Solution {
    public int addDigits(int num) {
        int sum = num;
		while (sum > 9) {
			sum = addDigitsNoCondition(sum);
		}
		return sum;
    }
	
	// Just add all digits for an input non-negative integer
	public int addDigitsNoCondition (int num) {
		int sum = 0;
		while (num > 9) {
			sum += sum % 10;
			num /= 10;
		}
		return sum + num; // Now, num is the highest digit
	}
}

// O(1) solution
public class Solution {
    public int addDigits(int num) {
		return (num - 1)%9 + 1;
	}
}