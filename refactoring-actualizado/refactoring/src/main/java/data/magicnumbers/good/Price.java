package data.magicnumbers.good;

public abstract class Price {

    private double price = 129.99;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    private double discount = 0.1;

    abstract double  calculateDiscount() ;
    abstract double calculateShipping();

    }
