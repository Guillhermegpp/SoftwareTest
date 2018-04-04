/**
 * 
 */
package aula;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author GUILHERME PINTO
 *
 */
public class Exercicio4 {

	/**
	 * @throws java.lang.Exception
	 */
	private Operacao op;

	@Before
	public void setUp() {
		/* chamado antes de cada @Test */
		op = new Operacao();
	}

	@Test(timeout = 1100)
	public void test1() throws InterruptedException {
		/* Este teste falha porque ele dura mais de 1 seg. */
		assertEquals(1, op.timer(1));
	}
	
	@Test(timeout = 3100)
	public void test2() throws InterruptedException {
		/* Este teste falha porque ele dura mais 2de 1 seg. */
		assertEquals(1, op.timer(3));
	}

}
