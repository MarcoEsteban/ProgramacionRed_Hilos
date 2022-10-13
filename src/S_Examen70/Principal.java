package S_Examen70;

public class Principal {

	public static void main(String[] args) {
		
		Monitor xmo = new Monitor();
		Productor pro1 = Productor.creaInicia("A",xmo);
		Productor2 pro2 = Productor2.creaInicia("B",xmo);

		Consumidor con1 = Consumidor.creaInicia("HILO #cons1",xmo);
		Consumidor con2 = Consumidor.creaInicia("HILO #cons2",xmo);
		Consumidor con3 = Consumidor.creaInicia("HILO #cons3",xmo);

	}

}
