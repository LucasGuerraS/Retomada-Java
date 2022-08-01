package fiap;

import javax.swing.JOptionPane;

public class TesteExeption03 {

	public static void main(String[] args) {
		String aux;
		int numero;

		try {
			aux = JOptionPane.showInputDialog("Digite um numero inteiro entre 1 e 20");

			numero = Integer.parseInt(aux);

			if (numero >= 1 && numero <= 20) {
				JOptionPane.showMessageDialog(null, "Você digitou: " + numero);
			} else {
				throw new Exception("Numero fora da faixa");
			}

		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Fim de programa!");

	}

}
