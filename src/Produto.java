public class Produto {
    private String nome;
    private double preco;

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
            System.out.println("O preço não pode ser negativo");
        }
        else{
            this.preco = preco;
        }
    }
}
