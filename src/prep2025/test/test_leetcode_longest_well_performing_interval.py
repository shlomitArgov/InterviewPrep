import unittest

from src.prep2025.src.leetcode_longest_well_performing_interval import LongestWPI


class MyTestCase(unittest.TestCase):
    def test_single_hour_long(self):
        res = LongestWPI().longest_WPI([9])
        self.assertEqual(res, 1)

    def test_single_short_not_long(self):
        res = LongestWPI().longest_WPI([8])
        self.assertEqual(res, 0)

    def test_wpi_starting_at_0_length_2_all_long(self):
        res = LongestWPI().longest_WPI([9, 9])
        self.assertEqual(res, 2)

    def test_wpi_starting_at_0_length_3_not_all_long_limit_by_list_length(self):
        res = LongestWPI().longest_WPI([9, 9, 0])
        self.assertEqual(res, 3)

    def test_wpi_starting_at_0_length_5_not_all_long_limit_by_wpi_length(self):
        res = LongestWPI().longest_WPI([9, 9, 0, 8, 9])
        self.assertEqual(res, 5)

    def test_wpi_starting_at_2_length_5_not_all_long_limit_by_wpi_length(self):
        res = LongestWPI().longest_WPI([0, 0, 9, 9, 0, 8, 9])
        self.assertEqual(res, 5)

    def test_wpi_starting_at_0_length_3_not_all_long_limit_by_wpi_length(self):
        res = LongestWPI().longest_WPI([9,9,6,0,6,6,9])
        self.assertEqual(res, 3)

    def test_wpi_starting_at_0_length_1_not_all_long_limit_by_wpi_length(self):
        res = LongestWPI().longest_WPI([8,10,6,16,5])
        self.assertEqual(res, 3)

    def test_wpi_failing_on_leetcode(self):
        res = LongestWPI().longest_WPI([6,9,9])
        self.assertEqual(res, 3)

if __name__ == '__main__':
    unittest.main()
