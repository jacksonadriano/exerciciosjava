package colecoes;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

//Crie uma lista vazia chamada campeoes.
//Leia os campeões do arquivo disponibilizado: campeoes.csv e adicione à lista.
//Crie um map chamado quantidadeTitulos onde a chave é o país e o valor é a quantidade de vezes que foi campeão.
//Percorra a lista criada, adicionando ao Map conforme achar necessário.
//Imprima de maneira ordenada (por nome) o país e a quantidade de copas. O ano pode ser ignorado.
public class ColecoesExercicio2 {

    private static final int COLUNA_NOME_DO_PAIS = 1;

    public static void main(String[] args) throws IOException {
        //Leitura de arquivo
        Scanner scanner = new Scanner(Path.of("src/main/resources/campeoes.csv"));

        List<String> paises = new ArrayList<>();

        while (scanner.hasNext()) {
            //ano - pais
            String linha = scanner.nextLine();

            String pais = linha.split("-")[COLUNA_NOME_DO_PAIS].trim();
            paises.add(pais);
            }

        Map<String, Integer> campeoes = new TreeMap<>();
        for (String pais : paises) {
            int quantidadeTitulos = 0;
            //Se noa esta ainda no map = 1
            if (!campeoes.containsKey(pais)) { // ! inverte - negacao
                quantidadeTitulos = 1;
            } else {
                int quantidadeAnterior = campeoes.get(pais);
                quantidadeTitulos = quantidadeAnterior + 1;
            }
            campeoes.put(pais, quantidadeTitulos);
        }
          //Imprime map
        for(Map.Entry<String, Integer> campeao: campeoes.entrySet()){
            System.out.println(campeao.getKey() + " -> " +campeao.getValue());
        }
}
}
