package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import servicos.BrasilServico;
import servicos.Servico;
import servicos.UsaServico;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantia: ");
		double quantia = sc.nextDouble();
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		
		Servico us = new BrasilServico(2.0);
		double pagamento = us.pagamento(quantia, meses);
		
		System.out.println("Pagamento depois de  " + meses + " meses:");
		System.out.println(String.format("%.2f", pagamento));
		
		sc.close();

	}

}
