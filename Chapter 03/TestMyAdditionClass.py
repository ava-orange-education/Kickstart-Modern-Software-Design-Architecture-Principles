import unittest

class TestMyAdditionClass(unittest.TestCase):

    def test_addition(self):
        my_class = MyClass()
        self.assertEqual(319, my_class.add(300, 19))
