package si1;

public class NumeroPorExtenso {

	
	
	String[] umADezenove = { "zero", "um", "dois", "tres", "quatro", "cinco",
			"seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze",
			"quatorze", "quize", "dezesseis", "dezessete", "dezoito",
			"dezenove" };

	String[] dezenas = { "", "", "vinte", "trinta", "quarenta", "cinquenta",
			"sessenta", "setenta", "oitenta", "noventa" };

	public String extenso(int numero) {
		int dezenaDoNumero = numero/10;
		int unidadeDoNumero = numero - (dezenaDoNumero * 10);

		if (numero < 20){
			return umADezenove[numero];
		}
		if (unidadeDoNumero != 0){
			return dezenas[dezenaDoNumero] + " e " + umADezenove[unidadeDoNumero];
		}
		return dezenas[dezenaDoNumero];

	}
}
