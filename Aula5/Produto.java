package Aula5;

public class Produto {
    private String nome;
    private double preco;

    public Produto() {
        this.nome = "";
        this.preco = 0.0;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        if (preco <0) {
            this.preco = 0.0;
            System.out.println("Preco Invalido!");
        }
        else {
            this.preco = preco;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}