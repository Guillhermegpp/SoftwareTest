package aula;

public abstract class Operacao {
	public abstract int maior(int a, int b);

	public abstract int incrementa(int a);

	public abstract void imprimir(String msg);

	public boolean isPar(Integer a) {
		return a % 2 == 0;
	}
}