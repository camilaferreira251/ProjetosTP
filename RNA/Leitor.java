package RNA;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Marcos
 */
public class Leitor {

    public final int tamanhoTreinamento = 48; //era 18
    private final double[][] entradaTreinamento = new double[tamanhoTreinamento][19];
    private final double[][] saidaDesejadaTreinamento = new double[tamanhoTreinamento][1];
    private double testeEntrada[][] = new double[Operador.TAMANHOTESTE][19];
    private double testeSaidaEsperada[][] = new double[Operador.TAMANHOTESTE][1];

    public void carregarArquivos() {
        int j;
        try {
            j = 0;
            FileReader file = new FileReader("TREINO.txt");
            BufferedReader fileReader = new BufferedReader(file);
            fileReader.mark(500);

            while (fileReader.readLine() != null && j < tamanhoTreinamento) {
                fileReader.reset();
                String s[] = new String[20];
                String linha = fileReader.readLine();
                s = linha.split(";");

                for (int i = 0; i < 19; i++) {
                    entradaTreinamento[j][i] = Double.parseDouble(s[i]);
                }

                saidaDesejadaTreinamento[j][0] = Double.parseDouble(s[19]);
                j++;
                fileReader.mark(500);
            }
            file.close();
            fileReader.close();
        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        }

        try {
            j = 0;
            FileReader file = new FileReader("TESTE.txt");
            BufferedReader fileReader = new BufferedReader(file);
            fileReader.mark(500);

            while (fileReader.readLine() != null && j < Operador.TAMANHOTESTE) {
                fileReader.reset();
                String s[] = new String[20];
                String linha = fileReader.readLine();
                s = linha.split(";");

                for (int t = 0; t < 19; t++) {
                    testeEntrada[j][t] = Double.parseDouble(s[t]);
                }
                testeSaidaEsperada[j][0] = Double.parseDouble(s[19]);
                j++;
                fileReader.mark(500);
            }
            file.close();
            fileReader.close();
        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        }
    }

    public double[][] getEntrada() {
        return entradaTreinamento;
    }

    public double[][] getSaidaDesejada() {
        return saidaDesejadaTreinamento;
    }

    public double[][] getTesteEntrada() {
        return testeEntrada;
    }

    public double[][] getTesteSaidaEsperada() {
        return testeSaidaEsperada;
    }
}
