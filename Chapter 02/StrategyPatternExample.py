class GiftingStrategy:
    def gift(self, amount):
        pass
class CreditCardDonation(GiftingStrategy):
    def __init__(self, card_number):
        self.card_number = card_number
    def gift(self, amount):
        print(f"Gifted ${amount} via credit card: {self.card_number}")
class CashAppDonation(GiftingStrategy):
    def __init__(self, email):
        self.email = email
    def gift(self, amount):
        print(f"Paid ${amount} via CashApp: {self.email}")
class ShoppingCart:
    def __init__(self):
        self.gifting_strategy = None
    def set_gifting_strategy(self, gifting_strategy):
        self.gifting_strategy = gifting_strategy
    def checkout(self, total_amount):
        self.gifting_strategy.pay(total_amount)
if __name__ == "__main__":
    cart = ShoppingCart()
    credit_card_donation = CreditCardDonation("0000-0000-0000-0000")
    cashApp_donation = CashAppDonation("muzz@email.com")
    cart.set_gifting_strategy(credit_card_donation)
    cart.checkout(319)
    cart.set_gifting_strategy(cashApp_donation)
    cart.checkout(30)
