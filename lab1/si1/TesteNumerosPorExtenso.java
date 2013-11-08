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
	
	@Test
	public void testeDezenasComUnidades(){
		Assert.assertEquals("vinte e um", ext.extenso(21));
		Assert.assertEquals("trinta e dois", ext.extenso(32));
		Assert.assertEquals("quarenta e tres", ext.extenso(43));
		Assert.assertEquals("cinquenta e quatro", ext.extenso(54));
		Assert.assertEquals("sessenta e cinco", ext.extenso(65));
		Assert.assertEquals("setenta e seis", ext.extenso(76));
		Assert.assertEquals("oitenta e sete", ext.extenso(87));
		Assert.assertEquals("noventa e oito", ext.extenso(98));
	}
	@Test
	public void testeCentenas(){
		Assert.assertEquals("cem", ext.extenso(100));
		Assert.assertEquals("duzentos", ext.extenso(200));
		Assert.assertEquals("trezentos", ext.extenso(300));
		Assert.assertEquals("quatrocentos", ext.extenso(400));
		Assert.assertEquals("quinhentos", ext.extenso(500));
		Assert.assertEquals("seiscentos", ext.extenso(600));
		Assert.assertEquals("setecentos", ext.extenso(700));
		Assert.assertEquals("oitocentos", ext.extenso(800));
		Assert.assertEquals("novecentos", ext.extenso(900));
	}
	@Test
	public void testeCentenasDezenasUnidades(){
		Assert.assertEquals("cento e dezenove", ext.extenso(119));
		Assert.assertEquals("duzentos e trinta e quatro", ext.extenso(234));
		Assert.assertEquals("trezentos e quarenta e cinco", ext.extenso(345));
		Assert.assertEquals("quatrocentos e cinquenta e seis", ext.extenso(456));
		Assert.assertEquals("quinhentos e sessenta e sete", ext.extenso(567));
		Assert.assertEquals("seiscentos e setenta e oito", ext.extenso(678));
		Assert.assertEquals("setecentos e oitenta e nove", ext.extenso(789));
		Assert.assertEquals("oitocentos e noventa", ext.extenso(890));
		Assert.assertEquals("novecentos e um", ext.extenso(901));
	}
	@Test
	public void testeMilhares(){
		Assert.assertEquals("dois milhoes cento e dezenove mil cento e dezenove", ext.extenso(2119119));
		Assert.assertEquals("oito mil duzentos e trinta e quatro", ext.extenso(1000));
		Assert.assertEquals("sete mil trezentos e quarenta e cinco", ext.extenso(7345));
		Assert.assertEquals("cinco mil quinhentos e sessenta e sete", ext.extenso(5567));
		Assert.assertEquals("quatro mil seiscentos e setenta e oito", ext.extenso(4678));
		Assert.assertEquals("tres mil setecentos e oitenta e nove", ext.extenso(3789));
		Assert.assertEquals("dois mil oitocentos e noventa", ext.extenso(2890));
		Assert.assertEquals("um mil novecentos e um", ext.extenso(1901));
	}
}
