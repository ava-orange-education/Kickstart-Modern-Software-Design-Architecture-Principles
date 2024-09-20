class CorgiModel:
    def __init__(self):
        self.name = None
    def set_name(self, name):
        self.name = name
    def get_name(self):
        return self.name

class CorgiView:
    def display_corgi_details(self, corgi_name):
        print(f"Corgi Name: {corgi_name}")

class CorgiController:
    def __init__(self, model, view):
        self.model = model
        self.view = view
    def update_corgi_name(self, name):
        self.model.set_name(name)
    def display_corgi_details(self):
        corgi_name = self.model.get_name()
        self.view.display_corgi_details(corgi_name)

if __name__ == "__main__":
    model = CorgiModel()
    view = CorgiView()
    controller = CorgiController(model, view)
    controller.update_corgi_name("Muzz")
    controller.display_corgi_details()
