import unittest

from MajorityElement import MajorityElement

class MajorityElementTest(unittest.TestCase):
    def MajorityElement_Test1(self):
        A = [2, 2, 2, 2, 3, 1, 4, 5, 2]
        self.assertEqual(MajorityElement().majority(A), 2)

    def MajorityElement_Test2(self):
        A = [2, 2, 3, 4, 1, 5]
        self.assertEqual(MajorityElement().majority(A), -1)

if __name__ == '__main__':
    unittest.main()