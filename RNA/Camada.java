package RNA;



import RNA.Funcao;
import RNA.Sigmoide;
import RNA.TgHip;

public class Camada {

    private Neuronio[] neuronios;
    private double[] saidas;
    private Funcao f;


    Camada(int n, int conexoes,int funcao, int bias,int intervalo) {
        
        if(funcao==0)
            f = new Sigmoide();
        else
            f=new TgHip();
        
        neuronios = new Neuronio[n];
        saidas = new double[n];

        for (int i = 0; i < neuronios.length; i++) {
            neuronios[i] = new Neuronio(conexoes,bias);
            neuronios[i].randomizarPesos(intervalo);
        }
    }

    void Calcular(double[] entradas) {

        for (int i = 0; i < neuronios.length; i++) {
            saidas[i] = f.funcao(rede(i, entradas));
        }
    }

    public int getTamanho() {
        return neuronios.length;
    }

    public double getSaida(int index) {
        return saidas[index];
    }

    public double[] getSaidas() {
        return saidas;
    }

    public Neuronio getNeuronio(int i) {
        return neuronios[i];
    }

    public int getTamanhoNeuronio() {
        return neuronios[0].getTamanho();
    }

    private double rede(int neuronio, double[] entradas) {
        double u = 0;

        for (int i = 0; i < entradas.length; i++) {
            u += entradas[i] * neuronios[neuronio].getPeso(i);
        }
        
        u -= neuronios[neuronio].getBias();
        return u;
    }
}
