package Arquivos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Principal extends JFrame implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Puxando a Fun��o

		Layout Layout = new Layout();

		// Executando o Menu

		Layout.Menu();

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
