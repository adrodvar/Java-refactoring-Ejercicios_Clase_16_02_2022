package data.magicnumbers.good;

public class Main {

    public static void main(String[] args)  {

        Price calculate = new calculatePriceProduct();
        double discountPrice = calculate.calculateDiscount();
        double shippingPrice = calculate.calculateShipping();
        if(discountPrice>0 && ) Discount discount = Discount.ESPECIAL;

        // switch expresión
        switch ((int) shippingPrice) {
            case shippingPrice -> System.out.println("cuenta básica");
            case shippingPrice -> System.out.println("cuenta ahorro");
            case shippingPrice -> { // si un caso tiene más de una línea se pueden crear bloques
                System.out.println("cuenta empresas");
                System.out.println("cuenta empresas");
            }
            default -> throw new IllegalArgumentException("bad account type");
        }
    }
}
enum Discount { NO_APLICA, ESPECIAL, PREMIUM}