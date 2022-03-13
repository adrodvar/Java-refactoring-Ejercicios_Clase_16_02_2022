package methods.extractmethod.good;

public class Main {
    public static void main(String[] args) {
        messageHtml msg= new messageHtml();
        new printHead();
        new printBody();
        System.out.println(msg.printHTML());
    }
}
