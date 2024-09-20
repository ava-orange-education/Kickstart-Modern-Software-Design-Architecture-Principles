interface GiftingStrategy {
    void gift(int amount);
}

class CreditCardDonation implements GiftingStrategy {
    private String cardNumber;

    public CreditCardDonation(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void gift(int amount) {
        System.out.println("Gifted $" + amount + " via credit card: " + cardNumber);
    }
}

class CashAppDonation implements GiftingStrategy {
    private String email;

    public CashAppDonation(String email) {
        this.email = email;
    }

    public void gift(int amount) {
        System.out.println("Gifted $" + amount + " via CashApp: " + email);
    }
}

class ShoppingCart {
    private GiftingStrategy giftStrategy;

    public void setGiftingStrategy(GiftingStrategy giftingStrategy) {
        this.giftingStrategy = giftingStrategy;
    }

    public void checkout(int totalAmount) {
        giftingStrategy.gift(totalAmount);
    }
}


public class StrategyPatternExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        GiftingStrategy creditCardDonation = new CreditCardDonation("0000-0000-0000-0000");
        GiftingStrategy cashAppPayment = new CashAppPayment("muzz@email.com");

        cart.setDonationStrategy(creditCardDonation);
        cart.checkout(319);

        cart.setDonationStrategy(cashAppPayment);
        cart.checkout(30);
    }
}
