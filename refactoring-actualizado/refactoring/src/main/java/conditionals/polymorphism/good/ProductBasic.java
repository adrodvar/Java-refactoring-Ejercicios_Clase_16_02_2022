package conditionals.polymorphism.good;

public final class ProductBasic extends Product{
    @Override
    double calculatePrice() {
        return this.getPrice() + SHIPPING;
    }
}
