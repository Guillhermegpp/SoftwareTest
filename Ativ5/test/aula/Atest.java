package aula;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class Atest {

	@Mock
	private A a = null;

	@Before
	public void setUp() throws Exception {
		a = mock(A.class);

		when(a.calc(2, 2)).thenReturn(4);
		when(a.calc("x", "y")).thenReturn("xy");
		when(a.calc(null, "y")).thenThrow(new NullPointerException());
		when(a.calc("2", 2)).thenThrow(new Exception());
		doThrow(new RuntimeException("Teste de exceção")).when(a).msg(anyString());
		when(a.area(2)).thenCallRealMethod();
		when(a.pow()).thenCallRealMethod();
		when(a.inc()).thenReturn(1, 2, 3, 4).thenThrow(new NullPointerException("Além do limite"));
		
	}

	@Test
	public void umA() throws NullPointerException, Exception {
		assertSame(4, a.calc(2, 2));
	}

	@Test
	public void umB() throws NullPointerException, Exception {
		assertSame("xy", a.calc("x", "y"));

	}

	@Test (expected = Exception.class)
	public void umC() throws NullPointerException, Exception {
		a.calc(null, "y");
	}

	@Test (expected = Exception.class)
	public void umD() throws NullPointerException, Exception {
		a.calc("2", 2);
	}

	@Test (expected = Exception.class)
	public void dois() {
		a.msg("oi");
	}
	
	@Test
	public void tres() {
		a.area(2);
		verify(a, times(1)).pi();
	}
	
	@Test
	public void quatro() {
		a.pow();
		verify(a, times(2)).pi();
	}

	@Test (expected = Exception.class)
	public void incTest() {
		while (true) {
			System.out.println(a.inc());
		}
	}

}
