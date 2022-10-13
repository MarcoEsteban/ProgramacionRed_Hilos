package Practica_CuentaBancariaCompartida;

public class CuentaBancaria {
	private int saldoActual = 50;
	
	//GET y SET:
	public int getSaldoActual() {
		return saldoActual;
	}

	public void retiroDeCuenta(int valorRetiro) {
		this.saldoActual -= valorRetiro;
	}
	
}
