package S_Examen100;

public class Principal {

	public static void main(String[] args) {
		
		Monitor xmo = new Monitor();
		Productor pro1 = Productor.creaInicia("A-E2",xmo);
		Productor pro2 = Productor.creaInicia("B-E2",xmo);

		Consumidor con1 = Consumidor.creaInicia("HILO #cons1",xmo);
		Consumidor con2 = Consumidor.creaInicia("HILO #cons2",xmo);
		Consumidor con3 = Consumidor.creaInicia("HILO #cons3",xmo);

	}

}
