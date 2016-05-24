/***
Leecode 344 Easy
Write a function that takes a string as input and returns the string reversed.
Example:
Given s = "hello", return "olleh". 
***/

public class Solution {
	public String reverseString(String s) {
		if (s == null)
			return null;
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();
	}
}