import unittest


class LongestPalindromeInSubstring(unittest.TestCase):
    def longestPalindrome(self, s: str) -> str:
        length = len(s)

        pal = s[0]
        curr_max_len = 1
        for potential_pal_len in range(length, 0, -1):
            for i in range(0, length - potential_pal_len + 1):
                if s[i: i + potential_pal_len] == s[i:i + potential_pal_len][::-1] and curr_max_len < potential_pal_len:
                    pal = s[i: i + potential_pal_len]
                    curr_max_len = potential_pal_len
                    break

        return pal

