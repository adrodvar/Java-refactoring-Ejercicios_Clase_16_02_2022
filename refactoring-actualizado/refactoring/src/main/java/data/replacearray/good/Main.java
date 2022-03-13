package data.replacearray.good;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Elements> elementos = new ArrayList<Elements>();
		Elements elemento = new Elements();
		elemento.setElement("Chair");
		elemento.setPrice(49.99);
		elemento.setColor("Black");
		elemento.setQuantity(5);
		elementos.add(elemento);
		if(elementos.iterator().hasNext()){
			double finalPrice = elemento.getPrice()*elemento.getQuantity();
			System.out.println("Result: " + finalPrice);
		}
	}
}
