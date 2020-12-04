package univas.edu.main4;
import java.util.Scanner;


public class questao4 {
static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		retangulo retangulo = new retangulo();
		
		retangulo = lerRetangulo();
		
		System.out.println("xIni = " + retangulo.xIni);
		System.out.println("xFim = " + retangulo.xFim);
		
		System.out.println("yIni = " + retangulo.yIni);
		System.out.println("yFim = " + retangulo.yFim);
		sc.close();
	}
	
	public static retangulo lerRetangulo() {
		
		retangulo lerRetangulo = new retangulo();
		
		lerRetangulo.xIni = sc.nextInt();
		retangulo.xFim = sc.nextInt();
		
		lerRetangulo.yIni = sc.nextInt();
		lerRetangulo.yFim = sc.nextInt();
		sc.nextLine();
		
		return lerRetangulo;
	}
}
