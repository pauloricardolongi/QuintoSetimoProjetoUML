package servicos;

public interface Servico {
	
	double getTaxaJuro();
	double pagamento(double quantia, int meses);

}
