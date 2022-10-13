package A_Sincronizar_hilos;

public class SumaArreglo {
	private int acumula;
	
	//UNA FORMA --> Sincronizando los Hilos desde el Método:
	synchronized int sumaElArray(int dat[]) {
		acumula=0;
		for(int i=0; i<dat.length;i++) {
			acumula = acumula + dat[i];
			System.out.println("El acumulado de "+Thread.currentThread().getName()+" es "+acumula); //Obtenemos la suma del Array.
			try {
				Thread.sleep(500);  //Inidcamos un tiempo de Ejecucion del Hilo.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return acumula;
	}
}
