public class Animal {
    private String nome;
    private String especie;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    // Consulta nome e espécie juntos
    public String consultarDados() {
        return "Nome: " + nome + ", Espécie: " + especie;
    }

    // Muda o nome, validando para não aceitar vazio
    public boolean mudarNome(String novoNome) {
        if (novoNome != null && !novoNome.trim().isEmpty()) {
            this.nome = novoNome;
            return true;
        }
        return false;
    }
}