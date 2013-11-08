package si1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteZeroADez {

	NumeroPorExtenso ext;

	@Before
	public void setUp() throws Exception {
		ext = new NumeroPorExtenso();
	}

	@Test
	public void test() {
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

}
