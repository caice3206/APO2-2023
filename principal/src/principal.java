import java.util.Scanner;

//nombre de la clase
public class principal {
	// metodo principál (main)
	public static void main(String[] args) {
		System.out.println("ingrese la palabra");
//clase que permite capturar dator por consola
		Scanner sc = new Scanner(System.in);
		String prueba = sc.next();
		System.out.println("la cantidad de letras que tiene la palabra es : " + prueba.length());

	}
}
