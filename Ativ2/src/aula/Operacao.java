package aula;
/**
 * 
 */

import java.util.concurrent.TimeUnit;

/**
 * @author guilherme pinto
 *
 */
public class Operacao {
	
	public double areaRetangulo(double b, double a) throws Exception {
		if (b < 0 || a < 0) {
			throw new Exception("Valor negativo");
		}
		return b * a;
	}
	
	public boolean isNumber(Object obj) throws Exception {
		return obj instanceof java.lang.Number;
	}
	

	public int timer(int cont) throws InterruptedException {
		/* sleep por cont segundos */
		TimeUnit.SECONDS.sleep(cont);
		return 1;
	}
}
