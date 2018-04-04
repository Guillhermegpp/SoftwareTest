package aula;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author guilherme pinto
 *
 */
//Exercicio 5 - 
@RunWith(Suite.class)
@SuiteClasses({ 
	Exercicio1.class, 
	Exercicio2.class, 
	Exercicio3.class, 
	Exercicio4.class 
})
public class AllTests {


}
/*	
	Exercicio 6 - 
		Pois para se usar teste parametrizado necessita todos os testes retornarem o mesmo tipo de objeto
		
		Suite - condensar em uma unica classe varias classes de testes
	
	
		
	Exercicio 7 - 
		A suite de Testes serve para testar todas as classes selecionadas.
		
		
 */
