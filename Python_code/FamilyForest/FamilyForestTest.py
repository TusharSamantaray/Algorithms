import unittest
from FamilyForest import FamilyForest

class FamilyForestTest(unittest.TestCase):
    def test_family1(self):
        f = FamilyForest()
        
        for s in ["Ricardo", "Sean", "Maya", "Ishaan", "Chia-Lin"]:
            f.make_family(s)
            # each person should now be their own family representative
            self.assertEqual(f.find(s), s)

        rep = f.union("Sean", "Ishaan")
        self.assertTrue(rep == "Sean" or rep == "Ishaan")

        f.union("Maya", "Ishaan")
        f.union("Ricardo", "Chia-Lin")

        # families: {"Sean", "Ishaan", "Maya"}, {"Ricardo", "Chia-Lin"}

        self.assertTrue(f.find("Sean") == f.find("Ishaan") == f.find("Maya"))
        self.assertTrue(f.find("Ricardo") == f.find("Chia-Lin"))
        self.assertTrue(f.find("Sean") != f.find("Chia-Lin"))

if __name__ == '__main__':
    unittest.main()