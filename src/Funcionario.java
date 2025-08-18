import java.util.SplittableRandom;

public class Funcionario {
    protected String nome;
    protected double salario;


    // Criando método construtor:
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    // Criando os métodos GETTERS:
    public String getNome(){
        return nome;
    }
    public double getSalario(){
        return salario;
    }



}
