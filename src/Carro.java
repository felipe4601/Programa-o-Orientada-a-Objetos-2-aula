public class Carro extends Veiculos{
    protected int numeroDePortas;

    // Criando construtores:
    public Carro(String marca, int numeroDePortas){
        super(marca); // Chama o construtor da classe mãe
        this.numeroDePortas = numeroDePortas;
    }

    // Criando método GETTER:
    public int getNumeroDePortas(){
        return numeroDePortas;
    }

}
