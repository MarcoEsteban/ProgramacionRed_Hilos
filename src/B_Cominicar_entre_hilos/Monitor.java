package B_Cominicar_entre_hilos;

public class Monitor {
	int n;
	boolean valorExiste = false;

	synchronized int getRecoger() {
		while(!valorExiste) { 
			try {
				wait(); //Detiene el proceso o Hilo.
			} catch (InterruptedException e) {
				Thread.currentThread().interrupted();
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" ---- "+"Recogiendo::"+this.n);
		valorExiste = false;
		notify();  //Indico que si no existe le mantenga activo.

		return this.n;
	}
	
	synchronized void setColocar(int xcol) {
		while(valorExiste) {
			try {
				wait(); //Detiene el proceso o Hilo.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.n=xcol;
		valorExiste = true;
		notify();  //Indico que si no existe le mantenga activo.
		System.out.println("Colocando::"+xcol);
				
	}
}