public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    // Método Construtor com apenas 1 atributo
    public Produto(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        if(preco < 0){
            System.out.println("Erro: O preço não pode ser negativo");
        }
        else{
            this.preco = preco;
        }
    }
}
