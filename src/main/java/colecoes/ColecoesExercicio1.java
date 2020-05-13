package colecoes;
//Crie uma lista vazia chamada pessoas.
//Adicione os nomes: Kiersten, Zaneta, Frank, Tedi, Bryana, Marigold, Devan, Jerrilyn, Isac, Kathrine, Bryana.
//Ordene a lista alfabeticamente.
//Ignore as repetições.
//Adicione programaticamente os primeiros 3 nomes (após ordenar) a uma segunda lista chamada primeiros.

import java.sql.ClientInfoStatus;
import java.util.*;

public class ColecoesExercicio1 {

    public static void main(String[] args) {

        ArrayList<String> pessoas = new ArrayList<String>();
        pessoas.add("Kiersten");
        pessoas.add("Zaneta");
        pessoas.add("Frank");
        pessoas.add("Tedi");
        pessoas.add("Bryana");
        pessoas.add("Marigold");
        pessoas.add("Devan");
        pessoas.add("Jerrilyn");
        pessoas.add("Isac");
        pessoas.add("Kathrine");
        pessoas.add("Bryana");

        //Modo mais facil de criar uma lista.
        //List<String> pessoas = Arrays.asList("Kiersten", "Zaneta", "Frank", "Tedi", "Bryana", "Marigold", "Devan", "Jerrilyn", "Isac", "Kathrine, Bryana")


        Collections.sort(pessoas);

        LinkedHashSet<String> listaSemDuplicacoes = new LinkedHashSet<String>(pessoas);
        LinkedList<String> primeiros = new LinkedList<>();

        int contador = 1;
        for (String nome: listaSemDuplicacoes){
            if(contador++ > 3){
                break;
            }
            primeiros.add(nome);
        }

        for (String nome : primeiros) {
            System.out.println(nome);
        }
    }
}
