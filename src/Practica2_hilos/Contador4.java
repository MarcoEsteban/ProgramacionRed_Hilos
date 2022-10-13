package Practica2_hilos;

public class Contador4 extends Thread{

	public void run() {
		int cont = 0;
		while(true) {
			cont++;
			
			Principal.la4.setText(cont+"");
			
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle 
				e.printStackTrace();
			}
		}
	}
}
