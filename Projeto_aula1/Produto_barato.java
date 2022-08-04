package Projeto_aula1;
 import java.util.Scanner;
public class Produto_barato {

	public static void main(String[] args) {
		String produto1 = "ARROZ";
		String produto2 = "MACARRAO";
		String produto3 = "FEIJAO";
		float p1,p2,p3;
		System.out.println("loja de compras");
		System.out.printf("%s, vale = ",produto1);
		Scanner leitor = new Scanner(System.in);
		p1 = leitor.nextFloat();
		System.out.printf("%s, vale = ",produto2);
		p2 = leitor.nextFloat();
		System.out.printf("%s, vale = ",produto3);
		p3 = leitor.nextFloat();
		leitor.close();
		if((p1 < p2)&&(p1 < p3)) {
			System.out.println("escolha o "+produto1);
		}
		else if((p2 < p1)&&(p2 < p3)) {
			System.out.println("escolha o "+produto2);
		}
		else
			System.out.println("escolha o "+produto3);
	}
}
