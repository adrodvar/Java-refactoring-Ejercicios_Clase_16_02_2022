package methods.extractvariable.good;

public class Main {
	
    static void printProductPrice(){
        System.out.println(new ProductoPrice().calculateProductPrice());
    }

    public static void main(String[] args) {
        printProductPrice();
    }
}
