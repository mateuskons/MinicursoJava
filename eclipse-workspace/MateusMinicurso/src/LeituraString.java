import java.util.Scanner;

public class LeituraString {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String palavra;
		String texto;
		
		//leitura palavra sem espaço
		System.out.println("Digite uma palavra");
		palavra = ler.next();
		System.out.println(palavra);
		
		//leitura de texto
		ler.nextLine();
		System.out.println("Digite uma texto");
		texto = ler.nextLine();
		System.out.println(texto);
		

	}

}
