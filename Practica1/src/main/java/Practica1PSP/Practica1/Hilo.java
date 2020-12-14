package Practica1PSP.Practica1;

import java.util.ArrayList;
import java.util.List;

public class Hilo extends Thread {
// No tenemos que importar nada ya que Thread esta incorporado en el paquete java.lang
	
	public Hilo() {
		
	}
	
	@Override
	public void run() {
		long segundos;
		segundos= (long)(Math.random()*5+1);
	
		System.out.println("Soy el hilo: "+getId()+
				" y me pongo a dormir "+segundos+" segundos.");
		
		
		try {
			Thread.sleep(segundos*1000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Soy el hilo: "+getId()+" y he terminado de dormir");
		
		
		
		
	
	}
	

	
	//MAIN
	public static void main(String[] args) {
		List<Hilo> misHilos = new ArrayList<Hilo>();
		for(int i=0;i<100;i++) {
			misHilos.add(new Hilo());
		}
		for (Hilo hilo : misHilos) {
			hilo.start();
			
		}
		
		

	}


	
	
	
	
	
	
}
