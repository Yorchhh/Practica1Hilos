package Practica1PSP.Practica1;

import java.util.ArrayList;
import java.util.List;

public class Main2x2 {

	public static void main(String[] args) {
		Cartera c = new Cartera();
		List<Cliente> clientes = new ArrayList<Cliente>();
		List<Worker> workers = new ArrayList<Worker>();

		for (int i = 0; i < 10; i++) {
			clientes.add(new Cliente(c));
		}
		for (Cliente cli : clientes) {
			cli.start();
		}

		for (int i = 0; i < 10; i++) {
			workers.add(new Worker(c));
		}
		System.out.println("*****************************************");

		for (Worker worker : workers) {
			worker.start();
		}
		c.start();

	}

}
