package AtividadeArthur;

public class Sedan extends Carros {

    private int capacidade;

    public Sedan(String tipo, String nome, String placa, int capacidade){
        super(tipo,nome,placa);
        this.capacidade = capacidade;
    
    }

    public int getPotencia(){
        return capacidade;
        
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + " Tipo: " + super.getTipo() + " Placa: " + super.getPlaca() + " Potencia: " + capacidade; 
    }
}