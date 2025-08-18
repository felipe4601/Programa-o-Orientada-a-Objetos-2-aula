public class Gerente extends Funcionario{
    // Classe filha que herda os comportamentos da classe funcionario(classe mãe)
    protected String departamento;

    // Criando método construtor
    public Gerente(String nome, double salario, String departamento){
        super(nome, salario); // chama o construtor da classe mãe
        this.departamento = departamento;
    }

    // Criando método GETTER
    public String getDepartamento(){
        return departamento;
    }

}
