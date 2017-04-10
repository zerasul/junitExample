import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	Calculadora calc = new Calculadora(2,2);
	
	@Test
	public void testSuma() {
		assertEquals(4, calc.suma());
	}

	@Test
	public void testResta(){
		assertEquals(0, calc.resta());
	}
	@Test
	public void testMult(){
		assertEquals(4, calc.mult());
	}
	
	@Test
	public void testDiv(){
		assertEquals(1, calc.div());
	}
}
