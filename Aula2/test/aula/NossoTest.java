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
import org.junit.runners.Parameterized.Parameters;

/**
 * @author GUILHERMEPINTO
 *
 */

/* A classe precisa ser anotada com @RunWith(Parameterized.class) */
@RunWith(Parameterized.class)
public class NossoTest {

	private int ent;
	private boolean esperado;
	private B azinho;

	@Before
	public void setUp() {
		System.out.println("SetUp chamado");
		azinho = new B();
	}

	public NossoTest(int ent, boolean esperado) {
		this.ent = ent;
		this.esperado = esperado;
		}
	
	@Parameters
	public static Collection parameters() {
		return Arrays.asList(
				new Object[][] { 
					{ -10, true },
					{ -9, true }, 
					{ 0, true }, { 9, true }, { 11, false } });
	}
		
	@Test
	public void teste1() {
		System.out.println("Testando: " + ent);
		assertEquals(esperado, azinho.n(ent));
	}

}
