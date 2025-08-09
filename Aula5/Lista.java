package Aula5;
import java.util.ArrayList;
import java.util.Random;

public class Lista {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Gabriel");
        nomes.add("Moacir");
        nomes.add("Ana");
        nomes.add("Lucas");
        nomes.add("Maria");
        nomes.add("Gustavo");
        nomes.add("Marcos");
        nomes.add("Livia");
        nomes.add("Cbum");
        nomes.add("Dino");

        Random random = new Random();
        int indice = random.nextInt(nomes.size());
        String nomeSorteado = nomes.get(indice);

        System.out.println("Nome sorteado: " + nomeSorteado);
    }
}