package Practica_CuentaBancariaCompartida;

public class Principal {

	public static void main(String[] args) {
		
		//INSTANCIAMOS UN OBJETO:
		CajeroAutomatico caja1 = new CajeroAutomatico();
		
		
		Thread pepito = new Thread(caja1, "Pepito");
		Thread juanito = new Thread(caja1, "Juanito");

		pepito.start();
		juanito.start();
	}

}
