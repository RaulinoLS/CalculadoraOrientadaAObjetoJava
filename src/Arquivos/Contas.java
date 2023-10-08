package Arquivos;

import javax.swing.JLabel;

//Fun��es para efetuar as contas

public class Contas {

	double x;
	//double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	/*public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}*/

	public void ContaAdicao(double numero) {
		
		this.x = x + numero;

	}
	
	public void ContaSubtracao(double numero) {

		this.x = x - numero;

	}

	public void ContaMultiplicacao(double numero) {

		this.x = x * numero;

	}

	public void ContaDivisao(double numero) {

		this.x = x / numero;

	}

}
