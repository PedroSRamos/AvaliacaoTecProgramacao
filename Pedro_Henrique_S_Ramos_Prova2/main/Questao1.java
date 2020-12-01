package univas.edu.main;

import java.util.Scanner;
import univas.edu.br.Controle;

public class Questao1 {
	private static final Controle[] Controle = null;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Controle[] controle = new Controle[100];
		String op;
		do {
			menu();
			String sc = sc.nextLine();
			if (op.equals("1")) {
				cadastrarControle(controle);
			} else if (op.equals("2")) {
				verSaldo(controle);
			} else if (op.equals("3")) {
				break;
			} else {

			}
		} while (true);
		sc.close();
		System.out.println("FIM!");
	}

	public static void cadastrarControle (Controle[] controle) {
		int i = 0;
		do {
			if (controle[i] == null) {
				Controle controle1 = new controle();
				System.out.println("\n Cadastro de Conta: ");
				System.out.println("Digite a descrição da conta: ");
				controle1.descricao= sc.nextLine();
				System.out.println("Digite o valor da conta: ");
				controle1.valor= sc.nextFloat();
				sc.nextLine();
				System.out.println("Digite a data de vencimento da conta: ");
				controle1.dataVenc = sc.nextLine();
				System.out.println("Digite qaul tipo de conta: Despesa ou Receita.");
				controle1.tipo = sc.nextLine();
				Controle[i] = controle1;
				break;
			}
			i++;
		} while (true);
	}

	public static void verSaldo(Controle[] controle) {
		float receita = 0;
		float despesa = 0;
		for (int i = 0; i < 100; i++) {
			if (controle[i] != null) {
				Controle controle = Controle[i];
				if (controle.tipo.equals("Despesa")) {
					despesa = controle.valor + despesa;
				} else if (controle.tipo.equals("Receita")) {
					receita = controle.valor + receita;
				} else {

				}
			}
		}
		float saldo = receita - despesa;
		if (saldo > 0) {
			System.out.printf("\n Saldo Positivo: %.2f %n", saldo);
		} else if (saldo < 0) {
			System.out.printf("\n Saldo Negativo: %.2f %n", saldo);
		} else {
			System.out.println("\n Saldo Zerado!");
		}
	}

	public static void menu() {
		System.out.println("- MENU - \n");
		System.out.println("1 - Cadastro de conta");
		System.out.println("2 - Ver Saldo ");
		System.out.println("3 - Sair");
	}
}