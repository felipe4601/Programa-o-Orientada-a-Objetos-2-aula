import java.util.Arrays;
public class Turma {
    private String nomeDaTurma;   // atributo com o nome da turma
    public Aluno [] alunos; // atributo do tipo aluno para preencher a minha turma

    public Turma(String nomeDaTurma, int capacidade) { //método construtor para criar a minha turma e a capacidade da turma
        this.nomeDaTurma = nomeDaTurma; // o atributo "nomeDaTurma" recebe o argumento passado
        this.alunos = new Aluno[capacidade]; // o atributo do aluno recebe um array to tipo Aluno
    }
    // Criando método adicionarAluno
    public void adicionarAlunos(Aluno aluno){
        for(int i = 0; i < alunos.length -1; i++){ // Abrindo for para iniciar a verificação de indices nulos
            if(alunos[i] == null){ // se o índice atual estiver vazio ele recebe argumento que foi passado nos parênteses
                alunos[i] = aluno; // momento em que o campo nulo recebe o argumento passado nos parênteses
                break; // break para finalizar o for, se não ele irá adicionar o mesmo argumento em todos os índices
            }
        }
    }
    
    // Listar alunos
    public void listarAlunos(){
        for(int i = 0; i < alunos.length -1; i++){ // For para listar todos os campos não nulos
            if(alunos[i] != null){ // Se o campo atual for diferente de nulo ele o mostra na tela
                System.out.println(alunos[i].getNome()); // como o objeto é do tipo nome, ele mostra
                // o nome correspondente ao objeto, através do método "getNome"
            }
            else{
                break; // para o loop para não passar por todos os nulos
            }
        }
    }
  
}
