class MyAdditionClass:
    def add(self, x, y):
        return x + y

def test_addition():
    my_addition_class = MyAdditionClass()
    assert my_addition_class.add(300, 19) == 319
