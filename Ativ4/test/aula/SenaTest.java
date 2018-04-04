package aula;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SenaTest {
	private Sena s;

	@Before
	public void setUp() {
		s = new Sena();
	}

	@Test
	public void testeA() throws Exception {
		assertThat(s.getSena(6), hasSize(6));
	}

	@Test
	public void testeB() throws Exception {
		List<Integer> l = s.getSena(10);
		assertThat(l, everyItem(allOf(greaterThanOrEqualTo(1), lessThanOrEqualTo(60))));
		System.out.println("Teste B ---> "+l);
	}

	@Test
	public void testeC() throws Exception {
		List<Integer> l = s.getSena(10);
		System.out.println("\nTeste C ---> "+l);
		assertThat(l, isOrder(l));
	}

	private TypeSafeMatcher<List<Integer>> isOrder(List<Integer> comparacao) {
		return new TypeSafeMatcher<List<Integer>>() {
			
			@Override
			protected boolean matchesSafely(List<Integer> comp) {
				for (int i = 0; i < comp.size()-1; i++) {
					if(comp.get(i) > comp.get(i+1))
						return false;
				}
				return true;
			}

			@Override
			public void describeTo(Description arg0) {
				// TODO Auto-generated method stub
				
			}
		};
	}

	

	@Test
	public void testeD() throws Exception {
		List<Integer> l = s.getSena(10);
		System.out.println("\nTeste D ---> "+l);
		assertThat(l, isDuplicate(l));
	}
	
	private TypeSafeMatcher<List<Integer>> isDuplicate(List<Integer> comparacao) {
		return new TypeSafeMatcher<List<Integer>>() {

			@Override
			public void describeTo(Description arg0) {
				arg0.appendText("Existe numeros repetidos");
			}

			@Override
			protected boolean matchesSafely(List<Integer> comp) {
				for (Integer integer : comp) {
					int freq = Collections.frequency(comp, integer);
					if (freq > 1)
						return false;
				}
				return true;
			}			
		};
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testeE() throws Exception {
		thrown.expect(Exception.class);
		s.getSena(null);
	}

	@Test
	public void testeF() throws Exception {
		thrown.expectMessage("Minimo 6");
		s.getSena(5);
	}

	@Test
	public void testeG() throws Exception {
		thrown.expectMessage("Maximo 12");
		s.getSena(13);
	}

}