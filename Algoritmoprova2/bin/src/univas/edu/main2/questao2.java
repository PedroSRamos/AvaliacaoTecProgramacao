package univas.edu.main2;
import java.util.Scanner;

public class questao2 {
static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ponto p1 = new ponto();
		p1 = lerponto();
		
		ponto p2 = new ponto();
		p2 = lerponto();
		
		retangulo retangulo = new retangulo();
		
		retangulo.inicio = p1;
		retangulo.fim = p2;
		
		ponto pontoTeste1 = new ponto();
		pontoTeste1 = lerponto();
		
		boolean estadentro = estadentro(retangulo, pontoTeste1);
		
		imprimeresultado(estadentro);
		
		scanner.close();
	}
	
	private static boolean estadentro(retangulo retangulo, ponto pontoTeste1) {
		// TODO Auto-generated method stub
		return false;
	}

	private static ponto lerponto() {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean estadentro1(retangulo retangulo, ponto p) {
	
		return p.x >= retangulo.inicio.x && p.y <= retangulo.inicio.y
				&& p.x <= retangulo.fim.x && p.y <= retangulo.fim.y;
	}
	
public static ponto lerPonto() {
		
	ponto ponto = new ponto();
		
		ponto.x = scanner.nextInt();
		ponto.y = scanner.nextInt();
		scanner.nextLine();
		
		return ponto;
	}
	
	public static void imprimeresultado(boolean resultado) {
		
		if(resultado) {
			System.out.println("Ponto DENTRO do Retângulo!");
		}
		else {
			System.out.println("Ponto NÃO está dentro do Retângulo!");
		}
		
	}
}
