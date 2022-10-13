package Practica1_hilos;
public class Contador3 extends Thread {

	public void run() {
		int cont = 0;
		while (true) {
			cont++;

			Principal.la3.setText(cont + "");

			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle
				e.printStackTrace();
			}
		}
	}
}