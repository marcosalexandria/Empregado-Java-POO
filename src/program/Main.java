package program;

import java.util.Scanner;

import empregado.Empregado;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Empregado emp1;
		emp1 = new Empregado();
		
		System.out.print("Nome do empregado: ");
		emp1.nome = scanner.next();
		System.out.print("Qual o salário bruto? ");
		emp1.salarioBruto = scanner.nextDouble();
		System.out.print("Quanto de imposto será descontado do salário? ");
		emp1.imposto = scanner.nextDouble();
		
		System.out.println(emp1);
		
		System.out.println();
		System.out.print("Porcentagem do aumento: ");
		double valor = scanner.nextDouble();
		
		emp1.aumento(valor);
		
		System.out.println();
		System.out.println(emp1);
		
		scanner.close();
	}

}
