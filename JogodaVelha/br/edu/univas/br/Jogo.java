package br.edu.univas.br;
import java.util.Scanner;

public class Jogo {
	static String[][] jogo = new String[3][3];
	static String[][] posicao = new String[][] { { "1a", "1b", "1c" }, { "2a", "2b", "2c" }, { "3a", "3b", "3c" } };
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Digite o nome do primeiro jogador(X):");
		String jogador1 = sc.nextLine();
		System.out.println("Digite o nome do segundo jogador(O): ");
		String jogador2 = sc.nextLine();
		int n;
		do {
			limparJogo();
			jogodaVelha(jogador1, jogador2);
			System.out.println("Jogar novamente? Digite 1 para SIM.");
			n = sc.nextInt();
			sc.nextLine();
		} while (n == 1);
		sc.close();
	}

	public static void jogodaVelha(String nome1, String nome2) {
		int numerojogadas = 0;
		do {
			numerojogadas++;
			if (numerojogadas % 2 != 0) {
				JogadaX(numerojogadas, nome1);
			} else {
				JogadaO(numerojogadas, nome2);
			}
			System.out.println("#	JOGO	#");
			imprimirJogo();
			numerojogadas = verificarJogo(numerojogadas);
		} while (numerojogadas < 9);
		resultadoFinal(numerojogadas, nome1, nome2);
	}

	public static void JogadaX(int numerojogadas, String nome1) {
		System.out.println(numerojogadas + ". Vez do jogador(X) " + nome1);
		String jogada = sc.nextLine();
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				if (posicao[a][b].equals(jogada)) {
					jogo[a][b] = "X";
				}
			}
		}
	}

	public static void JogadaO(int numerojogadas, String nome2) {
		System.out.println(numerojogadas + ". Vez do jogador(O) " + nome2);
		String jogada = sc.nextLine();
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				if (posicao[a][b].equals(jogada)) {
					jogo[a][b] = "O";
				}
			}
		}
	}

	public static int verificarJogo(int numerojogadas) {
		if (jogo[0][0] == "X" && jogo[0][1] == "X" && jogo[0][2] == "X") {
			return numerojogadas = 11;
		}
		if (jogo[1][0] == "X" && jogo[1][1] == "X" && jogo[1][2] == "X") {
			return numerojogadas = 11;
		}
		if (jogo[2][0] == "X" && jogo[2][1] == "X" && jogo[2][2] == "X") {
			return numerojogadas = 11;
		}
		if (jogo[0][0] == "X" && jogo[1][0] == "X" && jogo[2][0] == "X") {
			return numerojogadas = 11;
		}
		if (jogo[0][1] == "X" && jogo[1][1] == "X" && jogo[2][1] == "X") {
			return numerojogadas = 11;
		}
		if (jogo[0][2] == "X" && jogo[1][2] == "X" && jogo[2][2] == "X") {
			return numerojogadas = 11;
		}
		if (jogo[0][0] == "X" && jogo[1][1] == "X" && jogo[2][2] == "X") {
			return numerojogadas = 11;
		}
		if (jogo[0][2] == "X" && jogo[1][1] == "X" && jogo[2][0] == "X") {
			return numerojogadas = 11;
		}
		if (jogo[0][0] == "O" && jogo[0][1] == "O" && jogo[0][2] == "O") {
			return numerojogadas = 12;
		}
		if (jogo[1][0] == "O" && jogo[1][1] == "O" && jogo[1][2] == "O") {
			return numerojogadas = 12;
		}
		if (jogo[2][0] == "O" && jogo[2][1] == "O" && jogo[2][2] == "O") {
			return numerojogadas = 12;
		}
		if (jogo[0][0] == "O" && jogo[1][0] == "O" && jogo[2][0] == "O") {
			return numerojogadas = 12;
		}
		if (jogo[0][1] == "O" && jogo[1][1] == "O" && jogo[2][1] == "O") {
			return numerojogadas = 12;
		}
		if (jogo[0][2] == "O" && jogo[1][2] == "O" && jogo[2][2] == "O") {
			return numerojogadas = 12;
		}
		if (jogo[0][0] == "O" && jogo[1][1] == "O" && jogo[2][2] == "O") {
			return numerojogadas = 12;
		}
		if (jogo[0][2] == "O" && jogo[1][1] == "O" && jogo[2][0] == "O") {
			return numerojogadas = 12;
		}
		return numerojogadas;
	}

	public static void resultadoFinal(int numerojogadas, String nome1, String nome2) {
		if (numerojogadas == 12) {
			System.out.println("RESULTADO: (O) " + nome2 + " VENCEU!");
		} else if (numerojogadas == 11) {
			System.out.println("RESULTADO: (X) " + nome1 + " VENCEU!");
		} else {
			System.out.println("RESULTADO: Jogo deu VELHA!");
		}
	}

	public static void imprimirJogo() {
		System.out.println(jogo[0][0] + " | " + jogo[0][1] + " | " + jogo[0][2]);
		System.out.println("---------");
		System.out.println(jogo[1][0] + " | " + jogo[1][1] + " | " + jogo[1][2]);
		System.out.println("---------");
		System.out.println(jogo[2][0] + " | " + jogo[2][1] + " | " + jogo[2][2]);
	}

	public static void limparJogo() {
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				jogo[a][b] = " ";
			}
		}
	}
}