package RNA;



public class MLP {

    private Camada[] camadas;
    private int ultimaCamada = -1;
    private int tipoFuncao;
    private int bias;
    private int intervaloRand;

    public MLP(int numCamadas, int funcao, int bias,int intervalo) {
        this.camadas = new Camada[numCamadas];
        this.tipoFuncao=funcao;
        this.bias=bias;
        this.intervaloRand=intervalo;
    }

    public void inserirCamadaEntrada(int a, int b) {
        camadas[0] = new Camada(a,b,tipoFuncao,bias, intervaloRand);
        ultimaCamada = 0;
    }

    public void addCamada(int numNeuronios) {

        camadas[ultimaCamada + 1] = new Camada(numNeuronios, camadas[ultimaCamada].getTamanho(),tipoFuncao,bias,intervaloRand);

        ultimaCamada++;
    }


    public void Avancar(double[] entradas) {

        for (int i = 0; i < camadas.length; i++) {
            camadas[i].Calcular(entradas);

            entradas = camadas[i].getSaidas();
        }

    }

    public double getSaida(int neuronio) {
        return camadas[ultimaCamada].getSaida(neuronio);
    }

    public int getTamanho() {
        return camadas.length;
    }

    public final Camada getCamada(int i) {
        return camadas[i];
    }

    public final Camada getUltimaCamada() {
        return camadas[ultimaCamada];
    }

    public int getTipoFuncao() {
        return tipoFuncao;
    }
    
    
}
