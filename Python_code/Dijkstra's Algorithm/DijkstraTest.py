import unittest
from Dijkstra import Dijkstra

class CriticalLinkTest(unittest.TestCase):
    def test1(self):
        vertices = 6
        edges = [[0, 1, 4], [0, 2, 2], [1, 3, 2], [1, 4, 3], [2, 1, 1], [2, 3, 2], [2, 4, 5], [4, 3, 1], [5, 2, 2]]
        ans =  [0, 3, 2, 4, 6, -1]
        self.assertEqual(ans, Dijkstra().shortestDistance(edges, vertices))

if __name__ == '__main__':
    unittest.main()