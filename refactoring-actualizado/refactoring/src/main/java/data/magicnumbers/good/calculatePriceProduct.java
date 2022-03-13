package data.magicnumbers.good;

public class calculatePriceProduct extends Price {

    @Override
    double calculateDiscount() {
        return this.getPrice()< 100 ? 4.99 : 0;
    }

    @Override
    double calculateShipping() {
        return this.getPrice()  * getDiscount();
    }
}
