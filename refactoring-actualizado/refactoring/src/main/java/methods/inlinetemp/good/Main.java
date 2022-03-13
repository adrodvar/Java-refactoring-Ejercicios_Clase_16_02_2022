package methods.inlinetemp.good;

public class Main {
    static final double DISCOUNT_CONSTANT = 200;

    boolean calculateDiscount(Order order){
        return order.getPrice() > DISCOUNT_CONSTANT; // Metodo aplicado Inline TEMP
    }

}
