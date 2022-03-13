package conditionals.polymorphism.good;

//Se modifican las clases ProductBasic y ProductPremium como final y se establece como sealed la clase abstracta Product
public abstract sealed class Product permits ProductBasic, ProductPremium {

    protected static final Double COMMISSION = 0.10;
    protected static final Double SHIPPING = 5.99;

    private String name;
    private Double price;

    abstract double calculatePrice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
