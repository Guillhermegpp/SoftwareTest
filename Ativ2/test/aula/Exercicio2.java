/**
 * 
 */
package aula;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author guilherme pinto
 *
 */

@RunWith(Parameterized.class)
public class Exercicio2 {
	private int a,b,saida;
	private Operacao op;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		op = new Operacao();
	}

	public Exercicio2(int b, int a, int saida) {
		this.b = b;
		this.a = a;
		this.saida = saida;
	}

	@Parameterized.Parameters
	public static Collection get() {
		return Arrays.asList(new Object[][] {
			{-1, 0, -1},
			{0, -1, -1},
			{-1, -1, 1}
		});
	}

	@Test(expected = Exception.class)
	public void test() throws Exception {
		System.out.println("Testando - " + b + " " + a);
		if (saida == op.areaRetangulo(b,a)) {
			System.out.println("Passou");
		}
		assertEquals(saida, op.areaRetangulo(b,a),0);
	}
}
