package aula;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;	
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author guilherme pinto
 */
@RunWith(Parameterized.class)
public class Exercicio1 {
	private int a,b,saida;
	private Operacao op;

	
	@Before
	public void setUp() throws Exception {
		op = new Operacao();
	}

	public Exercicio1(int b, int a, int saida) {
		this.b = b;
		this.a = a;
		this.saida = saida;
	}

	@Parameterized.Parameters
	public static Collection get() {
		return Arrays.asList(new Object[][] {
			{0, 0, 0},
			{1, 1, 1},
			{2, 0, 0},
			{0, 2, 0}
		//	{b,a,saida}
		});
	}

	@Test
	public void test() throws Exception {
		assertEquals(saida, op.areaRetangulo(b,a),0);
	}

}
