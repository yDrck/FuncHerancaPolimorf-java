package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.FuncTerc;
import entities.Funcionario;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Funcionario> listafuncs = new ArrayList<Funcionario>();
		
		System.out.print("Entre com o número de funcionários: ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n;++i) {
			System.out.println();
			System.out.println("Funcionario #"+i+"");
			System.out.print("Terceirizado? [s/n]: ");
			char opcao = sc.next().charAt(0);
			
			if (opcao == 'n') {
				sc.nextLine();
				System.out.print("Nome? ");
				String name = sc.nextLine();
				System.out.print("Quantas horas ele trabalhou? ");
				Integer hora = sc.nextInt();
				System.out.print("Qual o valor da hora? ");
				double valorHora = sc.nextDouble();
				listafuncs.add(new Funcionario(name,hora,valorHora));
				
			} else if (opcao == 's') {
				sc.nextLine();
				System.out.print("Nome? ");
				String name = sc.nextLine();
				System.out.print("Quantas horas ele trabalhou? ");
				Integer hora = sc.nextInt();
				System.out.print("Qual o valor da hora? ");
				double valorHora = sc.nextDouble();
				System.out.println("Valor do adicional: ");
				double adicional = sc.nextDouble();
				listafuncs.add(new FuncTerc(name,hora,valorHora,adicional));
				
			}
			else {
				System.out.println("Opção inválida");
				break;
			}
			
		}
		sc.close();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Pagamentos");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for (Funcionario elem: listafuncs) {
			System.out.println(elem.getName() + " - $" + String.format("%.2f", elem.pagamento()));
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}
