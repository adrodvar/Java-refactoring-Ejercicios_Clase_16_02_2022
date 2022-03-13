package methods.extractvariable.good;

public class ProductoPrice {
    public ProductoPrice() {
    }
    Double calculateProductPrice(){
        Order order = new Order();
        Double price = order.getPrice() * order.getQuantity();
        Double ship = order.getShipping() * 2;
        Double totalPrice = price - order.getOffer() + ship;
        return totalPrice;
    }
}
