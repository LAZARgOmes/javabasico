package Projeto_aula1;

import java.util.Scanner;

public class Notas_aluno {

	public static void main(String[] args) {
		float nota1, nota2, media = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite as duas notas parciais:");
		nota1 = leitor.nextFloat();
		nota2 = leitor.nextFloat();
		media = (nota1 + nota2)/2;
		System.out.println(media);
		if(media >= 7){
			System.out.println("aprovado");
		}
		else if(media < 7) {
			System.out.println("reprovado");
		}
		else if(media == 10) {
			System.out.println("Aprovado com Distinção");
		}
		leitor.close();
	}

}
