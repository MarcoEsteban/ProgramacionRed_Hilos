package S_Examen70;

public class Productor2 extends Thread{
	Monitor mo;
	
	public Productor2(Monitor xmo){
		this.mo=xmo;
	}
	public static Productor2 creaInicia(String nombre, Monitor xmo) {
		Productor2 prod1 = new Productor2(xmo);
		
		prod1.start();
		prod1.setName(nombre);
		return prod1;
	}
	
	public void run() {
		int i=-1;
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
