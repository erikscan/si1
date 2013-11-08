package si1;

public class NumeroPorExtenso {

	String[] umADezenove = { "zero", "um", "dois", "tres", "quatro", "cinco",
			"seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze",
			"quatorze", "quize", "dezesseis", "dezessete", "dezoito",
			"dezenove"};

	public String extenso(int numero) {
		return umADezenove[numero];
	}
}
