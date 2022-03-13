package conditionals.polymorphism.good;

public class Main {

    public static void main(String[] args) {

        Product productBasic = new ProductBasic();
        double basicPrice = productBasic.calculatePrice();

        Product productPremium = new ProductPremium();
        double premiumPrice = productPremium.calculatePrice();
    }
}
