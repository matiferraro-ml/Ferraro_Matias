package ej6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public class StringUtil {
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c,int n) {
		String str = "";
		for(int i = 0; i < n; i++) {
			str += c;
		}
		return str;
	}

	// Retorna una cadena de longitud n, compuesta por s y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c) {
		while(s.length() != n) {
			s = c + s;
		}
		return s;
	}

	// Retorna un String[] conteniendo los elementos de arr representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])	{
		String arrStr[] = new String[arr.length];
		for(int i = 0; i < arr.length; i++) {
			arrStr[i] = String.valueOf(arr[i]);
		}
		return arrStr;
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

	// Completa los elementos del arr agregando caracteres c a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)	{
		String arrNew[] = new String[arr.length];
		int n = maxLength(arr);
		int i = 0;
		for(String s : arr) {
			arrNew[i] = (lpad(s, n, c));
			i++;
		}
	}

	// Idem lpad pero a la derecha
	public static String rpad(String s, char c, int n) {
		while(s.length() != n) {
			s += c;
		}
		return s;
	}

	// Retorna una cadena idéntica a s pero sin espacios a la izquierda.
	public static String ltrim(String s) {
		return s.replaceAll("^\\s*","");
	}

	// Idem ltrim, pero sin espacios a la derecha.
	public static String rtrim(String s) {
		return s.replaceAll("\\s*$","");
	}

	// Idem lpad, pero sin espacios a derecha ni izquierda.
	public static String trim(String s) {
		return s.trim();
	}

	// Retorna la posición de la n-ésima ocurrencia del carácter c dentro de s, o -1 si s no contiene a c.
	// Por ejemplo, si s = “John|Paul|George|Ringo”, c = ‘|’ y n=2, la función debe retornar la posición de la
	// segunda ocurrencia del carácter ‘|’ (pipe) dentro de la cadena s. Que, en este caso, es: 9.
	public static int indexOfN(String s, char c, int n) {
		int i = 0;
		int ind = -1;
		while(i < n) {
			ind = s.indexOf(c);
			if(ind != -1) {
				s = s.substring(ind + 1, s.length()-1);
			}
			else break;
			i++;
		}
		return ind;
	}

}
