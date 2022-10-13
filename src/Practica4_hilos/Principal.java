package Practica4_hilos;

public class Principal {

	public static void main(String[] args) {
		
		Monitor xmo = new Monitor();
		Productor pro1 = Productor.creaInicia("HILO #prod",xmo);

		Consumidor con1 = Consumidor.creaInicia("HILO #cons1",xmo);
		Consumidor con2 = Consumidor.creaInicia("HILO #cons2",xmo);
		Consumidor con3 = Consumidor.creaInicia("HILO #cons3",xmo);

	}

}
