import unittest
from TopologicalSort import TopologicalSort

class TopologicalSortTest(unittest.TestCase):
    def test1(self):
        total_courses = 10
        pre_requisites = [[0,1],[1,2],[0,2],[5,3],[6,4]]
        answers = [[0, 1, 2, 3, 4], [0, 1, 3, 2, 4]]
        result = TopologicalSort().topoSort(pre_requisites, total_courses)
        print(result)
        for answer in answers:
            with self.subTest(value = answer):
                self.assertEqual(result, answer)

if __name__ == '__main__':
    unittest.main()