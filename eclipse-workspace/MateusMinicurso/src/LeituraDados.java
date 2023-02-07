import java.util.Scanner;

public class LeituraDados {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numeroInteiro;
		byte numeroByte; 
		short inteiroCurto;
		long inteiroLongo;
		// Números reais
		float realFloat;
		double realDuplo;
		char caracter;
		boolean valorBoleano;
		String palavra = "Palavra grande";
		
		System.out.println("Digite numero inteiro");
		numeroInteiro=ler.nextInt();
		System.out.println(numeroInteiro);
		
		System.out.println("Digite numero double");
		realDuplo=ler.nextDouble();
		System.out.println(realDuplo);
		
		System.out.println("Digite numero inteiro curto");
		inteiroCurto=ler.nextShort();
		System.out.println(inteiroCurto);
		
		System.out.println("Digite numero inteiro longo");
		inteiroLongo=ler.nextLong();
		System.out.println(inteiroLongo);
		
		System.out.println("Digite numero float");
		realFloat=ler.nextFloat();
		System.out.println(realFloat);
		
		
		

	}

}
