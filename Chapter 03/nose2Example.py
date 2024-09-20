import unittest

class MyAdditionClass:
    def add(self, x, y):
        return x + y

class TestMyClass(unittest.TestCase):

    def setUp(self):
        self.my_addition_class = MyAdditionClass()

    def test_addition(self):
        self.assertEqual(319, self.my_addition_class.add(300, 19))

if __name__ == '__main__':
    import nose2
    nose2.main()
