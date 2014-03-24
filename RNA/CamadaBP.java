package RNA;



class CamadaBP {
	private double[] erros = null;
	private NeuronioBP[] neuronios = null;

	CamadaBP(int tamanho, int tamanhoNeuronio) {
		erros = new double[tamanho];
		neuronios = new NeuronioBP[tamanho];

		for (int i=0; i < neuronios.length; i++) {
			erros[i] = 0;
			neuronios[i] = new NeuronioBP(tamanhoNeuronio);
		}
	}

	final void setErro(int i, double valor) {
		erros[i] = valor;
	}

	final double getErro(int i) {
		return erros[i];
	}

	final NeuronioBP getNeuronioBP(int i) {
		return neuronios[i];
	}

	int getTamanho() {
		return neuronios.length;
	}
}
