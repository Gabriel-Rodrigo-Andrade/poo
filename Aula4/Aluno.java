package Aula4;
public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome) {
        this.nome = nome;
        this.nota = 0;
    }

    // Adiciona nota (só se não passar de 10 e for positiva)
    public boolean adicionarNota(double valor) {
        if (valor > 0 && (nota + valor) <= 10) {
            nota += valor;
            return true;
        }
        return false;
    }

    // Retira nota (só se tiver nota suficiente)
    public boolean retirarNota(double valor) {
        if (valor > 0 && nota >= valor) {
            nota -= valor;
            return true;
        }
        return false;
    }

    // Consulta nota
    public double consultarNota() {
        return nota;
    }

    public String getNome() {
        return nome;
    }

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Gabriel");

        System.out.println(aluno.adicionarNota(5)); // true
        System.out.println(aluno.consultarNota());  // 5.0

        System.out.println(aluno.adicionarNota(6)); // false
        System.out.println(aluno.consultarNota());  // 5.0

        System.out.println(aluno.retirarNota(2));   // true
        System.out.println(aluno.consultarNota());  // 3.0

        System.out.println(aluno.retirarNota(4));   // false
        System.out.println(aluno.consultarNota());  // 3.0
    }
}
}