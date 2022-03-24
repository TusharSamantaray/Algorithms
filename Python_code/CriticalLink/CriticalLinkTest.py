import unittest
from CriticalLink import CriticalLink

class CriticalLinkTest(unittest.TestCase):
    def test1(self):
        links = [[0,1],[1,2],[2,0],[1,3]]
        ans = 1
        self.assertEqual(ans, CriticalLink().criticalLink(4, links))

if __name__ == '__main__':
    unittest.main()