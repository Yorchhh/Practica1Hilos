package Practica1PSP.Practica1;

public class Cliente extends Thread {
	private Cartera cartera;

	public Cliente(Cartera cartera) {
		super();
		this.cartera = cartera;
	}

	@Override
	public void run() {

//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		cartera.incrementarSaldo();

	}
}
