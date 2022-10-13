package B_Cominicar_entre_hilos;

public class Principal {

	public static void main(String[] args) {
		
		Monitor xmo = new Monitor();
		
		Productor pro = Productor.creaInicia("HILO #prod1",xmo);

		Consumidor con = Consumidor.creaInicia("HILO #cons1",xmo);
		Consumidor con2 = Consumidor.creaInicia("HILO #cons2",xmo);
		Consumidor con3 = Consumidor.creaInicia("HILO #cons3",xmo);
				

	}

}
