import unittest
from Bipartiteness import Bipartiteness

class CriticalLinkTest(unittest.TestCase):
    def test1(self):
        vertices = 7
        edges = [[0, 6], [1, 6], [1, 2], [5, 6], [3, 2], [3, 4]]
        ans = 1
        self.assertEqual(ans, Bipartiteness().bipartite(edges, vertices))
    
    def test2(self):
        vertices = 7
        edges = [[0, 6], [1, 6], [1, 2], [5, 6], [3, 2], [3, 4], [6, 2]]
        ans = -1
        self.assertEqual(ans, Bipartiteness().bipartite(edges, vertices))
    
    def test3(self):
        vertices = 7
        edges = [[4, 3], [0, 6], [2, 3], [2, 6], [1, 6]]
        ans = 1
        self.assertEqual(ans, Bipartiteness().bipartite(edges, vertices))

if __name__ == '__main__':
    unittest.main()