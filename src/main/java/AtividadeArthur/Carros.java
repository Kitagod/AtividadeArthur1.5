package AtividadeArthur;

public abstract class Carros {
    private String tipo;
    private String nome;
    private String placa;

    public Carros(String tipo, String nome, String placa){
        this.tipo = tipo;
        this.nome = nome;
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getPlaca() {
        return placa;
    }

    
}