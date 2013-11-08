package si1;

public class NumeroPorExtenso {

	String[] umADezenove = { "zero", "um", "dois", "tres", "quatro", "cinco",
			"seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze",
			"quatorze", "quize", "dezesseis", "dezessete", "dezoito",
			"dezenove" };

	String[] dezenas = { "", "", "vinte", "trinta", "quarenta", "cinquenta",
			"sessenta", "setenta", "oitenta", "noventa" };

	String[] centenas = { "", "cento", "duzentos", "trezentos", "quatrocentos",
			"quinhentos", "seiscentos", "setecentos", "oitocentos",
			"novecentos" };

	public String extenso(int numero) {
		int centenaDoNumero = numero / 100;
		int dezenaDoNumero = (numero / 10) - (centenaDoNumero * 10);
		int unidadeDoNumero = numero - (dezenaDoNumero * 10)
				- (centenaDoNumero * 100);

		if (numero == 100) {
			return "cem";
		}

		if (numero < 20) {
			return umADezenove[numero];
		}

		if (dezenaDoNumero > 1) {
			if (unidadeDoNumero != 0) {
				if (centenaDoNumero != 0) {
					return centenas[centenaDoNumero] + " e "
							+ dezenas[dezenaDoNumero] + " e "
							+ umADezenove[unidadeDoNumero];
				}
				return dezenas[dezenaDoNumero] + " e "
						+ umADezenove[unidadeDoNumero];

			} else {
				if (centenaDoNumero != 0) {
					return centenas[centenaDoNumero] + " e "
							+ dezenas[dezenaDoNumero];
				}
				return dezenas[dezenaDoNumero];
			}
		} else if (unidadeDoNumero != 0) {
			return centenas[centenaDoNumero] + " e "
					+ umADezenove[unidadeDoNumero];
		}
		return centenas[centenaDoNumero];
	}
}
