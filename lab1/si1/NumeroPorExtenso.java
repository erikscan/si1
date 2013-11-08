package si1;

public class NumeroPorExtenso {

	String[] umADezenove = { "", "um", "dois", "tres", "quatro", "cinco",
			"seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze",
			"quatorze", "quize", "dezesseis", "dezessete", "dezoito",
			"dezenove" };

	String[] dezenas = { "", "", "vinte", "trinta", "quarenta", "cinquenta",
			"sessenta", "setenta", "oitenta", "noventa" };

	String[] centenas = { "", "cento", "duzentos", "trezentos", "quatrocentos",
			"quinhentos", "seiscentos", "setecentos", "oitocentos",
			"novecentos" };

	private String extensoAux(int numero) {
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
					+ umADezenove[unidadeDoNumero + (dezenaDoNumero * 10)];
		}
		return centenas[centenaDoNumero];
	}

	public String extenso(int numero) {
		if (numero == 1000000000)
			return "um bilhao";
		if (numero == 0)
			return "zero";
		String numeroString = Integer.toString(numero);
		String[] listaNumeros = new String[(numeroString.length() / 3) + 1];
		for (int i = 0; i < listaNumeros.length; i++) {
			listaNumeros[i] = "";
		}
		if (numeroString.length() > 3) {
			for (int i = 0; i < numeroString.length(); i++) {
				listaNumeros[i / 3] = numeroString.charAt(numeroString.length()
						- (i + 1))
						+ listaNumeros[i / 3];
			}
			if (numeroString.length() > 6) {
				return extensoAux(Integer.parseInt(listaNumeros[2]))
						+ " milhoes "
						+ extensoAux(Integer.parseInt(listaNumeros[1]))
						+ " mil "
						+ extensoAux(Integer.parseInt(listaNumeros[0]));
			} else {
				return extensoAux(Integer.parseInt(listaNumeros[1])) + " mil "
						+ extensoAux(Integer.parseInt(listaNumeros[0]));
			}
		}
		return extensoAux(numero);
	}
}
