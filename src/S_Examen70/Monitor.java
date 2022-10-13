package S_Examen70;

import java.util.Stack;

public class Monitor {
	int n;
	boolean valorExiste = false;
	boolean xconsumidor = false;
	boolean xproductor = true;
	Stack<Integer> pila = new Stack<Integer>();
	
	synchronized int getRecoger() {
		while(!valorExiste) { 
			try {
				wait(); //Detiene el proceso o Hilo.
			} catch (InterruptedException e) {
//				Thread.currentThread().interrupted(); 
				e.printStackTrace();
			}
		}
		if(this.xconsumidor) {
			this.n = pila.pop();
			System.out.println("Recogiendo::"+Thread.currentThread().getName()+" ==> "+this.n );	
			if(pila.isEmpty()) { 
				valorExiste = false;				
				this.xproductor = true;
				this.xconsumidor = false;
				notifyAll();  
			}
		}
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
		if (this.xproductor) {
			this.n = pila.push(xcol);

			if (pila.size() == 10) {
				valorExiste = true;
				this.xconsumidor = true;
				this.xproductor = false;
				notifyAll(); 
			}
			System.out.println("Colocando::"+Thread.currentThread().getName()+" ==> "+this.n);													

		}
	}
}
