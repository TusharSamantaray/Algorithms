import unittest
from HuffmanCoding import HuffmanCoding

class HuffmanCodingTest(unittest.TestCase):
    def test_HuffmanCoding_test1(self):
        text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        dic = HuffmanCoding().build(text)
        etext = HuffmanCoding().encode(dic,text)
        ans = 124
        self.assertEqual(ans, len(etext))
        self.assertEqual(text, HuffmanCoding().decode(dic, etext))

if __name__ == '__main__':
    unittest.main()