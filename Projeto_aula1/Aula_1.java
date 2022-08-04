package Projeto_aula1;

import java.util.Scanner;

public class Aula_1 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner leitor = new Scanner(System.in);
		num1 = leitor.nextInt();
		num2 = leitor.nextInt();
		String numero = num1 > num2? "numero "+num1+" e maior":"numero "+num2+" e maior";
		System.out.println(numero);
		leitor.close();
	}
}