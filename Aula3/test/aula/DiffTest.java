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
 * @author guilherme
 *
 */
@RunWith(Parameterized.class)
public class DiffTest {

	private int a,b,r;
	private Operacao op;
	
	
	
	public DiffTest(int a, int b, int r) {
		this.a = a;
		this.b = b;
		this.r = r;
	}
	@Before
	public void setUp() throws Exception {
		op = new Operacao();
	}
	@Parameters
	public static Collection<Object[]> get(){
		return Arrays.asList(new Object[][] {
			{0,0,0},
			{-1,-1,0},
			{-1,1,-2}
		});
	}
	@Test
	public void test() {
		assertEquals(r, op.diff(a, b));
	}

}
