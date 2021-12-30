package servicos;

public class BrasilServico implements Servico {
	private double taxaJuro;
	
	public BrasilServico() {
		
	}

	public BrasilServico(double taxaJuro) {		
		this.taxaJuro = taxaJuro;
	}	
	@Override
	public double getTaxaJuro() {
		return taxaJuro;
	}	

	
	}


