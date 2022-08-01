package fiap;

import javax.swing.JOptionPane;

public class UsaCalculadora {
	public static void main(String[] args) {
		float num1;
		float num2;
		String aux, continuar = "sim";
		int op;
		Calculadora mat;

		while (continuar.equalsIgnoreCase("sim")) {
			try {
				aux = JOptionPane.showInputDialog("Digite o primeiro numero");
				num1 = Integer.parseInt(aux);
				aux = JOptionPane.showInputDialog("Digite o segundo numero");
				num2 = Integer.parseInt(aux);
				aux = JOptionPane.showInputDialog(
						"Que operação deseja realizar? \n1-Adição \n2-Subtração \n3-Multiplicação \n4-Divisão");
				op = Integer.parseInt(aux);
				mat = new Calculadora();
				mat.setNumero1(num1);
				mat.setNumero2(num2);
				switch (op) {
				case 1:
					JOptionPane.showMessageDialog(null, "Resultado: " + mat.adicao());
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Resultado: " + mat.subtracao());
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Resultado: " + mat.multiplicacao());
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Resultado: " + mat.divisao());
					break;

				default:
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			continuar = JOptionPane.showInputDialog("Deseja continuar?");
		}
		JOptionPane.showMessageDialog(null, "Fim de programa!");
	}
}
