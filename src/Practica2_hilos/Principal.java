package Practica2_hilos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal {
	public static JFrame f;
	public static JLabel la1, la2, la3, la4;
	public static JButton b1, b2, b3, b4, b5, b6, b7, b8;
	public static void main(String[] args) {
			
		f = new JFrame("Trabajando con hilos...");
		f.setBounds(100, 100 ,500,400);
		
		f.setLayout(null);
		
		//Fuente para el Label
		Font fuente= new Font("Arial", Font.BOLD, 40);
		
		// AGregamos el Texto
		la1 = new JLabel("1");
		la1.setFont(fuente);  			//Agregamos la Fuente al label.
		la1.setBounds(80, 50, 80, 80); //Posicion del Label.
		
		la2 = new JLabel("2");
		la2.setFont(fuente);  			//Agregamos la Fuente al label.
		la2.setBounds(200, 50, 80, 80); //Posicion del Label.
		
		la3 = new JLabel("3");
		la3.setFont(fuente);  			//Agregamos la Fuente al label.
		la3.setBounds(350, 50, 80, 80); //Posicion del Label.
		
		la4 = new JLabel("4");
		la4.setFont(fuente);  			//Agregamos la Fuente al label.
		la4.setBounds(500, 50, 80, 80); //Posicion del Label.
		
		//Agregamos el Botton:
		b1 = new JButton("Inicio");
		b1.setBounds(35, 230, 100, 20);
				
		b2 = new JButton("Inicio");
		b2.setBounds(180, 230, 100, 20);
		
		//Botones para [Parar y Continuar] GrupoA:
		b5 = new JButton("Parar");
		b5.setBounds(120, 330, 100, 20);
		b6 = new JButton("Continuar");
		b6.setBounds(120, 380, 100, 20);
		
		b3 = new JButton("Inicio");
		b3.setBounds(320, 230, 100, 20);
		
		b4 = new JButton("Inicio");
		b4.setBounds(480, 230, 100, 20);
		
		//Botones para [Parar y Continuar] GrupoB:
		b7 = new JButton("Parar");
		b7.setBounds(400, 330, 100, 20);
		b8 = new JButton("Continuar");
		b8.setBounds(400, 380, 100, 20);
		
		
		ThreadGroup grupoA = new ThreadGroup("A");
		ThreadGroup grupoB = new ThreadGroup("B");
		
		Contador1 xcont1 = new Contador1();
		Contador2 xcont2 = new Contador2();
		Contador3 xcont3 = new Contador3();
		Contador4 xcont4 = new Contador4();
		
		Thread hiloA = new Thread(grupoA, xcont1, "A");
		Thread hiloB = new Thread(grupoA, xcont2, "A");

		Thread hiloC = new Thread(grupoB, xcont3, "B");
		Thread hiloD = new Thread(grupoB, xcont4, "B");
		
		//Boton1
		b1.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
//					xcont1.start();
					hiloA.start();
			}
		});		
		//Boton2
		b2.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
//					xcont2.start();
					hiloB.start();
			}
		});	
		//Bonton 5 == Parar
		b5.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
					grupoA.suspend();
			}
		});
		//Bonton 6 == Continuar
		b6.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
					grupoA.resume();
			}
		});
		
		//Boton3
		b3.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
//					xcont1.start();
					hiloC.start();
			}
		});		
		//Boton4
		b4.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
//					xcont2.start();
					hiloD.start();
			}
		});	
		//Bonton 7 == Parar
		b7.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
					grupoB.suspend();
			}
		});
		//Bonton 8 == Continuar
		b8.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
					grupoB.resume();
			}
		});


		f.add(la1);
		f.add(la2);
		f.add(la3);
		f.add(la4);


		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);

		f.setVisible(true);
	}

}
