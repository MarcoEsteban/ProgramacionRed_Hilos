package Practica1_hilos;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal {
	public static JFrame f;
	public static JLabel la1, la2, la3;
	public static JButton b1, b2, b3;

	public static void main(String[] args) {

		f = new JFrame("Trabajando con hilos...");
		f.setBounds(100, 100, 500, 400);

		f.setLayout(null);

		// Fuente para el Label
		Font fuente = new Font("Arial", Font.BOLD, 40);

		// AGregamos el Texto
		la1 = new JLabel("1");
		la1.setFont(fuente); // Agregamos la Fuente al label.
		la1.setBounds(80, 50, 80, 80); // Posicion del Label.

		la2 = new JLabel("2");
		la2.setFont(fuente); // Agregamos la Fuente al label.
		la2.setBounds(250, 50, 80, 80); // Posicion del Label.

		la3 = new JLabel("3");
		la3.setFont(fuente); // Agregamos la Fuente al label.
		la3.setBounds(400, 50, 80, 80); // Posicion del Label.
		// Agregamos el Botton:
		b1 = new JButton("Inicio");
		b1.setBounds(35, 230, 100, 20);

		b2 = new JButton("Inicio");
		b2.setBounds(205, 230, 100, 20);

		b3 = new JButton("Inicio");
		b3.setBounds(370, 230, 100, 20);

		Contador1 xcont1 = new Contador1();
		Contador2 xcont2 = new Contador2();
		Contador3 xcont3 = new Contador3();

		// Boton1
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (b1.getText() == "Inicio") {
					xcont1.start();
					b1.setText("Parar");
				} else if (b1.getText() == "Parar") {
					xcont1.suspend();
					b1.setText("Continuar");
				} else if (b1.getText() == "Continuar") {
					xcont1.resume();
					b1.setText("Parar");
				}
			}
		});
		// Boton2
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (b2.getText() == "Inicio") {
					xcont2.start();
					b2.setText("Parar");
				} else if (b2.getText() == "Parar") {
					xcont2.suspend();
					b2.setText("Continuar");
				} else if (b2.getText() == "Continuar") {
					xcont2.resume();
					b2.setText("Parar");
				}
			}
		});
		// Boton3
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (b3.getText() == "Inicio") {
					xcont3.start();
					b3.setText("Parar");
				} else if (b3.getText() == "Parar") {
					xcont3.suspend();
					b3.setText("Continuar");
				} else if (b3.getText() == "Continuar") {
					xcont3.resume();
					b3.setText("Parar");
				}
			}
		});

		f.add(la1);
		f.add(la2);
		f.add(la3);

		f.add(b1);
		f.add(b2);
		f.add(b3);

		f.setVisible(true);
	}

}
