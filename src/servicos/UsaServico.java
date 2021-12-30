package servicos;

public class UsaServico implements Servico{
	
	private double taxaJuro;
	public UsaServico() {
		
	}
	public UsaServico(double taxaJuro) {
		
		this.taxaJuro = taxaJuro;
	}
	@Override
	public double getTaxaJuro() {
		return taxaJuro;
	}
	
	}
	


