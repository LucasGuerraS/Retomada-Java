package fiap;

public class Calculadora {
	float numero1;
	float numero2;

	public Calculadora() {
	}

	public float getNumero1() {
		return numero1;
	}

	public void setNumero1(float numero1) {
		this.numero1 = numero1;
	}

	public float getNumero2() {
		return numero2;
	}

	public void setNumero2(float numero2) {
		this.numero2 = numero2;
	}

	public float adicao() {
		float resultado;
		resultado = this.numero1 + this.numero2;
		return resultado;
	}

	public float subtracao() {
		float resultado;
		resultado = this.numero1 - this.numero2;
		return resultado;
	}

	public float multiplicacao() {
		float resultado;
		resultado = this.numero1 * this.numero2;
		return resultado;
	}

	public float divisao() throws Exception {
		if (this.numero2 != 0) {
			float resultado;
			resultado = this.numero1 / this.numero2;
			return resultado;
		} else {
			throw new ArithmeticException("Não é possivel dividir um numero por 0");
		}

	}

}
