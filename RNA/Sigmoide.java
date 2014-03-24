package RNA;



public class Sigmoide extends Funcao{
      public final double funcao(double x) {
        return (1 / (1 + Math.exp(-x)));
    }

    public final double derivada(double x) {
        return x * (1 - x);
    }
}
