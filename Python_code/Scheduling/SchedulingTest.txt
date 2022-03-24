import unittest
from Scheduling import Scheduling

class SchedulingTest(unittest.TestCase):
    def test_Scheduling_test1(self):
        A = [[64800,21600], [75600,14400], [10800,50400], [46800, 68400]]
        ans = 2
        self.assertEqual(Scheduling().schedule(A), ans)