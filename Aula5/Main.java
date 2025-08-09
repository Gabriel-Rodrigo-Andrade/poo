package Aula5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);

        System.out.println("Pessoa criada: " + pessoa.getNome());
    }
}