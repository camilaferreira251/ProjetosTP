package RNA;



public class TgHip extends Funcao{
       public final double funcao(double x) {
        return ((Math.exp(x)-Math.exp(-x))/(Math.exp(x)+Math.exp(-x)));
    }

    public final double derivada(double x) {
        return 1-Math.pow(funcao(x), 2);
    }
}
