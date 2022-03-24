import unittest
from SeamCarving import SeamCarving

class SeamCarvingTest(unittest.TestCase):
    # def test1(self):
    #     disruption = [
    #         [1, 2, 0, 3],
    #         [1, 2, 3, 0],
    #         [1, 2, 3, 0],
    #         [1, 2, 0, 3]
    #     ]
    #     seam = SeamCarving().carve_seam(disruption)
    #     self.assertEqual([2, 3, 3, 2], seam)

    # def test2(self):
    #     disruption = [
    #         [1, 2, 8, 3],
    #         [4, 2, 1, 0],
    #         [1, 2, 3, 9],
    #         [3, 2, 0, 3]
    #     ]

    #     seam = SeamCarving().carve_seam(disruption)
    #     self.assertEqual([0, 1, 1, 2], seam)

    # def test3(self):
    #     disruption = [
    #         [1, 2, 0, 3],
    #         [1, 0, 3, 0],
    #         [1, 0, 3, 0],
    #         [1, 2, 0, 3]
    #     ]

    #     seam = SeamCarving().carve_seam(disruption)
    #     self.assertEqual([2, 1, 1, 2], seam)

    def test4(self):
        disruption = [
            [1, 3, 7, 0, 1, 4, 6, 2, 0, 1, 5, 0, 9, 8, 4],
            [4, 6, 2, 0, 1, 5, 0, 4, 6, 2, 0, 1, 5, 0, 3],
            [0, 1, 5, 0, 4, 6, 0, 1, 5, 0, 4, 6, 5, 0, 1],
            [0, 1, 5, 2, 0, 1, 6, 2, 0, 0, 4, 6, 5, 0, 2]
        ]

        seam = SeamCarving().carve_seam(disruption)
        self.assertEqual([3, 3, 3, 4], seam)

if __name__ == '__main__':
    unittest.main()