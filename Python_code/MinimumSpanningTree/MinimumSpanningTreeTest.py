import unittest
from MinimumSpanningTree import MinimumSpanningTree

class MinimumSpanningTreeTest(unittest.TestCase):
    def test1(self):
        vertices = 3
        # [u, v, w]
        edges = [[0, 1, 3], [1, 2, 1], [2, 0, 2]]
        # select [0, 2] and [1, 2]
        ans = 3
        self.assertEqual(MinimumSpanningTree().mst(edges, vertices), ans)

if __name__ == '__main__':
    unittest.main()