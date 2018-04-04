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
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * @author guilherme pinto
 *
 */
@RunWith(Parameterized.class)
public class Exercicio3 {
	private Object entrada;
	private boolean saida;
	private Operacao op;
	
	@Before
	public void setUp() throws Exception {
		op = new Operacao();
	}
	
	public Exercicio3(Object entrada, boolean saida) {
		this.entrada = entrada;
		this.saida = saida;
	}
	
	@Parameterized.Parameters
	public static Collection get() {
		return Arrays.asList(new Object[][] {
			{12, true},
			{12.0, true},
			{(char)12.0, false},
			{"12", false},
			{new Object(), false},
			{null, false} });
	}
	
	
	@Test
	public void test() throws Exception {
		assertEquals(saida, op.isNumber(entrada));
	}

}
