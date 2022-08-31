package Trabalho;

import java.util.Scanner;

public class Trabalho {
	public static void main(String[] args) {
			
	
	Scanner x=new Scanner(System.in);
	System.out.println("Digite a nota do primeiro bimestre");
	double valor1=x.nextDouble();
	System.out.println("Digite a nota do segundo bimestre");
	double valor2=x.nextDouble();
	double media=valor1*2 + valor2*3/5;
	System.out.println("A media do aluno foi de:"+media);
	
	
	
	
	}
}
