package test.java.Model;

public class Conversor 
{
	private static int CASAS = 10;
	private static char[] digitos =
		{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
		    'A', 'B', 'C', 'D', 'E', 'F'};
	public void setCasas(int x)
	{
		CASAS = x;
	}
	public String converter(double x, int b)
	{
		int parteInteira = (int) x;
		double parteDecimal = x - parteInteira;
		int indice;
		int i;
		String convertido = "";
		while(parteInteira >= b)
		{
			indice = parteInteira % b;
			convertido = digitos[indice] + convertido;
			parteInteira /= b;
		}
		if((int) x == 0 || parteInteira != 0)
		{
			convertido = digitos[parteInteira] + convertido;
		}
		
		if(parteDecimal > 0 && CASAS > 0)
		{
			convertido += ',';
			i = 0;
			while(parteDecimal - (int)parteDecimal > 0 && i < CASAS)
			{
				parteDecimal -= (int)parteDecimal;
				parteDecimal *= b;
				indice = (int)parteDecimal;
				convertido += digitos[indice];
				i++;
			}
		}
		return convertido;
	}
}
