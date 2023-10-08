package Arquivos;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Layout extends JFrame implements ActionListener {

	JTextField Numeros = new JTextField();
	JLabel Resultado = new JLabel();
	Contas Conta = new Contas();
	double NumerosConta[] = new double[10]; 
	int ContadorNumeros = 0;
	String ultimaConta = "";

	// Criando o Menu da Calculadora

	public void Menu() {
		
		JFrame meuFrame = new JFrame();
		JButton btn1 = new JButton("+");
		JButton btn2 = new JButton("-");
		JButton btn3 = new JButton("*");
		JButton btn4 = new JButton("/");
		JButton btn5 = new JButton("=");

		btn1.addActionListener(new Adicao());
		btn2.addActionListener(new Subtracao());
		//btn3.addActionListener(new Multiplicacao());
		//btn4.addActionListener(new Divisao());
		btn5.addActionListener(new Resultado());
		
		Container c = new Container();
		Container c1 = new Container();

		meuFrame.setLayout(new GridLayout(2, 2));
		c.setLayout(new GridLayout(1, 2));
		c1.setLayout(new GridLayout(3, 3));
		c.add(Numeros);
		c.add(Resultado);
		c1.add(btn1);
		c1.add(btn2);
		c1.add(btn3);
		c1.add(btn4);
		c1.add(btn5);
		meuFrame.add(c);
		meuFrame.add(c1);

		btn1.setSize(100, 100);
		btn2.setSize(100, 100);
		btn3.setSize(100, 100);
		btn4.setSize(100, 100);

		c.setSize(100, 100);

		meuFrame.setTitle("Calculadora Orientada");
		meuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		meuFrame.setSize(400, 400);
		meuFrame.setVisible(true);
		c.setVisible(true);
	}

	// Fun��es para quando apertar o bot�o
	
	public class Resultado implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if ( ultimaConta == "adicao" ) {
				String numeros = Numeros.getText();
				
				String[] splitted = numeros.split("[\\W]");
				
				NumerosConta[ContadorNumeros] = Double.parseDouble(splitted[ContadorNumeros]) + Conta.getX();
				
				Conta.setX(NumerosConta[ContadorNumeros]);
				
				ContadorNumeros++;
			} else if ( ultimaConta == "subtracao" ) {
				String numeros = Numeros.getText();
				
				String[] splitted = numeros.split("[\\W]");
				
				NumerosConta[ContadorNumeros] = Conta.getX() - Double.parseDouble(splitted[ContadorNumeros]);
				
				Conta.setX(NumerosConta[ContadorNumeros]);
				
				ContadorNumeros++;
			}
			
			Resultado.setText("" + Conta.getX());
			
		}
		
	}

	public class Adicao implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			
			String numeros = Numeros.getText();

			if ( ultimaConta == "adicao" ) {
				String[] splitted = numeros.split("[\\W]");
				
				NumerosConta[ContadorNumeros] = Double.parseDouble(splitted[ContadorNumeros]) + Conta.getX();
				
				Conta.setX(NumerosConta[ContadorNumeros]);
				
				ContadorNumeros++;
			} else if ( ultimaConta == "subtracao" ) {
				String[] splitted = numeros.split("[\\W]");
				
				NumerosConta[ContadorNumeros] = Conta.getX() - Double.parseDouble(splitted[ContadorNumeros]);
				
				Conta.setX(NumerosConta[ContadorNumeros]);
				
				ContadorNumeros++;
			} if ( ultimaConta == "" ) {
				String[] splitted = numeros.split("[\\W]");
				
				NumerosConta[ContadorNumeros] = Double.parseDouble(splitted[ContadorNumeros]) + Conta.getX();
				
				Conta.setX(NumerosConta[ContadorNumeros]);
				ContadorNumeros++;
			}
			
			ultimaConta = "adicao";
			Numeros.setText(numeros + "+");
			
			System.out.println(Conta.getX());
			
		}

	}

	public class Subtracao implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			
			String numeros = Numeros.getText();
			
			if ( ultimaConta == "adicao" ) {
				
				String[] splitted = numeros.split("[\\W]");
				
				NumerosConta[ContadorNumeros] = Double.parseDouble(splitted[ContadorNumeros]) + Conta.getX();
				
				Conta.setX(NumerosConta[ContadorNumeros]);
				
				ContadorNumeros++;
			} else if ( ultimaConta == "subtracao" ) {
				String[] splitted = numeros.split("[\\W]");
				
				NumerosConta[ContadorNumeros] = Conta.getX() - Double.parseDouble(splitted[ContadorNumeros]);
				
				Conta.setX(NumerosConta[ContadorNumeros]);
				
				ContadorNumeros++;
			} if ( ultimaConta == "" ) {
				String[] splitted = numeros.split("[\\W]");
				
				NumerosConta[ContadorNumeros] = Double.parseDouble(splitted[ContadorNumeros]) - Conta.getX();
				
				Conta.setX(NumerosConta[ContadorNumeros]);
				
				ContadorNumeros++;
			}
			
			ultimaConta = "subtracao";
			Numeros.setText(numeros + "-");
			
			System.out.println(Conta.getX());

		}

	}

	/*public class Multiplicacao implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			// Pegando os n�meros do Text Field
			
			Conta.setX(1);

			String numeros = Numeros.getText();
			
			System.out.println(Conta.getX());
			
			String[] splitted = numeros.split("\\*");
			
			for ( int i = 0; i < splitted.length; i++ ) {
				
				
				double x = Integer.parseInt(splitted[i]);
				Conta.ContaMultiplicacao(x);
				
			}
			
			System.out.println(splitted.length);

			// Transformando String em n�mero

			double x = Integer.parseInt(splitted[0]);
			double y = Integer.parseInt(splitted[1]);

			// Manda pra Conta para efetuar a conta

			Conta.setX(x);
			Conta.setY(y);

			// Recebe de volta

			Resultado.setText("" + Conta.getX());

		}

	}

	public class Divisao implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			// Pegando os n�meros do Text Field
			

			String numeros = Numeros.getText();
			
			System.out.println(Conta.getX());
			
			String[] splitted = numeros.split("\\/");
			
			double y = Integer.parseInt(splitted[0]);
			Conta.setX(y);
			
			for ( int i = 1; i < splitted.length; i++ ) {
				
				
				double x = Integer.parseInt(splitted[i]);
				Conta.ContaDivisao(x);
				
			}
			
			System.out.println(splitted.length);

			// Transformando String em n�mero

			double x = Integer.parseInt(splitted[0]);
			double y = Integer.parseInt(splitted[1]);
			// Manda pra Conta para efetuar a conta

			Conta.setX(x);
			Conta.setY(y);

			Recebe de volta

			Resultado.setText("" + Conta.getX());

		}

	}*/

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
