package fiap;

public class TesteExeption02 {

	public static void main(String[] args) {
		int[] numeros = { 2, 4, 10, 25, 33, 45 };
		int[] divisores = { 2, 2, 0, 5 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println("Resultado: " + (numeros[i] / divisores[i]));
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("Fim de programa!");

	}

}
