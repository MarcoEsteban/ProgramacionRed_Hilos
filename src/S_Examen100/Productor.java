package S_Examen100;

public class Productor extends Thread {
	Monitor mo;
	
	public Productor(Monitor xmo){
		this.mo=xmo;
	}
	public static Productor creaInicia(String nombre, Monitor xmo) {
		Productor prod = new Productor(xmo);

		prod.start();
		prod.setName(nombre);
		return prod;
	}
	
	public void run() {
		int i=0;
		if (Thread.currentThread().getName().equalsIgnoreCase("A-E2")) {
			i=-2;
		}
		if (Thread.currentThread().getName().equalsIgnoreCase("B-E2")) {
			i=-1;
		}
		while (true) {
			mo.setColocar(i+=2);
			try {	
				sleep(1000);
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
	}
}