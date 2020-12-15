package Practica1PSP.Practica1;

public class Main {

	public static void main(String[] args) {
		Cartera cart = new Cartera();
		Cliente c = new Cliente(cart);
		Worker w = new Worker(cart);
		
		c.start();
		w.start();
		
		
	}

}
