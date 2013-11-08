package si1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteNumerosPorExtenso {

	NumeroPorExtenso ext;

	@Before
	public void setUp() throws Exception {
		ext = new NumeroPorExtenso();
	}

	@Test
	public void testeZeroADez() {
		Assert.assertEquals("zero", ext.extenso(0));
		Assert.assertEquals("um", ext.extenso(1));
		Assert.assertEquals("dois", ext.extenso(2));
		Assert.assertEquals("tres", ext.extenso(3));
		Assert.assertEquals("quatro", ext.extenso(4));
		Assert.assertEquals("cinco", ext.extenso(5));
		Assert.assertEquals("seis", ext.extenso(6));
		Assert.assertEquals("sete", ext.extenso(7));
		Assert.assertEquals("oito", ext.extenso(8));
		Assert.assertEquals("nove", ext.extenso(9));
	}
	@Test
	public void testeDezADezenove(){
		Assert.assertEquals("onze", ext.extenso(11));
		Assert.assertEquals("doze", ext.extenso(12));
		Assert.assertEquals("treze", ext.extenso(13));
		Assert.assertEquals("quatorze", ext.extenso(14));
		Assert.assertEquals("quize", ext.extenso(15));
		Assert.assertEquals("dezesseis", ext.extenso(16));
		Assert.assertEquals("dezessete", ext.extenso(17));
		Assert.assertEquals("dezoito", ext.extenso(18));
		Assert.assertEquals("dezenove", ext.extenso(19));
		Assert.assertEquals("dez", ext.extenso(10));	
	}	
	@Test
	public void testeDezenas(){
		Assert.assertEquals("vinte", ext.extenso(20));
		Assert.assertEquals("trinta", ext.extenso(30));
		Assert.assertEquals("quarenta", ext.extenso(40));
		Assert.assertEquals("cinquenta", ext.extenso(50));
		Assert.assertEquals("sessenta", ext.extenso(60));
		Assert.assertEquals("setenta", ext.extenso(70));
		Assert.assertEquals("oitenta", ext.extenso(80));
		Assert.assertEquals("noventa", ext.extenso(90));	
	}

}
