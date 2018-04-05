package aula;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class OperacaoTest {
	/*
	 * a anotação @Mock indica que este atributo deverá receber um objeto Mock
	 */
	@Mock
	private Operacao op = null;

	@Before
	public void setUp() throws Exception {
		/* o método mock cria um objeto do tipo Operacao */
		op = mock(Operacao.class);
		/*
		 * o método when é usado para indicarmos quais métodos e com quais parâmetros
		 * serão testados. O método thenReturn indica o valor retornado quando o método
		 * especificado no when for chamado
		 */
		when(op.maior(4, 2)).thenReturn(4);
		when(op.maior(2, 4)).thenReturn(4);
	}

	@Test
	public void test1() {
		/* checa se o método maior(4,2) foi chamado zero vezes */
		verify(op, times(0)).maior(4, 2);
		/*
		 * assertSame é um método do framework JUnit, ou seja, não tem relação com o
		 * objeto Mock
		 */
		assertSame(4, op.maior(4, 2));
		/* checa se o método maior(4,2) foi chamado exatamente 1 vez */
		verify(op, times(1)).maior(4, 2);
	}

	@Test
	public void test2() {
		verify(op, times(0)).maior(4, 2);
		assertSame(4, op.maior(4, 2));
		verify(op, times(1)).maior(4, 2);
	}

	@Test
	public void test3() {
		verify(op, times(0)).maior(2, 4);
		assertSame(4, op.maior(2, 4));
		verify(op, times(1)).maior(2, 4);
	}

	@Test(expected = Exception.class)
	public void test6() {
		/* o método doThrow provê a capacidade do objeto Mock de lançar uma exceção */
		doThrow(new Exception("Teste de exceção")).when(op).maior(4, 2);
	}

	@Test
	public void test8() {
		/* indica que deverá ser chamado o método concreto isPar */
		when(op.isPar(3)).thenCallRealMethod();
		assertFalse(op.isPar(3));
		verify(op, times(1)).isPar(3);
	}
}
