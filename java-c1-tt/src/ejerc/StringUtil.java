package ejerc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class StringUtil {
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c,int n) {
		String aux = null;
		for(int i = 0; i < n; i++) {
			aux += c;
		}
		return aux;
	}

	// Retorna una cadena de longitud n, compuesta por s y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c) {
		//evalua la longitud de la cadena para iterar y le concatena a la izquierda el caracter que recibe n veces
		while(s.length() != n) {
			s = c + s;
		}
		return s;
	}

	// Retorna un String[] conteniendo los elementos de arr representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])	{
		List<String> arrStr = new ArrayList<>();
		List arrList = Arrays.asList(arr);
		for(Object i : arrList) {
			arrStr.add(i.toString());
		}
		return arrStr.toArray(new String[0]);
	}

	// Retorna un String[] conteniendo los elementos de arr representados como cadenas de caracteres
	public static int[] toIntArray(String arr[]) {
		int[] arrInt = Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray();
		return arrInt;
	}

	// Retorna la longitud del elemento con mayor cantidad de caracteres del array arr
	public static int maxLength(String arr[]) {
		List<String> arrList = Arrays.asList(arr);
		String maxString = arrList.stream().max(comparing(String::length)).get();
		return maxString.length();
	}

	// Completa los elemento del arr agregando caracteres c a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)	{

		// Falta

	}
}
