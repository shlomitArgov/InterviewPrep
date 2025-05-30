import unittest

from src.prep2025.src.leetcode_longest_palindromic_substring import LongestPalindromeInSubstring


class MyTestCase(unittest.TestCase):
    def test_in_string_beginning(self):
        self.assertIn(LongestPalindromeInSubstring().longestPalindrome("babad"), ["bab", "aba"])  # add assertion here

    def test_single_character(self):
        self.assertIn(LongestPalindromeInSubstring().longestPalindrome("a"), ["a"])  # add assertion here

    def test_two_character(self):
        ret = LongestPalindromeInSubstring().longestPalindrome("ac")
        self.assertIn(ret, ["a", "c"])  # add assertion here
        print(ret)

    def test_two_characters_palindrome(self):
        ret = LongestPalindromeInSubstring().longestPalindrome("bb")
        self.assertIn(ret, ["bb"])  # add assertion here
        print(ret)


if __name__ == '__main__':
    unittest.main()
