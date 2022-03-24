import unittest
from StronglyConnectedComponents import StronglyConnectedComponents

class StronglyConnectedComponentsTest (unittest.TestCase):
    def test_scc(self):
        students = 14
        knows = [[2, 0], [0, 1], [1, 2], [2, 3], [4, 3], [3, 4], [6, 9], [9, 6]]
        result = StronglyConnectedComponents().scc(students, knows)
        ans = [[0, 1, 2], [4, 3], [5], [6]]
        self.assertTrue(r in ans for r in result)

if __name__ == '__main__':
    unittest.main()