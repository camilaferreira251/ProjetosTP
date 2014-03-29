package RNA;

import RNA.MultilayerPerceptron;
import RNA.BackPropagation;

public class Operador {
    
    public static MultilayerPerceptron m;
    public static Leitor leitor;
    public static double entradas[] = new double[19];
    public static final int TAMANHOTESTE = 86;
    public static int iteracoesFeitas = 0;
    public static double calcErro = 1;

    public static void treinar(double aprendizado, double momento, int bias, int funcao, int intervalo, int iteracoes, double erro) {
        leitor = new Leitor();
        leitor.carregarArquivos();

        m = new MultilayerPerceptron(3, funcao, bias, intervalo);

        m.insertInPutLayer(19, 19);
        m.addCamada(6);
        m.addCamada(1);

        BackPropagation b = new BackPropagation(m, aprendizado, momento);
        calcErro = 1;
        int i;
        for (i = 0; i < iteracoes && calcErro > erro; i++) {
            double erroAux = 0;
            double saidas[] = new double[leitor.tamanhoTreinamento];

            for (int k = 0; k < leitor.tamanhoTreinamento; k++) {
                b.treinar(leitor.getEntrada()[k], leitor.getSaidaDesejada()[k]);
                saidas[k] = m.getOutPut(0);
            }
            erroAux = b.calcularErro(leitor, saidas);
            calcErro = erroAux;
        }
        iteracoesFeitas = i;



        for (int w = 0; w < TAMANHOTESTE; w++) {
            m.Advance(leitor.getTesteEntrada()[w]);
        }
    }

    public static int teste() {
        int soma = 0;
        for (int w = 0; w < 86; w++) {
            m.Advance(leitor.getTesteEntrada()[w]);
            if (m.getOutPut(0) > 0.5) {
                soma++;
            }
        }
        return soma - 8;
    }

    public static double operar() {
        m.Advance(entradas);
        return m.getOutPut(0);
    }
}