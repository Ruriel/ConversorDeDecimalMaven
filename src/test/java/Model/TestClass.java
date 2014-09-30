package test.java.Model;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Model.Conversor;
 
public class TestClass {

	private Conversor model = new Conversor();
	@Test
	public void testCem() {
		assertEquals("1100100", model.converter(100, 2));
		assertEquals("144", model.converter(100, 8));
		assertEquals("64", model.converter(100, 16));
	}
	
	@Test
	public void testDuzentos()
	{
		assertEquals("11001000", model.converter(200, 2));
		assertEquals("310", model.converter(200, 8));
		assertEquals("C8", model.converter(200, 16));
	}
	
	@Test
	public void testOitentaECincoPontoSete()
	{
		assertEquals("1010101,1011001100", model.converter(85.7, 2));
		assertEquals("125,5463146314", model.converter(85.7, 8));
		assertEquals("55,B333333333", model.converter(85.7, 16));
	}

}
