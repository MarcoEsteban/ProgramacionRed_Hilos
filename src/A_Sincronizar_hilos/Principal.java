package A_Sincronizar_hilos;

public class Principal {

	public static void main(String[] args) {
		// Instanciamos 2 Hilos:
		int a[]= {1,2,3,4,5};
		Mihilo h1 = Mihilo.creaInicia("HILO #1",a); //Pasamo por parametro el nombre del Hilo y el Array.
		Mihilo h2 = Mihilo.creaInicia("HILO #2",a);	
		
		//*************************************** SINCRONIZACIÓN ********************************************
		// Sincronizacion de HILOS: Nos permite ordenar el curso del Array.
		//Desventaja-->Consume un poco mas de recurso.
		//UNA FORMA --> Sincronizando los Hilos desde el Método.
		//SEGUNDA FORMA --> Sincronizando los Hilos desde el Objeto.

		
		//Cuando el hilo termina su trabajo termina al toque.
		try {
			h1.join();
			h2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
