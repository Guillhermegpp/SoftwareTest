package aula;

public class Main {
	
	public int n(int a, int b) throws Exception {
		if (a < b) {
			return a;
		} else if (a > b) {
			return b;
		}
		throw new Exception();
	}
	
	public static void main(String[] args) throws Exception {
		Main m = new Main();
		System.out.println(m.n(2, 2));

	}

}
