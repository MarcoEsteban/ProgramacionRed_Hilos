package A_Sincronizar_hilos;

public class Mihilo extends Thread {
	static SumaArreglo sumaarray = new SumaArreglo();
	int arr[];
	int xtotal;
	
	//Constructor:
	public Mihilo(int nums[]){
		arr=nums;
	}
	
	//Inicia el Hilo:
	public static Mihilo creaInicia(String nombre, int nums[]) {
		Mihilo miHilo = new Mihilo(nums);
		miHilo.start(); 		//Inicia el Hilo.
		miHilo.setName(nombre); //Asigna un nombre al Hilo.
		return miHilo;
	}
	
	@Override
	public void run() {
			System.out.println("Iniciando "+Thread.currentThread().getName());
			
			//SEGUNDA FORMA --> Sincronizando los Hilos desde el Objeto:
			synchronized (sumaarray) {
				xtotal=sumaarray.sumaElArray(arr);
			}
	
			System.out.println("---TOTAL "+Thread.currentThread().getName()+" : "+xtotal);
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}