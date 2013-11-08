package si1;

public class NumeroPorExtenso {

	String[] umADezenove = { "zero", "um", "dois", "tres", "quatro", "cinco",
			"seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze",
			"quatorze", "quize", "dezesseis", "dezessete", "dezoito",
			"dezenove" };

	String[] dezenas = { "", "", "vinte", "trinta", "quarenta", "cinquenta",
			"sessenta", "setenta", "oitenta", "noventa" };

	public String extenso(int numero) {
		if (numero < 20)
			return umADezenove[numero];
		return dezenas[(numero / 10)];

	}
}
