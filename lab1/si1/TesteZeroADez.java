package si1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteZeroADez {
	
	@Before
	public void setUp() throws Exception {
		NumeroPorExtenso ext = new NumeroPorExtenso();
	}

	@Test
	public void test() {
		Assert.assertStringEquals("zero", ext.extenso("0"));
		Assert.assertStringEquals("um", ext.extenso("1"));
		Assert.assertStringEquals("dois", ext.extenso("2"));
		Assert.assertStringEquals("tres", ext.extenso("3"));
		Assert.assertStringEquals("quatro", ext.extenso("4"));
		Assert.assertStringEquals("cinco", ext.extenso("5"));
		Assert.assertStringEquals("seis", ext.extenso("6"));
		Assert.assertStringEquals("sete", ext.extenso("7"));
		Assert.assertStringEquals("oito", ext.extenso("8"));
		Assert.assertStringEquals("nove", ext.extenso("9"));
	}

}
