package AtividadeArthur;

public class Pessoa {
    private String nome;
    private int idade;
    private Cpf cpf;

    public Pessoa(String nome, int idade, Cpf cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " CPF: " + cpf.getValor() + " Idade: " + idade;
    }
}