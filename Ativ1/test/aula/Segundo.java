package aula;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Segundo {
	private A a;
	
	@Before
	public void setUp() {
		//Instancia um obj para 'a'
		a = new A();
	}

	@Test
	public void a() {
		/* 
		 * 14/2 == 7
		 * 7 < 5 == false
		 * nao apresenta falha
		*/
		assertFalse(a.m(14));
	}

	@Test(expected = Exception.class)
	public void b() {
		/*
		 * Esse teste falha pois espera uma exce��o, porem nao ha
		*/
		assertFalse(a.m(14));
	}
	
	@Test(expected = Exception.class)
	public void c() {
		/*
		 * nao falha por ja esperar um Exception
		*/
		assertFalse(a.m(null));
	}

	@Test
	public void d() throws Exception {
		/*
		 * Da certo - pois compara 1 com 1
		*/
		assertEquals(1, a.n(1, 2), 0);
	}

	@Test
	public void e() throws Exception {
		/* 
		 * No caso - a.n(2,2) retorna Exception	
		 * dando erro	
		*/		
		assertEquals(2, a.n(2, 2), 0);
	}

	@Test
	public void f() {
		/*
		 * compara p.nome == Ana com a.q (que recebe o nome "Ana" tbm)
		 * Nao apresenta erro
		*/
		Pessoa p = new Pessoa();
		p.nome = "Ana";
		assertEquals(p, a.q());
	}

	@Test
	public void g() {
		/*
		 * Apresenta falha - pois compara p (new Object) com a(outro new Object)
		 * referencias diferentes
		*/
		Pessoa p = new Pessoa();
		p.nome = "Ana";
		assertSame(p, a.q());
	}
	
	/*
	 * Exercicio 3
	 * Pois nos dois metodos � esperado alguma exce��o, porem no metodo c() nao acontece.
	*/
	
	/*
	 * Exercicio 4
	 * Adicionando o "(expected = Exception.class)" junto a anota��o
	*/
	
	// Exercicio 5
	@Test
	public void h() {
		Pessoa g = null;
		assertSame(g,a.o());
		
		//OU
		assertNull(a.o());
	}
	
	//Exercicio 6 
	@Test
	public void i() {
		String oi = "oi";
		assertSame(a.p(),oi);
	}
	
	/*
	 * Exercicio 7
	 * O metodo assertEquals compara dois valores, no caso, dois nomes.
	 * Ja o metodo assertSame compara dois objetos, onde as referencias 
	 * precisam ser a mesma
	*/
}
/*
 *  a - V
 *  b - F
 *  c - V
 *  d - V
 *  e - F
 *  f - V
 *  g - F
*/
