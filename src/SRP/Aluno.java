public class Aluno{

    private String nome;
    private String matricula;

    public Aluno(){}

    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public String getMatricula(){
        return matricula;
    }
    
}