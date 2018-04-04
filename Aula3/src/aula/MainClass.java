package aula;

public class MainClass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		System.out.println(Operacao.class);
		Operacao o = Operacao.class.newInstance();
	}

}
