package RNA;



public class Neuronio {

    private double[] pesos = null;
    private double bias = 1;

    public Neuronio(int connections, int bias) {
        pesos = new double[connections];
        this.bias = bias;
    }

    public int getTamanho() {
        return pesos.length;
    }

    public double getPeso(int index) {
        return pesos[index];
    }

    public void setPeso(int index, double peso) {
        pesos[index] = peso;
    }

    public double getBias() {
        return bias;
    }

    public void setBias(double b) {
        bias = b;
    }

    public void corrigirPeso(int i, double delta) {
        pesos[i] += delta;
    }

    public void corrigirBias(double delta) {
        bias += delta;
    }

    protected void randomizarPesos(int opcao) {
        switch (opcao) {
            case 0:
                for (int i = 0; i < pesos.length; i++) {
                    pesos[i] = Math.random();
                }
                break;
            case 1:
                for (int i = 0; i < pesos.length; i++) {
                    pesos[i] = (Math.random() - 1 / 2) * 2;
                }
                break;
            case 2:
                for (int i = 0; i < pesos.length; i++) {
                    pesos[i] = Math.random() - 1;
                }
                break;
            default:
        }
    }
}
