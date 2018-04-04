package aula;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Primeiro {
	
	//e' chamado apos cada metodo de teste
	@After
	public void a() {
		System.out.println("a");
	}
	
	//e' chamado antes de cada metodo de teste
	@Before
	public void b() {
		System.out.println("b");
	}
	
	//e' chamado após todos os testes - Ultimo
	@AfterClass
	public static void c() {
		System.out.println("c");
	}
	
	//e' chamado antes de qualquer teste - Primeiro
	@BeforeClass
	public static void d() {
		System.out.println("d");
	}
	//Ignora o teste - Caso ja tenha testado e esteja tudo OK
	@Ignore 
	@Test
	public void e() {
		System.out.println("e");
	}
	
	
	@Test
	public void f() {
		System.out.println("f");
	}

	@Test
	public void g() {
		System.out.println("g");
	}
}

/* Console:
 * 
 * 		d
 * 		b
 * 		f
 * 		a
 * 		b
 * 		g
 * 		a
 * 		c
 * 
*/
