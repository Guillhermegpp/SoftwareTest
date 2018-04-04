package aula;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class Atest {
	
	private A a;
	
	@Before
	public void setUp() {
		a = new A();
	}
	
	@Test 
	public void testaG() throws Exception{
	    a.g(5);
	}

	@Test (expected = Exception.class)
	public void testaGa() throws Exception{
	    //� esperado exce��o    
	    a.g(15);
	}

	@Test
	public void testDobro() {
		try {
			Method mtdDobro = A.class.getDeclaredMethod("dobro"	, int.class, int.class);
			mtdDobro.setAccessible(true);
			int saida = (int) mtdDobro.invoke(a,5,5);
			assertEquals(10, saida);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException 
				| IllegalArgumentException
				| InvocationTargetException e)  {
			//e.printStackTrace();
		}
	}
	
	@Test
	public void testA() throws Exception {
		a = new A(12.5);	
		assertTrue(a instanceof A);
	}
	
	@Test(expected = Exception.class)
	public void testAa() throws Exception {
		a = new A("12.5");
		
	}
	
	@Test
	public void testDiff() {
		assertEquals(1,A.diff(3,2));
	}
	
	@Test
	public void testSoma() {
		A.C novo = new A().new C();
		A.C c = a.new C();
		assertEquals(5,novo.soma(2, 3));	
	}
	
}
