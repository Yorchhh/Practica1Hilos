package Practica1PSP.Practica1;

import java.text.DecimalFormat;

public class Cartera extends Thread {
	private double saldo = 0;
	DecimalFormat forma = new DecimalFormat("####.##");

//geethg

	// Metodos Sincronizados
	public synchronized void incrementarSaldo() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		saldo += Math.random() * 101;
		System.out.println("Saldo despues de incremento: " + forma.format(getSaldo()) + "€. Cliente : "
				+ Thread.currentThread().getId());
	}

	public synchronized void decrementarSaldo() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		saldo -= Math.random() * 101;
		System.out.println("Saldo despues de decremento: " + forma.format(getSaldo()) + "€. Worker: "
				+ Thread.currentThread().getId());
	}

	public synchronized void dameSaldo() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Su saldo es de : " + forma.format(saldo) + "€");
	}

	// Getters & Setter
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void run() {
		dameSaldo();

	}
}
