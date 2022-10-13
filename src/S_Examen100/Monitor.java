package S_Examen100;

import java.util.Stack;

public class Monitor {
	int n;
	boolean valorExiste = false;
	boolean xconsumidor = false;
	boolean xproductor = true;
	Stack<Integer> pila1 = new Stack<Integer>();
	Stack<Integer> pila2 = new Stack<Integer>();

	
	synchronized int getRecoger() {
		while(!valorExiste) { 
			try {
				wait(); //Detiene el proceso o Hilo.
			} catch (InterruptedException e) {
				Thread.currentThread().interrupted(); 
				e.printStackTrace();
			}
		}
		if(this.xconsumidor) {
			this.n = pila2.pop();
			System.out.println("Recogiendo::"+Thread.currentThread().getName()+" ==> "+this.n );
			this.n = pila1.pop();
			System.out.println("Recogiendo::"+Thread.currentThread().getName()+" ==> "+this.n );	
			
			if(pila1.isEmpty() && pila2.isEmpty()) { 
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
			if (Thread.currentThread().getName().equalsIgnoreCase("A-E2")) {
				this.n = pila1.push(xcol);
			}
			if (Thread.currentThread().getName().equalsIgnoreCase("B-E2")) {
				this.n = pila2.push(xcol);
			}

			if (pila1.size() == 5 && pila2.size() == 5) {
				valorExiste = true;
				this.xconsumidor = true;
				this.xproductor = false;
				notifyAll(); 
			}
			System.out.println("Colocando::"+Thread.currentThread().getName()+" ==> "+this.n);													

		}
	}
}

