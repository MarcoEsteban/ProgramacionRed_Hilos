package Practica_CuentaBancariaCompartida;

public class CajeroAutomatico extends Thread{
	
	//Instanciamos un objeto:
	CuentaBancaria miCuentaBancaria = new CuentaBancaria();
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				retirarDinero(10);
				if(miCuentaBancaria.getSaldoActual() < 0) {
					System.out.println("Su cuenta posee saldo negativo!!!");
				}
				System.out.println();
				sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private synchronized void retirarDinero(int valorRetiro) {
		if (miCuentaBancaria.getSaldoActual() >= valorRetiro) {
			System.out.println("Saldo Actual: "+miCuentaBancaria.getSaldoActual());
			System.out.println("El Usuario:: "+Thread.currentThread().getName()+" Esta realizando un retiro de: "+valorRetiro);
			miCuentaBancaria.retiroDeCuenta(valorRetiro);
			System.out.println("El retiro se ralizó exitosamente!!!, el saldo es: "+miCuentaBancaria.getSaldoActual());
		}else {
			System.out.println("No hay saldo suficiente para realizar la transacción.");
		}
	}
}

