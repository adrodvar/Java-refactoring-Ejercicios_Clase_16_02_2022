package conditionals.polymorphism.good;

public final class ProductPremium extends Product{
    @Override
    double calculatePrice() {
        return this.getPrice();
    }
}
