package si1;

public class NumeroPorExtenso {

	String[] unidades = { "zero", "um", "dois", "tres", "quatro", "cinco",
			"seis", "sete", "oito", "nove" };

	public String extenso(int numero) {
		return unidades[numero];
	}
}
