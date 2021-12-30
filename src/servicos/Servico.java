package servicos;

import java.security.InvalidParameterException;

public interface Servico {
	
	double getTaxaJuro();
	default  double pagamento(double quantia, int meses) {
		if (meses < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return quantia * Math.pow(1.0 + getTaxaJuro()/ 100.0, meses);
	}

}
