import unittest
from BreadthFirstSearch import BreadthFirstSearch

class FamilyForestTest(unittest.TestCase):
    def test_Scheduling_test1(self):
        result = BreadthFirstSearch().breadthFirstSearch([[0,3], [1,2], [0,1], [1,3], [3,5], [2,5]], 6)
        ans = [0, 1, 2, 1, -1, 2]
        self.assertEqual(result, ans)

if __name__ == '__main__':
    unittest.main()