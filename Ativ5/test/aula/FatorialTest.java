package aula;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyLong;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class FatorialTest {
	private long ent,saida;
	
	@Mock
	private A a = null;
	
	@Before
	public void setUp() {
		a = mock(A.class);
		when(a.fatorial(anyLong())).thenCallRealMethod();
	}
	
	public FatorialTest(long ent, long saida) {
		this.ent = ent;
		this.saida = saida;
	}
	
	@Parameterized.Parameters
	public static Collection get() {
		return Arrays.asList(new Object[][] {
			{0,1},
			{1,1},
			{2,2},
			{5,120}
		});
	}

	@Test
	public void fat() {
		System.out.println(ent + " = " + a.fatorial(ent));
		assertEquals(saida,a.fatorial(ent));
	}

}
