package methods.inlinemethod.good;

public class Main {
    static final double INTEREST = 5d;

    double getRateInterest(){
        return INTEREST > 5 ? 2 : 1;
    } // Metodo de refactorizacion aplicado Inline Method
}