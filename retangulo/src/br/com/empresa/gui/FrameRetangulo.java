package br.com.empresa.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameRetangulo {

	public void criarTela () {
	
	// *** Construir a Tela
	JFrame tela = new JFrame();
	tela.setTitle("Calculos com o ret�ngulo");
	tela.setSize(1080, 720);
	tela.setDefaultCloseOperation(3);
	tela.setLayout(null);
	
	// ***Construir um JLabel
	JLabel labelAltura = new JLabel();
	labelAltura.setText("Altura:");
	labelAltura.setBounds(10, 10, 60, 30);
	
	// ***Construir um JTextField
	JTextField textAltura = new JTextField();
	textAltura.setBounds(70, 10, 50, 30);
	
	tela.getContentPane().add(labelAltura);
	tela.getContentPane().add(textAltura);	
	
	
	
	
	tela.setVisible(true);
	
	}
	
	
}