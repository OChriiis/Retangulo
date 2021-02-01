package br.com.empresa.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.br.empresa.model.Retangulo;

public class FrameRetangulo {

	public void criarTela () {
	
	// *** Construir a Tela
	JFrame tela = new JFrame();
	tela.setTitle("Calculos com o retângulo");
	tela.setSize(1080, 720);
	tela.setDefaultCloseOperation(3);
	tela.setLayout(null);
	
	// ***Construir um JLabel Altura
	JLabel labelAltura = new JLabel();
	labelAltura.setText("Altura:");
	labelAltura.setBounds(10, 10, 60, 30);
	
	// ***Construir um JTextField Altura
	JTextField textAltura = new JTextField();
	textAltura.setBounds(70, 10, 50, 30);
	
	// *** Construir um JLabel Base
	JLabel labelBase = new JLabel ();
	labelBase.setText("Base:");
	labelBase.setBounds(10, 50, 60, 30);
	
	// *** Construir um JTextField Base
	JTextField textBase = new JTextField();
	textBase.setBounds(70, 50, 50, 30);

	// *** Construir Botão calcular
	JButton btnCalcular = new JButton();
	btnCalcular.setText("Calcular");
	btnCalcular.setBounds(10, 100, 110, 30);
	
	// *** Construir Botão Limpar
	JButton btnLimpar = new JButton();
	btnLimpar.setText("Limpar");
	btnLimpar.setBounds(10, 140, 110, 30);
	
	// *** Labels Resultados
	
		JLabel labelArea = new JLabel();
		labelArea.setText("Área:");
		labelArea.setBounds(150, 10, 120, 30);
		
		JLabel labelPerimetro = new JLabel();
		labelPerimetro.setText("Perímetro:");
		labelPerimetro.setBounds(150, 50, 120, 30);
	
	tela.getContentPane().add(labelAltura);
	tela.getContentPane().add(textAltura);	
	tela.getContentPane().add(labelBase);
	tela.getContentPane().add(textBase);
	tela.getContentPane().add(btnCalcular);
	tela.getContentPane().add(btnLimpar);
	tela.getContentPane().add(labelArea);
	tela.getContentPane().add(labelPerimetro);
	
	
	tela.setVisible(true);
	
	
	// *** Ouvintes/Listeners de ações/eventos
	btnCalcular.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			Retangulo r1 = new Retangulo ();
			r1.setAltura(Double.parseDouble(textAltura.getText()));
			r1.setBase(Double.parseDouble(textBase.getText()));
			
			labelArea.setText("Área: " + String.valueOf(r1.calcularArea()));
			labelPerimetro.setText("Perímetro: " + String.valueOf(r1.calcularPerimetro()));
		
		}
		
	});
	
	
	
	
	
	
	
	
	}
	
	
}
