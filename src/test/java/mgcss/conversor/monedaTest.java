package mgcss.test;

import static org.junit.Assert.*;
import mgcss.conversor.moneda;

import org.junit.Test;

public class monedaTest {

	private moneda m;
	
	public monedaTest(){
		m=new moneda();
	}
	@Test
	public void testDeLibra() {
		float resultadoEsperado = 12.45f;
		float resultadoReal = m.deLibra(10);
		assertEquals(resultadoEsperado, resultadoReal, 0.1);
	}

	@Test
	public void testDeCoronaSueca() {
		float resultadoEsperado = 1.07f;
		float resultadoReal = m.deCoronaSueca(10);
		assertEquals(resultadoEsperado, resultadoReal, 0.1);
	}

	@Test
	public void testDeFrancoSuizo() {
		float resultadoEsperado = 9.08f;
		float resultadoReal = m.deFrancoSuizo(10);
		assertEquals(resultadoEsperado, resultadoReal, 0.1);
	}

	@Test
	public void testDeCoronaNoruega() {
		float resultadoEsperado = 1.05f;
		float resultadoReal = m.deCoronaNoruega(10);
		assertEquals(resultadoEsperado, resultadoReal, 0.1);
	}

	@Test
	public void testDeDolarUSA() {
		float resultadoEsperado = 8.78f;
		float resultadoReal = m.deDolarUSA(10);
		assertEquals(resultadoEsperado, resultadoReal, 0.1);
	}

}
