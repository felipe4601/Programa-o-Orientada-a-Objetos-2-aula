public class Livro extends Produto{
    private String autor;

    public Livro(String nome, double preco, String autor){
        super(nome, preco);
        this.autor = autor;
    }

    // Criando GETTERS
    public String getAutor(){
        return autor;
    }
    // Método para exibir detalhes:
    public void exibirDetalhes(){
        System.out.println("Livro: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Autor: " + autor);
    }

}
