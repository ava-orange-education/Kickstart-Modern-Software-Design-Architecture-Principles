class TargetExample:
    def request(self):
        pass
class AdapteeExample:
    def specific_request(self):
        print("This is the adaptee's specific request.")
class AdapterExample(TargetExample):
    def __init__(self, adaptee):
        self.adaptee = adaptee
    def request(self):
        print("This is the adapter's request")
        self.adaptee.specific_request()
if __name__ == "__main__":
    adaptee = AdapteeExample()
    adapter = AdapterExample(adaptee)

    adapter.request()
