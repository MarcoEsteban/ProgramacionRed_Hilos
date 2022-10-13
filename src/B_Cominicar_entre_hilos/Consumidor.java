package B_Cominicar_entre_hilos;

public class Consumidor extends Thread {
	Monitor mo;
	
	public Consumidor(Monitor xmo){
		this.mo=xmo;
	}
	
	public static Consumidor creaInicia(String nombre, Monitor xmo) {
		Consumidor consum = new Consumidor(xmo);

		consum.start();
		consum.setName(nombre);
//		System.out.println(consum.getName());
		return consum;
	}
	
	public void run() {
		while(true) {
				mo.getRecoger();	
			try {
				sleep(1000);
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
	}
}