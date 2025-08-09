package Aula5;
import java.util.Scanner;
import java.util.ArrayList;

public class Livro {
    private String nome;
    private int ano;

    public Livro(String nome, int ano) {
    this.nome = nome;
    this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();

        System.out.print("Quantos livros deseja cadastrar ?: ");
        int quantidade = entrada.nextInt();
        entrada.nextLine(); //limpa o buffer

        for (int i = 0; i <quantidade; i++) {
            System.out.print("Digite o Nome do livro: ");
            String nome = entrada.nextLine();

            System.out.print("Digite o Ano deste livro: ");
            int ano = entrada.nextInt();
            entrada.nextLine();

            livros.add(new Livro(nome, ano));
        }

        System.out.println("\nLivros cadastrados: ");
        for (Livro livro : livros) { //for-each
            System.out.println(livro.getNome() + " - " + livro.getAno());
        }
    }
    
}