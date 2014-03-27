//teste

package RNA;



class NeuronioBP {

    private double[] deltaw = null;
    private double deltaBias = 0;

    NeuronioBP(int tamanho) {
        deltaw = new double[tamanho];

        for (int i = 0; i < deltaw.length; i++) {
            deltaw[i] = 0;
        }
    }

    final double getDeltaw(int i) {
        return deltaw[i];
    }

    final void setDeltaw(int i, double valor) {
        deltaw[i] = valor;
    }

    final double getDeltaBias() {
        return deltaBias;
    }

    final void setDeltaBias(double deltaBias) {
        this.deltaBias = deltaBias;
    }

    int getTamanho() {
        return deltaw.length;
    }
}
