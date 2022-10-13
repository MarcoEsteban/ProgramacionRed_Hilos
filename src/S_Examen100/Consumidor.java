package S_Examen100;

public class Consumidor extends Thread{
	Monitor mo;
	
	public Consumidor(Monitor xmo){
		this.mo=xmo;
	}
	
	public static Consumidor creaInicia(String nombre, Monitor xmo) {
		Consumidor consum = new Consumidor(xmo);

		consum.start(); 
		consum.setName(nombre);
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
