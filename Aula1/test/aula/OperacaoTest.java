package aula;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static java.lang.Math.*;

public class OperacaoTest {
	private Operacao op;
	@Test
	public void a() {
		assertEquals((long)8, (long)op.potencia(2, 3));
	}

	@Test
	public void b() {
		System.out.println("bbb");
		//fail("Errei");
	}

	@Before
	public void c() {
		op = new Operacao();
		System.out.println("ccc");
	}

	@After
	public void d() {
		System.out.println("ddd");
	}

	@BeforeClass
	public static void e() {
		System.out.println("eee");
	}

	@AfterClass
	public static void f() {
		System.out.println("fff");
	}

}
