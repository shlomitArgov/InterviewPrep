from itertools import count
from typing import List


class LongestWPI:
    LONG_DAY_HOURS = 8

    def longest_WPI(self, hours: List[int]) -> int:
        total_max = 0
        largest_possible_max_wpi = min(len(list(filter(lambda h: h > 8, hours))) * 2 - 1, len(hours))
        for i in range(len(hours)):
            if self.is_long_day(hours[i]):
                count_long = 1
                count_short = 0
                curr_max = 1
            else:
                count_short = 1
                count_long = 0
                curr_max = 0

            r = i + 1
            r_done = r > len(hours) - 1

            while (not r_done):
                if not r_done:
                    if self.is_long_day(hours[r]):
                        count_long += 1
                    else:
                        count_short += 1

                if count_long > count_short:
                    wpi_length = count_long + count_short
                    curr_max = max(wpi_length, curr_max)

                if (r -i) > largest_possible_max_wpi or r >= len(hours) - 1:
                    r_done = True
                else:
                    r = r + 1

            total_max = max(curr_max, total_max)
            if total_max == (len(hours) - i):
                break

        return total_max

    def is_long_day(self, hours: int) -> bool:
        return hours > LongestWPI.LONG_DAY_HOURS
