package fiap;

public class TesteExeption {

	public static void main(String[] args) {
		int[] numeros = { 2, 4, 10, 0, 33 };

		try {
			System.out.println(numeros[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Fim de programa!");
		}

	}

}
