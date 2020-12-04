package univas.edu.main;
import java.util.Scanner;

public class questao1 {
static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int idx;
		
		data dataInicio1 = new data();
		dataInicio1 = lerdata();
		
		data dataFim1 = new data();
		dataFim1 = lerdata();
		
		periodo periodo1 = new periodo();
		
		periodo1.inicio = dataInicio1;
		periodo1.fim = dataFim1;
		
		
		data dataTeste1 = new data();
		
		dataTeste1 = lerdata();
		
		idx = estaDentro(periodo1, dataTeste1);
		
		imprimeResultado(idx);
		
		
		
		data dataInicio2 = new data();
		dataInicio2 = lerdata();
		
		data dataFim2 = new data();
		dataFim2 = lerdata();
		
		
		periodo periodo2 = new periodo();
		
		periodo2.inicio = dataInicio2;
		periodo2.fim = dataFim2;
		
		data dataTeste2 = new data();
		dataTeste2 = lerdata();
		
		idx = estaDentro(periodo2, dataTeste2);
		
		imprimeResultado(idx);

	scanner.close();	
	}
	
	public static int estaDentro(periodo periodo, data data) {		
		
		if(data.ano >= periodo.inicio.ano && data.ano <= periodo.fim.ano) {
			if(data.mes >= periodo.inicio.mes && data.mes <= periodo.fim.mes) {
				if(data.dia >= periodo.inicio.dia && data.dia <= periodo.fim.dia) {
					return 1;
				}
				else {
					return 0;
				}
			}
			else {
				return 0;
			}
		}
		else {
			return 0;
		}
	}
	
	public static data lerdata() {
		
		data data = new data();
		
		data.dia = scanner.nextInt();
		data.mes = scanner.nextInt();
		data.ano = scanner.nextInt();
		scanner.nextLine();
		
		return data;
	}
	
	public static void imprimeResultado(int idx) {
		
		if(idx == 1) {
			System.out.println("Data está dentro do período!");
		}
		else {
			System.out.println("Data NÃO está dentro do período!");
		}
		
	}

}
