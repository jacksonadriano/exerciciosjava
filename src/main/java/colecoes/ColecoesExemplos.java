package colecoes;

import java.util.ArrayList;
import java.util.Collections;

public class ColecoesExemplos {

    public static void main(String[] args) {
        //ArrayList Lista de linguagens: Java, PHP, JS, Scala
        ArrayList<String> linguagens = new ArrayList<String>();
        linguagens.add("Java");
        linguagens.add("PHP");
        linguagens.add("Shell");
        linguagens.add("Scala");
        linguagens.add("JS");

        Collections.sort(linguagens);

        for (String ling : linguagens){
            System.out.println(ling);
        }

        boolean temPHP = linguagens.contains("PHP");
        System.out.println("Contem PHP? " + temPHP);

        String primeiroElemento = linguagens.get(0);
        System.out.println("Primeiro elemento: " + primeiroElemento);

        int posicao = linguagens.indexOf("Scala");
        System.out.println("Scala esta na posicao: " +posicao);
    }
}
