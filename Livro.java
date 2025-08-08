public class Livro {
    private String nome;
    private String autor;
    private int paginas;

    public String getNome(){
        return nome;
    }

    public String getAutor(){
        return autor;
    }

    public int getPaginas(){
        return paginas;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAutor(String novoAutor){
        autor = novoAutor;
    }

    public void setPaginas(int numPaginas){
        if(numPaginas > 0){
            paginas = numPaginas;
        }
    }
}