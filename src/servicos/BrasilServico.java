package servicos;

import java.security.InvalidParameterException;

public class BrasilServico implements Servico {
	private double taxaJuro;
	
	public BrasilServico() {
		
	}

	public BrasilServico(double taxaJuro) {		
		this.taxaJuro = taxaJuro;
	}	
	public double getTaxaJuro() {
		return taxaJuro;
	}	

	public double pagamento(double quantia, int meses) {
		if (meses < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return quantia * Math.pow(1.0 + taxaJuro/ 100.0, meses);
	}

}
