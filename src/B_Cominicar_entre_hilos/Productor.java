package B_Cominicar_entre_hilos;

public class Productor extends Thread{
	Monitor mo;
	
	public Productor(Monitor xmo){
		this.mo=xmo;
	}
	public static Productor creaInicia(String nombre, Monitor xmo) {
		Productor prod = new Productor(xmo);
		prod.start();
		prod.setName(nombre);
//		System.out.println(prod.getName());
		return prod;
	}
	
	public void run() {
		int i=0;
		while (true) {
				mo.setColocar(i++);
			try {
				sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.getStackTrace();
			}
		}
	}	
}
